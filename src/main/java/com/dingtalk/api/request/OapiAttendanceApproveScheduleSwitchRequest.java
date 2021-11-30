package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceApproveScheduleSwitchResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.approve.schedule.switch request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.19
 */
public class OapiAttendanceApproveScheduleSwitchRequest extends BaseTaobaoRequest<OapiAttendanceApproveScheduleSwitchResponse> {
	
	

	/** 
	* 申请人换班日期当天的班次id
	 */
	private Long applyShiftId;

	/** 
	* 申请换班人id，仅支持排班制考勤组用户
	 */
	private String applyUserid;

	/** 
	* 审批单唯一id
	 */
	private String approveId;

	/** 
	* 申请人还班日期当天的班次id
	 */
	private Long rebackApplyShiftId;

	/** 
	* 还班日期，当天必须有排班或排休，如果申请换班人和被换班人是同一个人，那么必须要有还班日期
	 */
	private String rebackDate;

	/** 
	* 被换班人还班日期当天的班次id
	 */
	private Long rebackTargetShiftId;

	/** 
	* 申请换班日期，当天必须有排班或排休
	 */
	private String switchDate;

	/** 
	* 被换班人换班日期当天的班次id
	 */
	private Long targetShiftId;

	/** 
	* 被换班人id，仅支持排班制考勤组用户
	 */
	private String targetUserid;

	/** 
	* 发起人的user_id
	 */
	private String userid;

	public void setApplyShiftId(Long applyShiftId) {
		this.applyShiftId = applyShiftId;
	}

	public Long getApplyShiftId() {
		return this.applyShiftId;
	}

	public void setApplyUserid(String applyUserid) {
		this.applyUserid = applyUserid;
	}

	public String getApplyUserid() {
		return this.applyUserid;
	}

	public void setApproveId(String approveId) {
		this.approveId = approveId;
	}

	public String getApproveId() {
		return this.approveId;
	}

	public void setRebackApplyShiftId(Long rebackApplyShiftId) {
		this.rebackApplyShiftId = rebackApplyShiftId;
	}

	public Long getRebackApplyShiftId() {
		return this.rebackApplyShiftId;
	}

	public void setRebackDate(String rebackDate) {
		this.rebackDate = rebackDate;
	}

	public String getRebackDate() {
		return this.rebackDate;
	}

	public void setRebackTargetShiftId(Long rebackTargetShiftId) {
		this.rebackTargetShiftId = rebackTargetShiftId;
	}

	public Long getRebackTargetShiftId() {
		return this.rebackTargetShiftId;
	}

	public void setSwitchDate(String switchDate) {
		this.switchDate = switchDate;
	}

	public String getSwitchDate() {
		return this.switchDate;
	}

	public void setTargetShiftId(Long targetShiftId) {
		this.targetShiftId = targetShiftId;
	}

	public Long getTargetShiftId() {
		return this.targetShiftId;
	}

	public void setTargetUserid(String targetUserid) {
		this.targetUserid = targetUserid;
	}

	public String getTargetUserid() {
		return this.targetUserid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.approve.schedule.switch";
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
		txtParams.put("apply_shift_id", this.applyShiftId);
		txtParams.put("apply_userid", this.applyUserid);
		txtParams.put("approve_id", this.approveId);
		txtParams.put("reback_apply_shift_id", this.rebackApplyShiftId);
		txtParams.put("reback_date", this.rebackDate);
		txtParams.put("reback_target_shift_id", this.rebackTargetShiftId);
		txtParams.put("switch_date", this.switchDate);
		txtParams.put("target_shift_id", this.targetShiftId);
		txtParams.put("target_userid", this.targetUserid);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceApproveScheduleSwitchResponse> getResponseClass() {
		return OapiAttendanceApproveScheduleSwitchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(applyUserid, "applyUserid");
		RequestCheckUtils.checkNotEmpty(approveId, "approveId");
		RequestCheckUtils.checkMaxLength(approveId, 100, "approveId");
		RequestCheckUtils.checkNotEmpty(switchDate, "switchDate");
		RequestCheckUtils.checkNotEmpty(targetUserid, "targetUserid");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}