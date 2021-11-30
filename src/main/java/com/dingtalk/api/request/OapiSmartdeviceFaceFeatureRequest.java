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

import com.dingtalk.api.response.OapiSmartdeviceFaceFeatureResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.face.feature request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.04
 */
public class OapiSmartdeviceFaceFeatureRequest extends BaseTaobaoRequest<OapiSmartdeviceFaceFeatureResponse> {
	
	

	/** 
	* 算法模型
	 */
	private Long modelType;

	/** 
	* 模型版本
	 */
	private String modelVersion;

	/** 
	* 用户id列表
	 */
	private String useridList;

	public void setModelType(Long modelType) {
		this.modelType = modelType;
	}

	public Long getModelType() {
		return this.modelType;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.face.feature";
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
		txtParams.put("model_type", this.modelType);
		txtParams.put("model_version", this.modelVersion);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceFaceFeatureResponse> getResponseClass() {
		return OapiSmartdeviceFaceFeatureResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(modelType, "modelType");
		RequestCheckUtils.checkNotEmpty(modelVersion, "modelVersion");
		RequestCheckUtils.checkNotEmpty(useridList, "useridList");
		RequestCheckUtils.checkMaxListSize(useridList, 20, "useridList");
	}
	

}