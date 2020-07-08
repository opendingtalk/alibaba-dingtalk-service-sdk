package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.cost.center.entity.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripCostCenterEntityAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6665692496236672136L;

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
	 * 结果对象
	 */
	@ApiField("result")
	private OpenCostCenterAddEntityRs result;

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

	public void setResult(OpenCostCenterAddEntityRs result) {
		this.result = result;
	}
	public OpenCostCenterAddEntityRs getResult( ) {
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
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCostCenterAddEntityRs extends TaobaoObject {
		private static final long serialVersionUID = 7585175446924132973L;
		/**
		 * 增加的人员信息条数
		 */
		@ApiField("add_num")
		private Long addNum;
		/**
		 * 该成本中心下员工总数
		 */
		@ApiField("selected_user_num")
		private Long selectedUserNum;
	
		public Long getAddNum() {
			return this.addNum;
		}
		public void setAddNum(Long addNum) {
			this.addNum = addNum;
		}
		public Long getSelectedUserNum() {
			return this.selectedUserNum;
		}
		public void setSelectedUserNum(Long selectedUserNum) {
			this.selectedUserNum = selectedUserNum;
		}
	}
	


}
