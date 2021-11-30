package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scenegroup.member.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatScenegroupMemberGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3638446279953294117L;

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
	 * 返回结果
	 */
	@ApiField("result")
	private OpenSceneGroupMemberQueryResponse result;

	/** 
	 * 请求是否成功
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

	public void setResult(OpenSceneGroupMemberQueryResponse result) {
		this.result = result;
	}
	public OpenSceneGroupMemberQueryResponse getResult( ) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenSceneGroupMemberQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 5885697463852838865L;
		/**
		 * 是否还有剩余成员
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 作为客户联系人的staffId
		 */
		@ApiListField("member_contact_staff_ids")
		@ApiField("string")
		private List<String> memberContactStaffIds;
		/**
		 * 群成员的userid
		 */
		@ApiListField("member_user_ids")
		@ApiField("string")
		private List<String> memberUserIds;
		/**
		 * 下一次请求的游标
		 */
		@ApiField("next_cursor")
		private String nextCursor;
		/**
		 * staffId昵称映射
		 */
		@ApiField("staff_id_nick_map")
		private String staffIdNickMap;
		/**
		 * unionId昵称映射
		 */
		@ApiField("union_id_nick_map")
		private String unionIdNickMap;
		/**
		 * 外部客户的unionId
		 */
		@ApiListField("union_ids")
		@ApiField("string")
		private List<String> unionIds;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<String> getMemberContactStaffIds() {
			return this.memberContactStaffIds;
		}
		public void setMemberContactStaffIds(List<String> memberContactStaffIds) {
			this.memberContactStaffIds = memberContactStaffIds;
		}
		public List<String> getMemberUserIds() {
			return this.memberUserIds;
		}
		public void setMemberUserIds(List<String> memberUserIds) {
			this.memberUserIds = memberUserIds;
		}
		public String getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(String nextCursor) {
			this.nextCursor = nextCursor;
		}
		public String getStaffIdNickMap() {
			return this.staffIdNickMap;
		}
		public void setStaffIdNickMap(String staffIdNickMap) {
			this.staffIdNickMap = staffIdNickMap;
		}
		public void setStaffIdNickMapString(String staffIdNickMap) {
			this.staffIdNickMap = staffIdNickMap;
		}
		
		public String getUnionIdNickMap() {
			return this.unionIdNickMap;
		}
		public void setUnionIdNickMap(String unionIdNickMap) {
			this.unionIdNickMap = unionIdNickMap;
		}
		public void setUnionIdNickMapString(String unionIdNickMap) {
			this.unionIdNickMap = unionIdNickMap;
		}
		
		public List<String> getUnionIds() {
			return this.unionIds;
		}
		public void setUnionIds(List<String> unionIds) {
			this.unionIds = unionIds;
		}
	}
	


}
