package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiWorkspaceStatusUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.status.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.17
 */
public class OapiWorkspaceStatusUpdateRequest extends BaseTaobaoRequest<OapiWorkspaceStatusUpdateResponse> {
	
	

	/** 
	* 更新状态
	 */
	private String updateStatus;

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}

	public void setUpdateStatus(OpenWorkspaceUpdateStatusDto updateStatus) {
		this.updateStatus = new JSONWriter(false,false,true).write(updateStatus);
	}

	public String getUpdateStatus() {
		return this.updateStatus;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.status.update";
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
		txtParams.put("update_status", this.updateStatus);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceStatusUpdateResponse> getResponseClass() {
		return OapiWorkspaceStatusUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 更新状态
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenWorkspaceUpdateStatusDto extends TaobaoObject {
		private static final long serialVersionUID = 5873899244823984473L;
		/**
		 * 对于项目有如下状态： WORKING进行中 DISBANDED解散 CLOSE归档 RECYCLE回收站状态 新建项目后状态是WORKING，WORKINGCLOSERECYCLE回收站状态可以切换，但是一旦成为DISBANDED则说明项目已销毁无法变更状态
		 */
		@ApiField("status")
		private String status;
	
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	}
	

}