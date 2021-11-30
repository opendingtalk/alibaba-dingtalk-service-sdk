package com.dingtalk.api.reqrsp;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import java.util.Map;

public class SmartworkBpmsProcessinstanceGetRequest
        extends BaseTaobaoRequest<SmartworkBpmsProcessinstanceGetResponse>
{
    private String processInstanceId;

    public void setProcessInstanceId(String processInstanceId)
    {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessInstanceId()
    {
        return this.processInstanceId;
    }

    public String getApiMethodName()
    {
        return "dingtalk.smartwork.bpms.processinstance.get";
    }

    public String getTopApiCallType()
    {
        return "top";
    }

    public String getTopHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams()
    {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("process_instance_id", this.processInstanceId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SmartworkBpmsProcessinstanceGetResponse> getResponseClass()
    {
        return SmartworkBpmsProcessinstanceGetResponse.class;
    }

    public void check()
            throws ApiRuleException
    {
        RequestCheckUtils.checkNotEmpty(this.processInstanceId, "processInstanceId");
    }
}
