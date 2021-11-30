package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCallBackRegisterCallBackResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.call_back.register_call_back request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiCallBackRegisterCallBackRequest extends BaseTaobaoRequest<OapiCallBackRegisterCallBackResponse> {
	
	

	/** 
	* 数据加密密钥。用于回调数据的加密，长度固定为43个字符，从a-z, A-Z, 0-9共62个字符中选取,您可以随机生成，ISV(服务提供商)推荐使用注册套件时填写的EncodingAESKey
	 */
	private String aesKey;

	/** 
	* 需要监听的事件类型，有20种，“user_add_org”, “user_modify_org”, “user_leave_org”,“org_admin_add”, “org_admin_remove”, “org_dept_create”, “org_dept_modify”, “org_dept_remove”, “org_remove”,“label_user_change”, “label_conf_add”, “label_conf_modify”,“label_conf_del”,“org_change”, “chat_add_member”, “chat_remove_member”, “chat_quit”, “chat_update_owner”, “chat_update_title”, “chat_disband”, “chat_disband_microapp”,“check_in”,“bpms_task_change”,“bpms_instance_change”
	 */
	private List<String> callBackTag;

	/** 
	* 加解密需要用到的token，ISV(服务提供商)推荐使用注册套件时填写的token，普通企业可以随机填写
	 */
	private String token;

	/** 
	* 接收事件回调的url
	 */
	private String url;

	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}

	public String getAesKey() {
		return this.aesKey;
	}

	public void setCallBackTag(List<String> callBackTag) {
		this.callBackTag = callBackTag;
	}

	public List<String> getCallBackTag() {
		return this.callBackTag;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.call_back.register_call_back";
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
		txtParams.put("aes_key", this.aesKey);
		txtParams.put("call_back_tag", TaobaoUtils.objectToJson(this.callBackTag));
		txtParams.put("token", this.token);
		txtParams.put("url", this.url);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCallBackRegisterCallBackResponse> getResponseClass() {
		return OapiCallBackRegisterCallBackResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}