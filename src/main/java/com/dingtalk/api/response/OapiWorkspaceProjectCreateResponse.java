package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkspaceProjectCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4637753565451181232L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回值
	 */
	@ApiField("result")
	private OpenProjectDto result;

	/** 
	 * 是否成功
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

	public void setResult(OpenProjectDto result) {
		this.result = result;
	}
	public OpenProjectDto getResult( ) {
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
		private static final long serialVersionUID = 3386341299415445312L;
		/**
		 * 角色code
		 */
		@ApiField("code")
		private String code;
		/**
		 * 角色名称
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
	 * 负责人，刚创建时负责人就是创建人
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenProjectMemberDto extends TaobaoObject {
		private static final long serialVersionUID = 8633239723345988469L;
		/**
		 * 开放组织id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 成员名称
		 */
		@ApiField("name")
		private String name;
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
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
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
	
	/**
	 * 返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenProjectDto extends TaobaoObject {
		private static final long serialVersionUID = 4785965286425576956L;
		/**
		 * 开放组织id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 创建组织时返回，用corpId+corpSecret可以换取token
		 */
		@ApiField("corp_secret")
		private String corpSecret;
		/**
		 * 创建时间
		 */
		@ApiField("create_time")
		private Long createTime;
		/**
		 * 创建人
		 */
		@ApiField("creator")
		private OpenProjectMemberDto creator;
		/**
		 * 描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 允许调用者传入外部id用于做系统关联
		 */
		@ApiField("outer_id")
		private String outerId;
		/**
		 * 负责人，刚创建时负责人就是创建人
		 */
		@ApiField("owner")
		private OpenProjectMemberDto owner;
		/**
		 * 1项目 2圈子
		 */
		@ApiField("type")
		private Long type;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getCorpSecret() {
			return this.corpSecret;
		}
		public void setCorpSecret(String corpSecret) {
			this.corpSecret = corpSecret;
		}
		public Long getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
		public OpenProjectMemberDto getCreator() {
			return this.creator;
		}
		public void setCreator(OpenProjectMemberDto creator) {
			this.creator = creator;
		}
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOuterId() {
			return this.outerId;
		}
		public void setOuterId(String outerId) {
			this.outerId = outerId;
		}
		public OpenProjectMemberDto getOwner() {
			return this.owner;
		}
		public void setOwner(OpenProjectMemberDto owner) {
			this.owner = owner;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	


}
