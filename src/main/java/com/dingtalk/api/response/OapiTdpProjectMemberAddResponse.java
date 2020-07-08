package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.project.member.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiTdpProjectMemberAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3745385511541654143L;

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
		private static final long serialVersionUID = 8645734242171912221L;
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
		 * 项目成员ID
		 */
		@ApiField("member_id")
		private String memberId;
		/**
		 * 更新者id, 传staffId（工号）
		 */
		@ApiField("modifier_userid")
		private String modifierUserid;
		/**
		 * 成员所属空间ID
		 */
		@ApiField("target_id")
		private String targetId;
		/**
		 * 成员所属空间类型
		 */
		@ApiField("target_type")
		private String targetType;
		/**
		 * 用户ID
		 */
		@ApiField("userid")
		private String userid;
	
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
		public String getMemberId() {
			return this.memberId;
		}
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public String getModifierUserid() {
			return this.modifierUserid;
		}
		public void setModifierUserid(String modifierUserid) {
			this.modifierUserid = modifierUserid;
		}
		public String getTargetId() {
			return this.targetId;
		}
		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}
		public String getTargetType() {
			return this.targetType;
		}
		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
