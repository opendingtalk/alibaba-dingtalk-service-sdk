package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.user.bindapply response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRetailUserBindapplyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2415771558618422979L;

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
	 * 返回结果对象
	 */
	@ApiField("result")
	private UserBindDto result;

	/** 
	 * 成功失败
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

	public void setResult(UserBindDto result) {
		this.result = result;
	}
	public UserBindDto getResult( ) {
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
	 * 返回结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserBindDto extends TaobaoObject {
		private static final long serialVersionUID = 8596116484115467691L;
		/**
		 * 中心组织唯一ID
		 */
		@ApiField("associate_union_id")
		private String associateUnionId;
		/**
		 * 扩展字段Map json
		 */
		@ApiField("extension")
		private String extension;
	
		public String getAssociateUnionId() {
			return this.associateUnionId;
		}
		public void setAssociateUnionId(String associateUnionId) {
			this.associateUnionId = associateUnionId;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
	}
	


}
