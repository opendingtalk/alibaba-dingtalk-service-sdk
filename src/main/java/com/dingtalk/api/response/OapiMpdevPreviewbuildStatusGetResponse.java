package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.mpdev.previewbuild.status.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMpdevPreviewbuildStatusGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2638657934647532735L;

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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BuildResultVo extends TaobaoObject {
		private static final long serialVersionUID = 3455615148917234332L;
		/**
		 * 构建记录ID
		 */
		@ApiField("build_id")
		private Long buildId;
		/**
		 * 任务结束
		 */
		@ApiField("finished")
		private Boolean finished;
		/**
		 * 预览scheme
		 */
		@ApiField("result_url")
		private String resultUrl;
		/**
		 * 构建状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 任务ID
		 */
		@ApiField("task_id")
		private String taskId;
	
		public Long getBuildId() {
			return this.buildId;
		}
		public void setBuildId(Long buildId) {
			this.buildId = buildId;
		}
		public Boolean getFinished() {
			return this.finished;
		}
		public void setFinished(Boolean finished) {
			this.finished = finished;
		}
		public String getResultUrl() {
			return this.resultUrl;
		}
		public void setResultUrl(String resultUrl) {
			this.resultUrl = resultUrl;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}
	


}
