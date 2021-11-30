package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceApproveCheckResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.approve.check request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.30
 */
public class OapiAttendanceApproveCheckRequest extends BaseTaobaoRequest<OapiAttendanceApproveCheckResponse> {
	
	

	/** 
	* 审批单id，全局唯一
	 */
	private String approveId;

	/** 
	* 审批单跳转地址
	 */
	private String jumpUrl;

	/** 
	* 排班时间
	 */
	private String punchCheckTime;

	/** 
	* 要补的排班id
	 */
	private Long punchId;

	/** 
	* 审批单名称
	 */
	private String tagName;

	/** 
	* 用户打卡时间
	 */
	private String userCheckTime;

	/** 
	* 员工的user_id
	 */
	private String userid;

	/** 
	* 要补哪一天的卡，注意这个日期不是实际要补的日期，而是班次的日期。例如用户要补卡的时间是2019-08-16 00:20，排班时间是2019-08-15 23：50，那么这里要传的日期是2019-08-15
	 */
	private String workDate;

	public void setApproveId(String approveId) {
		this.approveId = approveId;
	}

	public String getApproveId() {
		return this.approveId;
	}

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}

	public void setPunchCheckTime(String punchCheckTime) {
		this.punchCheckTime = punchCheckTime;
	}

	public String getPunchCheckTime() {
		return this.punchCheckTime;
	}

	public void setPunchId(Long punchId) {
		this.punchId = punchId;
	}

	public Long getPunchId() {
		return this.punchId;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setUserCheckTime(String userCheckTime) {
		this.userCheckTime = userCheckTime;
	}

	public String getUserCheckTime() {
		return this.userCheckTime;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getWorkDate() {
		return this.workDate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.approve.check";
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
		txtParams.put("jump_url", this.jumpUrl);
		txtParams.put("punch_check_time", this.punchCheckTime);
		txtParams.put("punch_id", this.punchId);
		txtParams.put("tag_name", this.tagName);
		txtParams.put("user_check_time", this.userCheckTime);
		txtParams.put("userid", this.userid);
		txtParams.put("work_date", this.workDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceApproveCheckResponse> getResponseClass() {
		return OapiAttendanceApproveCheckResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}