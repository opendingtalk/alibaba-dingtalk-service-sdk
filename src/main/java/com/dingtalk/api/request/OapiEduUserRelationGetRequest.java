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

import com.dingtalk.api.response.OapiEduUserRelationGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.user.relation.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.23
 */
public class OapiEduUserRelationGetRequest extends BaseTaobaoRequest<OapiEduUserRelationGetResponse> {
	
	

	/** 
	* 班级id
	 */
	private Long classId;

	/** 
	* 监护人id
	 */
	private String fromUserid;

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setFromUserid(String fromUserid) {
		this.fromUserid = fromUserid;
	}

	public String getFromUserid() {
		return this.fromUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.user.relation.get";
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
		txtParams.put("class_id", this.classId);
		txtParams.put("from_userid", this.fromUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduUserRelationGetResponse> getResponseClass() {
		return OapiEduUserRelationGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkNotEmpty(fromUserid, "fromUserid");
	}
	

}