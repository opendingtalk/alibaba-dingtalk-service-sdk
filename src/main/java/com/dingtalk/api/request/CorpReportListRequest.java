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

import com.dingtalk.api.response.CorpReportListResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.report.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpReportListRequest extends BaseTaobaoRequest<CorpReportListResponse> {
	
	

	/** 
	* 查询游标，初始传入0，后续从上一次的返回值中获取
	 */
	private Long cursor;

	/** 
	* 查询截止时间
	 */
	private Long endTime;

	/** 
	* 每页数据量
	 */
	private Long size;

	/** 
	* 查询起始时间
	 */
	private Long startTime;

	/** 
	* 要查询的模板名称
	 */
	private String templateName;

	/** 
	* 员工的userid
	 */
	private String userid;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getEndTime() {
		return this.endTime;
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

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.report.list";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("end_time", this.endTime);
		txtParams.put("size", this.size);
		txtParams.put("start_time", this.startTime);
		txtParams.put("template_name", this.templateName);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpReportListResponse> getResponseClass() {
		return CorpReportListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(endTime, "endTime");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkNotEmpty(startTime, "startTime");
	}
	

}