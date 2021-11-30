package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.openlive.record.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacOpenliveRecordListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6689622957786826695L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果集合
	 */
	@ApiField("result")
	private ResultList result;

	/** 
	 * 是否调用成功
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

	public void setResult(ResultList result) {
		this.result = result;
	}
	public ResultList getResult( ) {
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
	 * 集合子对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ListOpenLiveRecordRspModel extends TaobaoObject {
		private static final long serialVersionUID = 2285478356791537826L;
		/**
		 * 直播ID
		 */
		@ApiField("live_id")
		private String liveId;
		/**
		 * 直播观看链接
		 */
		@ApiField("live_link")
		private String liveLink;
		/**
		 * 公开类型 0: 不公开; 1: 完全公开; 2:组织内公开
		 */
		@ApiField("public_type")
		private Long publicType;
		/**
		 * 预约开始时间戳
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 直播状态：init: 未开播, living: 直播中，end: 直播已结束
		 */
		@ApiField("status")
		private String status;
		/**
		 * 直播标题
		 */
		@ApiField("title")
		private String title;
	
		public String getLiveId() {
			return this.liveId;
		}
		public void setLiveId(String liveId) {
			this.liveId = liveId;
		}
		public String getLiveLink() {
			return this.liveLink;
		}
		public void setLiveLink(String liveLink) {
			this.liveLink = liveLink;
		}
		public Long getPublicType() {
			return this.publicType;
		}
		public void setPublicType(Long publicType) {
			this.publicType = publicType;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 结果集合
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ResultList extends TaobaoObject {
		private static final long serialVersionUID = 4719925152152577557L;
		/**
		 * 直播总数
		 */
		@ApiField("total_cnt")
		private Long totalCnt;
		/**
		 * 集合子对象
		 */
		@ApiListField("values")
		@ApiField("list_open_live_record_rsp_model")
		private List<ListOpenLiveRecordRspModel> values;
	
		public Long getTotalCnt() {
			return this.totalCnt;
		}
		public void setTotalCnt(Long totalCnt) {
			this.totalCnt = totalCnt;
		}
		public List<ListOpenLiveRecordRspModel> getValues() {
			return this.values;
		}
		public void setValues(List<ListOpenLiveRecordRspModel> values) {
			this.values = values;
		}
	}
	


}
