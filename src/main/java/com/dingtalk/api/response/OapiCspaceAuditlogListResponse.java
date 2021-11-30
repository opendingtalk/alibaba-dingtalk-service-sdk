package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.auditlog.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCspaceAuditlogListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1571675229177154898L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ListAuditLogResult result;

	/** 
	 * 请求结果
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(ListAuditLogResult result) {
		this.result = result;
	}
	public ListAuditLogResult getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 记录列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AuditLogVO extends TaobaoObject {
		private static final long serialVersionUID = 3152613753153716698L;
		/**
		 * 操作类型
		 */
		@ApiField("action")
		private Long action;
		/**
		 * 操作类型翻译值
		 */
		@ApiField("action_view")
		private String actionView;
		/**
		 * 文件id
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 记录生成时间，unix时间戳，单位ms
		 */
		@ApiField("gmt_create")
		private Long gmtCreate;
		/**
		 * 记录修改时间，unix时间戳，单位ms
		 */
		@ApiField("gmt_modified")
		private Long gmtModified;
		/**
		 * 操作机器ip
		 */
		@ApiField("ip_address")
		private String ipAddress;
		/**
		 * 操作来源空间
		 */
		@ApiField("operate_module")
		private Long operateModule;
		/**
		 * 操作来源翻译值
		 */
		@ApiField("operate_module_view")
		private String operateModuleView;
		/**
		 * 用户昵称
		 */
		@ApiField("operator_name")
		private String operatorName;
		/**
		 * 文件所属组织名称
		 */
		@ApiField("org_name")
		private String orgName;
		/**
		 * 操作端
		 */
		@ApiField("platform")
		private Long platform;
		/**
		 * 操作端翻译值
		 */
		@ApiField("platform_view")
		private String platformView;
		/**
		 * 用户姓名
		 */
		@ApiField("real_name")
		private String realName;
		/**
		 * 文件接收方名称
		 */
		@ApiField("receiver_name")
		private String receiverName;
		/**
		 * 文件接收方类型
		 */
		@ApiField("receiver_type")
		private Long receiverType;
		/**
		 * 接收方类型翻译值
		 */
		@ApiField("receiver_type_view")
		private String receiverTypeView;
		/**
		 * 文件名
		 */
		@ApiField("resource")
		private String resource;
		/**
		 * 文件类型
		 */
		@ApiField("resource_extension")
		private String resourceExtension;
		/**
		 * 文件大小
		 */
		@ApiField("resource_size")
		private Long resourceSize;
		/**
		 * 记录状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 空间id
		 */
		@ApiField("target_space_id")
		private Long targetSpaceId;
		/**
		 * 员工的userId
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getAction() {
			return this.action;
		}
		public void setAction(Long action) {
			this.action = action;
		}
		public String getActionView() {
			return this.actionView;
		}
		public void setActionView(String actionView) {
			this.actionView = actionView;
		}
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
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
		public String getIpAddress() {
			return this.ipAddress;
		}
		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}
		public Long getOperateModule() {
			return this.operateModule;
		}
		public void setOperateModule(Long operateModule) {
			this.operateModule = operateModule;
		}
		public String getOperateModuleView() {
			return this.operateModuleView;
		}
		public void setOperateModuleView(String operateModuleView) {
			this.operateModuleView = operateModuleView;
		}
		public String getOperatorName() {
			return this.operatorName;
		}
		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
		public Long getPlatform() {
			return this.platform;
		}
		public void setPlatform(Long platform) {
			this.platform = platform;
		}
		public String getPlatformView() {
			return this.platformView;
		}
		public void setPlatformView(String platformView) {
			this.platformView = platformView;
		}
		public String getRealName() {
			return this.realName;
		}
		public void setRealName(String realName) {
			this.realName = realName;
		}
		public String getReceiverName() {
			return this.receiverName;
		}
		public void setReceiverName(String receiverName) {
			this.receiverName = receiverName;
		}
		public Long getReceiverType() {
			return this.receiverType;
		}
		public void setReceiverType(Long receiverType) {
			this.receiverType = receiverType;
		}
		public String getReceiverTypeView() {
			return this.receiverTypeView;
		}
		public void setReceiverTypeView(String receiverTypeView) {
			this.receiverTypeView = receiverTypeView;
		}
		public String getResource() {
			return this.resource;
		}
		public void setResource(String resource) {
			this.resource = resource;
		}
		public String getResourceExtension() {
			return this.resourceExtension;
		}
		public void setResourceExtension(String resourceExtension) {
			this.resourceExtension = resourceExtension;
		}
		public Long getResourceSize() {
			return this.resourceSize;
		}
		public void setResourceSize(Long resourceSize) {
			this.resourceSize = resourceSize;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getTargetSpaceId() {
			return this.targetSpaceId;
		}
		public void setTargetSpaceId(Long targetSpaceId) {
			this.targetSpaceId = targetSpaceId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ListAuditLogResult extends TaobaoObject {
		private static final long serialVersionUID = 5556365781615194717L;
		/**
		 * 记录列表
		 */
		@ApiListField("list")
		@ApiField("audit_log_v_o")
		private List<AuditLogVO> list;
	
		public List<AuditLogVO> getList() {
			return this.list;
		}
		public void setList(List<AuditLogVO> list) {
			this.list = list;
		}
	}
	


}
