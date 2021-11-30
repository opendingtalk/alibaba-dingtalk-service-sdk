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

import com.dingtalk.api.response.OapiWorkbenchShortcutDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workbench.shortcut.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.21
 */
public class OapiWorkbenchShortcutDeleteRequest extends BaseTaobaoRequest<OapiWorkbenchShortcutDeleteResponse> {
	
	

	/** 
	* 应用ID
	 */
	private String appId;

	/** 
	* 系统交互唯一流水号(ISV维度下不可重复)
	 */
	private String bizNo;

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workbench.shortcut.delete";
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
		txtParams.put("app_id", this.appId);
		txtParams.put("biz_no", this.bizNo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkbenchShortcutDeleteResponse> getResponseClass() {
		return OapiWorkbenchShortcutDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(appId, "appId");
		RequestCheckUtils.checkNotEmpty(bizNo, "bizNo");
	}
	

}