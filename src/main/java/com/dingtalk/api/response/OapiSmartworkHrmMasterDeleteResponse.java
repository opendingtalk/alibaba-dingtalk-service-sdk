package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.master.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmMasterDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7763952964499756864L;

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
	 * 批量处理结果
	 */
	@ApiField("result")
	private IntegrateBatchResultVo result;

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

	public void setResult(IntegrateBatchResultVo result) {
		this.result = result;
	}
	public IntegrateBatchResultVo getResult( ) {
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
	 * 失败的处理结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Failresult extends TaobaoObject {
		private static final long serialVersionUID = 4315149643313873755L;
		/**
		 * 业务UK,唯一确定一条流水
		 */
		@ApiField("biz_uk")
		private String bizUk;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
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
	 * 批量处理结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IntegrateBatchResultVo extends TaobaoObject {
		private static final long serialVersionUID = 5164126346599719785L;
		/**
		 * 是否全部成功
		 */
		@ApiField("all_success")
		private Boolean allSuccess;
		/**
		 * 失败的处理结果
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
