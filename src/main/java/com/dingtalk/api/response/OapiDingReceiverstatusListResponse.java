package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ding.receiverstatus.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingReceiverstatusListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3389354362996955619L;

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
	 * 返回的根对象
	 */
	@ApiListField("result_list")
	@ApiField("ding_receiver_status_result")
	private List<DingReceiverStatusResult> resultList;

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

	public void setResultList(List<DingReceiverStatusResult> resultList) {
		this.resultList = resultList;
	}
	public List<DingReceiverStatusResult> getResultList( ) {
		return this.resultList;
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
	 * 返回的根对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingReceiverStatusResult extends TaobaoObject {
		private static final long serialVersionUID = 5429347636343245917L;
		/**
		 * 接收者状态列表，当这里返回为null表示分页已经结束
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
	


}
