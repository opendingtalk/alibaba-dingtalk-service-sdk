package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.openlive.white_users.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacOpenliveWhiteUsersListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8781882627881445217L;

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
	 * 结果集合
	 */
	@ApiField("result")
	private ResultList result;

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

	public void setResult(ResultList result) {
		this.result = result;
	}
	public ResultList getResult( ) {
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
	 * 直播对应的人员信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ListLiveUserWhitelistResponse extends TaobaoObject {
		private static final long serialVersionUID = 2562624376664562264L;
		/**
		 * 员工id
		 */
		@ApiField("user_id")
		private String userId;
	
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
	}
	
	/**
	 * 结果集合
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ResultList extends TaobaoObject {
		private static final long serialVersionUID = 4727675652788671988L;
		/**
		 * 人员总数
		 */
		@ApiField("total_cnt")
		private Long totalCnt;
		/**
		 * 直播对应的人员信息
		 */
		@ApiListField("values")
		@ApiField("list_live_user_whitelist_response")
		private List<ListLiveUserWhitelistResponse> values;
	
		public Long getTotalCnt() {
			return this.totalCnt;
		}
		public void setTotalCnt(Long totalCnt) {
			this.totalCnt = totalCnt;
		}
		public List<ListLiveUserWhitelistResponse> getValues() {
			return this.values;
		}
		public void setValues(List<ListLiveUserWhitelistResponse> values) {
			this.values = values;
		}
	}
	


}
