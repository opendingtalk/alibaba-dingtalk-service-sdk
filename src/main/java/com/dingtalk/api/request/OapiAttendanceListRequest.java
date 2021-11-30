package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.list request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.31
 */
public class OapiAttendanceListRequest extends BaseTaobaoRequest<OapiAttendanceListResponse> {
	
	

	/** 
	* 是否国际化
	 */
	private Boolean isI18n;

	/** 
	* 表示获取考勤数据的条数，最大不能超过50条
	 */
	private Long limit;

	/** 
	* 表示获取考勤数据的起始点，第一次传0，如果还有多余数据，下次获取传的offset值为之前的offset+limit
	 */
	private Long offset;

	/** 
	* 员工在企业内的UserID列表，企业用来唯一标识用户的字段
	 */
	private List<String> userIdList;

	/** 
	* 查询考勤打卡记录的起始工作日
	 */
	private String workDateFrom;

	/** 
	* 查询考勤打卡记录的结束工作日
	 */
	private String workDateTo;

	public void setIsI18n(Boolean isI18n) {
		this.isI18n = isI18n;
	}

	public Boolean getIsI18n() {
		return this.isI18n;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}

	public void setWorkDateFrom(String workDateFrom) {
		this.workDateFrom = workDateFrom;
	}

	public String getWorkDateFrom() {
		return this.workDateFrom;
	}

	public void setWorkDateTo(String workDateTo) {
		this.workDateTo = workDateTo;
	}

	public String getWorkDateTo() {
		return this.workDateTo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.list";
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
		txtParams.put("isI18n", this.isI18n);
		txtParams.put("limit", this.limit);
		txtParams.put("offset", this.offset);
		txtParams.put("userIdList", TaobaoUtils.objectToJson(this.userIdList));
		txtParams.put("workDateFrom", this.workDateFrom);
		txtParams.put("workDateTo", this.workDateTo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceListResponse> getResponseClass() {
		return OapiAttendanceListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}