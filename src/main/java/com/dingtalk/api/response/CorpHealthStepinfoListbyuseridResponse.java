package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.health.stepinfo.listbyuserid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpHealthStepinfoListbyuseridResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8355966259153822695L;

	/** 
	 * result
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
	 * 步数列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BasicStepInfoVo extends TaobaoObject {
		private static final long serialVersionUID = 7186722898538192791L;
		/**
		 * 统计的时间
		 */
		@ApiField("stat_date")
		private Long statDate;
		/**
		 * 步数
		 */
		@ApiField("step_count")
		private Long stepCount;
		/**
		 * 员工userid
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getStatDate() {
			return this.statDate;
		}
		public void setStatDate(Long statDate) {
			this.statDate = statDate;
		}
		public Long getStepCount() {
			return this.stepCount;
		}
		public void setStepCount(Long stepCount) {
			this.stepCount = stepCount;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2437816884127659742L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 步数列表
		 */
		@ApiListField("stepinfo_list")
		@ApiField("basic_step_info_vo")
		private List<BasicStepInfoVo> stepinfoList;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public List<BasicStepInfoVo> getStepinfoList() {
			return this.stepinfoList;
		}
		public void setStepinfoList(List<BasicStepInfoVo> stepinfoList) {
			this.stepinfoList = stepinfoList;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
