package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiMessageCorpconversationSendbytemplateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.corpconversation.sendbytemplate request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.08
 */
public class OapiMessageCorpconversationSendbytemplateRequest extends BaseTaobaoRequest<OapiMessageCorpconversationSendbytemplateResponse> {
	
	

	/** 
	* 微应用Id
	 */
	private Long agentId;

	/** 
	* 接收用户所属部门
	 */
	private String deptIdList;

	/** 
	* 模板code
	 */
	private String templateCode;

	/** 
	* 全员
	 */
	private Boolean toAllUser;

	/** 
	* 接收用户
	 */
	private String useridList;

	/** 
	* 模板变量
	 */
	private String vals;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setDeptIdList(String deptIdList) {
		this.deptIdList = deptIdList;
	}

	public String getDeptIdList() {
		return this.deptIdList;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}

	public void setToAllUser(Boolean toAllUser) {
		this.toAllUser = toAllUser;
	}

	public Boolean getToAllUser() {
		return this.toAllUser;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public void setVals(String vals) {
		this.vals = vals;
	}

	public void setVals(List<OaMsgTemplateValList> vals) {
		this.vals = new JSONWriter(false,false,true).write(vals);
	}

	public String getVals() {
		return this.vals;
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
		txtParams.put("dept_id_list", this.deptIdList);
		txtParams.put("template_code", this.templateCode);
		txtParams.put("to_all_user", this.toAllUser);
		txtParams.put("userid_list", this.useridList);
		txtParams.put("vals", this.vals);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageCorpconversationSendbytemplateResponse> getResponseClass() {
		return OapiMessageCorpconversationSendbytemplateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(deptIdList, 20, "deptIdList");
		RequestCheckUtils.checkMaxListSize(useridList, 20, "useridList");
		RequestCheckUtils.checkObjectMaxListSize(vals, 20, "vals");
	}
	
	/**
	 * 模板变量
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OaMsgTemplateValList extends TaobaoObject {
		private static final long serialVersionUID = 8768425212876332452L;
		/**
		 * 变量名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 变量值
		 */
		@ApiField("value")
		private String value;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	

}