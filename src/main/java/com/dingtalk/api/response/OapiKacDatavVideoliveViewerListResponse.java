package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.videolive.viewer.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavVideoliveViewerListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2616144358487624945L;

	/** 
	 * 结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 提示信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private GroupLiveViewerPageResult result;


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

	public void setResult(GroupLiveViewerPageResult result) {
		this.result = result;
	}
	public GroupLiveViewerPageResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 列表数据项
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupLiveViewer extends TaobaoObject {
		private static final long serialVersionUID = 5275232257685799427L;
		/**
		 * 观看直播时长（毫秒）
		 */
		@ApiField("play_duration")
		private Long playDuration;
		/**
		 * 观看直播时长（分钟）
		 */
		@ApiField("play_duration_min")
		private String playDurationMin;
		/**
		 * 观看直播回放时长（毫秒）
		 */
		@ApiField("play_record_duration")
		private Long playRecordDuration;
		/**
		 * 观看直播回放时长（分钟）
		 */
		@ApiField("play_record_duration_min")
		private String playRecordDurationMin;
		/**
		 * 员工在当前企业内的唯一标识，也称staffId。可由企业在创建时指定，并代表一定含义比如工号，创建后不可修改
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getPlayDuration() {
			return this.playDuration;
		}
		public void setPlayDuration(Long playDuration) {
			this.playDuration = playDuration;
		}
		public String getPlayDurationMin() {
			return this.playDurationMin;
		}
		public void setPlayDurationMin(String playDurationMin) {
			this.playDurationMin = playDurationMin;
		}
		public Long getPlayRecordDuration() {
			return this.playRecordDuration;
		}
		public void setPlayRecordDuration(Long playRecordDuration) {
			this.playRecordDuration = playRecordDuration;
		}
		public String getPlayRecordDurationMin() {
			return this.playRecordDurationMin;
		}
		public void setPlayRecordDurationMin(String playRecordDurationMin) {
			this.playRecordDurationMin = playRecordDurationMin;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupLiveViewerPageResult extends TaobaoObject {
		private static final long serialVersionUID = 8692939217531767838L;
		/**
		 * 列表数据项
		 */
		@ApiListField("data")
		@ApiField("group_live_viewer")
		private List<GroupLiveViewer> data;
		/**
		 * 是否有下一页；true则存在更多分页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一次请求的分页游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<GroupLiveViewer> getData() {
			return this.data;
		}
		public void setData(List<GroupLiveViewer> data) {
			this.data = data;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
