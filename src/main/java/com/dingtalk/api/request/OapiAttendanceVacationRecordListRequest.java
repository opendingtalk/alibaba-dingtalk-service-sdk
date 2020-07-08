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

import com.dingtalk.api.response.OapiAttendanceVacationRecordListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.record.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiAttendanceVacationRecordListRequest extends BaseTaobaoRequest<OapiAttendanceVacationRecordListResponse> {
	
	

	/** 
	* 假期类型唯一标识
	 */
	private String leaveCode;

	/** 
	* 分页偏移(从0开始非负整数)
	 */
	private Long offset;

	/** 
	* 操作者ID
	 */
	private String opUserid;

	/** 
	* 分页偏移(正整数 最大50)
	 */
	private Long size;

	/** 
	* 待查询员工ID列表
	 */
	private String userids;

	public void setLeaveCode(String leaveCode) {
		this.leaveCode = leaveCode;
	}

	public String getLeaveCode() {
		return this.leaveCode;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setUserids(String userids) {
		this.userids = userids;
	}

	public String getUserids() {
		return this.userids;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.vacation.record.list";
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
		txtParams.put("leave_code", this.leaveCode);
		txtParams.put("offset", this.offset);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("size", this.size);
		txtParams.put("userids", this.userids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceVacationRecordListResponse> getResponseClass() {
		return OapiAttendanceVacationRecordListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(leaveCode, "leaveCode");
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkMinValue(offset, 0L, "offset");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 200L, "size");
		RequestCheckUtils.checkNotEmpty(userids, "userids");
		RequestCheckUtils.checkMaxListSize(userids, 50, "userids");
	}
	

}