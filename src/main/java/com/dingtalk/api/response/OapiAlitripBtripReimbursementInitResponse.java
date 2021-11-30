package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.reimbursement.init response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripReimbursementInitResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7568141849144616757L;

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
	 * 返回值
	 */
	@ApiField("module")
	private OpenApiNewReimbursementRs module;

	/** 
	 * 操作是否成功
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

	public void setModule(OpenApiNewReimbursementRs module) {
		this.module = module;
	}
	public OpenApiNewReimbursementRs getModule( ) {
		return this.module;
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
	 * 返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiNewReimbursementRs extends TaobaoObject {
		private static final long serialVersionUID = 7272175339746678465L;
		/**
		 * 报销单号
		 */
		@ApiField("flow_no")
		private Long flowNo;
		/**
		 * 第三方流程编号
		 */
		@ApiField("thirdparty_flow_id")
		private String thirdpartyFlowId;
	
		public Long getFlowNo() {
			return this.flowNo;
		}
		public void setFlowNo(Long flowNo) {
			this.flowNo = flowNo;
		}
		public String getThirdpartyFlowId() {
			return this.thirdpartyFlowId;
		}
		public void setThirdpartyFlowId(String thirdpartyFlowId) {
			this.thirdpartyFlowId = thirdpartyFlowId;
		}
	}
	


}
