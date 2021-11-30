package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.userid.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduUseridGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5662646979536995737L;

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
	private OpenEduUserIdListResponse result;

	/** 
	 * 接口调用成功or失败
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

	public void setResult(OpenEduUserIdListResponse result) {
		this.result = result;
	}
	public OpenEduUserIdListResponse getResult( ) {
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
	 * 用户id列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserIdHold extends TaobaoObject {
		private static final long serialVersionUID = 5619434952495945343L;
		/**
		 * 手机号码
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduUserIdListResponse extends TaobaoObject {
		private static final long serialVersionUID = 5137274736273159737L;
		/**
		 * 用户id列表
		 */
		@ApiListField("users")
		@ApiField("user_id_hold")
		private List<UserIdHold> users;
	
		public List<UserIdHold> getUsers() {
			return this.users;
		}
		public void setUsers(List<UserIdHold> users) {
			this.users = users;
		}
	}
	


}
