package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.group.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmGroupCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5631671688843546165L;

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
	 * 群cid信息
	 */
	@ApiField("result")
	private CreateGroupResponse result;


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

	public void setResult(CreateGroupResponse result) {
		this.result = result;
	}
	public CreateGroupResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 群cid信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateGroupResponse extends TaobaoObject {
		private static final long serialVersionUID = 4717529877347565358L;
		/**
		 * 加密的群cid
		 */
		@ApiField("cid")
		private String cid;
	
		public String getCid() {
			return this.cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
	}
	


}
