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

import com.dingtalk.api.response.OapiEduClassListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.class.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiEduClassListRequest extends BaseTaobaoRequest<OapiEduClassListResponse> {
	
	

	/** 
	* 年级ID
	 */
	private Long gradeId;

	/** 
	* 分页页数
	 */
	private Long pageNo;

	/** 
	* 分页每页大小
	 */
	private Long pageSize;

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getGradeId() {
		return this.gradeId;
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
		return "dingtalk.oapi.edu.class.list";
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
		txtParams.put("grade_id", this.gradeId);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduClassListResponse> getResponseClass() {
		return OapiEduClassListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(gradeId, "gradeId");
		RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
	}
	

}