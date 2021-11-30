package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.card.user.post.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCardUserPostUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7262768228472198545L;

	/** 
	 * 无效参数
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 系统自动生成
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 系统自动生成
	 */
	@ApiField("result")
	private UpdatePostResponse result;

	/** 
	 * 系统自动生成
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

	public void setResult(UpdatePostResponse result) {
		this.result = result;
	}
	public UpdatePostResponse getResult( ) {
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
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UpdatePostResponse extends TaobaoObject {
		private static final long serialVersionUID = 1561171522716954435L;
		/**
		 * 动态ID
		 */
		@ApiField("post_id")
		private Long postId;
	
		public Long getPostId() {
			return this.postId;
		}
		public void setPostId(Long postId) {
			this.postId = postId;
		}
	}
	


}
