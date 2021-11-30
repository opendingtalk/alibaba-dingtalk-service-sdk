package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.group.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasGroupQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7718444591583615278L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 群信息
	 */
	@ApiField("result")
	private GroupInfo result;


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

	public void setResult(GroupInfo result) {
		this.result = result;
	}
	public GroupInfo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 群主
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseGroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 8164628479386457474L;
		/**
		 * 群主ID，类型由type字段决定
		 */
		@ApiField("id")
		private String id;
		/**
		 * 账号ID类型，当type=staff时，id填写staffid，当type=channelUser时，id字段填写channelUserId
		 */
		@ApiField("type")
		private String type;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 群信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupInfo extends TaobaoObject {
		private static final long serialVersionUID = 7656291579781722652L;
		/**
		 * 群ID
		 */
		@ApiField("chatid")
		private String chatid;
		/**
		 * 群主
		 */
		@ApiField("creater")
		private BaseGroupMemberInfo creater;
		/**
		 * 群名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 群成员人数
		 */
		@ApiField("member_count")
		private Long memberCount;
		/**
		 * 群成员人数上限
		 */
		@ApiField("member_limit")
		private Long memberLimit;
		/**
		 * 群类型
		 */
		@ApiField("type")
		private Long type;
	
		public String getChatid() {
			return this.chatid;
		}
		public void setChatid(String chatid) {
			this.chatid = chatid;
		}
		public BaseGroupMemberInfo getCreater() {
			return this.creater;
		}
		public void setCreater(BaseGroupMemberInfo creater) {
			this.creater = creater;
		}
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public Long getMemberCount() {
			return this.memberCount;
		}
		public void setMemberCount(Long memberCount) {
			this.memberCount = memberCount;
		}
		public Long getMemberLimit() {
			return this.memberLimit;
		}
		public void setMemberLimit(Long memberLimit) {
			this.memberLimit = memberLimit;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	


}
