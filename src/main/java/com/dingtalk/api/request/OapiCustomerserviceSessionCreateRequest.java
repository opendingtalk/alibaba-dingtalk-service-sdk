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
import com.dingtalk.api.response.OapiCustomerserviceSessionCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.session.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.29
 */
public class OapiCustomerserviceSessionCreateRequest extends BaseTaobaoRequest<OapiCustomerserviceSessionCreateResponse> {
	
	

	/** 
	* 新建会话参数
	 */
	private String createSession;

	public void setCreateSession(String createSession) {
		this.createSession = createSession;
	}

	public void setCreateSession(CreateSessionDTO createSession) {
		this.createSession = new JSONWriter(false,false,true).write(createSession);
	}

	public String getCreateSession() {
		return this.createSession;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.session.create";
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
		txtParams.put("create_session", this.createSession);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceSessionCreateResponse> getResponseClass() {
		return OapiCustomerserviceSessionCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 会员来源
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SessionSourceDTO extends TaobaoObject {
		private static final long serialVersionUID = 6176913313321394819L;
		/**
		 * **      * H5页面      *     H5(0),     **      * APP内嵌的链接      *     APP(1),     **      * 微信小程序      *     WE_CHAT_APPLETS(2),     **      * 微信公众号      *     WE_CHAT_OFFICIAL_ACCOUNTS(3)
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 发起咨询的头像
		 */
		@ApiField("channel_avatar_url")
		private String channelAvatarUrl;
		/**
		 * 渠道名称
		 */
		@ApiField("channel_nick")
		private String channelNick;
		/**
		 * 渠道会员id
		 */
		@ApiField("channel_uid")
		private String channelUid;
		/**
		 * 渠道会员所属的系统
		 */
		@ApiField("channel_user_source")
		private String channelUserSource;
		/**
		 * 会员id
		 */
		@ApiField("cms_id")
		private String cmsId;
		/**
		 * 会话结束时间
		 */
		@ApiField("session_end_time")
		private Long sessionEndTime;
		/**
		 * 会话来源
		 */
		@ApiField("session_source")
		private String sessionSource;
		/**
		 * 会话开始时间
		 */
		@ApiField("session_start_time")
		private Long sessionStartTime;
		/**
		 * 0会话中，1已结束
		 */
		@ApiField("session_status")
		private Long sessionStatus;
		/**
		 * 会话id
		 */
		@ApiField("sid")
		private String sid;
		/**
		 * 会话摘要
		 */
		@ApiField("summary")
		private String summary;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getChannelAvatarUrl() {
			return this.channelAvatarUrl;
		}
		public void setChannelAvatarUrl(String channelAvatarUrl) {
			this.channelAvatarUrl = channelAvatarUrl;
		}
		public String getChannelNick() {
			return this.channelNick;
		}
		public void setChannelNick(String channelNick) {
			this.channelNick = channelNick;
		}
		public String getChannelUid() {
			return this.channelUid;
		}
		public void setChannelUid(String channelUid) {
			this.channelUid = channelUid;
		}
		public String getChannelUserSource() {
			return this.channelUserSource;
		}
		public void setChannelUserSource(String channelUserSource) {
			this.channelUserSource = channelUserSource;
		}
		public String getCmsId() {
			return this.cmsId;
		}
		public void setCmsId(String cmsId) {
			this.cmsId = cmsId;
		}
		public Long getSessionEndTime() {
			return this.sessionEndTime;
		}
		public void setSessionEndTime(Long sessionEndTime) {
			this.sessionEndTime = sessionEndTime;
		}
		public String getSessionSource() {
			return this.sessionSource;
		}
		public void setSessionSource(String sessionSource) {
			this.sessionSource = sessionSource;
		}
		public Long getSessionStartTime() {
			return this.sessionStartTime;
		}
		public void setSessionStartTime(Long sessionStartTime) {
			this.sessionStartTime = sessionStartTime;
		}
		public Long getSessionStatus() {
			return this.sessionStatus;
		}
		public void setSessionStatus(Long sessionStatus) {
			this.sessionStatus = sessionStatus;
		}
		public String getSid() {
			return this.sid;
		}
		public void setSid(String sid) {
			this.sid = sid;
		}
		public String getSummary() {
			return this.summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
	}
	
	/**
	 * 会话目标
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SessionTargetDTO extends TaobaoObject {
		private static final long serialVersionUID = 3647796911713145888L;
		/**
		 * 业务单元id
		 */
		@ApiField("bu_id")
		private String buId;
		/**
		 * 钉钉的corpId
		 */
		@ApiField("ding_corp_id")
		private String dingCorpId;
		/**
		 * 实例的id
		 */
		@ApiField("open_instance_id")
		private String openInstanceId;
		/**
		 * 1，智能客服；1001，经济体版本
		 */
		@ApiField("production_type")
		private Long productionType;
		/**
		 * 服务编号
		 */
		@ApiField("service_id")
		private String serviceId;
		/**
		 * 会话来源
		 */
		@ApiField("session_source")
		private String sessionSource;
	
		public String getBuId() {
			return this.buId;
		}
		public void setBuId(String buId) {
			this.buId = buId;
		}
		public String getDingCorpId() {
			return this.dingCorpId;
		}
		public void setDingCorpId(String dingCorpId) {
			this.dingCorpId = dingCorpId;
		}
		public String getOpenInstanceId() {
			return this.openInstanceId;
		}
		public void setOpenInstanceId(String openInstanceId) {
			this.openInstanceId = openInstanceId;
		}
		public Long getProductionType() {
			return this.productionType;
		}
		public void setProductionType(Long productionType) {
			this.productionType = productionType;
		}
		public String getServiceId() {
			return this.serviceId;
		}
		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}
		public String getSessionSource() {
			return this.sessionSource;
		}
		public void setSessionSource(String sessionSource) {
			this.sessionSource = sessionSource;
		}
	}
	
	/**
	 * 新建会话参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateSessionDTO extends TaobaoObject {
		private static final long serialVersionUID = 6738137573615417984L;
		/**
		 * 会员来源
		 */
		@ApiField("source")
		private SessionSourceDTO source;
		/**
		 * 会话目标
		 */
		@ApiField("target")
		private SessionTargetDTO target;
	
		public SessionSourceDTO getSource() {
			return this.source;
		}
		public void setSource(SessionSourceDTO source) {
			this.source = source;
		}
		public SessionTargetDTO getTarget() {
			return this.target;
		}
		public void setTarget(SessionTargetDTO target) {
			this.target = target;
		}
	}
	

}