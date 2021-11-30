package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.member.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkspaceProjectMemberAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1245976989323454455L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 项目成员
	 */
	@ApiListField("result")
	@ApiField("open_project_member_dto")
	private List<OpenProjectMemberDto> result;

	/** 
	 * 请求成功
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

	public void setResult(List<OpenProjectMemberDto> result) {
		this.result = result;
	}
	public List<OpenProjectMemberDto> getResult( ) {
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
	 * 角色
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenTagDto extends TaobaoObject {
		private static final long serialVersionUID = 7833813672388572198L;
		/**
		 * 角色的code
		 */
		@ApiField("code")
		private String code;
		/**
		 * 角色的名称
		 */
		@ApiField("name")
		private String name;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 项目成员
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenProjectMemberDto extends TaobaoObject {
		private static final long serialVersionUID = 1235927479738819219L;
		/**
		 * 组织id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 从哪个组织选人
		 */
		@ApiField("from_corp_id")
		private String fromCorpId;
		/**
		 * 配合fromCorpId，在那个组织内的userid
		 */
		@ApiField("from_user_id")
		private String fromUserId;
		/**
		 * 角色
		 */
		@ApiListField("tags")
		@ApiField("open_tag_dto")
		private List<OpenTagDto> tags;
		/**
		 * 成员id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getFromCorpId() {
			return this.fromCorpId;
		}
		public void setFromCorpId(String fromCorpId) {
			this.fromCorpId = fromCorpId;
		}
		public String getFromUserId() {
			return this.fromUserId;
		}
		public void setFromUserId(String fromUserId) {
			this.fromUserId = fromUserId;
		}
		public List<OpenTagDto> getTags() {
			return this.tags;
		}
		public void setTags(List<OpenTagDto> tags) {
			this.tags = tags;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
