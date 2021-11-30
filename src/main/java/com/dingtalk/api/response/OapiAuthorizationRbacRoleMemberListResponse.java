package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.member.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAuthorizationRbacRoleMemberListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8472795233293279694L;

	/** 
	 * DingOpenResult
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberVo extends TaobaoObject {
		private static final long serialVersionUID = 6153326321736933842L;
		/**
		 * 成员所属corpid
		 */
		@ApiField("belong_corpid")
		private String belongCorpid;
		/**
		 * 成员id
		 */
		@ApiField("member_id")
		private String memberId;
		/**
		 * 成员类型
		 */
		@ApiField("member_type")
		private String memberType;
		/**
		 * 操作人userid
		 */
		@ApiField("operate_userid")
		private String operateUserid;
	
		public String getBelongCorpid() {
			return this.belongCorpid;
		}
		public void setBelongCorpid(String belongCorpid) {
			this.belongCorpid = belongCorpid;
		}
		public String getMemberId() {
			return this.memberId;
		}
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public String getMemberType() {
			return this.memberType;
		}
		public void setMemberType(String memberType) {
			this.memberType = memberType;
		}
		public String getOperateUserid() {
			return this.operateUserid;
		}
		public void setOperateUserid(String operateUserid) {
			this.operateUserid = operateUserid;
		}
	}
	
	/**
	 * PageVo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageVo extends TaobaoObject {
		private static final long serialVersionUID = 1387913979427889269L;
		/**
		 * hasMore
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 成员列表
		 */
		@ApiListField("list")
		@ApiField("open_member_vo")
		private List<OpenMemberVo> list;
		/**
		 * nexCursor
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<OpenMemberVo> getList() {
			return this.list;
		}
		public void setList(List<OpenMemberVo> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	
	/**
	 * DingOpenResult
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5176628811282547653L;
		/**
		 * errcode
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * errmsg
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * PageVo
		 */
		@ApiField("result")
		private PageVo result;
		/**
		 * 调用是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public PageVo getResult() {
			return this.result;
		}
		public void setResult(PageVo result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
