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
import com.dingtalk.api.response.OapiWorkspaceProjectNoticeSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.notice.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.19
 */
public class OapiWorkspaceProjectNoticeSendRequest extends BaseTaobaoRequest<OapiWorkspaceProjectNoticeSendResponse> {
	
	

	/** 
	* 发送通知入参
	 */
	private String sendNoticeReq;

	public void setSendNoticeReq(String sendNoticeReq) {
		this.sendNoticeReq = sendNoticeReq;
	}

	public void setSendNoticeReq(OpenSendNoticeRequestDto sendNoticeReq) {
		this.sendNoticeReq = new JSONWriter(false,false,true).write(sendNoticeReq);
	}

	public String getSendNoticeReq() {
		return this.sendNoticeReq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.project.notice.send";
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
		txtParams.put("send_notice_req", this.sendNoticeReq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceProjectNoticeSendResponse> getResponseClass() {
		return OapiWorkspaceProjectNoticeSendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 发送通知入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenSendNoticeRequestDto extends TaobaoObject {
		private static final long serialVersionUID = 2749971662525759386L;
		/**
		 * 圈子corpId+secret方式调用接口，没有agentId可以不传此时透出给用户是以圈子名字发通知。如果是isv方式的圈子应用，在圈子开通时会推送给isv agentID，必须传入agentId，会以圈子内应用的身份发通知
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 通知点击跳转的手机链接
		 */
		@ApiField("mobile_url")
		private String mobileUrl;
		/**
		 * 通知文本内容 1-512字符
		 */
		@ApiField("msg_content")
		private String msgContent;
		/**
		 * 通知点击跳转的pc链接
		 */
		@ApiField("pc_url")
		private String pcUrl;
		/**
		 * 接收人在圈子组织内的userid
		 */
		@ApiListField("receiver_userids")
		@ApiField("string")
		private List<String> receiverUserids;
		/**
		 * 是否在圈子入口展示数字红点+1，默认情况只是点进圈子在通知那一栏有数字红点，该值设为true后会在圈子入口也展示数字红点
		 */
		@ApiField("show_red_point")
		private Boolean showRedPoint;
		/**
		 * 防重复，如果2个请求传入同样的uuid，第二个请求会返回成功
		 */
		@ApiField("uuid")
		private String uuid;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getMobileUrl() {
			return this.mobileUrl;
		}
		public void setMobileUrl(String mobileUrl) {
			this.mobileUrl = mobileUrl;
		}
		public String getMsgContent() {
			return this.msgContent;
		}
		public void setMsgContent(String msgContent) {
			this.msgContent = msgContent;
		}
		public String getPcUrl() {
			return this.pcUrl;
		}
		public void setPcUrl(String pcUrl) {
			this.pcUrl = pcUrl;
		}
		public List<String> getReceiverUserids() {
			return this.receiverUserids;
		}
		public void setReceiverUserids(List<String> receiverUserids) {
			this.receiverUserids = receiverUserids;
		}
		public Boolean getShowRedPoint() {
			return this.showRedPoint;
		}
		public void setShowRedPoint(Boolean showRedPoint) {
			this.showRedPoint = showRedPoint;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	

}