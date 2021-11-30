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

import com.dingtalk.api.response.OapiCspaceAuditlogListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.auditlog.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.11.25
 */
public class OapiCspaceAuditlogListRequest extends BaseTaobaoRequest<OapiCspaceAuditlogListResponse> {
	
	

	/** 
	* 操作日志截止时间，unix时间戳，单位ms
	 */
	private Long endDate;

	/** 
	* 操作记录文件id，作为分页偏移量，与load_more_gmt_create一起使用，返回记录的biz_id为load_more_biz_id且gmt_create为load_more_gmt_create之后的操作列表，分页查询获取下一页时，传最后一条记录的biz_id和gmt_create。
	 */
	private Long loadMoreBizId;

	/** 
	* 操作记录生成时间，作为分页偏移量，分页查询时必传，unix时间戳，单位ms
	 */
	private Long loadMoreGmtCreate;

	/** 
	* 操作列表长度，最大500
	 */
	private Long pageSize;

	/** 
	* 操作日志起始时间，unix时间戳，单位ms
	 */
	private Long startDate;

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setLoadMoreBizId(Long loadMoreBizId) {
		this.loadMoreBizId = loadMoreBizId;
	}

	public Long getLoadMoreBizId() {
		return this.loadMoreBizId;
	}

	public void setLoadMoreGmtCreate(Long loadMoreGmtCreate) {
		this.loadMoreGmtCreate = loadMoreGmtCreate;
	}

	public Long getLoadMoreGmtCreate() {
		return this.loadMoreGmtCreate;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}

	public Long getStartDate() {
		return this.startDate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.auditlog.list";
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
		txtParams.put("end_date", this.endDate);
		txtParams.put("load_more_biz_id", this.loadMoreBizId);
		txtParams.put("load_more_gmt_create", this.loadMoreGmtCreate);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_date", this.startDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceAuditlogListResponse> getResponseClass() {
		return OapiCspaceAuditlogListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endDate, "endDate");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(startDate, "startDate");
	}
	

}