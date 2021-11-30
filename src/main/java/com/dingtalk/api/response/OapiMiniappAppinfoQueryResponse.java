package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.miniapp.appinfo.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMiniappAppinfoQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1615638189417258527L;

	/** 
	 * 返回的数据实体
	 */
	@ApiField("data")
	private AppInfoDoModel data;

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


	public void setData(AppInfoDoModel data) {
		this.data = data;
	}
	public AppInfoDoModel getData( ) {
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
	public static class AppInfoDoModel extends TaobaoObject {
		private static final long serialVersionUID = 6772333629855679621L;
		/**
		 * alias
		 */
		@ApiField("alias")
		private String alias;
		/**
		 * 应用通道
		 */
		@ApiField("app_channel")
		private Long appChannel;
		/**
		 * 应用ID
		 */
		@ApiField("app_id")
		private String appId;
		/**
		 * 应用key
		 */
		@ApiField("app_key")
		private String appKey;
		/**
		 * 应用类型
		 */
		@ApiField("app_type")
		private Long appType;
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
		 * 描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 设备ID
		 */
		@ApiField("dev_id")
		private String devId;
		/**
		 * 英文名称
		 */
		@ApiField("english_name")
		private String englishName;
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
		 * inheritConfig
		 */
		@ApiField("inherit_config")
		private String inheritConfig;
		/**
		 * 租户ID
		 */
		@ApiField("inst_id")
		private Long instId;
		/**
		 * isDeleted
		 */
		@ApiField("is_deleted")
		private Long isDeleted;
		/**
		 * lastDiscards
		 */
		@ApiField("last_discards")
		private String lastDiscards;
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
		 * 来源
		 */
		@ApiField("origin")
		private Long origin;
		/**
		 * 预装载
		 */
		@ApiField("preset")
		private Long preset;
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
		 * 状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 子类型
		 */
		@ApiField("sub_type")
		private Long subType;
		/**
		 * vhost
		 */
		@ApiField("v_host")
		private String vHost;
	
		public String getAlias() {
			return this.alias;
		}
		public void setAlias(String alias) {
			this.alias = alias;
		}
		public Long getAppChannel() {
			return this.appChannel;
		}
		public void setAppChannel(Long appChannel) {
			this.appChannel = appChannel;
		}
		public String getAppId() {
			return this.appId;
		}
		public void setAppId(String appId) {
			this.appId = appId;
		}
		public String getAppKey() {
			return this.appKey;
		}
		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}
		public Long getAppType() {
			return this.appType;
		}
		public void setAppType(Long appType) {
			this.appType = appType;
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
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getDevId() {
			return this.devId;
		}
		public void setDevId(String devId) {
			this.devId = devId;
		}
		public String getEnglishName() {
			return this.englishName;
		}
		public void setEnglishName(String englishName) {
			this.englishName = englishName;
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
		public String getLastDiscards() {
			return this.lastDiscards;
		}
		public void setLastDiscards(String lastDiscards) {
			this.lastDiscards = lastDiscards;
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
		public Long getOrigin() {
			return this.origin;
		}
		public void setOrigin(Long origin) {
			this.origin = origin;
		}
		public Long getPreset() {
			return this.preset;
		}
		public void setPreset(Long preset) {
			this.preset = preset;
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
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getSubType() {
			return this.subType;
		}
		public void setSubType(Long subType) {
			this.subType = subType;
		}
		public String getvHost() {
			return this.vHost;
		}
		public void setvHost(String vHost) {
			this.vHost = vHost;
		}
	}
	


}
