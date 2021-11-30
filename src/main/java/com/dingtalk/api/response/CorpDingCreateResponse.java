package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ding.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpDingCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7584215757343652221L;

	/** 
	 * result
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CorpDingCreateResult extends TaobaoObject {
		private static final long serialVersionUID = 7585826766344185513L;
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
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2374458758531488999L;
		/**
		 * 错码码
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * 失败原因
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 返回结果
		 */
		@ApiField("result")
		private CorpDingCreateResult result;
		/**
		 * 调用结果
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public CorpDingCreateResult getResult() {
			return this.result;
		}
		public void setResult(CorpDingCreateResult result) {
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
