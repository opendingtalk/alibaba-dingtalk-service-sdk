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

import com.dingtalk.api.response.OapiProcessPrintTemplateSaveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.print.template.save request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.31
 */
public class OapiProcessPrintTemplateSaveRequest extends BaseTaobaoRequest<OapiProcessPrintTemplateSaveResponse> {
	
	

	/** 
	* 字体
	 */
	private String font;

	/** 
	* 是否开启自定义打印
	 */
	private Boolean openCustomizePrint;

	/** 
	* 审批流程唯一code
	 */
	private String processCode;

	/** 
	* vm文件
	 */
	private String vm;

	public void setFont(String font) {
		this.font = font;
	}

	public String getFont() {
		return this.font;
	}

	public void setOpenCustomizePrint(Boolean openCustomizePrint) {
		this.openCustomizePrint = openCustomizePrint;
	}

	public Boolean getOpenCustomizePrint() {
		return this.openCustomizePrint;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public void setVm(String vm) {
		this.vm = vm;
	}

	public String getVm() {
		return this.vm;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.print.template.save";
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
		txtParams.put("font", this.font);
		txtParams.put("open_customize_print", this.openCustomizePrint);
		txtParams.put("process_code", this.processCode);
		txtParams.put("vm", this.vm);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessPrintTemplateSaveResponse> getResponseClass() {
		return OapiProcessPrintTemplateSaveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(font, "font");
		RequestCheckUtils.checkNotEmpty(processCode, "processCode");
		RequestCheckUtils.checkNotEmpty(vm, "vm");
	}
	

}