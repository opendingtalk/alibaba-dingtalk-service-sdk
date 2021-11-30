package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.job.batchadd response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAtsJobBatchaddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8619476287987531616L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 职位
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class JobSimpleVo extends TaobaoObject {
		private static final long serialVersionUID = 2673482236224178917L;
		/**
		 * 职位编号
		 */
		@ApiField("job_code")
		private String jobCode;
		/**
		 * 职位唯一标识
		 */
		@ApiField("job_id")
		private String jobId;
		/**
		 * 职位名称
		 */
		@ApiField("name")
		private String name;
	
		public String getJobCode() {
			return this.jobCode;
		}
		public void setJobCode(String jobCode) {
			this.jobCode = jobCode;
		}
		public String getJobId() {
			return this.jobId;
		}
		public void setJobId(String jobId) {
			this.jobId = jobId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 操作结果项列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BatchResultItemVO extends TaobaoObject {
		private static final long serialVersionUID = 1864954111718892876L;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误描述
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 下标（从0开始）
		 */
		@ApiField("index")
		private Long index;
		/**
		 * 职位
		 */
		@ApiField("item")
		private JobSimpleVo item;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public Long getIndex() {
			return this.index;
		}
		public void setIndex(Long index) {
			this.index = index;
		}
		public JobSimpleVo getItem() {
			return this.item;
		}
		public void setItem(JobSimpleVo item) {
			this.item = item;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	
	/**
	 * 批量操作结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BatchResultVo extends TaobaoObject {
		private static final long serialVersionUID = 2866485683634699542L;
		/**
		 * 失败数量
		 */
		@ApiField("failed_count")
		private Long failedCount;
		/**
		 * 操作结果项列表
		 */
		@ApiListField("result")
		@ApiField("batch_result_item_v_o")
		private List<BatchResultItemVO> result;
		/**
		 * 成功数量
		 */
		@ApiField("success_count")
		private Long successCount;
		/**
		 * 总数量
		 */
		@ApiField("total_count")
		private Long totalCount;
	
		public Long getFailedCount() {
			return this.failedCount;
		}
		public void setFailedCount(Long failedCount) {
			this.failedCount = failedCount;
		}
		public List<BatchResultItemVO> getResult() {
			return this.result;
		}
		public void setResult(List<BatchResultItemVO> result) {
			this.result = result;
		}
		public Long getSuccessCount() {
			return this.successCount;
		}
		public void setSuccessCount(Long successCount) {
			this.successCount = successCount;
		}
		public Long getTotalCount() {
			return this.totalCount;
		}
		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 6741748521668524438L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 错误描述
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 批量操作结果
		 */
		@ApiField("result")
		private BatchResultVo result;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public BatchResultVo getResult() {
			return this.result;
		}
		public void setResult(BatchResultVo result) {
			this.result = result;
		}
	}
	


}
