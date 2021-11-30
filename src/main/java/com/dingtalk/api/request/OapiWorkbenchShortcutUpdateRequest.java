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

import com.dingtalk.api.response.OapiWorkbenchShortcutUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workbench.shortcut.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiWorkbenchShortcutUpdateRequest extends BaseTaobaoRequest<OapiWorkbenchShortcutUpdateResponse> {
	
	

	/** 
	* 应用ID
	 */
	private String appId;

	/** 
	* 系统交互唯一业务单号
	 */
	private String bizNo;

	/** 
	* 图标Url
	 */
	private String icon;

	/** 
	* 快捷方式名称
	 */
	private String name;

	/** 
	* PC端快捷方式跳转地址
	 */
	private String pcShortcutUri;

	/** 
	* 快捷方式跳转地址(移动端地址-默认地址)
	 */
	private String shortcutUri;

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

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPcShortcutUri(String pcShortcutUri) {
		this.pcShortcutUri = pcShortcutUri;
	}

	public String getPcShortcutUri() {
		return this.pcShortcutUri;
	}

	public void setShortcutUri(String shortcutUri) {
		this.shortcutUri = shortcutUri;
	}

	public String getShortcutUri() {
		return this.shortcutUri;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workbench.shortcut.update";
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
		txtParams.put("icon", this.icon);
		txtParams.put("name", this.name);
		txtParams.put("pc_shortcut_uri", this.pcShortcutUri);
		txtParams.put("shortcut_uri", this.shortcutUri);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkbenchShortcutUpdateResponse> getResponseClass() {
		return OapiWorkbenchShortcutUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(appId, "appId");
		RequestCheckUtils.checkNotEmpty(bizNo, "bizNo");
	}
	

}