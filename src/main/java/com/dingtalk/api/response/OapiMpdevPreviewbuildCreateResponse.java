package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.mpdev.previewbuild.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMpdevPreviewbuildCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1498122127932253879L;

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
	 * 返回内容
	 */
	@ApiField("result")
	private BuildResultVo result;

	/** 
	 * 成功
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

	public void setResult(BuildResultVo result) {
		this.result = result;
	}
	public BuildResultVo getResult( ) {
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
	 * 返回内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BuildResultVo extends TaobaoObject {
		private static final long serialVersionUID = 6828617193697631277L;
		/**
		 * 构建ID
		 */
		@ApiField("build_id")
		private String buildId;
		/**
		 * 构建信息
		 */
		@ApiField("build_info")
		private String buildInfo;
		/**
		 * 构建完成
		 */
		@ApiField("finished")
		private Boolean finished;
		/**
		 * 构建日志地址
		 */
		@ApiField("log_url")
		private String logUrl;
		/**
		 * 结果url地址
		 */
		@ApiField("result_url")
		private String resultUrl;
		/**
		 * 构建任务ID
		 */
		@ApiField("task_id")
		private String taskId;
	
		public String getBuildId() {
			return this.buildId;
		}
		public void setBuildId(String buildId) {
			this.buildId = buildId;
		}
		public String getBuildInfo() {
			return this.buildInfo;
		}
		public void setBuildInfo(String buildInfo) {
			this.buildInfo = buildInfo;
		}
		public Boolean getFinished() {
			return this.finished;
		}
		public void setFinished(Boolean finished) {
			this.finished = finished;
		}
		public String getLogUrl() {
			return this.logUrl;
		}
		public void setLogUrl(String logUrl) {
			this.logUrl = logUrl;
		}
		public String getResultUrl() {
			return this.resultUrl;
		}
		public void setResultUrl(String resultUrl) {
			this.resultUrl = resultUrl;
		}
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}
	


}
