package com.dingtalk.api.reqrsp;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP DingTalk-API: dingtalk.oapi.gettoken request
 *
 * @author top auto create
 * @since 1.0, 2018.05.02
 */
public class OapiGettokenRequest extends BaseTaobaoRequest<OapiGettokenResponse> {



    /**
     * corpid
     */
    private String corpid;

    /**
     * corpsecret
     */
    private String corpsecret;

    public void setCorpid(String corpid) {
        this.corpid = corpid;
    }

    public String getCorpid() {
        return this.corpid;
    }

    public void setCorpsecret(String corpsecret) {
        this.corpsecret = corpsecret;
    }

    public String getCorpsecret() {
        return this.corpsecret;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.gettoken";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return "GET";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("corpid", this.corpid);
        txtParams.put("corpsecret", this.corpsecret);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiGettokenResponse> getResponseClass() {
        return OapiGettokenResponse.class;
    }

    public void check() throws ApiRuleException {
    }


}