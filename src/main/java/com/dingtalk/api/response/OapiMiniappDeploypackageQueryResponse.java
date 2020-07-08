package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.miniapp.deploypackage.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMiniappDeploypackageQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1875523413598465445L;

	/** 
	 * 返回的数据实体
	 */
	@ApiField("data")
	private DeployPackageDoModel data;

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


	public void setData(DeployPackageDoModel data) {
		this.data = data;
	}
	public DeployPackageDoModel getData( ) {
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
	public static class DeployPackageDoModel extends TaobaoObject {
		private static final long serialVersionUID = 5874558747325742451L;
		/**
		 * 应用ID
		 */
		@ApiField("app_id")
		private String appId;
		/**
		 * 自动装载
		 */
		@ApiField("auto_install")
		private Long autoInstall;
		/**
		 * 客户端
		 */
		@ApiField("client_id")
		private Long clientId;
		/**
		 * 部署时间
		 */
		@ApiField("deploy_time")
		private Long deployTime;
		/**
		 * 描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 英文名
		 */
		@ApiField("english_name")
		private String englishName;
		/**
		 * 扩展信息
		 */
		@ApiField("extend_info")
		private String extendInfo;
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
		 * 灰度
		 */
		@ApiField("gray")
		private Long gray;
		/**
		 * 灰度码
		 */
		@ApiField("gray_code")
		private String grayCode;
		/**
		 * 灰度时间
		 */
		@ApiField("gray_time")
		private Long grayTime;
		/**
		 * 图标
		 */
		@ApiField("icon_url")
		private String iconUrl;
		/**
		 * ID
		 */
		@ApiField("id")
		private Long id;
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
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 在线
		 */
		@ApiField("online")
		private Long online;
		/**
		 * 包ID
		 */
		@ApiField("package_id")
		private Long packageId;
		/**
		 * 包地址
		 */
		@ApiField("package_url")
		private String packageUrl;
		/**
		 * 插件映射
		 */
		@ApiField("plugin_refs")
		private String pluginRefs;
		/**
		 * 插件大小
		 */
		@ApiField("plugin_size")
		private Long pluginSize;
		/**
		 * 插件 url
		 */
		@ApiField("plugin_url")
		private String pluginUrl;
		/**
		 * 预发状态
		 */
		@ApiField("pre")
		private Long pre;
		/**
		 * 预发布时间
		 */
		@ApiField("pre_time")
		private Long preTime;
		/**
		 * 预装载
		 */
		@ApiField("preset")
		private Long preset;
		/**
		 * 上线状态
		 */
		@ApiField("prod")
		private Long prod;
		/**
		 * 回滚自哪个部署包
		 */
		@ApiField("rollback_from")
		private Long rollbackFrom;
		/**
		 * 大小
		 */
		@ApiField("size")
		private Long size;
		/**
		 * 标语
		 */
		@ApiField("slogan")
		private String slogan;
		/**
		 * 版本
		 */
		@ApiField("version")
		private String version;
		/**
		 * vhost
		 */
		@ApiField("vhost")
		private String vhost;
		/**
		 * 发布窗口ID
		 */
		@ApiField("window_id")
		private Long windowId;
	
		public String getAppId() {
			return this.appId;
		}
		public void setAppId(String appId) {
			this.appId = appId;
		}
		public Long getAutoInstall() {
			return this.autoInstall;
		}
		public void setAutoInstall(Long autoInstall) {
			this.autoInstall = autoInstall;
		}
		public Long getClientId() {
			return this.clientId;
		}
		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}
		public Long getDeployTime() {
			return this.deployTime;
		}
		public void setDeployTime(Long deployTime) {
			this.deployTime = deployTime;
		}
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getEnglishName() {
			return this.englishName;
		}
		public void setEnglishName(String englishName) {
			this.englishName = englishName;
		}
		public String getExtendInfo() {
			return this.extendInfo;
		}
		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
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
		public Long getGray() {
			return this.gray;
		}
		public void setGray(Long gray) {
			this.gray = gray;
		}
		public String getGrayCode() {
			return this.grayCode;
		}
		public void setGrayCode(String grayCode) {
			this.grayCode = grayCode;
		}
		public Long getGrayTime() {
			return this.grayTime;
		}
		public void setGrayTime(Long grayTime) {
			this.grayTime = grayTime;
		}
		public String getIconUrl() {
			return this.iconUrl;
		}
		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getOnline() {
			return this.online;
		}
		public void setOnline(Long online) {
			this.online = online;
		}
		public Long getPackageId() {
			return this.packageId;
		}
		public void setPackageId(Long packageId) {
			this.packageId = packageId;
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
		public Long getPre() {
			return this.pre;
		}
		public void setPre(Long pre) {
			this.pre = pre;
		}
		public Long getPreTime() {
			return this.preTime;
		}
		public void setPreTime(Long preTime) {
			this.preTime = preTime;
		}
		public Long getPreset() {
			return this.preset;
		}
		public void setPreset(Long preset) {
			this.preset = preset;
		}
		public Long getProd() {
			return this.prod;
		}
		public void setProd(Long prod) {
			this.prod = prod;
		}
		public Long getRollbackFrom() {
			return this.rollbackFrom;
		}
		public void setRollbackFrom(Long rollbackFrom) {
			this.rollbackFrom = rollbackFrom;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public String getSlogan() {
			return this.slogan;
		}
		public void setSlogan(String slogan) {
			this.slogan = slogan;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		public String getVhost() {
			return this.vhost;
		}
		public void setVhost(String vhost) {
			this.vhost = vhost;
		}
		public Long getWindowId() {
			return this.windowId;
		}
		public void setWindowId(Long windowId) {
			this.windowId = windowId;
		}
	}
	


}
