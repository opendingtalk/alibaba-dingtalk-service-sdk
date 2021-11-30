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

import com.dingtalk.api.response.OapiInactiveUserV2GetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.inactive.user.v2.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.13
 */
public class OapiInactiveUserV2GetRequest extends BaseTaobaoRequest<OapiInactiveUserV2GetResponse> {
	
	

	/** 
	* 过滤部门id列表，不传表示查询整个企业
	 */
	private String deptIds;

	/** 
	* 是否活跃 false不活跃 true 活跃
	 */
	private Boolean isActive;

	/** 
	* 获取数据偏移量，第一页使用0，后面页使用接口返回的nextCursor
	 */
	private Long offset;

	/** 
	* 查询日期, 日期格式yyyyMMdd
	 */
	private String queryDate;

	/** 
	* 获取数据size,最大100
	 */
	private Long size;

	public void setDeptIds(String deptIds) {
		this.deptIds = deptIds;
	}

	public String getDeptIds() {
		return this.deptIds;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

	public String getQueryDate() {
		return this.queryDate;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.inactive.user.v2.get";
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
		txtParams.put("dept_ids", this.deptIds);
		txtParams.put("is_active", this.isActive);
		txtParams.put("offset", this.offset);
		txtParams.put("query_date", this.queryDate);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiInactiveUserV2GetResponse> getResponseClass() {
		return OapiInactiveUserV2GetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(deptIds, 100, "deptIds");
		RequestCheckUtils.checkNotEmpty(isActive, "isActive");
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkNotEmpty(queryDate, "queryDate");
		RequestCheckUtils.checkNotEmpty(size, "size");
	}
	

}