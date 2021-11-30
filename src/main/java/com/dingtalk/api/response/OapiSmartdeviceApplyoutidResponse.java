package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.applyoutid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceApplyoutidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5749699877895415867L;

	/** 
	 * 错误编码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回值对象
	 */
	@ApiField("result")
	private OutDeviceIdVo result;

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

	public void setResult(OutDeviceIdVo result) {
		this.result = result;
	}
	public OutDeviceIdVo getResult( ) {
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
	 * 返回值对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OutDeviceIdVo extends TaobaoObject {
		private static final long serialVersionUID = 5857275697577144514L;
		/**
		 * 外部设备id
		 */
		@ApiField("outdid")
		private String outdid;
	
		public String getOutdid() {
			return this.outdid;
		}
		public void setOutdid(String outdid) {
			this.outdid = outdid;
		}
	}
	


}
