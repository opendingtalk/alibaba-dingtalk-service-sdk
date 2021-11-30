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

import com.dingtalk.api.response.OapiProcessTemplateUpgradeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.template.upgrade request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiProcessTemplateUpgradeRequest extends BaseTaobaoRequest<OapiProcessTemplateUpgradeResponse> {
	
	

	/** 
	* 明细组件id
	 */
	private String detailComponentId;

	/** 
	* 数组或金额类组件id
	 */
	private String formComponentId;

	/** 
	* 流程code
	 */
	private String processCode;

	/** 
	* 其实是staffId
	 */
	private String userid;

	public void setDetailComponentId(String detailComponentId) {
		this.detailComponentId = detailComponentId;
	}

	public String getDetailComponentId() {
		return this.detailComponentId;
	}

	public void setFormComponentId(String formComponentId) {
		this.formComponentId = formComponentId;
	}

	public String getFormComponentId() {
		return this.formComponentId;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.template.upgrade";
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
		txtParams.put("detail_component_id", this.detailComponentId);
		txtParams.put("form_component_id", this.formComponentId);
		txtParams.put("process_code", this.processCode);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessTemplateUpgradeResponse> getResponseClass() {
		return OapiProcessTemplateUpgradeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(formComponentId, "formComponentId");
		RequestCheckUtils.checkNotEmpty(processCode, "processCode");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}