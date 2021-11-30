package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.project.basic.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiTdpProjectBasicCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7695563356856579964L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 响应结果
	 */
	@ApiField("result")
	private Project result;


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

	public void setResult(Project result) {
		this.result = result;
	}
	public Project getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 响应结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Project extends TaobaoObject {
		private static final long serialVersionUID = 3812552713695986964L;
		/**
		 * 归属企业id
		 */
		@ApiField("belong_corp_id")
		private String belongCorpId;
		/**
		 * 业务标识
		 */
		@ApiField("biz_tag")
		private String bizTag;
		/**
		 * 创建者id, 传staffId（工号）
		 */
		@ApiField("creator_userid")
		private String creatorUserid;
		/**
		 * 项目描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 修改时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 项目图标
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 是否归档
		 */
		@ApiField("is_archived")
		private Boolean isArchived;
		/**
		 * 是否放入回收站
		 */
		@ApiField("is_recycled")
		private Boolean isRecycled;
		/**
		 * 更新者id, 传staffId（工号）
		 */
		@ApiField("modifier_userid")
		private String modifierUserid;
		/**
		 * 项目名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 父项目id
		 */
		@ApiField("parent_id")
		private String parentId;
		/**
		 * 项目ID
		 */
		@ApiField("project_id")
		private String projectId;
		/**
		 * 来源
		 */
		@ApiField("source")
		private String source;
		/**
		 * 此字段用于数据迁移的场景，表示任务在源系统中的唯一ID
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 关联的虚拟组织ID
		 */
		@ApiField("virtual_ding_orgid")
		private String virtualDingOrgid;
		/**
		 * 项目可见性
		 */
		@ApiField("visibility")
		private String visibility;
	
		public String getBelongCorpId() {
			return this.belongCorpId;
		}
		public void setBelongCorpId(String belongCorpId) {
			this.belongCorpId = belongCorpId;
		}
		public String getBizTag() {
			return this.bizTag;
		}
		public void setBizTag(String bizTag) {
			this.bizTag = bizTag;
		}
		public String getCreatorUserid() {
			return this.creatorUserid;
		}
		public void setCreatorUserid(String creatorUserid) {
			this.creatorUserid = creatorUserid;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public Boolean getIsArchived() {
			return this.isArchived;
		}
		public void setIsArchived(Boolean isArchived) {
			this.isArchived = isArchived;
		}
		public Boolean getIsRecycled() {
			return this.isRecycled;
		}
		public void setIsRecycled(Boolean isRecycled) {
			this.isRecycled = isRecycled;
		}
		public String getModifierUserid() {
			return this.modifierUserid;
		}
		public void setModifierUserid(String modifierUserid) {
			this.modifierUserid = modifierUserid;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getParentId() {
			return this.parentId;
		}
		public void setParentId(String parentId) {
			this.parentId = parentId;
		}
		public String getProjectId() {
			return this.projectId;
		}
		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public String getVirtualDingOrgid() {
			return this.virtualDingOrgid;
		}
		public void setVirtualDingOrgid(String virtualDingOrgid) {
			this.virtualDingOrgid = virtualDingOrgid;
		}
		public String getVisibility() {
			return this.visibility;
		}
		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}
	}
	


}
