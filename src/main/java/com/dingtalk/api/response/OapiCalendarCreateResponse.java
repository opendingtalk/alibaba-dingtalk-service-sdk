package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCalendarCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1483458857191575326L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private CorpCalendarCreateResult result;


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

	public void setResult(CorpCalendarCreateResult result) {
		this.result = result;
	}
	public CorpCalendarCreateResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CorpCalendarCreateResult extends TaobaoObject {
		private static final long serialVersionUID = 5438634144937844111L;
		/**
		 * dingtalkCalendarId
		 */
		@ApiField("dingtalk_calendar_id")
		private String dingtalkCalendarId;
		/**
		 * invalidUser
		 */
		@ApiListField("invalid_userids")
		@ApiField("string")
		private List<String> invalidUserids;
	
		public String getDingtalkCalendarId() {
			return this.dingtalkCalendarId;
		}
		public void setDingtalkCalendarId(String dingtalkCalendarId) {
			this.dingtalkCalendarId = dingtalkCalendarId;
		}
		public List<String> getInvalidUserids() {
			return this.invalidUserids;
		}
		public void setInvalidUserids(List<String> invalidUserids) {
			this.invalidUserids = invalidUserids;
		}
	}
	


}
