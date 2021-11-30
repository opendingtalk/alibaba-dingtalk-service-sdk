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

import com.dingtalk.api.response.OapiReportStatisticsListbytypeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.report.statistics.listbytype request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.19
 */
public class OapiReportStatisticsListbytypeRequest extends BaseTaobaoRequest<OapiReportStatisticsListbytypeResponse> {
	
	

	/** 
	* 分页查询的游标，最开始传0，后续传返回参数中的next_cursor值，默认值为0
	 */
	private Long offset;

	/** 
	* 日志id
	 */
	private String reportId;

	/** 
	* 分页参数，每页大小，最多传100，默认值为100
	 */
	private Long size;

	/** 
	* 查询类型 0:已读人员列表 1:评论人员列表 2:点赞人员列表
	 */
	private Long type;

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.report.statistics.listbytype";
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
		txtParams.put("offset", this.offset);
		txtParams.put("report_id", this.reportId);
		txtParams.put("size", this.size);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiReportStatisticsListbytypeResponse> getResponseClass() {
		return OapiReportStatisticsListbytypeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(reportId, "reportId");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}