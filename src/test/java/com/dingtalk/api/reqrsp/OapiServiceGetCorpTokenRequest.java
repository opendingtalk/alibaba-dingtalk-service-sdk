package com.dingtalk.api.reqrsp;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;


/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_corp_token request
 *
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiServiceGetCorpTokenRequest extends BaseTaobaoRequest<OapiServiceGetCorpTokenResponse> {



    /**
     * ?????????corpid
     */
    private String authCorpid;

    /**
     * ????????????????????????get_permanent_code??????
     */
    private String permanentCode;

    public void setAuthCorpid(String authCorpid) {
        this.authCorpid = authCorpid;
    }

    public String getAuthCorpid() {
        return this.authCorpid;
    }

    public void setPermanentCode(String permanentCode) {
        this.permanentCode = permanentCode;
    }

    public String getPermanentCode() {
        return this.permanentCode;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.service.get_corp_token";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auth_corpid", this.authCorpid);
        txtParams.put("permanent_code", this.permanentCode);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiServiceGetCorpTokenResponse> getResponseClass() {
        return OapiServiceGetCorpTokenResponse.class;
    }

    public void check() throws ApiRuleException {
    }


}
