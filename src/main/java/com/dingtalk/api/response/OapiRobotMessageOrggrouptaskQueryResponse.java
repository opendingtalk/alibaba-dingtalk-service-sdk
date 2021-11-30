package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.orggrouptask.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRobotMessageOrggrouptaskQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6494531199119285495L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private GroupMessageTaskQueryTopResponse result;

	/** 
	 * 是否受理成功
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

	public void setResult(GroupMessageTaskQueryTopResponse result) {
		this.result = result;
	}
	public GroupMessageTaskQueryTopResponse getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMessageTaskQueryTopResponse extends TaobaoObject {
		private static final long serialVersionUID = 6366134667413723122L;
		/**
		 * 是否还有更多页数
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 请求下一页的游标
		 */
		@ApiField("next_cursor")
		private String nextCursor;
		/**
		 * 已读员工的userids
		 */
		@ApiListField("read_staff_ids")
		@ApiField("string")
		private List<String> readStaffIds;
		/**
		 * 发送结果码，只有SUCCESS为成功
		 */
		@ApiField("send_status")
		private String sendStatus;
	
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
		public List<String> getReadStaffIds() {
			return this.readStaffIds;
		}
		public void setReadStaffIds(List<String> readStaffIds) {
			this.readStaffIds = readStaffIds;
		}
		public String getSendStatus() {
			return this.sendStatus;
		}
		public void setSendStatus(String sendStatus) {
			this.sendStatus = sendStatus;
		}
	}
	


}
