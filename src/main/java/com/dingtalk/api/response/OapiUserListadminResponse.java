package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.listadmin response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserListadminResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8626691475518297765L;

	/** 
	 * 错误码。0代表成功。
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息。
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiListField("result")
	@ApiField("list_admin_response")
	private List<ListAdminResponse> result;


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

	public void setResult(List<ListAdminResponse> result) {
		this.result = result;
	}
	public List<ListAdminResponse> getResult( ) {
		return this.result;
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
	public static class ListAdminResponse extends TaobaoObject {
		private static final long serialVersionUID = 6171288153282497661L;
		/**
		 * 管理员角色，1 主管理员 2 子管理员
		 */
		@ApiField("sys_level")
		private Long sysLevel;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getSysLevel() {
			return this.sysLevel;
		}
		public void setSysLevel(Long sysLevel) {
			this.sysLevel = sysLevel;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
