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

import com.dingtalk.api.response.OapiKacOpenliveRecordListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.openlive.record.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.22
 */
public class OapiKacOpenliveRecordListRequest extends BaseTaobaoRequest<OapiKacOpenliveRecordListResponse> {
	
	

	/** 
	* 员工id
	 */
	private String authorUserId;

	/** 
	* 查询时间范围开始时间戳
	 */
	private Long beginTime;

	/** 
	* 查询时间范围结束时间戳
	 */
	private Long endTime;

	/** 
	* 分页大小，小于等于100
	 */
	private Long pageSize;

	/** 
	* 第几页，从1开始
	 */
	private Long pageStart;

	/** 
	* 直播状态：init: 未开播, living: 直播中，end: 直播已结束, null或空: 全体
	 */
	private String status;

	public void setAuthorUserId(String authorUserId) {
		this.authorUserId = authorUserId;
	}

	public String getAuthorUserId() {
		return this.authorUserId;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageStart(Long pageStart) {
		this.pageStart = pageStart;
	}

	public Long getPageStart() {
		return this.pageStart;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.openlive.record.list";
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
		txtParams.put("author_user_id", this.authorUserId);
		txtParams.put("begin_time", this.beginTime);
		txtParams.put("end_time", this.endTime);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("page_start", this.pageStart);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiKacOpenliveRecordListResponse> getResponseClass() {
		return OapiKacOpenliveRecordListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(authorUserId, "authorUserId");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(pageStart, "pageStart");
	}
	

}