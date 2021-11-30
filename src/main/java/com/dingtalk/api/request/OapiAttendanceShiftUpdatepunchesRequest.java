package com.dingtalk.api.request;

import java.util.List;
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
import com.dingtalk.api.response.OapiAttendanceShiftUpdatepunchesResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.updatepunches request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.05
 */
public class OapiAttendanceShiftUpdatepunchesRequest extends BaseTaobaoRequest<OapiAttendanceShiftUpdatepunchesResponse> {
	
	

	/** 
	* 操作者userId
	 */
	private String opUserId;

	/** 
	* 卡点设置列表
	 */
	private String punches;

	/** 
	* 班次id
	 */
	private Long shiftId;

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setPunches(String punches) {
		this.punches = punches;
	}

	public void setPunches(List<TopPunchVO> punches) {
		this.punches = new JSONWriter(false,false,true).write(punches);
	}

	public String getPunches() {
		return this.punches;
	}

	public void setShiftId(Long shiftId) {
		this.shiftId = shiftId;
	}

	public Long getShiftId() {
		return this.shiftId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.shift.updatepunches";
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
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("punches", this.punches);
		txtParams.put("shift_id", this.shiftId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceShiftUpdatepunchesResponse> getResponseClass() {
		return OapiAttendanceShiftUpdatepunchesResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkObjectMaxListSize(punches, 20, "punches");
		RequestCheckUtils.checkNotEmpty(shiftId, "shiftId");
	}
	
	/**
	 * 卡点设置列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopPunchVO extends TaobaoObject {
		private static final long serialVersionUID = 8299521293238974328L;
		/**
		 * 是否无需打卡 true：开启无需打卡，false：关闭无需打卡
		 */
		@ApiField("free_check")
		private Boolean freeCheck;
		/**
		 * 卡点id
		 */
		@ApiField("id")
		private Long id;
	
		public Boolean getFreeCheck() {
			return this.freeCheck;
		}
		public void setFreeCheck(Boolean freeCheck) {
			this.freeCheck = freeCheck;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	}
	

}