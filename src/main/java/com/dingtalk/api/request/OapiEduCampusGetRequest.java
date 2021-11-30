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

import com.dingtalk.api.response.OapiEduCampusGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.campus.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiEduCampusGetRequest extends BaseTaobaoRequest<OapiEduCampusGetResponse> {
	
	

	/** 
	* 校区ID
	 */
	private Long campusId;

	public void setCampusId(Long campusId) {
		this.campusId = campusId;
	}

	public Long getCampusId() {
		return this.campusId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.campus.get";
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
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCampusGetResponse> getResponseClass() {
		return OapiEduCampusGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(campusId, "campusId");
	}
	

}