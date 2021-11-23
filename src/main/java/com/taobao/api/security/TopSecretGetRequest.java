package com.taobao.api.security;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * 
 * @author changchun
 * @since 2016年3月3日 下午1:55:04
 */
public class TopSecretGetRequest extends BaseTaobaoRequest<TopSecretGetResponse> {

    private String randomNum;// 伪随机码
    private Long secretVersion;// 秘钥版本
    private Long customerUserId;// 自主账号id

    public Long getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(Long customerUserId) {
        this.customerUserId = customerUserId;
    }

    public void setRandomNum(String randomNum) {
        this.randomNum = randomNum;
    }

    public void setSecretVersion(Long secretVersion) {
        this.secretVersion = secretVersion;
    }

    public String getApiMethodName() {
        return "taobao.top.secret.get";
    }

    public String getContentType() {
        return null;
    }

    public String getResponseType() {
        return null;
    }

    public String getApiVersion() {
        return null;
    }

    public String getApiCallType() {
        return null;
    }

    public String getHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap params = new TaobaoHashMap();
        params.put("random_num", this.randomNum);
        if (this.secretVersion != null) {
            params.put("secret_version", this.secretVersion);
        }
        if (this.customerUserId != null) {
            params.put("customer_user_id", this.customerUserId);
        }
        
        if (this.udfParams != null) {
            params.putAll(this.udfParams);
        }
        return params;
    }

    public Class<TopSecretGetResponse> getResponseClass() {
        return TopSecretGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(randomNum, "random_num");
    }

}
