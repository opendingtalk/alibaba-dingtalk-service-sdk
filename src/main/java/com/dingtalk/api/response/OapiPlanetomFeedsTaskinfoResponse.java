package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.planetom.feeds.taskinfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiPlanetomFeedsTaskinfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2714695811767577519L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiListField("result")
	@ApiField("upload_feed_rsp_model")
	private List<UploadFeedRspModel> result;


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

	public void setResult(List<UploadFeedRspModel> result) {
		this.result = result;
	}
	public List<UploadFeedRspModel> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UploadFeedRspModel extends TaobaoObject {
		private static final long serialVersionUID = 6833197813831925435L;
		/**
		 * 课程处理结果
		 */
		@ApiField("process_msg")
		private String processMsg;
		/**
		 * 结果
		 */
		@ApiField("success")
		private Boolean success;
		/**
		 * 课程标题
		 */
		@ApiField("title")
		private String title;
	
		public String getProcessMsg() {
			return this.processMsg;
		}
		public void setProcessMsg(String processMsg) {
			this.processMsg = processMsg;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
