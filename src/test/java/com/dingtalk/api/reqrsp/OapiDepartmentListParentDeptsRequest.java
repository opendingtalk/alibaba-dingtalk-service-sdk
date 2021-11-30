package com.dingtalk.api.reqrsp;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.list_parent_depts request
 *
 * @author top auto create
 * @since 1.0, 2018.05.03
 */
public class OapiDepartmentListParentDeptsRequest extends BaseTaobaoRequest<OapiDepartmentListParentDeptsResponse> {



    /**
     * ??????userId
     */
    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.department.list_parent_depts";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return "GET";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("userId", this.userId);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiDepartmentListParentDeptsResponse> getResponseClass() {
        return OapiDepartmentListParentDeptsResponse.class;
    }

    public void check() throws ApiRuleException {
    }


}
