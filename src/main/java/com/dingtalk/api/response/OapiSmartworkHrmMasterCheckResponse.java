package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.master.check response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmMasterCheckResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8555176696119677116L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 保存错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 保存结果
	 */
	@ApiField("result")
	private IntegrateBatchResultVo result;


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

	public void setResult(IntegrateBatchResultVo result) {
		this.result = result;
	}
	public IntegrateBatchResultVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 保存失败的结果，全部成功是为空
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Failresult extends TaobaoObject {
		private static final long serialVersionUID = 3337788245553671755L;
		/**
		 * 业务UK唯一确定一条流水
		 */
		@ApiField("biz_uk")
		private String bizUk;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 保存错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public String getBizUk() {
			return this.bizUk;
		}
		public void setBizUk(String bizUk) {
			this.bizUk = bizUk;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	
	/**
	 * 保存结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IntegrateBatchResultVo extends TaobaoObject {
		private static final long serialVersionUID = 6369528682168282965L;
		/**
		 * 是否全部处理成功
		 */
		@ApiField("all_success")
		private Boolean allSuccess;
		/**
		 * 保存失败的结果，全部成功是为空
		 */
		@ApiListField("fail_result")
		@ApiField("failresult")
		private List<Failresult> failResult;
	
		public Boolean getAllSuccess() {
			return this.allSuccess;
		}
		public void setAllSuccess(Boolean allSuccess) {
			this.allSuccess = allSuccess;
		}
		public List<Failresult> getFailResult() {
			return this.failResult;
		}
		public void setFailResult(List<Failresult> failResult) {
			this.failResult = failResult;
		}
	}
	


}
