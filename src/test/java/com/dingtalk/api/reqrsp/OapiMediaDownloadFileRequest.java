package com.dingtalk.api.reqrsp;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP DingTalk-API: dingtalk.oapi.media.downloadFile request
 *
 * @author top auto create
 * @since 1.0, 2018.05.03
 */
public class OapiMediaDownloadFileRequest extends BaseTaobaoRequest<OapiMediaDownloadFileResponse> {



    /**
     * 1
     */
    private String mediaId;

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.media.downloadFile";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("media_id", this.mediaId);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiMediaDownloadFileResponse> getResponseClass() {
        return OapiMediaDownloadFileResponse.class;
    }

    public void check() throws ApiRuleException {
    }


}