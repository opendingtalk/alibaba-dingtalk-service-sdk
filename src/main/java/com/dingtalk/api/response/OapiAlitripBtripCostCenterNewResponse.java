package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.cost.center.new response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripCostCenterNewResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1596872216188447728L;

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
	 * 成本中心对象
	 */
	@ApiField("result")
	private OpenCostCenterSaveRs result;

	/** 
	 * 成功标识
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

	public void setResult(OpenCostCenterSaveRs result) {
		this.result = result;
	}
	public OpenCostCenterSaveRs getResult( ) {
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
	 * 成本中心对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCostCenterSaveRs extends TaobaoObject {
		private static final long serialVersionUID = 2668419335174349148L;
		/**
		 * 商旅横版中心id
		 */
		@ApiField("id")
		private Long id;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	}
	


}
