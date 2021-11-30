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
import com.dingtalk.api.response.OapiProcessinstanceCspacePreviewResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.cspace.preview request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.05
 */
public class OapiProcessinstanceCspacePreviewRequest extends BaseTaobaoRequest<OapiProcessinstanceCspacePreviewResponse> {
	
	

	/** 
	* request
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GrantCspaceRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.processinstance.cspace.preview";
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

	public Class<OapiProcessinstanceCspacePreviewResponse> getResponseClass() {
		return OapiProcessinstanceCspacePreviewResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * request
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GrantCspaceRequest extends TaobaoObject {
		private static final long serialVersionUID = 3434341334317952856L;
		/**
		 * 应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 附件id
		 */
		@ApiField("file_id")
		private String fileId;
		/**
		 * 附件id列表，支持批量授权
		 */
		@ApiListField("fileid_list")
		@ApiField("string")
		private List<String> fileidList;
		/**
		 * 实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 授权用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getFileId() {
			return this.fileId;
		}
		public void setFileId(String fileId) {
			this.fileId = fileId;
		}
		public List<String> getFileidList() {
			return this.fileidList;
		}
		public void setFileidList(List<String> fileidList) {
			this.fileidList = fileidList;
		}
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}