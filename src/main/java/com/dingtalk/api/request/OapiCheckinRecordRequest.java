package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCheckinRecordResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.checkin.record request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiCheckinRecordRequest extends BaseTaobaoRequest<OapiCheckinRecordResponse> {
	
	

	/** 
	* 部门id（1 表示根部门）
	 */
	private String departmentId;

	/** 
	* 开始时间，精确到毫秒，注意字段的位数 例：1520956800000
	 */
	private Long endTime;

	/** 
	* 支持分页查询，与size 参数同时设置时才生效，此参数代表偏移量，从0 开始
	 */
	private Long offset;

	/** 
	* 排序，asc 为正序，desc 为倒序
	 */
	private String order;

	/** 
	* 支持分页查询，与offset 参数同时设置时才生效，此参数代表分页大小，最大100
	 */
	private Long size;

	/** 
	* 结束时间，精确到毫秒，注意字段的位数 例：1520956800000（默认为当前时间）
	 */
	private Long startTime;

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getOrder() {
		return this.order;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.checkin.record";
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

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_GET;

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
		txtParams.put("department_id", this.departmentId);
		txtParams.put("end_time", this.endTime);
		txtParams.put("offset", this.offset);
		txtParams.put("order", this.order);
		txtParams.put("size", this.size);
		txtParams.put("start_time", this.startTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCheckinRecordResponse> getResponseClass() {
		return OapiCheckinRecordResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}