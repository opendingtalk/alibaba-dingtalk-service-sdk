package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.meetingroom.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceMeetingroomListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8848117746137524322L;

	/** 
	 * errorCode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 系统自动生成
	 */
	@ApiField("result")
	private OpenPageResult result;


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

	public void setResult(OpenPageResult result) {
		this.result = result;
	}
	public OpenPageResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MeetingRoomOpenInfo extends TaobaoObject {
		private static final long serialVersionUID = 2736547654421516345L;
		/**
		 * 会议室容量
		 */
		@ApiField("capacity")
		private String capacity;
		/**
		 * 支持的标签列表
		 */
		@ApiListField("labels")
		@ApiField("number")
		private List<Long> labels;
		/**
		 * 会议室名称
		 */
		@ApiField("room")
		private String room;
		/**
		 * 会议室id
		 */
		@ApiField("room_id")
		private String roomId;
	
		public String getCapacity() {
			return this.capacity;
		}
		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}
		public List<Long> getLabels() {
			return this.labels;
		}
		public void setLabels(List<Long> labels) {
			this.labels = labels;
		}
		public String getRoom() {
			return this.room;
		}
		public void setRoom(String room) {
			this.room = room;
		}
		public String getRoomId() {
			return this.roomId;
		}
		public void setRoomId(String roomId) {
			this.roomId = roomId;
		}
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPageResult extends TaobaoObject {
		private static final long serialVersionUID = 2345218248746611379L;
		/**
		 * 是否有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 系统自动生成
		 */
		@ApiField("next_cursor")
		private String nextCursor;
		/**
		 * 结果
		 */
		@ApiListField("rooms")
		@ApiField("meeting_room_open_info")
		private List<MeetingRoomOpenInfo> rooms;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public String getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(String nextCursor) {
			this.nextCursor = nextCursor;
		}
		public List<MeetingRoomOpenInfo> getRooms() {
			return this.rooms;
		}
		public void setRooms(List<MeetingRoomOpenInfo> rooms) {
			this.rooms = rooms;
		}
	}
	


}
