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

import com.dingtalk.api.response.OapiEduDeptListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.dept.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.23
 */
public class OapiEduDeptListRequest extends BaseTaobaoRequest<OapiEduDeptListResponse> {
	
	

	/** 
	* 页码，从1开始
	 */
	private Long pageNo;

	/** 
	* 每页大小，最大30
	 */
	private Long pageSize;

	/** 
	* 父部门节点id，如果不填，则默认获取第一层级的部门节点
	 */
	private Long superId;

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

	public void setSuperId(Long superId) {
		this.superId = superId;
	}

	public Long getSuperId() {
		return this.superId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.dept.list";
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
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("super_id", this.superId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduDeptListResponse> getResponseClass() {
		return OapiEduDeptListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
	}
	

}