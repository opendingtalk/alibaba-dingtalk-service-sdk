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
import com.dingtalk.api.response.OapiPbpEventDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.event.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.01
 */
public class OapiPbpEventDeleteRequest extends BaseTaobaoRequest<OapiPbpEventDeleteResponse> {
	
	

	/** 
	* 打卡事件参数模型
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(UserEventOapiRequestVo param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.pbp.event.delete";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPbpEventDeleteResponse> getResponseClass() {
		return OapiPbpEventDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 打卡事件列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserEventOapiVo extends TaobaoObject {
		private static final long serialVersionUID = 3562242353163281492L;
		/**
		 * 打卡业务实例id
		 */
		@ApiField("biz_inst_id")
		private String bizInstId;
		/**
		 * 打卡事件外部id，唯一键
		 */
		@ApiField("event_id")
		private String eventId;
		/**
		 * 打卡事件名称
		 */
		@ApiField("event_name")
		private String eventName;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getBizInstId() {
			return this.bizInstId;
		}
		public void setBizInstId(String bizInstId) {
			this.bizInstId = bizInstId;
		}
		public String getEventId() {
			return this.eventId;
		}
		public void setEventId(String eventId) {
			this.eventId = eventId;
		}
		public String getEventName() {
			return this.eventName;
		}
		public void setEventName(String eventName) {
			this.eventName = eventName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 打卡事件参数模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserEventOapiRequestVo extends TaobaoObject {
		private static final long serialVersionUID = 6453428819929733327L;
		/**
		 * 打卡业务代码
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 打卡事件列表
		 */
		@ApiListField("user_event_list")
		@ApiField("user_event_oapi_vo")
		private List<UserEventOapiVo> userEventList;
	
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public List<UserEventOapiVo> getUserEventList() {
			return this.userEventList;
		}
		public void setUserEventList(List<UserEventOapiVo> userEventList) {
			this.userEventList = userEventList;
		}
	}
	

}