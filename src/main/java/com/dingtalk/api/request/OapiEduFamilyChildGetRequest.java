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

import com.dingtalk.api.response.OapiEduFamilyChildGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.family.child.get request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.20
 */
public class OapiEduFamilyChildGetRequest extends BaseTaobaoRequest<OapiEduFamilyChildGetResponse> {
	
	

	/** 
	* 孩子userid
	 */
	private String childUserid;

	/** 
	* 操作者userid
	 */
	private String opUserid;

	public void setChildUserid(String childUserid) {
		this.childUserid = childUserid;
	}

	public String getChildUserid() {
		return this.childUserid;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.family.child.get";
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
		txtParams.put("child_userid", this.childUserid);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduFamilyChildGetResponse> getResponseClass() {
		return OapiEduFamilyChildGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(childUserid, "childUserid");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	

}