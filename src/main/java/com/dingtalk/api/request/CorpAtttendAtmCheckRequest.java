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

import com.dingtalk.api.response.CorpAtttendAtmCheckResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.atttend.atm.check request
 * 
 * @author top auto create
 * @since 1.0, 2016.12.12
 */
public class CorpAtttendAtmCheckRequest extends BaseTaobaoRequest<CorpAtttendAtmCheckResponse> {
	
	

	/** 
	* 测试使用
	 */
	private String para;

	public void setPara(String para) {
		this.para = para;
	}

	public String getPara() {
		return this.para;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.atttend.atm.check";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("para", this.para);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpAtttendAtmCheckResponse> getResponseClass() {
		return CorpAtttendAtmCheckResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(para, "para");
	}
	

}