package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ding.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3823625598944527663L;

	/** 
	 * 错码码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 失败原因
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private CorpDingCreateResult result;


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

	public void setResult(CorpDingCreateResult result) {
		this.result = result;
	}
	public CorpDingCreateResult getResult( ) {
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
	public static class CorpDingCreateResult extends TaobaoObject {
		private static final long serialVersionUID = 3127461862347328292L;
		/**
		 * invalidUser
		 */
		@ApiListField("invalid_users")
		@ApiField("string")
		private List<String> invalidUsers;
		/**
		 * openDingId
		 */
		@ApiField("open_ding_id")
		private String openDingId;
	
		public List<String> getInvalidUsers() {
			return this.invalidUsers;
		}
		public void setInvalidUsers(List<String> invalidUsers) {
			this.invalidUsers = invalidUsers;
		}
		public String getOpenDingId() {
			return this.openDingId;
		}
		public void setOpenDingId(String openDingId) {
			this.openDingId = openDingId;
		}
	}
	


}
