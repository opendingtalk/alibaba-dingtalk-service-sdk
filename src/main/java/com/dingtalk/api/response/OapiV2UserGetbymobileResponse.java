package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.getbymobile response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2UserGetbymobileResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7392537557884323413L;

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
	@ApiField("result")
	private UserGetByMobileResponse result;


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

	public void setResult(UserGetByMobileResponse result) {
		this.result = result;
	}
	public UserGetByMobileResponse getResult( ) {
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
	public static class UserGetByMobileResponse extends TaobaoObject {
		private static final long serialVersionUID = 8528881629395961312L;
		/**
		 * 专属帐号员工的userid列表
		 */
		@ApiListField("exclusive_account_userid_list")
		@ApiField("string")
		private List<String> exclusiveAccountUseridList;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public List<String> getExclusiveAccountUseridList() {
			return this.exclusiveAccountUseridList;
		}
		public void setExclusiveAccountUseridList(List<String> exclusiveAccountUseridList) {
			this.exclusiveAccountUseridList = exclusiveAccountUseridList;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
