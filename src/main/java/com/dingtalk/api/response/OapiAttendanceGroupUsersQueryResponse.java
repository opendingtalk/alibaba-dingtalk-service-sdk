package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.users.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupUsersQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4516834684587534787L;

	/** 
	 * 出参
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
	 * 查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 2791454421629163823L;
		/**
		 * 是否更多
		 */
		@ApiField("has_more")
		private String hasMore;
		/**
		 * 用户列表
		 */
		@ApiListField("user_list")
		@ApiField("string")
		private List<String> userList;
	
		public String getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(String hasMore) {
			this.hasMore = hasMore;
		}
		public List<String> getUserList() {
			return this.userList;
		}
		public void setUserList(List<String> userList) {
			this.userList = userList;
		}
	}
	
	/**
	 * 出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 6733349449767535937L;
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
		 * 查询结果
		 */
		@ApiField("result")
		private Result result;
		/**
		 * 是否成功
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
		public Result getResult() {
			return this.result;
		}
		public void setResult(Result result) {
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
