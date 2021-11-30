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
import com.dingtalk.api.response.OapiMpdevPreviewbuildCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.mpdev.previewbuild.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.08.17
 */
public class OapiMpdevPreviewbuildCreateRequest extends BaseTaobaoRequest<OapiMpdevPreviewbuildCreateResponse> {
	
	

	/** 
	* SDK构建脚本版本
	 */
	private String buildScriptVersion;

	/** 
	* 远程调试的channel
	 */
	private String channel;

	/** 
	* scheme中corpId值
	 */
	private String corpid;

	/** 
	* 开启tabBar
	 */
	private String enableTabbar;

	/** 
	* 忽略http安全域名检查
	 */
	private Boolean ignoreHttpReqPermission;

	/** 
	* 忽略web-view安全域名检查
	 */
	private Boolean ignoreWebviewDomainCheck;

	/** 
	* 远程调试模式
	 */
	private Boolean isRemoteDebug;

	/** 
	* remoteX远程调试模式
	 */
	private Boolean isRemoteX;

	/** 
	* 包默认主页
	 */
	private String mainPage;

	/** 
	* 小程序ID
	 */
	private String miniappId;

	/** 
	* 预览上传包地址
	 */
	private String packageKey;

	/** 
	* scheme page参数
	 */
	private String page;

	/** 
	* 插件预览包地址
	 */
	private String pluginPackageKey;

	/** 
	* 静态插件信息
	 */
	private String pluginRefs;

	/** 
	* scheme query参数
	 */
	private String query;

	/** 
	* 分包数据
	 */
	private String subPackages;

	/** 
	* 远程调试tyroid
	 */
	private String tyroid;

	public void setBuildScriptVersion(String buildScriptVersion) {
		this.buildScriptVersion = buildScriptVersion;
	}

	public String getBuildScriptVersion() {
		return this.buildScriptVersion;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setEnableTabbar(String enableTabbar) {
		this.enableTabbar = enableTabbar;
	}

	public String getEnableTabbar() {
		return this.enableTabbar;
	}

	public void setIgnoreHttpReqPermission(Boolean ignoreHttpReqPermission) {
		this.ignoreHttpReqPermission = ignoreHttpReqPermission;
	}

	public Boolean getIgnoreHttpReqPermission() {
		return this.ignoreHttpReqPermission;
	}

	public void setIgnoreWebviewDomainCheck(Boolean ignoreWebviewDomainCheck) {
		this.ignoreWebviewDomainCheck = ignoreWebviewDomainCheck;
	}

	public Boolean getIgnoreWebviewDomainCheck() {
		return this.ignoreWebviewDomainCheck;
	}

	public void setIsRemoteDebug(Boolean isRemoteDebug) {
		this.isRemoteDebug = isRemoteDebug;
	}

	public Boolean getIsRemoteDebug() {
		return this.isRemoteDebug;
	}

	public void setIsRemoteX(Boolean isRemoteX) {
		this.isRemoteX = isRemoteX;
	}

	public Boolean getIsRemoteX() {
		return this.isRemoteX;
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

	public void setPage(String page) {
		this.page = page;
	}

	public String getPage() {
		return this.page;
	}

	public void setPluginPackageKey(String pluginPackageKey) {
		this.pluginPackageKey = pluginPackageKey;
	}

	public String getPluginPackageKey() {
		return this.pluginPackageKey;
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

	public void setQuery(String query) {
		this.query = query;
	}

	public String getQuery() {
		return this.query;
	}

	public void setSubPackages(String subPackages) {
		this.subPackages = subPackages;
	}

	public void setSubPackages(List<OpenSubPackageVo> subPackages) {
		this.subPackages = new JSONWriter(false,false,true).write(subPackages);
	}

	public String getSubPackages() {
		return this.subPackages;
	}

	public void setTyroid(String tyroid) {
		this.tyroid = tyroid;
	}

	public String getTyroid() {
		return this.tyroid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.mpdev.previewbuild.create";
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
		txtParams.put("build_script_version", this.buildScriptVersion);
		txtParams.put("channel", this.channel);
		txtParams.put("corpid", this.corpid);
		txtParams.put("enable_tabbar", this.enableTabbar);
		txtParams.put("ignore_http_req_permission", this.ignoreHttpReqPermission);
		txtParams.put("ignore_webview_domain_check", this.ignoreWebviewDomainCheck);
		txtParams.put("is_remote_debug", this.isRemoteDebug);
		txtParams.put("is_remote_x", this.isRemoteX);
		txtParams.put("main_page", this.mainPage);
		txtParams.put("miniapp_id", this.miniappId);
		txtParams.put("package_key", this.packageKey);
		txtParams.put("page", this.page);
		txtParams.put("plugin_package_key", this.pluginPackageKey);
		txtParams.put("plugin_refs", this.pluginRefs);
		txtParams.put("query", this.query);
		txtParams.put("sub_packages", this.subPackages);
		txtParams.put("tyroid", this.tyroid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMpdevPreviewbuildCreateResponse> getResponseClass() {
		return OapiMpdevPreviewbuildCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(enableTabbar, "enableTabbar");
		RequestCheckUtils.checkNotEmpty(mainPage, "mainPage");
		RequestCheckUtils.checkNotEmpty(miniappId, "miniappId");
		RequestCheckUtils.checkNotEmpty(packageKey, "packageKey");
		RequestCheckUtils.checkNotEmpty(pluginPackageKey, "pluginPackageKey");
		RequestCheckUtils.checkObjectMaxListSize(pluginRefs, 999, "pluginRefs");
		RequestCheckUtils.checkObjectMaxListSize(subPackages, 999, "subPackages");
	}
	
	/**
	 * 分包数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenSubPackageVo extends TaobaoObject {
		private static final long serialVersionUID = 4752227796469438569L;
		/**
		 * 包地址
		 */
		@ApiField("package_key")
		private String packageKey;
		/**
		 * 分包路径
		 */
		@ApiField("path")
		private String path;
		/**
		 * 包类型，主包or分包
		 */
		@ApiField("type")
		private String type;
	
		public String getPackageKey() {
			return this.packageKey;
		}
		public void setPackageKey(String packageKey) {
			this.packageKey = packageKey;
		}
		public String getPath() {
			return this.path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 静态插件信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PluginReference extends TaobaoObject {
		private static final long serialVersionUID = 4226975287925838459L;
		/**
		 * 插件ID
		 */
		@ApiField("plugin_id")
		private String pluginId;
		/**
		 * 版本号
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