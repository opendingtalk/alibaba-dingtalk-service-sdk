package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMessageCorpconversationSendbytemplateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.corpconversation.sendbytemplate request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.15
 */
public class OapiMessageCorpconversationSendbytemplateRequest extends BaseTaobaoRequest<OapiMessageCorpconversationSendbytemplateResponse> {
	
	

	/** 
	* 微应用的id
	 */
	private Long agentId;

	/** 
	* 消息模板动态参数赋值数据, key和value均为字符串格式。
	 */
	private String data;

	/** 
	* 接收者的部门id列表
	 */
	private String deptIdList;

	/** 
	* 消息模板id
	 */
	private String templateId;

	/** 
	* 接收者的用户userid列表
	 */
	private String useridList;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setData(String data) {
		this.data = data;
	}
	public void setDataString(String data) {
		this.data = data;
	}

	public String getData() {
		return this.data;
	}

	public void setDeptIdList(String deptIdList) {
		this.deptIdList = deptIdList;
	}

	public String getDeptIdList() {
		return this.deptIdList;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.corpconversation.sendbytemplate";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("data", this.data);
		txtParams.put("dept_id_list", this.deptIdList);
		txtParams.put("template_id", this.templateId);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageCorpconversationSendbytemplateResponse> getResponseClass() {
		return OapiMessageCorpconversationSendbytemplateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkMaxListSize(deptIdList, 500, "deptIdList");
		RequestCheckUtils.checkNotEmpty(templateId, "templateId");
		RequestCheckUtils.checkMaxListSize(useridList, 5000, "useridList");
	}
	

}