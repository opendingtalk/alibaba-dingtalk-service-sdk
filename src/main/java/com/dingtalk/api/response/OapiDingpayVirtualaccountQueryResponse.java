package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.virtualaccount.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayVirtualaccountQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3489485731674811192L;

	/** 
	 * 钉钉错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误详情
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private AccountQueryOpenResponse result;

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

	public void setResult(AccountQueryOpenResponse result) {
		this.result = result;
	}
	public AccountQueryOpenResponse getResult( ) {
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
	 * accountOpenBO
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingPayAccountOpenBo extends TaobaoObject {
		private static final long serialVersionUID = 5228333871174526866L;
		/**
		 * 支付宝托管账户
		 */
		@ApiField("anonymous_alipay_uid")
		private String anonymousAlipayUid;
		/**
		 * 企业corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 扩展属性
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 支付宝资金账号列表
		 */
		@ApiListField("real_alipay_uids")
		@ApiField("string")
		private List<String> realAlipayUids;
		/**
		 * 当前使用的支付宝资金账号
		 */
		@ApiField("real_used_alipay_uid")
		private String realUsedAlipayUid;
	
		public String getAnonymousAlipayUid() {
			return this.anonymousAlipayUid;
		}
		public void setAnonymousAlipayUid(String anonymousAlipayUid) {
			this.anonymousAlipayUid = anonymousAlipayUid;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public void setExtensionString(String extension) {
			this.extension = extension;
		}
		
		public List<String> getRealAlipayUids() {
			return this.realAlipayUids;
		}
		public void setRealAlipayUids(List<String> realAlipayUids) {
			this.realAlipayUids = realAlipayUids;
		}
		public String getRealUsedAlipayUid() {
			return this.realUsedAlipayUid;
		}
		public void setRealUsedAlipayUid(String realUsedAlipayUid) {
			this.realUsedAlipayUid = realUsedAlipayUid;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountQueryOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 1784952224815557765L;
		/**
		 * accountOpenBO
		 */
		@ApiField("account_open_bo")
		private DingPayAccountOpenBo accountOpenBo;
	
		public DingPayAccountOpenBo getAccountOpenBo() {
			return this.accountOpenBo;
		}
		public void setAccountOpenBo(DingPayAccountOpenBo accountOpenBo) {
			this.accountOpenBo = accountOpenBo;
		}
	}
	


}
