package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpBpmsProcessesGetResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.bpms.processes.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.09
 */
public class CorpBpmsProcessesGetRequest extends BaseTaobaoRequest<CorpBpmsProcessesGetResponse> {
	
	

	/** 
	* 审批接入方标识，2表示钉钉系统内置
	 */
	private Long groupId;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.bpms.processes.get";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group_id", this.groupId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpBpmsProcessesGetResponse> getResponseClass() {
		return CorpBpmsProcessesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMinValue(groupId, 1L, "groupId");
	}
	

}