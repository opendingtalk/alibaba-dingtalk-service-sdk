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
import com.dingtalk.api.response.OapiOpenencryptEncryptboxStatusUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.openencrypt.encryptbox.status.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.07
 */
public class OapiOpenencryptEncryptboxStatusUpdateRequest extends BaseTaobaoRequest<OapiOpenencryptEncryptboxStatusUpdateResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String topEncryptBoxStatus;

	public void setTopEncryptBoxStatus(String topEncryptBoxStatus) {
		this.topEncryptBoxStatus = topEncryptBoxStatus;
	}

	public void setTopEncryptBoxStatus(TopEncryptBoxStatus topEncryptBoxStatus) {
		this.topEncryptBoxStatus = new JSONWriter(false,false,true).write(topEncryptBoxStatus);
	}

	public String getTopEncryptBoxStatus() {
		return this.topEncryptBoxStatus;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.openencrypt.encryptbox.status.update";
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
		txtParams.put("top_encrypt_box_status", this.topEncryptBoxStatus);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOpenencryptEncryptboxStatusUpdateResponse> getResponseClass() {
		return OapiOpenencryptEncryptboxStatusUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopEncryptBoxStatus extends TaobaoObject {
		private static final long serialVersionUID = 8556636839216392568L;
		/**
		 * 微应用的id
		 */
		@ApiField("appid")
		private Long appid;
		/**
		 * 组织的id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 附加信息，方便扩展
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 请求的id
		 */
		@ApiField("request_id")
		private String requestId;
		/**
		 * 加密盒子状态，1表示盒子掉线，2表示盒子上线，3表示企业之前有盒子，现在变成了无盒子的状态
		 */
		@ApiField("status")
		private Long status;
	
		public Long getAppid() {
			return this.appid;
		}
		public void setAppid(Long appid) {
			this.appid = appid;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getRequestId() {
			return this.requestId;
		}
		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	

}