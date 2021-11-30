package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkspaceUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4427977498474322347L;

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
	 * 更新后的结果
	 */
	@ApiField("result")
	private OpenWorkspaceDto result;

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

	public void setResult(OpenWorkspaceDto result) {
		this.result = result;
	}
	public OpenWorkspaceDto getResult( ) {
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
		private static final long serialVersionUID = 2542412389647811356L;
		/**
		 * 角色code
		 */
		@ApiField("code")
		private String code;
		/**
		 * 角色名
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
	 * 创建人
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberDto extends TaobaoObject {
		private static final long serialVersionUID = 8716829276795846591L;
		/**
		 * 项目corpid
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 姓名
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
		 * 项目组织内userid
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
	 * 更新后的结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenWorkspaceDto extends TaobaoObject {
		private static final long serialVersionUID = 4314825168858385186L;
		/**
		 * 创建时间
		 */
		@ApiField("create_time")
		private Long createTime;
		/**
		 * 创建人
		 */
		@ApiField("creator")
		private OpenMemberDto creator;
		/**
		 * 项目描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 项目名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 外部系统id
		 */
		@ApiField("outer_id")
		private String outerId;
		/**
		 * 管理员（负责人）
		 */
		@ApiField("owner")
		private OpenMemberDto owner;
		/**
		 * 1项目 2圈子
		 */
		@ApiField("type")
		private Long type;
	
		public Long getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
		public OpenMemberDto getCreator() {
			return this.creator;
		}
		public void setCreator(OpenMemberDto creator) {
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
		public OpenMemberDto getOwner() {
			return this.owner;
		}
		public void setOwner(OpenMemberDto owner) {
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
