package com.dingtalk.api.request;

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
import com.dingtalk.api.response.OapiSmartworkHrmEmployeeAttachmentUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.attachment.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.21
 */
public class OapiSmartworkHrmEmployeeAttachmentUpdateRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeAttachmentUpdateResponse> {
	
	

	/** 
	* 微应用在企业的AgentId
	 */
	private String agentid;

	/** 
	* 更新信息
	 */
	private String param;

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public String getAgentid() {
		return this.agentid;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(EmpAttachmentUpdateParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.attachment.update";
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
		txtParams.put("agentid", this.agentid);
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeAttachmentUpdateResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeAttachmentUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
	}
	
	/**
	 * 更新信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpAttachmentUpdateParam extends TaobaoObject {
		private static final long serialVersionUID = 1716728741811228891L;
		/**
		 * 字段ID
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 文件名后缀，用以标识和展示
		 */
		@ApiField("file_suffix")
		private String fileSuffix;
		/**
		 * 文件id，参考oapi.dingtalk.commediaupload接口
		 */
		@ApiField("media_id")
		private String mediaId;
		/**
		 * 用户ID
		 */
		@ApiField("userid")
		private String userid;
	
		public String getFieldCode() {
			return this.fieldCode;
		}
		public void setFieldCode(String fieldCode) {
			this.fieldCode = fieldCode;
		}
		public String getFileSuffix() {
			return this.fileSuffix;
		}
		public void setFileSuffix(String fileSuffix) {
			this.fileSuffix = fileSuffix;
		}
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}