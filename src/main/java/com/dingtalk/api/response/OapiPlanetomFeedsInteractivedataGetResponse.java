package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.planetom.feeds.interactivedata.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiPlanetomFeedsInteractivedataGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5893589335238997648L;

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
	 * 返回值model
	 */
	@ApiField("result")
	private OpenFeedInteractiveDataModel result;

	/** 
	 * 是否成功
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

	public void setResult(OpenFeedInteractiveDataModel result) {
		this.result = result;
	}
	public OpenFeedInteractiveDataModel getResult( ) {
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
	 * 基础信息model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseFeedInfoModel extends TaobaoObject {
		private static final long serialVersionUID = 8699195737643764136L;
		/**
		 * 直播时长
		 */
		@ApiField("live_duration")
		private Long liveDuration;
		/**
		 * 分享绑定的群列表
		 */
		@ApiListField("share_live_cid_list")
		@ApiField("string")
		private List<String> shareLiveCidList;
		/**
		 * 开始时间戳
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 课程标题
		 */
		@ApiField("title")
		private String title;
	
		public Long getLiveDuration() {
			return this.liveDuration;
		}
		public void setLiveDuration(Long liveDuration) {
			this.liveDuration = liveDuration;
		}
		public List<String> getShareLiveCidList() {
			return this.shareLiveCidList;
		}
		public void setShareLiveCidList(List<String> shareLiveCidList) {
			this.shareLiveCidList = shareLiveCidList;
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
	
	/**
	 * 互动信息model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InteractiveInfoModel extends TaobaoObject {
		private static final long serialVersionUID = 6224339348487955192L;
		/**
		 * 消息数
		 */
		@ApiField("message_count")
		private Long messageCount;
		/**
		 * 点赞数
		 */
		@ApiField("praise_count")
		private Long praiseCount;
		/**
		 * 观看总次数
		 */
		@ApiField("pv")
		private Long pv;
		/**
		 * 观看总人数（去重）
		 */
		@ApiField("uv")
		private Long uv;
	
		public Long getMessageCount() {
			return this.messageCount;
		}
		public void setMessageCount(Long messageCount) {
			this.messageCount = messageCount;
		}
		public Long getPraiseCount() {
			return this.praiseCount;
		}
		public void setPraiseCount(Long praiseCount) {
			this.praiseCount = praiseCount;
		}
		public Long getPv() {
			return this.pv;
		}
		public void setPv(Long pv) {
			this.pv = pv;
		}
		public Long getUv() {
			return this.uv;
		}
		public void setUv(Long uv) {
			this.uv = uv;
		}
	}
	
	/**
	 * 返回值model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenFeedInteractiveDataModel extends TaobaoObject {
		private static final long serialVersionUID = 7792456943757326862L;
		/**
		 * 基础信息model
		 */
		@ApiField("base_feed_info")
		private BaseFeedInfoModel baseFeedInfo;
		/**
		 * 互动信息model
		 */
		@ApiField("interactive_info")
		private InteractiveInfoModel interactiveInfo;
	
		public BaseFeedInfoModel getBaseFeedInfo() {
			return this.baseFeedInfo;
		}
		public void setBaseFeedInfo(BaseFeedInfoModel baseFeedInfo) {
			this.baseFeedInfo = baseFeedInfo;
		}
		public InteractiveInfoModel getInteractiveInfo() {
			return this.interactiveInfo;
		}
		public void setInteractiveInfo(InteractiveInfoModel interactiveInfo) {
			this.interactiveInfo = interactiveInfo;
		}
	}
	


}
