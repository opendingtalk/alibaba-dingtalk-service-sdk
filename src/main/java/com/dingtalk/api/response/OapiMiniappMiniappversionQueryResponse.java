package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.miniapp.miniappversion.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMiniappMiniappversionQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1425262216668828492L;

	/** 
	 * 返回的数据实体
	 */
	@ApiField("data")
	private MiniAppVersionDoModel data;

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


	public void setData(MiniAppVersionDoModel data) {
		this.data = data;
	}
	public MiniAppVersionDoModel getData( ) {
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
	public static class MiniAppVersionDoModel extends TaobaoObject {
		private static final long serialVersionUID = 8447541575764971598L;
		/**
		 * 应用ID
		 */
		@ApiField("appId")
		private String appId;
		/**
		 * 审核结束时间
		 */
		@ApiField("audit_finish_time")
		private Long auditFinishTime;
		/**
		 * 审核提交时间
		 */
		@ApiField("audit_submit_time")
		private Long auditSubmitTime;
		/**
		 * 构建源
		 */
		@ApiField("build_source")
		private String buildSource;
		/**
		 * 客户端类型
		 */
		@ApiField("client_type")
		private Long clientType;
		/**
		 * 描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 过期版本
		 */
		@ApiField("exp_version")
		private Long expVersion;
		/**
		 * 扩展信息
		 */
		@ApiField("extra_info")
		private String extraInfo;
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
		 * 灰度开始时间
		 */
		@ApiField("gray_start_time")
		private Long grayStartTime;
		/**
		 * 灰度策略
		 */
		@ApiField("gray_strategy")
		private String grayStrategy;
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
		 * isDeleted
		 */
		@ApiField("is_deleted")
		private Long isDeleted;
		/**
		 * 下线时间
		 */
		@ApiField("offline_time")
		private Long offlineTime;
		/**
		 * 包地址
		 */
		@ApiField("package_url")
		private String packageUrl;
		/**
		 * 商户ID
		 */
		@ApiField("pid")
		private String pid;
		/**
		 * 回滚时间
		 */
		@ApiField("rollback_time")
		private Long rollbackTime;
		/**
		 * 上架时间
		 */
		@ApiField("shelf_time")
		private Long shelfTime;
		/**
		 * 状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 子状态
		 */
		@ApiField("sub_status")
		private String subStatus;
		/**
		 * 模板拓展参数
		 */
		@ApiField("template_extra")
		private String templateExtra;
		/**
		 * 版本
		 */
		@ApiField("version")
		private String version;
	
		public String getAppId() {
			return this.appId;
		}
		public void setAppId(String appId) {
			this.appId = appId;
		}
		public Long getAuditFinishTime() {
			return this.auditFinishTime;
		}
		public void setAuditFinishTime(Long auditFinishTime) {
			this.auditFinishTime = auditFinishTime;
		}
		public Long getAuditSubmitTime() {
			return this.auditSubmitTime;
		}
		public void setAuditSubmitTime(Long auditSubmitTime) {
			this.auditSubmitTime = auditSubmitTime;
		}
		public String getBuildSource() {
			return this.buildSource;
		}
		public void setBuildSource(String buildSource) {
			this.buildSource = buildSource;
		}
		public Long getClientType() {
			return this.clientType;
		}
		public void setClientType(Long clientType) {
			this.clientType = clientType;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getExpVersion() {
			return this.expVersion;
		}
		public void setExpVersion(Long expVersion) {
			this.expVersion = expVersion;
		}
		public String getExtraInfo() {
			return this.extraInfo;
		}
		public void setExtraInfo(String extraInfo) {
			this.extraInfo = extraInfo;
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
		public Long getGrayStartTime() {
			return this.grayStartTime;
		}
		public void setGrayStartTime(Long grayStartTime) {
			this.grayStartTime = grayStartTime;
		}
		public String getGrayStrategy() {
			return this.grayStrategy;
		}
		public void setGrayStrategy(String grayStrategy) {
			this.grayStrategy = grayStrategy;
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
		public Long getOfflineTime() {
			return this.offlineTime;
		}
		public void setOfflineTime(Long offlineTime) {
			this.offlineTime = offlineTime;
		}
		public String getPackageUrl() {
			return this.packageUrl;
		}
		public void setPackageUrl(String packageUrl) {
			this.packageUrl = packageUrl;
		}
		public String getPid() {
			return this.pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
		}
		public Long getRollbackTime() {
			return this.rollbackTime;
		}
		public void setRollbackTime(Long rollbackTime) {
			this.rollbackTime = rollbackTime;
		}
		public Long getShelfTime() {
			return this.shelfTime;
		}
		public void setShelfTime(Long shelfTime) {
			this.shelfTime = shelfTime;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getSubStatus() {
			return this.subStatus;
		}
		public void setSubStatus(String subStatus) {
			this.subStatus = subStatus;
		}
		public String getTemplateExtra() {
			return this.templateExtra;
		}
		public void setTemplateExtra(String templateExtra) {
			this.templateExtra = templateExtra;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	}
	


}
