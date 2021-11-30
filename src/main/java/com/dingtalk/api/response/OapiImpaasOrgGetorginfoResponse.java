package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.org.getorginfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasOrgGetorginfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1293252839166421529L;

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
		private static final long serialVersionUID = 2828174834594763759L;
		/**
		 * 组织附件信息
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 组织名
		 */
		@ApiField("orgname")
		private String orgname;
	
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getOrgname() {
			return this.orgname;
		}
		public void setOrgname(String orgname) {
			this.orgname = orgname;
		}
	}
	


}
