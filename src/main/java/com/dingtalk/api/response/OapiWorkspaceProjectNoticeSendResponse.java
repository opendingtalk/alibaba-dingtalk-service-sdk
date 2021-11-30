package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.notice.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkspaceProjectNoticeSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8159492667433635134L;

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
	 * 发送结果
	 */
	@ApiField("result")
	private OpenSendNoticeResponseDto result;

	/** 
	 * 请求成功
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

	public void setResult(OpenSendNoticeResponseDto result) {
		this.result = result;
	}
	public OpenSendNoticeResponseDto getResult( ) {
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
	 * 发送结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenSendNoticeResponseDto extends TaobaoObject {
		private static final long serialVersionUID = 1783346147912626824L;
		/**
		 * 被发送额度控制的userids
		 */
		@ApiListField("limit_userids")
		@ApiField("string")
		private List<String> limitUserids;
	
		public List<String> getLimitUserids() {
			return this.limitUserids;
		}
		public void setLimitUserids(List<String> limitUserids) {
			this.limitUserids = limitUserids;
		}
	}
	


}
