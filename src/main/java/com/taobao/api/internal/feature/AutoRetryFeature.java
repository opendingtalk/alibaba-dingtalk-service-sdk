package com.taobao.api.internal.feature;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;
import java.util.Set;

/**
 * 自动重试特性
 */
public abstract class AutoRetryFeature {

    private static final Log log = LogFactory.getLog(AutoRetryFeature.class);
    private static final ApiException RETRY_FAIL = new ApiException("sdk.retry-call-fail", "API调用重试失败");

    /**
     * 单次请求的最大重试次数，默认值为3次。
     */
    private int maxRetryCount = 3;
    /**
     * 重试之前休眠时间，默认值为100毫秒。
     */
    private long retryWaitTime = 100L;
    /**
     * 超过最大重试次数时是否抛出异常。
     */
    private boolean throwIfOverMaxRetry = false;
    /**
     * 自定义重试错误码列表。
     */
    private Set<String> retryErrorCodes;

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String session) throws ApiException {
        T rsp = null;
        ApiException exp = null;

        for (int i = 0; i <= maxRetryCount; i++) {
            if (i > 0) {
                if ((rsp != null && ((rsp.getSubCode() != null && rsp.getSubCode().startsWith("isp."))
                        || (retryErrorCodes != null && retryErrorCodes.contains(rsp.getSubCode())))) || exp != null) {
                    sleepWithoutInterrupt(retryWaitTime);
                    log.warn(buildRetryLog(request.getApiMethodName(), request.getTextParams(), i));
                } else {
                    break;
                }
            }

            try {
                rsp = clientExecute(request, session);
                if (rsp.isSuccess()) {
                    return rsp;
                } else {
                    if (i == maxRetryCount && throwIfOverMaxRetry) {
                        throw RETRY_FAIL;
                    }
                }
            } catch (ApiException e) {
                if (exp == null) {
                    exp = e;
                }
            }
        }

        if (exp != null) {
            throw exp;
        } else {
            return rsp;
        }
    }

    private String buildRetryLog(String apiName, Map<String, String> params, int retryCount) {
        StringBuilder sb = new StringBuilder();
        sb.append(apiName).append(" retry call ").append(retryCount);
        params.remove("fields");
        sb.append(" times, params=").append(params);
        return sb.toString();
    }

    public void setMaxRetryCount(int maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    public void setRetryWaitTime(long retryWaitTime) {
        this.retryWaitTime = retryWaitTime;
    }

    public void setThrowIfOverMaxRetry(boolean throwIfOverMaxRetry) {
        this.throwIfOverMaxRetry = throwIfOverMaxRetry;
    }

    public void setRetryErrorCodes(Set<String> retryErrorCodes) {
        this.retryErrorCodes = retryErrorCodes;
    }

    private void sleepWithoutInterrupt(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public abstract <T extends TaobaoResponse> T clientExecute(TaobaoRequest<T> request, String session) throws ApiException;
}
