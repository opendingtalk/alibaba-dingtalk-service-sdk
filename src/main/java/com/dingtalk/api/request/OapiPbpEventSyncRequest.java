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
import com.dingtalk.api.response.OapiPbpEventSyncResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.event.sync request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.29
 */
public class OapiPbpEventSyncRequest extends BaseTaobaoRequest<OapiPbpEventSyncResponse> {
	
	

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
		return "dingtalk.oapi.pbp.event.sync";
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

	public Class<OapiPbpEventSyncResponse> getResponseClass() {
		return OapiPbpEventSyncResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 位置列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PositionOapiVo extends TaobaoObject {
		private static final long serialVersionUID = 7573789973565178433L;
		/**
		 * 位置点id
		 */
		@ApiField("position_id")
		private String positionId;
		/**
		 * 位置类型
		 */
		@ApiField("position_type")
		private Long positionType;
	
		public String getPositionId() {
			return this.positionId;
		}
		public void setPositionId(String positionId) {
			this.positionId = positionId;
		}
		public Long getPositionType() {
			return this.positionType;
		}
		public void setPositionType(Long positionType) {
			this.positionType = positionType;
		}
	}
	
	/**
	 * 打卡事件列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserEventOapiVo extends TaobaoObject {
		private static final long serialVersionUID = 7876344169932988141L;
		/**
		 * 打卡业务实例id
		 */
		@ApiField("biz_inst_id")
		private String bizInstId;
		/**
		 * 打卡事件开始时间，单位毫秒
		 */
		@ApiField("end_time")
		private Long endTime;
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
		 * 打卡事件生成时间戳，单位毫秒
		 */
		@ApiField("event_time_stamp")
		private Long eventTimeStamp;
		/**
		 * 位置列表
		 */
		@ApiListField("position_list")
		@ApiField("position_oapi_vo")
		private List<PositionOapiVo> positionList;
		/**
		 * 打卡事件结束时间，单位毫秒
		 */
		@ApiField("start_time")
		private Long startTime;
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
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
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
		public Long getEventTimeStamp() {
			return this.eventTimeStamp;
		}
		public void setEventTimeStamp(Long eventTimeStamp) {
			this.eventTimeStamp = eventTimeStamp;
		}
		public List<PositionOapiVo> getPositionList() {
			return this.positionList;
		}
		public void setPositionList(List<PositionOapiVo> positionList) {
			this.positionList = positionList;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
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
		private static final long serialVersionUID = 3657279356938951522L;
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