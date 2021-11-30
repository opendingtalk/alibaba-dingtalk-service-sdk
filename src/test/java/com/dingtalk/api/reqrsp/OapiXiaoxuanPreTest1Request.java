package com.dingtalk.api.reqrsp;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP DingTalk-API: dingtalk.oapi.xiaoxuan.pre.test1 request
 *
 * @author top auto create
 * @since 1.0, 2018.04.26
 */
public class OapiXiaoxuanPreTest1Request extends BaseTaobaoRequest<OapiXiaoxuanPreTest1Response> {



    /**
     * 1
     */
    private String normalData;

    /**
     * 1
     */
    private String systemData;

    public void setNormalData(String normalData) {
        this.normalData = normalData;
    }

    public String getNormalData() {
        return this.normalData;
    }

    public void setSystemData(String systemData) {
        this.systemData = systemData;
    }

    public String getSystemData() {
        return this.systemData;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.xiaoxuan.pre.test1";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return "POST";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("normalData", this.normalData);
        txtParams.put("systemData", this.systemData);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiXiaoxuanPreTest1Response> getResponseClass() {
        return OapiXiaoxuanPreTest1Response.class;
    }

    public void check() throws ApiRuleException {
    }


}
