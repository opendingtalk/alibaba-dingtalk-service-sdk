package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.corpconversation.getsendprogress response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMessageCorpconversationGetsendprogressResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8776232492396428694L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("progress")
	private AsyncSendProgress progress;


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

	public void setProgress(AsyncSendProgress progress) {
		this.progress = progress;
	}
	public AsyncSendProgress getProgress( ) {
		return this.progress;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AsyncSendProgress extends TaobaoObject {
		private static final long serialVersionUID = 3347642997929188544L;
		/**
		 * 取值 0-100，表示处理的百分比
		 */
		@ApiField("progress_in_percent")
		private Long progressInPercent;
		/**
		 * 任务执行状态,0=未开始,1=处理中,2=处理完毕
		 */
		@ApiField("status")
		private Long status;
	
		public Long getProgressInPercent() {
			return this.progressInPercent;
		}
		public void setProgressInPercent(Long progressInPercent) {
			this.progressInPercent = progressInPercent;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	


}
