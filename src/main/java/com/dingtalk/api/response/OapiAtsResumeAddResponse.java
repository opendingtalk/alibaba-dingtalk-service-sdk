package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.resume.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAtsResumeAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1751366564234146763L;

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
	 * 处理结果
	 */
	@ApiField("result")
	private TopCollectResumeResult result;


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

	public void setResult(TopCollectResumeResult result) {
		this.result = result;
	}
	public TopCollectResumeResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 处理结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopCollectResumeResult extends TaobaoObject {
		private static final long serialVersionUID = 7516492527157278662L;
		/**
		 * 移动端跳转地址
		 */
		@ApiField("mobile_jump_url")
		private String mobileJumpUrl;
		/**
		 * pc端跳转地址
		 */
		@ApiField("pc_jump_url")
		private String pcJumpUrl;
		/**
		 * 简历id
		 */
		@ApiField("resume_id")
		private String resumeId;
	
		public String getMobileJumpUrl() {
			return this.mobileJumpUrl;
		}
		public void setMobileJumpUrl(String mobileJumpUrl) {
			this.mobileJumpUrl = mobileJumpUrl;
		}
		public String getPcJumpUrl() {
			return this.pcJumpUrl;
		}
		public void setPcJumpUrl(String pcJumpUrl) {
			this.pcJumpUrl = pcJumpUrl;
		}
		public String getResumeId() {
			return this.resumeId;
		}
		public void setResumeId(String resumeId) {
			this.resumeId = resumeId;
		}
	}
	


}
