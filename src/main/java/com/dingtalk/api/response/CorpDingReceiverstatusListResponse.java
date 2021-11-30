package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ding.receiverstatus.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpDingReceiverstatusListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8873288456582147735L;

	/** 
	 * 返回的根对象
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
	 * 接收者状态列表，当这里返回为null表示分页已经结束
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingReceiverStatusResult extends TaobaoObject {
		private static final long serialVersionUID = 3195975547698988724L;
		/**
		 * 确认状态。0-未确认；1-已确认；
		 */
		@ApiField("confirmed_status")
		private Long confirmedStatus;
		/**
		 * 确认时间
		 */
		@ApiField("confirmed_time")
		private Long confirmedTime;
		/**
		 * dingId
		 */
		@ApiField("ding_id")
		private String dingId;
		/**
		 * 接收者id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getConfirmedStatus() {
			return this.confirmedStatus;
		}
		public void setConfirmedStatus(Long confirmedStatus) {
			this.confirmedStatus = confirmedStatus;
		}
		public Long getConfirmedTime() {
			return this.confirmedTime;
		}
		public void setConfirmedTime(Long confirmedTime) {
			this.confirmedTime = confirmedTime;
		}
		public String getDingId() {
			return this.dingId;
		}
		public void setDingId(String dingId) {
			this.dingId = dingId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 返回的根对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 8645423636691151213L;
		/**
		 * 错误码
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 接收者状态列表，当这里返回为null表示分页已经结束
		 */
		@ApiListField("result_list")
		@ApiField("ding_receiver_status_result")
		private List<DingReceiverStatusResult> resultList;
		/**
		 * 接口调用是否成功
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
		public List<DingReceiverStatusResult> getResultList() {
			return this.resultList;
		}
		public void setResultList(List<DingReceiverStatusResult> resultList) {
			this.resultList = resultList;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
