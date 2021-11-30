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
import com.dingtalk.api.response.OapiPbpEventResultSyncResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.event.result.sync request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.29
 */
public class OapiPbpEventResultSyncRequest extends BaseTaobaoRequest<OapiPbpEventResultSyncResponse> {
	
	

	/** 
	* 打卡事件结果模型
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(UserEventResultOapiRequestVo param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.pbp.event.result.sync";
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

	public Class<OapiPbpEventResultSyncResponse> getResponseClass() {
		return OapiPbpEventResultSyncResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 打卡成功的位置信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PositionOapiVo extends TaobaoObject {
		private static final long serialVersionUID = 4818737324729951854L;
		/**
		 * 打卡成功的位置点id
		 */
		@ApiField("position_id")
		private String positionId;
		/**
		 * 打卡成功的位置类型
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
	 * 打卡事件结果模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserEventResultOapiRequestVo extends TaobaoObject {
		private static final long serialVersionUID = 6373377277629223145L;
		/**
		 * 打卡业务代码
		 */
		@ApiField("biz_code")
		private String bizCode;
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
		 * 是否失效当前事件，不可重复打卡:true，可重复打卡:false
		 */
		@ApiField("invalid_event")
		private Boolean invalidEvent;
		/**
		 * 打卡成功的位置信息
		 */
		@ApiField("punch_position")
		private PositionOapiVo punchPosition;
		/**
		 * 打卡事件结果，2:成功，3:失败
		 */
		@ApiField("result")
		private Long result;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
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
		public Boolean getInvalidEvent() {
			return this.invalidEvent;
		}
		public void setInvalidEvent(Boolean invalidEvent) {
			this.invalidEvent = invalidEvent;
		}
		public PositionOapiVo getPunchPosition() {
			return this.punchPosition;
		}
		public void setPunchPosition(PositionOapiVo punchPosition) {
			this.punchPosition = punchPosition;
		}
		public Long getResult() {
			return this.result;
		}
		public void setResult(Long result) {
			this.result = result;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}