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

import com.dingtalk.api.response.OapiLiveGroupliveViewrecordResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.viewrecord request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.07
 */
public class OapiLiveGroupliveViewrecordRequest extends BaseTaobaoRequest<OapiLiveGroupliveViewrecordResponse> {
	
	

	/** 
	* 部门id
	 */
	private Long deptId;

	/** 
	* 直播uuid
	 */
	private String liveUuid;

	/** 
	* 分页拉取
	 */
	private Long pageIndex;

	/** 
	* 一页多少数据，默认100
	 */
	private Long pageSize;

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public void setLiveUuid(String liveUuid) {
		this.liveUuid = liveUuid;
	}

	public String getLiveUuid() {
		return this.liveUuid;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.live.grouplive.viewrecord";
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
		txtParams.put("dept_id", this.deptId);
		txtParams.put("live_uuid", this.liveUuid);
		txtParams.put("page_index", this.pageIndex);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiLiveGroupliveViewrecordResponse> getResponseClass() {
		return OapiLiveGroupliveViewrecordResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deptId, "deptId");
		RequestCheckUtils.checkNotEmpty(liveUuid, "liveUuid");
		RequestCheckUtils.checkNotEmpty(pageIndex, "pageIndex");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
	}
	

}