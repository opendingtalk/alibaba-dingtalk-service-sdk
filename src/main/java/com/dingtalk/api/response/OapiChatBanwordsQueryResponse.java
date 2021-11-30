package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.banwords.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiChatBanwordsQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8418964792968719146L;

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
	 * 结果集
	 */
	@ApiField("result")
	private OpenBanWordModel result;

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

	public void setResult(OpenBanWordModel result) {
		this.result = result;
	}
	public OpenBanWordModel getResult( ) {
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
	 * 单个人禁言的状态
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserBanWordModel extends TaobaoObject {
		private static final long serialVersionUID = 4381727646449841262L;
		/**
		 * true为该用户禁言，false该用户没有被禁言
		 */
		@ApiField("ban_words_status")
		private Boolean banWordsStatus;
		/**
		 * 结束禁言的时间戳
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 开始禁言的时间戳
		 */
		@ApiField("start_time")
		private Long startTime;
	
		public Boolean getBanWordsStatus() {
			return this.banWordsStatus;
		}
		public void setBanWordsStatus(Boolean banWordsStatus) {
			this.banWordsStatus = banWordsStatus;
		}
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
	}
	
	/**
	 * 结果集
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenBanWordModel extends TaobaoObject {
		private static final long serialVersionUID = 6124286721673329862L;
		/**
		 * true为开启全员禁言，false为关闭全员禁言
		 */
		@ApiField("all_ban_words")
		private Boolean allBanWords;
		/**
		 * 单个人禁言的状态
		 */
		@ApiField("user_ban_words")
		private UserBanWordModel userBanWords;
	
		public Boolean getAllBanWords() {
			return this.allBanWords;
		}
		public void setAllBanWords(Boolean allBanWords) {
			this.allBanWords = allBanWords;
		}
		public UserBanWordModel getUserBanWords() {
			return this.userBanWords;
		}
		public void setUserBanWords(UserBanWordModel userBanWords) {
			this.userBanWords = userBanWords;
		}
	}
	


}
