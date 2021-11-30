package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiMpdevBuildCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.mpdev.build.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.15
 */
public class OapiMpdevBuildCreateRequest extends BaseTaobaoRequest<OapiMpdevBuildCreateResponse> {
	
	

	/** 
	* 是否开启TabBar
	 */
	private String enableTabbar;

	/** 
	* 小程序默认首页
	 */
	private String mainPage;

	/** 
	* 小程序ID
	 */
	private String miniappId;

	/** 
	* 上传包Key
	 */
	private String packageKey;

	/** 
	* 上传包MD5
	 */
	private String packageMd5;

	/** 
	* 小程序版本号
	 */
	private String packageVersion;

	/** 
	* 静态插件信息
	 */
	private String pluginRefs;

	public void setEnableTabbar(String enableTabbar) {
		this.enableTabbar = enableTabbar;
	}

	public String getEnableTabbar() {
		return this.enableTabbar;
	}

	public void setMainPage(String mainPage) {
		this.mainPage = mainPage;
	}

	public String getMainPage() {
		return this.mainPage;
	}

	public void setMiniappId(String miniappId) {
		this.miniappId = miniappId;
	}

	public String getMiniappId() {
		return this.miniappId;
	}

	public void setPackageKey(String packageKey) {
		this.packageKey = packageKey;
	}

	public String getPackageKey() {
		return this.packageKey;
	}

	public void setPackageMd5(String packageMd5) {
		this.packageMd5 = packageMd5;
	}

	public String getPackageMd5() {
		return this.packageMd5;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
	}

	public String getPackageVersion() {
		return this.packageVersion;
	}

	public void setPluginRefs(String pluginRefs) {
		this.pluginRefs = pluginRefs;
	}

	public void setPluginRefs(List<PluginReference> pluginRefs) {
		this.pluginRefs = new JSONWriter(false,false,true).write(pluginRefs);
	}

	public String getPluginRefs() {
		return this.pluginRefs;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.mpdev.build.create";
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
		txtParams.put("enable_tabbar", this.enableTabbar);
		txtParams.put("main_page", this.mainPage);
		txtParams.put("miniapp_id", this.miniappId);
		txtParams.put("package_key", this.packageKey);
		txtParams.put("package_md5", this.packageMd5);
		txtParams.put("package_version", this.packageVersion);
		txtParams.put("plugin_refs", this.pluginRefs);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMpdevBuildCreateResponse> getResponseClass() {
		return OapiMpdevBuildCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(enableTabbar, "enableTabbar");
		RequestCheckUtils.checkNotEmpty(mainPage, "mainPage");
		RequestCheckUtils.checkNotEmpty(miniappId, "miniappId");
		RequestCheckUtils.checkNotEmpty(packageKey, "packageKey");
		RequestCheckUtils.checkNotEmpty(packageMd5, "packageMd5");
		RequestCheckUtils.checkObjectMaxListSize(pluginRefs, 999, "pluginRefs");
	}
	
	/**
	 * 静态插件信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PluginReference extends TaobaoObject {
		private static final long serialVersionUID = 5632573179253144623L;
		/**
		 * 插件ID
		 */
		@ApiField("plugin_id")
		private String pluginId;
		/**
		 * 插件版本
		 */
		@ApiField("plugin_version")
		private String pluginVersion;
	
		public String getPluginId() {
			return this.pluginId;
		}
		public void setPluginId(String pluginId) {
			this.pluginId = pluginId;
		}
		public String getPluginVersion() {
			return this.pluginVersion;
		}
		public void setPluginVersion(String pluginVersion) {
			this.pluginVersion = pluginVersion;
		}
	}
	

}