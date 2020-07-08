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

	private static final long serialVersionUID = 7845264492214885456L;

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
		private static final long serialVersionUID = 6695474248372647995L;
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
		 * 用户名字
		 */
		@ApiField("operator_name")
		private String operatorName;
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
		 * 文件名
		 */
		@ApiField("resource")
		private String resource;
		/**
		 * 记录状态
		 */
		@ApiField("status")
		private Long status;
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
		public String getResource() {
			return this.resource;
		}
		public void setResource(String resource) {
			this.resource = resource;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
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
		private static final long serialVersionUID = 3235212243922831793L;
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
