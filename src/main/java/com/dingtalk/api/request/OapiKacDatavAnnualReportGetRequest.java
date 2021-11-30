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

import com.dingtalk.api.response.OapiKacDatavAnnualReportGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.annual_report.get request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.19
 */
public class OapiKacDatavAnnualReportGetRequest extends BaseTaobaoRequest<OapiKacDatavAnnualReportGetResponse> {
	
	

	/** 
	* 部门id，当type=2时该参数需存在
	 */
	private Long deptId;

	/** 
	* 年报的数据维度，1-企业维度，2-部门维度，3-员工维度（员工维度的数据需要额外授权，请联系对接BD)
	 */
	private Long type;

	/** 
	* 用户id，当type=3时该参数需存在
	 */
	private String userId;

	/** 
	* 年份标识
	 */
	private String year;

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getYear() {
		return this.year;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.datav.annual_report.get";
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
		txtParams.put("type", this.type);
		txtParams.put("user_id", this.userId);
		txtParams.put("year", this.year);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiKacDatavAnnualReportGetResponse> getResponseClass() {
		return OapiKacDatavAnnualReportGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(type, "type");
		RequestCheckUtils.checkMaxLength(userId, 128, "userId");
		RequestCheckUtils.checkNotEmpty(year, "year");
		RequestCheckUtils.checkMaxLength(year, 32, "year");
	}
	

}