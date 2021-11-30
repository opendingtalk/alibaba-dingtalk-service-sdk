package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.listbytime response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiLiveGroupliveListbytimeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1622216745499238219L;

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
	 * 直播列表
	 */
	@ApiListField("result")
	@ApiField("group_live_list_result")
	private List<GroupLiveListResult> result;


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

	public void setResult(List<GroupLiveListResult> result) {
		this.result = result;
	}
	public List<GroupLiveListResult> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 直播列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupLiveListResult extends TaobaoObject {
		private static final long serialVersionUID = 7744677467126922479L;
		/**
		 * 直播时长
		 */
		@ApiField("duration")
		private Long duration;
		/**
		 * 直播id
		 */
		@ApiField("live_uuid")
		private String liveUuid;
		/**
		 * true为被联播群，false为主群
		 */
		@ApiField("share_from")
		private Boolean shareFrom;
		/**
		 * 直播开始时间
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 直播标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 主播userId
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getDuration() {
			return this.duration;
		}
		public void setDuration(Long duration) {
			this.duration = duration;
		}
		public String getLiveUuid() {
			return this.liveUuid;
		}
		public void setLiveUuid(String liveUuid) {
			this.liveUuid = liveUuid;
		}
		public Boolean getShareFrom() {
			return this.shareFrom;
		}
		public void setShareFrom(Boolean shareFrom) {
			this.shareFrom = shareFrom;
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
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
