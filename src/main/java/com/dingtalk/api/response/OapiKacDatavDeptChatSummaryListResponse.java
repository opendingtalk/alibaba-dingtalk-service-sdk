package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.dept.chat.summary.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavDeptChatSummaryListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4879687315138846958L;

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
	 * resut
	 */
	@ApiField("result")
	private ImDeptSummaryResponse result;


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

	public void setResult(ImDeptSummaryResponse result) {
		this.result = result;
	}
	public ImDeptSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * data
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ImDeptSummaryVo extends TaobaoObject {
		private static final long serialVersionUID = 2364674877196571667L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 部门名称
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 最近天一天群聊消息数
		 */
		@ApiField("group_message_cnt")
		private Long groupMessageCnt;
		/**
		 * 最近1天发送群文件数
		 */
		@ApiField("group_send_file_message_cnt")
		private String groupSendFileMessageCnt;
		/**
		 * 最近1天发消息数
		 */
		@ApiField("message_cnt")
		private Long messageCnt;
		/**
		 * 最近一天群聊消息人数
		 */
		@ApiField("send_group_message_user_cnt")
		private Long sendGroupMessageUserCnt;
		/**
		 * 最近一天人均发送消息数
		 */
		@ApiField("send_message_avg_cnt")
		private String sendMessageAvgCnt;
		/**
		 * 最近一天发消息人数
		 */
		@ApiField("send_message_user_cnt")
		private Long sendMessageUserCnt;
		/**
		 * 最近一天单聊消息人数
		 */
		@ApiField("send_single_message_user_cnt")
		private Long sendSingleMessageUserCnt;
		/**
		 * 最近一天单聊消息数
		 */
		@ApiField("single_message_cnt")
		private Long singleMessageCnt;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public Long getGroupMessageCnt() {
			return this.groupMessageCnt;
		}
		public void setGroupMessageCnt(Long groupMessageCnt) {
			this.groupMessageCnt = groupMessageCnt;
		}
		public String getGroupSendFileMessageCnt() {
			return this.groupSendFileMessageCnt;
		}
		public void setGroupSendFileMessageCnt(String groupSendFileMessageCnt) {
			this.groupSendFileMessageCnt = groupSendFileMessageCnt;
		}
		public Long getMessageCnt() {
			return this.messageCnt;
		}
		public void setMessageCnt(Long messageCnt) {
			this.messageCnt = messageCnt;
		}
		public Long getSendGroupMessageUserCnt() {
			return this.sendGroupMessageUserCnt;
		}
		public void setSendGroupMessageUserCnt(Long sendGroupMessageUserCnt) {
			this.sendGroupMessageUserCnt = sendGroupMessageUserCnt;
		}
		public String getSendMessageAvgCnt() {
			return this.sendMessageAvgCnt;
		}
		public void setSendMessageAvgCnt(String sendMessageAvgCnt) {
			this.sendMessageAvgCnt = sendMessageAvgCnt;
		}
		public Long getSendMessageUserCnt() {
			return this.sendMessageUserCnt;
		}
		public void setSendMessageUserCnt(Long sendMessageUserCnt) {
			this.sendMessageUserCnt = sendMessageUserCnt;
		}
		public Long getSendSingleMessageUserCnt() {
			return this.sendSingleMessageUserCnt;
		}
		public void setSendSingleMessageUserCnt(Long sendSingleMessageUserCnt) {
			this.sendSingleMessageUserCnt = sendSingleMessageUserCnt;
		}
		public Long getSingleMessageCnt() {
			return this.singleMessageCnt;
		}
		public void setSingleMessageCnt(Long singleMessageCnt) {
			this.singleMessageCnt = singleMessageCnt;
		}
	}
	
	/**
	 * resut
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ImDeptSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 2356197739974365529L;
		/**
		 * data
		 */
		@ApiListField("data")
		@ApiField("im_dept_summary_vo")
		private List<ImDeptSummaryVo> data;
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
	
		public List<ImDeptSummaryVo> getData() {
			return this.data;
		}
		public void setData(List<ImDeptSummaryVo> data) {
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
