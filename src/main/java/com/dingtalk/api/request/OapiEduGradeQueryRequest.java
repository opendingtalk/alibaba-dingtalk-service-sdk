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

import com.dingtalk.api.response.OapiEduGradeQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.grade.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.28
 */
public class OapiEduGradeQueryRequest extends BaseTaobaoRequest<OapiEduGradeQueryResponse> {
	
	

	/** 
	* 校区id
	 */
	private Long campusId;

	/** 
	* 钉钉企业管理员
	 */
	private String operator;

	/** 
	* 学段id
	 */
	private Long periodId;

	public void setCampusId(Long campusId) {
		this.campusId = campusId;
	}

	public Long getCampusId() {
		return this.campusId;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}

	public Long getPeriodId() {
		return this.periodId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.grade.query";
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
		txtParams.put("campus_id", this.campusId);
		txtParams.put("operator", this.operator);
		txtParams.put("period_id", this.periodId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduGradeQueryResponse> getResponseClass() {
		return OapiEduGradeQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operator, "operator");
	}
	

}