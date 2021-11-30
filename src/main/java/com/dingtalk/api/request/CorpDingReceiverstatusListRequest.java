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

import com.dingtalk.api.response.CorpDingReceiverstatusListResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ding.receiverstatus.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpDingReceiverstatusListRequest extends BaseTaobaoRequest<CorpDingReceiverstatusListResponse> {
	
	

	/** 
	* 确认状态，三种情况：不传表示查所有；传0表示查未确认状态；传1表示查已经确认状态；
	 */
	private Long confirmedStatus;

	/** 
	* dingid
	 */
	private String dingId;

	/** 
	* 分页页码，从1开始
	 */
	private Long pageNo;

	/** 
	* 每页显示数量，最大值50
	 */
	private Long pageSize;

	public void setConfirmedStatus(Long confirmedStatus) {
		this.confirmedStatus = confirmedStatus;
	}

	public Long getConfirmedStatus() {
		return this.confirmedStatus;
	}

	public void setDingId(String dingId) {
		this.dingId = dingId;
	}

	public String getDingId() {
		return this.dingId;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.ding.receiverstatus.list";
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
		txtParams.put("confirmed_status", this.confirmedStatus);
		txtParams.put("ding_id", this.dingId);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpDingReceiverstatusListResponse> getResponseClass() {
		return CorpDingReceiverstatusListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dingId, "dingId");
		RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
	}
	

}