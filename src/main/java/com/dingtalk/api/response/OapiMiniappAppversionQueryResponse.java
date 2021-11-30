package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.miniapp.appversion.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMiniappAppversionQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7263125987635953981L;

	/** 
	 * 返回的数据实体
	 */
	@ApiField("data")
	private AppVersionDoModel data;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setData(AppVersionDoModel data) {
		this.data = data;
	}
	public AppVersionDoModel getData( ) {
		return this.data;
	}

	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回的数据实体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AppVersionDoModel extends TaobaoObject {
		private static final long serialVersionUID = 8173156379248695571L;
		/**
		 * appid
		 */
		@ApiField("app_id")
		private String appId;
		/**
		 * 构建任务ID
		 */
		@ApiField("build_task_no")
		private String buildTaskNo;
		/**
		 * 构建类型
		 */
		@ApiField("build_type")
		private Long buildType;
		/**
		 * 客户端
		 */
		@ApiField("client_id")
		private Long clientId;
		/**
		 * 模板实例化小程序的扩展数据
		 */
		@ApiField("ext_json_config")
		private String extJsonConfig;
		/**
		 * 模板实例化小程序的扩展数据url
		 */
		@ApiField("ext_json_config_url")
		private String extJsonConfigUrl;
		/**
		 * 扩展信息
		 */
		@ApiField("extend_info")
		private String extendInfo;
		/**
		 * 扩展
		 */
		@ApiField("extra")
		private String extra;
		/**
		 * fallbackBaseUrl
		 */
		@ApiField("fallback_base_url")
		private String fallbackBaseUrl;
		/**
		 * 更新时间
		 */
		@ApiField("gmt_create")
		private Long gmtCreate;
		/**
		 * 更新时间
		 */
		@ApiField("gmt_modified")
		private Long gmtModified;
		/**
		 * ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 未知
		 */
		@ApiField("inherit_config")
		private String inheritConfig;
		/**
		 * 租户ID
		 */
		@ApiField("inst_id")
		private Long instId;
		/**
		 * 是否删除
		 */
		@ApiField("is_deleted")
		private Long isDeleted;
		/**
		 * 主URL
		 */
		@ApiField("main_url")
		private String mainUrl;
		/**
		 * MD5
		 */
		@ApiField("md5")
		private String md5;
		/**
		 * 猫爪任务ID
		 */
		@ApiField("mosec_job_id")
		private String mosecJobId;
		/**
		 * 猫爪扫描任务状态
		 */
		@ApiField("mosec_status")
		private Long mosecStatus;
		/**
		 * 包地址
		 */
		@ApiField("package_url")
		private String packageUrl;
		/**
		 * 插件关联
		 */
		@ApiField("plugin_refs")
		private String pluginRefs;
		/**
		 * 插件大小
		 */
		@ApiField("plugin_size")
		private Long pluginSize;
		/**
		 * 插件url
		 */
		@ApiField("plugin_url")
		private String pluginUrl;
		/**
		 * 构建任务ID
		 */
		@ApiField("qcloud_job_id")
		private String qcloudJobId;
		/**
		 * 构建任务状态
		 */
		@ApiField("qcloud_status")
		private Long qcloudStatus;
		/**
		 * 大小
		 */
		@ApiField("size")
		private Long size;
		/**
		 * 源URL
		 */
		@ApiField("source_url")
		private String sourceUrl;
		/**
		 * 模板应用ID
		 */
		@ApiField("template_app_id")
		private String templateAppId;
		/**
		 * 模板ID
		 */
		@ApiField("template_id")
		private Long templateId;
		/**
		 * 模板版本
		 */
		@ApiField("template_version")
		private String templateVersion;
		/**
		 * tinyCliVersion
		 */
		@ApiField("tiny_cli_version")
		private String tinyCliVersion;
		/**
		 * 版本
		 */
		@ApiField("version")
		private String version;
		/**
		 * 版本ID
		 */
		@ApiField("version_unique_id")
		private String versionUniqueId;
	
		public String getAppId() {
			return this.appId;
		}
		public void setAppId(String appId) {
			this.appId = appId;
		}
		public String getBuildTaskNo() {
			return this.buildTaskNo;
		}
		public void setBuildTaskNo(String buildTaskNo) {
			this.buildTaskNo = buildTaskNo;
		}
		public Long getBuildType() {
			return this.buildType;
		}
		public void setBuildType(Long buildType) {
			this.buildType = buildType;
		}
		public Long getClientId() {
			return this.clientId;
		}
		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}
		public String getExtJsonConfig() {
			return this.extJsonConfig;
		}
		public void setExtJsonConfig(String extJsonConfig) {
			this.extJsonConfig = extJsonConfig;
		}
		public String getExtJsonConfigUrl() {
			return this.extJsonConfigUrl;
		}
		public void setExtJsonConfigUrl(String extJsonConfigUrl) {
			this.extJsonConfigUrl = extJsonConfigUrl;
		}
		public String getExtendInfo() {
			return this.extendInfo;
		}
		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
		}
		public String getExtra() {
			return this.extra;
		}
		public void setExtra(String extra) {
			this.extra = extra;
		}
		public String getFallbackBaseUrl() {
			return this.fallbackBaseUrl;
		}
		public void setFallbackBaseUrl(String fallbackBaseUrl) {
			this.fallbackBaseUrl = fallbackBaseUrl;
		}
		public Long getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Long getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getInheritConfig() {
			return this.inheritConfig;
		}
		public void setInheritConfig(String inheritConfig) {
			this.inheritConfig = inheritConfig;
		}
		public Long getInstId() {
			return this.instId;
		}
		public void setInstId(Long instId) {
			this.instId = instId;
		}
		public Long getIsDeleted() {
			return this.isDeleted;
		}
		public void setIsDeleted(Long isDeleted) {
			this.isDeleted = isDeleted;
		}
		public String getMainUrl() {
			return this.mainUrl;
		}
		public void setMainUrl(String mainUrl) {
			this.mainUrl = mainUrl;
		}
		public String getMd5() {
			return this.md5;
		}
		public void setMd5(String md5) {
			this.md5 = md5;
		}
		public String getMosecJobId() {
			return this.mosecJobId;
		}
		public void setMosecJobId(String mosecJobId) {
			this.mosecJobId = mosecJobId;
		}
		public Long getMosecStatus() {
			return this.mosecStatus;
		}
		public void setMosecStatus(Long mosecStatus) {
			this.mosecStatus = mosecStatus;
		}
		public String getPackageUrl() {
			return this.packageUrl;
		}
		public void setPackageUrl(String packageUrl) {
			this.packageUrl = packageUrl;
		}
		public String getPluginRefs() {
			return this.pluginRefs;
		}
		public void setPluginRefs(String pluginRefs) {
			this.pluginRefs = pluginRefs;
		}
		public Long getPluginSize() {
			return this.pluginSize;
		}
		public void setPluginSize(Long pluginSize) {
			this.pluginSize = pluginSize;
		}
		public String getPluginUrl() {
			return this.pluginUrl;
		}
		public void setPluginUrl(String pluginUrl) {
			this.pluginUrl = pluginUrl;
		}
		public String getQcloudJobId() {
			return this.qcloudJobId;
		}
		public void setQcloudJobId(String qcloudJobId) {
			this.qcloudJobId = qcloudJobId;
		}
		public Long getQcloudStatus() {
			return this.qcloudStatus;
		}
		public void setQcloudStatus(Long qcloudStatus) {
			this.qcloudStatus = qcloudStatus;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public String getSourceUrl() {
			return this.sourceUrl;
		}
		public void setSourceUrl(String sourceUrl) {
			this.sourceUrl = sourceUrl;
		}
		public String getTemplateAppId() {
			return this.templateAppId;
		}
		public void setTemplateAppId(String templateAppId) {
			this.templateAppId = templateAppId;
		}
		public Long getTemplateId() {
			return this.templateId;
		}
		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}
		public String getTemplateVersion() {
			return this.templateVersion;
		}
		public void setTemplateVersion(String templateVersion) {
			this.templateVersion = templateVersion;
		}
		public String getTinyCliVersion() {
			return this.tinyCliVersion;
		}
		public void setTinyCliVersion(String tinyCliVersion) {
			this.tinyCliVersion = tinyCliVersion;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		public String getVersionUniqueId() {
			return this.versionUniqueId;
		}
		public void setVersionUniqueId(String versionUniqueId) {
			this.versionUniqueId = versionUniqueId;
		}
	}
	


}
