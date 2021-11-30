package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.planetom.feeds.watchdata.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiPlanetomFeedsWatchdataGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2198821779343782599L;

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
	private OpenFeedWatchDetailRspModel result;

	/** 
	 * 是否请求成功
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

	public void setResult(OpenFeedWatchDetailRspModel result) {
		this.result = result;
	}
	public OpenFeedWatchDetailRspModel getResult( ) {
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
	 * 观看数据列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenFeedWatchDetailModel extends TaobaoObject {
		private static final long serialVersionUID = 6527613111946811452L;
		/**
		 * 观看直播时长（秒）
		 */
		@ApiField("play_live_duration")
		private Long playLiveDuration;
		/**
		 * 观看回放时长（秒）
		 */
		@ApiField("play_record_duration")
		private Long playRecordDuration;
		/**
		 * 观看者在组织内id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getPlayLiveDuration() {
			return this.playLiveDuration;
		}
		public void setPlayLiveDuration(Long playLiveDuration) {
			this.playLiveDuration = playLiveDuration;
		}
		public Long getPlayRecordDuration() {
			return this.playRecordDuration;
		}
		public void setPlayRecordDuration(Long playRecordDuration) {
			this.playRecordDuration = playRecordDuration;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 返回值model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenFeedWatchDetailRspModel extends TaobaoObject {
		private static final long serialVersionUID = 7486111839718269779L;
		/**
		 * 是否还有数据没返回(0还有1没有)
		 */
		@ApiField("has_finish")
		private Long hasFinish;
		/**
		 * 观看数据列表
		 */
		@ApiListField("viewer_watch_details")
		@ApiField("open_feed_watch_detail_model")
		private List<OpenFeedWatchDetailModel> viewerWatchDetails;
	
		public Long getHasFinish() {
			return this.hasFinish;
		}
		public void setHasFinish(Long hasFinish) {
			this.hasFinish = hasFinish;
		}
		public List<OpenFeedWatchDetailModel> getViewerWatchDetails() {
			return this.viewerWatchDetails;
		}
		public void setViewerWatchDetails(List<OpenFeedWatchDetailModel> viewerWatchDetails) {
			this.viewerWatchDetails = viewerWatchDetails;
		}
	}
	


}
