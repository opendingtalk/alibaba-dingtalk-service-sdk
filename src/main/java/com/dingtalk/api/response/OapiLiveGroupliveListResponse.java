package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiLiveGroupliveListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3654937955978635541L;

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
	 * 返回列表
	 */
	@ApiListField("result")
	@ApiField("result")
	private List<Result> result;


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

	public void setResult(List<Result> result) {
		this.result = result;
	}
	public List<Result> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 4784722334927399166L;
		/**
		 * 群id
		 */
		@ApiField("cid")
		private Long cid;
		/**
		 * 时长
		 */
		@ApiField("duration")
		private Long duration;
		/**
		 * 是否横屏
		 */
		@ApiField("is_landscape")
		private Boolean isLandscape;
		/**
		 * 直播id
		 */
		@ApiField("live_uuid")
		private String liveUuid;
		/**
		 * openid
		 */
		@ApiField("open_id")
		private Long openId;
		/**
		 * 开始时间ms
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public Long getCid() {
			return this.cid;
		}
		public void setCid(Long cid) {
			this.cid = cid;
		}
		public Long getDuration() {
			return this.duration;
		}
		public void setDuration(Long duration) {
			this.duration = duration;
		}
		public Boolean getIsLandscape() {
			return this.isLandscape;
		}
		public void setIsLandscape(Boolean isLandscape) {
			this.isLandscape = isLandscape;
		}
		public String getLiveUuid() {
			return this.liveUuid;
		}
		public void setLiveUuid(String liveUuid) {
			this.liveUuid = liveUuid;
		}
		public Long getOpenId() {
			return this.openId;
		}
		public void setOpenId(Long openId) {
			this.openId = openId;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
