package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.meetingroom.participant.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceMeetingroomParticipantListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2889921384855786126L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误码信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
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
	 * 参会人列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MemeberOpenInfo extends TaobaoObject {
		private static final long serialVersionUID = 1658456536992993719L;
		/**
		 * 参会人userid
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPageResult extends TaobaoObject {
		private static final long serialVersionUID = 1312323785216996562L;
		/**
		 * 是否有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 游标
		 */
		@ApiField("next_cursor")
		private String nextCursor;
		/**
		 * 参会人列表
		 */
		@ApiListField("participants")
		@ApiField("memeber_open_info")
		private List<MemeberOpenInfo> participants;
	
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
		public List<MemeberOpenInfo> getParticipants() {
			return this.participants;
		}
		public void setParticipants(List<MemeberOpenInfo> participants) {
			this.participants = participants;
		}
	}
	


}
