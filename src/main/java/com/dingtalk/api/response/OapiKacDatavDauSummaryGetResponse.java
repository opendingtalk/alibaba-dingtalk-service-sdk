package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.dau.summary.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavDauSummaryGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4198485272241958623L;

	/** 
	 * 结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private DauSummaryResponse result;


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

	public void setResult(DauSummaryResponse result) {
		this.result = result;
	}
	public DauSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DauSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 2121774714556854454L;
		/**
		 * 激活人数（累计）
		 */
		@ApiField("activated_count")
		private Long activatedCount;
		/**
		 * 聊天用户数
		 */
		@ApiField("chat_user_count")
		private Long chatUserCount;
		/**
		 * 通讯录人数
		 */
		@ApiField("contacts_count")
		private Long contactsCount;
		/**
		 * 日活跃人数
		 */
		@ApiField("daily_active_users")
		private Long dailyActiveUsers;
	
		public Long getActivatedCount() {
			return this.activatedCount;
		}
		public void setActivatedCount(Long activatedCount) {
			this.activatedCount = activatedCount;
		}
		public Long getChatUserCount() {
			return this.chatUserCount;
		}
		public void setChatUserCount(Long chatUserCount) {
			this.chatUserCount = chatUserCount;
		}
		public Long getContactsCount() {
			return this.contactsCount;
		}
		public void setContactsCount(Long contactsCount) {
			this.contactsCount = contactsCount;
		}
		public Long getDailyActiveUsers() {
			return this.dailyActiveUsers;
		}
		public void setDailyActiveUsers(Long dailyActiveUsers) {
			this.dailyActiveUsers = dailyActiveUsers;
		}
	}
	


}
