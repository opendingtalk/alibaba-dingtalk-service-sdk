package com.dingtalk.api.reqrsp;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;


/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_auth_info request
 *
 * @author top auto create
 * @since 1.0, 2018.05.09
 */
public class OapiServiceGetAuthInfoRequest extends BaseTaobaoRequest<OapiServiceGetAuthInfoResponse> {



    /**
     * ?????????corpid
     */
    private String authCorpid;

    /**
     * ??????key
     */
    private String suiteKey;

    public void setAuthCorpid(String authCorpid) {
        this.authCorpid = authCorpid;
    }

    public String getAuthCorpid() {
        return this.authCorpid;
    }

    public void setSuiteKey(String suiteKey) {
        this.suiteKey = suiteKey;
    }

    public String getSuiteKey() {
        return this.suiteKey;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.service.get_auth_info";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auth_corpid", this.authCorpid);
        txtParams.put("suite_key", this.suiteKey);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiServiceGetAuthInfoResponse> getResponseClass() {
        return OapiServiceGetAuthInfoResponse.class;
    }

    public void check() throws ApiRuleException {
    }


}
