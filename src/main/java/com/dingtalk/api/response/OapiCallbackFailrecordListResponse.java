package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.callback.failrecord.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCallbackFailrecordListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4245494391962526926L;

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
	 * 回调失败数据列表
	 */
	@ApiListField("failed_list")
	@ApiField("failed_list")
	private List<FailedList> failedList;

	/** 
	 * 是否更多
	 */
	@ApiField("has_more")
	private Boolean hasMore;


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

	public void setFailedList(List<FailedList> failedList) {
		this.failedList = failedList;
	}
	public List<FailedList> getFailedList( ) {
		return this.failedList;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 回调失败数据列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FailedList extends TaobaoObject {
		private static final long serialVersionUID = 5456342882214441893L;
		/**
		 * 回调数据。不同事件类型不同，通常为JSON String
		 */
		@ApiField("call_back_data")
		private String callBackData;
		/**
		 * 事件类型
		 */
		@ApiField("call_back_tag")
		private String callBackTag;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 失败时间。单位：毫秒
		 */
		@ApiField("event_time")
		private Long eventTime;
		/**
		 * 回调失败记录id
		 */
		@ApiField("id")
		private Long id;
	
		public String getCallBackData() {
			return this.callBackData;
		}
		public void setCallBackData(String callBackData) {
			this.callBackData = callBackData;
		}
		public String getCallBackTag() {
			return this.callBackTag;
		}
		public void setCallBackTag(String callBackTag) {
			this.callBackTag = callBackTag;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public Long getEventTime() {
			return this.eventTime;
		}
		public void setEventTime(Long eventTime) {
			this.eventTime = eventTime;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	}
	


}
