package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.orgpaas.org.info.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiOrgpaasOrgInfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1414488992911973821L;

	/** 
	 * 错误码 -1 系统异常 40035 参数错误
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 组织信息
	 */
	@ApiField("result")
	private GetOrgInfoResp result;

	/** 
	 * 接口是否调用成功
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

	public void setResult(GetOrgInfoResp result) {
		this.result = result;
	}
	public GetOrgInfoResp getResult( ) {
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
	 * 组织信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetOrgInfoResp extends TaobaoObject {
		private static final long serialVersionUID = 5534264564169577438L;
		/**
		 * 组织附件信息
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 组织名
		 */
		@ApiField("org_name")
		private String orgName;
	
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
	}
	


}
