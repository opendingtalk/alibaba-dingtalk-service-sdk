package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.miniapp.packageconfig.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMiniappPackageconfigQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7133194415692927188L;

	/** 
	 * 返回的数据实体
	 */
	@ApiField("data")
	private PackageConfigDOModel data;

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


	public void setData(PackageConfigDOModel data) {
		this.data = data;
	}
	public PackageConfigDOModel getData( ) {
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
	public static class PackageConfigDOModel extends TaobaoObject {
		private static final long serialVersionUID = 2888814858771267328L;
		/**
		 * appid
		 */
		@ApiField("app_id")
		private String appId;
		/**
		 * 构建结果url
		 */
		@ApiField("build_result_url")
		private String buildResultUrl;
		/**
		 * fallback
		 */
		@ApiField("fallback_url")
		private String fallbackUrl;
		/**
		 * 是否删除
		 */
		@ApiField("is_deleted")
		private Long isDeleted;
		/**
		 * 包路径
		 */
		@ApiField("package_path")
		private String packagePath;
		/**
		 * 包类型MAINSUB
		 */
		@ApiField("package_type")
		private String packageType;
		/**
		 * 包地址
		 */
		@ApiField("package_url")
		private String packageUrl;
		/**
		 * 大小
		 */
		@ApiField("size")
		private Long size;
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
		public String getBuildResultUrl() {
			return this.buildResultUrl;
		}
		public void setBuildResultUrl(String buildResultUrl) {
			this.buildResultUrl = buildResultUrl;
		}
		public String getFallbackUrl() {
			return this.fallbackUrl;
		}
		public void setFallbackUrl(String fallbackUrl) {
			this.fallbackUrl = fallbackUrl;
		}
		public Long getIsDeleted() {
			return this.isDeleted;
		}
		public void setIsDeleted(Long isDeleted) {
			this.isDeleted = isDeleted;
		}
		public String getPackagePath() {
			return this.packagePath;
		}
		public void setPackagePath(String packagePath) {
			this.packagePath = packagePath;
		}
		public String getPackageType() {
			return this.packageType;
		}
		public void setPackageType(String packageType) {
			this.packageType = packageType;
		}
		public String getPackageUrl() {
			return this.packageUrl;
		}
		public void setPackageUrl(String packageUrl) {
			this.packageUrl = packageUrl;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public String getVersionUniqueId() {
			return this.versionUniqueId;
		}
		public void setVersionUniqueId(String versionUniqueId) {
			this.versionUniqueId = versionUniqueId;
		}
	}
	


}
