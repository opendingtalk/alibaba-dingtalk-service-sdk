package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.cost.center.entity.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripCostCenterEntityDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3241116463963282427L;

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
	private OpenCostCenterDeleteEntityRs result;

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

	public void setResult(OpenCostCenterDeleteEntityRs result) {
		this.result = result;
	}
	public OpenCostCenterDeleteEntityRs getResult( ) {
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
	public static class OpenCostCenterDeleteEntityRs extends TaobaoObject {
		private static final long serialVersionUID = 4836438692449364441L;
		/**
		 * 删除的人员信息条数
		 */
		@ApiField("remove_num")
		private Long removeNum;
		/**
		 * 该成本中心下员工总数
		 */
		@ApiField("selected_user_num")
		private Long selectedUserNum;
	
		public Long getRemoveNum() {
			return this.removeNum;
		}
		public void setRemoveNum(Long removeNum) {
			this.removeNum = removeNum;
		}
		public Long getSelectedUserNum() {
			return this.selectedUserNum;
		}
		public void setSelectedUserNum(Long selectedUserNum) {
			this.selectedUserNum = selectedUserNum;
		}
	}
	


}
