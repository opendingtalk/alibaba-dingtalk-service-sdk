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

import com.dingtalk.api.response.OapiProjectPointHistoryPageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.project.point.history.page request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.28
 */
public class OapiProjectPointHistoryPageRequest extends BaseTaobaoRequest<OapiProjectPointHistoryPageResponse> {
	
	

	/** 
	* 数据游标，初始传0。后续传入返回参数中的next_cursor值
	 */
	private Long cursor;

	/** 
	* 每页大小，最大200条
	 */
	private Long pageSize;

	/** 
	* 业务ID（固定值，农村积分传7001）
	 */
	private Long tenantId;

	/** 
	* 用户id
	 */
	private String userid;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.project.point.history.page";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProjectPointHistoryPageResponse> getResponseClass() {
		return OapiProjectPointHistoryPageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}