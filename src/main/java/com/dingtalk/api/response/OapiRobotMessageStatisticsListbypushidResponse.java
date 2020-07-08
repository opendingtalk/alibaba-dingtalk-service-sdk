package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.statistics.listbypushid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRobotMessageStatisticsListbypushidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5381939566237315487L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误值
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private RobotMsgStatPageResponse result;

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

	public void setResult(RobotMsgStatPageResponse result) {
		this.result = result;
	}
	public RobotMsgStatPageResponse getResult( ) {
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
	 * pagination
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PaginationVo extends TaobaoObject {
		private static final long serialVersionUID = 6418137549853554427L;
		/**
		 * 当前页数
		 */
		@ApiField("current_page")
		private Long currentPage;
		/**
		 * 总页数
		 */
		@ApiField("total_page")
		private Long totalPage;
		/**
		 * 总记录数
		 */
		@ApiField("total_record_num")
		private Long totalRecordNum;
	
		public Long getCurrentPage() {
			return this.currentPage;
		}
		public void setCurrentPage(Long currentPage) {
			this.currentPage = currentPage;
		}
		public Long getTotalPage() {
			return this.totalPage;
		}
		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}
		public Long getTotalRecordNum() {
			return this.totalRecordNum;
		}
		public void setTotalRecordNum(Long totalRecordNum) {
			this.totalRecordNum = totalRecordNum;
		}
	}
	
	/**
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MsgStatByPushIdResVo extends TaobaoObject {
		private static final long serialVersionUID = 5312372932629798976L;
		/**
		 * 群Id
		 */
		@ApiField("conversation_id")
		private String conversationId;
		/**
		 * 群成员数量
		 */
		@ApiField("group_member_count")
		private Long groupMemberCount;
		/**
		 * 群成员未读数量
		 */
		@ApiField("group_member_unread_count")
		private Long groupMemberUnreadCount;
		/**
		 * 机器人消息推送Id
		 */
		@ApiField("push_id")
		private String pushId;
	
		public String getConversationId() {
			return this.conversationId;
		}
		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}
		public Long getGroupMemberCount() {
			return this.groupMemberCount;
		}
		public void setGroupMemberCount(Long groupMemberCount) {
			this.groupMemberCount = groupMemberCount;
		}
		public Long getGroupMemberUnreadCount() {
			return this.groupMemberUnreadCount;
		}
		public void setGroupMemberUnreadCount(Long groupMemberUnreadCount) {
			this.groupMemberUnreadCount = groupMemberUnreadCount;
		}
		public String getPushId() {
			return this.pushId;
		}
		public void setPushId(String pushId) {
			this.pushId = pushId;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RobotMsgStatPageResponse extends TaobaoObject {
		private static final long serialVersionUID = 6866662635567513465L;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("msg_stat_by_push_id_res_vo")
		private List<MsgStatByPushIdResVo> list;
		/**
		 * pagination
		 */
		@ApiField("pagination")
		private PaginationVo pagination;
	
		public List<MsgStatByPushIdResVo> getList() {
			return this.list;
		}
		public void setList(List<MsgStatByPushIdResVo> list) {
			this.list = list;
		}
		public PaginationVo getPagination() {
			return this.pagination;
		}
		public void setPagination(PaginationVo pagination) {
			this.pagination = pagination;
		}
	}
	


}
