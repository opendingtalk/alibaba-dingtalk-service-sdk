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
import com.dingtalk.api.response.OapiSmartdeviceVisitorSendnotifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.visitor.sendnotify request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartdeviceVisitorSendnotifyRequest extends BaseTaobaoRequest<OapiSmartdeviceVisitorSendnotifyResponse> {
	
	

	/** 
	* 预约ID
	 */
	private String reservationId;

	/** 
	* 访客通知模型
	 */
	private String visitorNotifyVo;

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getReservationId() {
		return this.reservationId;
	}

	public void setVisitorNotifyVo(String visitorNotifyVo) {
		this.visitorNotifyVo = visitorNotifyVo;
	}

	public void setVisitorNotifyVo(VisitorNotifyVo visitorNotifyVo) {
		this.visitorNotifyVo = new JSONWriter(false,false,true).write(visitorNotifyVo);
	}

	public String getVisitorNotifyVo() {
		return this.visitorNotifyVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.visitor.sendnotify";
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
		txtParams.put("reservation_id", this.reservationId);
		txtParams.put("visitor_notify_vo", this.visitorNotifyVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceVisitorSendnotifyResponse> getResponseClass() {
		return OapiSmartdeviceVisitorSendnotifyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 访客通知模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class VisitorNotifyVo extends TaobaoObject {
		private static final long serialVersionUID = 1569561148897352848L;
		/**
		 * 消息内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 设备ID
		 */
		@ApiField("device_id")
		private Long deviceId;
		/**
		 * 接待意见反馈
		 */
		@ApiField("feedback")
		private String feedback;
		/**
		 * 通知类型
		 */
		@ApiField("notify_type")
		private Long notifyType;
		/**
		 * 访客姓名
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 外部联系ID
		 */
		@ApiField("userid")
		private String userid;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Long getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(Long deviceId) {
			this.deviceId = deviceId;
		}
		public String getFeedback() {
			return this.feedback;
		}
		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}
		public Long getNotifyType() {
			return this.notifyType;
		}
		public void setNotifyType(Long notifyType) {
			this.notifyType = notifyType;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}