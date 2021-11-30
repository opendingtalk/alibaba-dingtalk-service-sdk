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

import com.dingtalk.api.response.OapiAttendanceApproveFinishResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.approve.finish request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.03
 */
public class OapiAttendanceApproveFinishRequest extends BaseTaobaoRequest<OapiAttendanceApproveFinishResponse> {
	
	

	/** 
	* 审批单全局唯一id，最大长度100个字符
	 */
	private String approveId;

	/** 
	* 审批单类型1:加班，2：外出、出差，3：请假
	 */
	private Long bizType;

	/** 
	* 计算方法，0：按自然日计算，1：按工作日计算
	 */
	private Long calculateModel;

	/** 
	* 钉钉侧审批单全局唯一id，最大长度64个字符
	 */
	private String dingtalkApproveId;

	/** 
	* 时长单位，支持的day,halfDay,hour，biz_type为1时仅支持hour。时间格式必须与时长单位对应，2019-08-15对应day，2019-08-15  AM对应halfDay，2019-08-15 12:43对应hour
	 */
	private String durationUnit;

	/** 
	* 开始时间，支持的时间格式 2019-08-152019-08-15 AM2019-08-15 12:43。开始时间不能早于当前时间前31天
	 */
	private String fromTime;

	/** 
	* 审批单跳转地址，最大长度100个字符
	 */
	private String jumpUrl;

	/** 
	* biz_type为1时必传，加班时长单位小时
	 */
	private String overtimeDuration;

	/** 
	* biz_type为1时必传，1：加班转调休，2：加班转工资
	 */
	private Long overtimeToMore;

	/** 
	* 子类型名称，最大长度20个字符
	 */
	private String subType;

	/** 
	* 审批单类型名称，最大长度20个字符
	 */
	private String tagName;

	/** 
	* 结束时间，支持的时间格式 2019-08-152019-08-15 AM2019-08-15 12:43。结束时间减去开始时间的天数不能超过31天。biz_type为1时结束时间减去开始时间不能超过1天
	 */
	private String toTime;

	/** 
	* 员工的user_id
	 */
	private String userid;

	public void setApproveId(String approveId) {
		this.approveId = approveId;
	}

	public String getApproveId() {
		return this.approveId;
	}

	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Long getBizType() {
		return this.bizType;
	}

	public void setCalculateModel(Long calculateModel) {
		this.calculateModel = calculateModel;
	}

	public Long getCalculateModel() {
		return this.calculateModel;
	}

	public void setDingtalkApproveId(String dingtalkApproveId) {
		this.dingtalkApproveId = dingtalkApproveId;
	}

	public String getDingtalkApproveId() {
		return this.dingtalkApproveId;
	}

	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}

	public String getDurationUnit() {
		return this.durationUnit;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getFromTime() {
		return this.fromTime;
	}

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}

	public void setOvertimeDuration(String overtimeDuration) {
		this.overtimeDuration = overtimeDuration;
	}

	public String getOvertimeDuration() {
		return this.overtimeDuration;
	}

	public void setOvertimeToMore(Long overtimeToMore) {
		this.overtimeToMore = overtimeToMore;
	}

	public Long getOvertimeToMore() {
		return this.overtimeToMore;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getSubType() {
		return this.subType;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getToTime() {
		return this.toTime;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.approve.finish";
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
		txtParams.put("approve_id", this.approveId);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("calculate_model", this.calculateModel);
		txtParams.put("dingtalk_approve_id", this.dingtalkApproveId);
		txtParams.put("duration_unit", this.durationUnit);
		txtParams.put("from_time", this.fromTime);
		txtParams.put("jump_url", this.jumpUrl);
		txtParams.put("overtime_duration", this.overtimeDuration);
		txtParams.put("overtime_to_more", this.overtimeToMore);
		txtParams.put("sub_type", this.subType);
		txtParams.put("tag_name", this.tagName);
		txtParams.put("to_time", this.toTime);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceApproveFinishResponse> getResponseClass() {
		return OapiAttendanceApproveFinishResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(approveId, 100, "approveId");
		RequestCheckUtils.checkMaxLength(dingtalkApproveId, 64, "dingtalkApproveId");
		RequestCheckUtils.checkMaxLength(jumpUrl, 200, "jumpUrl");
		RequestCheckUtils.checkMaxLength(subType, 20, "subType");
		RequestCheckUtils.checkMaxLength(tagName, 20, "tagName");
	}
	

}