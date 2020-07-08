package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.corp.member.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkspaceCorpMemberAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8712641417991811787L;

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
	 * 结果
	 */
	@ApiListField("result")
	@ApiField("open_member_dto")
	private List<OpenMemberDto> result;

	/** 
	 * true or false
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

	public void setResult(List<OpenMemberDto> result) {
		this.result = result;
	}
	public List<OpenMemberDto> getResult( ) {
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
		private static final long serialVersionUID = 3454915557243779381L;
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberDto extends TaobaoObject {
		private static final long serialVersionUID = 7717128538894787377L;
		/**
		 * 组织id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 配合fromCorpId，在那个组织内的userid
		 */
		@ApiField("from_corp_id")
		private String fromCorpId;
		/**
		 * 配合fromCorpId，在那个组织内的userid
		 */
		@ApiField("from_userid")
		private String fromUserid;
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
		public String getFromUserid() {
			return this.fromUserid;
		}
		public void setFromUserid(String fromUserid) {
			this.fromUserid = fromUserid;
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
