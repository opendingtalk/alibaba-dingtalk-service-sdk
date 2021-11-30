package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
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
import com.dingtalk.api.response.OapiBipaasNotifyGrouprobotResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.bipaas.notify.grouprobot request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiBipaasNotifyGrouprobotRequest extends BaseTaobaoRequest<OapiBipaasNotifyGrouprobotResponse> {
	
	

	/** 
	* 群机器人通知请求
	 */
	private String robotNotify;

	public void setRobotNotify(String robotNotify) {
		this.robotNotify = robotNotify;
	}

	public void setRobotNotify(GroupRobotNotifyDto robotNotify) {
		this.robotNotify = new JSONWriter(false,false,true).write(robotNotify);
	}

	public String getRobotNotify() {
		return this.robotNotify;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.bipaas.notify.grouprobot";
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
		txtParams.put("robot_notify", this.robotNotify);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiBipaasNotifyGrouprobotResponse> getResponseClass() {
		return OapiBipaasNotifyGrouprobotResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 群机器人通知请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupRobotNotifyDto extends TaobaoObject {
		private static final long serialVersionUID = 5819841856548777848L;
		/**
		 * 需要@到的金融云租户下操作员列表
		 */
		@ApiListField("antcloud_operator_ids")
		@ApiField("string")
		private List<String> antcloudOperatorIds;
		/**
		 * 金融云租户 ID
		 */
		@ApiField("antcloud_tenant_id")
		private String antcloudTenantId;
		/**
		 * 对应消息格式内容
		 */
		@ApiField("message_body")
		private String messageBody;
		/**
		 * 消息格式
		 */
		@ApiField("message_type")
		private String messageType;
		/**
		 * 钉钉群机器人地址
		 */
		@ApiField("robot_url")
		private String robotUrl;
	
		public List<String> getAntcloudOperatorIds() {
			return this.antcloudOperatorIds;
		}
		public void setAntcloudOperatorIds(List<String> antcloudOperatorIds) {
			this.antcloudOperatorIds = antcloudOperatorIds;
		}
		public String getAntcloudTenantId() {
			return this.antcloudTenantId;
		}
		public void setAntcloudTenantId(String antcloudTenantId) {
			this.antcloudTenantId = antcloudTenantId;
		}
		public String getMessageBody() {
			return this.messageBody;
		}
		public void setMessageBody(String messageBody) {
			this.messageBody = messageBody;
		}
		public void setMessageBodyString(String messageBody) {
			this.messageBody = messageBody;
		}
		
		public String getMessageType() {
			return this.messageType;
		}
		public void setMessageType(String messageType) {
			this.messageType = messageType;
		}
		public String getRobotUrl() {
			return this.robotUrl;
		}
		public void setRobotUrl(String robotUrl) {
			this.robotUrl = robotUrl;
		}
	}
	

}