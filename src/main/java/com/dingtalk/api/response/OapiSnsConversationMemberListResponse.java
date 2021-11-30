package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.conversation.member.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSnsConversationMemberListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1173922326283426192L;

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
	 * 结果数据
	 */
	@ApiField("result")
	private SnsOpenGroupMemberResponse result;

	/** 
	 * 请求成功标识
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

	public void setResult(SnsOpenGroupMemberResponse result) {
		this.result = result;
	}
	public SnsOpenGroupMemberResponse getResult( ) {
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
	 * 成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SnsGroupMemberModel extends TaobaoObject {
		private static final long serialVersionUID = 6467933896365842654L;
		/**
		 * 群昵称
		 */
		@ApiField("group_nick_name")
		private String groupNickName;
		/**
		 * 昵称
		 */
		@ApiField("nick_name")
		private String nickName;
		/**
		 * 头像url
		 */
		@ApiField("portrait_url")
		private String portraitUrl;
		/**
		 * 角色，1-群主 2-管理员 3-普通成员
		 */
		@ApiField("role")
		private Long role;
		/**
		 * 用户id
		 */
		@ApiField("unionid")
		private String unionid;
	
		public String getGroupNickName() {
			return this.groupNickName;
		}
		public void setGroupNickName(String groupNickName) {
			this.groupNickName = groupNickName;
		}
		public String getNickName() {
			return this.nickName;
		}
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
		public String getPortraitUrl() {
			return this.portraitUrl;
		}
		public void setPortraitUrl(String portraitUrl) {
			this.portraitUrl = portraitUrl;
		}
		public Long getRole() {
			return this.role;
		}
		public void setRole(Long role) {
			this.role = role;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
	}
	
	/**
	 * 结果数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SnsOpenGroupMemberResponse extends TaobaoObject {
		private static final long serialVersionUID = 6176297913455934259L;
		/**
		 * 群成员是否还有下页数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 成员列表
		 */
		@ApiListField("members")
		@ApiField("sns_group_member_model")
		private List<SnsGroupMemberModel> members;
		/**
		 * 下一页的游标
		 */
		@ApiField("next_cursor")
		private String nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<SnsGroupMemberModel> getMembers() {
			return this.members;
		}
		public void setMembers(List<SnsGroupMemberModel> members) {
			this.members = members;
		}
		public String getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(String nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
