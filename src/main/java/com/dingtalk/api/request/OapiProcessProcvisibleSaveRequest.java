package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiProcessProcvisibleSaveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.procvisible.save request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.24
 */
public class OapiProcessProcvisibleSaveRequest extends BaseTaobaoRequest<OapiProcessProcvisibleSaveResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(UpdateProcessVisibleRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.procvisible.save";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessProcvisibleSaveResponse> getResponseClass() {
		return OapiProcessProcvisibleSaveResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 可见权限配置列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Visiblelist extends TaobaoObject {
		private static final long serialVersionUID = 5879682724918387875L;
		/**
		 * 可见性类型，部门可见（0），员工可见（1）
		 */
		@ApiField("visible_type")
		private Long visibleType;
		/**
		 * 可见值
		 */
		@ApiField("visible_value")
		private String visibleValue;
	
		public Long getVisibleType() {
			return this.visibleType;
		}
		public void setVisibleType(Long visibleType) {
			this.visibleType = visibleType;
		}
		public String getVisibleValue() {
			return this.visibleValue;
		}
		public void setVisibleValue(String visibleValue) {
			this.visibleValue = visibleValue;
		}
	}
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UpdateProcessVisibleRequest extends TaobaoObject {
		private static final long serialVersionUID = 8591383721422996549L;
		/**
		 * 企业应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 流程模板processCode
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 操作人userId
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 可见权限配置列表
		 */
		@ApiListField("visible_list")
		@ApiField("visiblelist")
		private List<Visiblelist> visibleList;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public List<Visiblelist> getVisibleList() {
			return this.visibleList;
		}
		public void setVisibleList(List<Visiblelist> visibleList) {
			this.visibleList = visibleList;
		}
	}
	

}