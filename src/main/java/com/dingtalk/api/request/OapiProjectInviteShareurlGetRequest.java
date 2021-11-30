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
import com.dingtalk.api.response.OapiProjectInviteShareurlGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.project.invite.shareurl.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.09
 */
public class OapiProjectInviteShareurlGetRequest extends BaseTaobaoRequest<OapiProjectInviteShareurlGetResponse> {
	
	

	/** 
	* 邀请信息
	 */
	private String inviteInfo;

	public void setInviteInfo(String inviteInfo) {
		this.inviteInfo = inviteInfo;
	}

	public void setInviteInfo(InviteUrlQuery inviteInfo) {
		this.inviteInfo = new JSONWriter(false,false,true).write(inviteInfo);
	}

	public String getInviteInfo() {
		return this.inviteInfo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.project.invite.shareurl.get";
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
		txtParams.put("invite_info", this.inviteInfo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProjectInviteShareurlGetResponse> getResponseClass() {
		return OapiProjectInviteShareurlGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 邀请信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InviteUrlQuery extends TaobaoObject {
		private static final long serialVersionUID = 1562179483841417223L;
		/**
		 * 圈子里关联的某个群ID
		 */
		@ApiField("chat_id")
		private String chatId;
		/**
		 * 该分享链接有效时间，以秒为单位。 最大不超过7776000（即90天），此字段如果不填，则默认有效期为30秒。
		 */
		@ApiField("expire_seconds")
		private Long expireSeconds;
		/**
		 * 活动生效后的承接页面标志
		 */
		@ApiField("redirect")
		private String redirect;
		/**
		 * 场景标志，用于区分活动场景
		 */
		@ApiField("scene_id")
		private String sceneId;
		/**
		 * 期限类型：SHORT短期（默认），LONG长期（最多10万个数量限制）
		 */
		@ApiField("term_type")
		private String termType;
		/**
		 * 邀请人的员工ID
		 */
		@ApiField("userid")
		private String userid;
	
		public String getChatId() {
			return this.chatId;
		}
		public void setChatId(String chatId) {
			this.chatId = chatId;
		}
		public Long getExpireSeconds() {
			return this.expireSeconds;
		}
		public void setExpireSeconds(Long expireSeconds) {
			this.expireSeconds = expireSeconds;
		}
		public String getRedirect() {
			return this.redirect;
		}
		public void setRedirect(String redirect) {
			this.redirect = redirect;
		}
		public String getSceneId() {
			return this.sceneId;
		}
		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}
		public String getTermType() {
			return this.termType;
		}
		public void setTermType(String termType) {
			this.termType = termType;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}