package com.dingtalk.api.reqrsp;

import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.FileItem;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP DingTalk-API: dingtalk.oapi.media.upload request
 *
 * @author top auto create
 * @since 1.0, 2018.05.03
 */
public class OapiMediaUploadRequest extends BaseTaobaoRequest<OapiMediaUploadResponse> implements TaobaoUploadRequest<OapiMediaUploadResponse> {



    /**
     * form-data???????????????????????????filename???filelength???content-type?????????
     */
    private FileItem media;

    /**
     * ???????????????????????????????????????image???????????????voice??????????????????(file)
     */
    private String type;

    public void setMedia(FileItem media) {
        this.media = media;
    }

    public FileItem getMedia() {
        return this.media;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.media.upload";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("type", this.type);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiMediaUploadResponse> getResponseClass() {
        return OapiMediaUploadResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(media, "media");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("media", this.media);
        return params;
    }


}
