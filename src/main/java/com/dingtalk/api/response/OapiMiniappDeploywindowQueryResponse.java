package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.miniapp.deploywindow.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMiniappDeploywindowQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3764629487628698271L;

	/** 
	 * 返回的数据实体
	 */
	@ApiField("data")
	private DeployWindowDoModel data;

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


	public void setData(DeployWindowDoModel data) {
		this.data = data;
	}
	public DeployWindowDoModel getData( ) {
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
	public static class DeployWindowDoModel extends TaobaoObject {
		private static final long serialVersionUID = 2753959696799395576L;
		/**
		 * 安卓最大版本
		 */
		@ApiField("android_client_max")
		private String androidClientMax;
		/**
		 * 安卓最小版本
		 */
		@ApiField("android_client_min")
		private String androidClientMin;
		/**
		 * 安卓实例ID
		 */
		@ApiField("android_instance_id")
		private Long androidInstanceId;
		/**
		 * 应用ID
		 */
		@ApiField("app_id")
		private String appId;
		/**
		 * 客户端
		 */
		@ApiField("client_id")
		private Long clientId;
		/**
		 * 包ID
		 */
		@ApiField("deploy_package_id")
		private Long deployPackageId;
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
		 * 租户ID
		 */
		@ApiField("inst_id")
		private Long instId;
		/**
		 * IOS客户端最大版本
		 */
		@ApiField("ios_client_max")
		private String iosClientMax;
		/**
		 * IOS客户端最小版本
		 */
		@ApiField("ios_client_min")
		private String iosClientMin;
		/**
		 * IOS实例ID
		 */
		@ApiField("ios_instance_id")
		private Long iosInstanceId;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 安卓平台
		 */
		@ApiField("platform_android")
		private Long platformAndroid;
		/**
		 * ios平台
		 */
		@ApiField("platform_ios")
		private Long platformIos;
		/**
		 * 版本
		 */
		@ApiField("version")
		private String version;
	
		public String getAndroidClientMax() {
			return this.androidClientMax;
		}
		public void setAndroidClientMax(String androidClientMax) {
			this.androidClientMax = androidClientMax;
		}
		public String getAndroidClientMin() {
			return this.androidClientMin;
		}
		public void setAndroidClientMin(String androidClientMin) {
			this.androidClientMin = androidClientMin;
		}
		public Long getAndroidInstanceId() {
			return this.androidInstanceId;
		}
		public void setAndroidInstanceId(Long androidInstanceId) {
			this.androidInstanceId = androidInstanceId;
		}
		public String getAppId() {
			return this.appId;
		}
		public void setAppId(String appId) {
			this.appId = appId;
		}
		public Long getClientId() {
			return this.clientId;
		}
		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}
		public Long getDeployPackageId() {
			return this.deployPackageId;
		}
		public void setDeployPackageId(Long deployPackageId) {
			this.deployPackageId = deployPackageId;
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
		public Long getInstId() {
			return this.instId;
		}
		public void setInstId(Long instId) {
			this.instId = instId;
		}
		public String getIosClientMax() {
			return this.iosClientMax;
		}
		public void setIosClientMax(String iosClientMax) {
			this.iosClientMax = iosClientMax;
		}
		public String getIosClientMin() {
			return this.iosClientMin;
		}
		public void setIosClientMin(String iosClientMin) {
			this.iosClientMin = iosClientMin;
		}
		public Long getIosInstanceId() {
			return this.iosInstanceId;
		}
		public void setIosInstanceId(Long iosInstanceId) {
			this.iosInstanceId = iosInstanceId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getPlatformAndroid() {
			return this.platformAndroid;
		}
		public void setPlatformAndroid(Long platformAndroid) {
			this.platformAndroid = platformAndroid;
		}
		public Long getPlatformIos() {
			return this.platformIos;
		}
		public void setPlatformIos(Long platformIos) {
			this.platformIos = platformIos;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	}
	


}
