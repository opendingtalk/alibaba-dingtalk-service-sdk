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

import com.dingtalk.api.response.OapiBlackboardGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.04
 */
public class OapiBlackboardGetRequest extends BaseTaobaoRequest<OapiBlackboardGetResponse> {
	
	

	/** 
	* 公告id
	 */
	private String blackboardId;

	/** 
	* 操作人userId
	 */
	private String operationUserid;

	public void setBlackboardId(String blackboardId) {
		this.blackboardId = blackboardId;
	}

	public String getBlackboardId() {
		return this.blackboardId;
	}

	public void setOperationUserid(String operationUserid) {
		this.operationUserid = operationUserid;
	}

	public String getOperationUserid() {
		return this.operationUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.blackboard.get";
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
		txtParams.put("blackboard_id", this.blackboardId);
		txtParams.put("operation_userid", this.operationUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiBlackboardGetResponse> getResponseClass() {
		return OapiBlackboardGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(blackboardId, "blackboardId");
		RequestCheckUtils.checkNotEmpty(operationUserid, "operationUserid");
	}
	

}