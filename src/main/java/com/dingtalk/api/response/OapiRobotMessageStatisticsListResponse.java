package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.statistics.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRobotMessageStatisticsListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8799366953281577818L;

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
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MsgStatResVo extends TaobaoObject {
		private static final long serialVersionUID = 4131244635365396541L;
		/**
		 * 机器人消息推送Id
		 */
		@ApiField("push_id")
		private String pushId;
		/**
		 * 触达群数量
		 */
		@ApiField("reach_group_count")
		private Long reachGroupCount;
		/**
		 * 触达群成员数量
		 */
		@ApiField("reach_group_member_count")
		private Long reachGroupMemberCount;
		/**
		 * 触达群成员未读数量
		 */
		@ApiField("reach_group_member_unread_count")
		private Long reachGroupMemberUnreadCount;
	
		public String getPushId() {
			return this.pushId;
		}
		public void setPushId(String pushId) {
			this.pushId = pushId;
		}
		public Long getReachGroupCount() {
			return this.reachGroupCount;
		}
		public void setReachGroupCount(Long reachGroupCount) {
			this.reachGroupCount = reachGroupCount;
		}
		public Long getReachGroupMemberCount() {
			return this.reachGroupMemberCount;
		}
		public void setReachGroupMemberCount(Long reachGroupMemberCount) {
			this.reachGroupMemberCount = reachGroupMemberCount;
		}
		public Long getReachGroupMemberUnreadCount() {
			return this.reachGroupMemberUnreadCount;
		}
		public void setReachGroupMemberUnreadCount(Long reachGroupMemberUnreadCount) {
			this.reachGroupMemberUnreadCount = reachGroupMemberUnreadCount;
		}
	}
	
	/**
	 * pagination
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PaginationVo extends TaobaoObject {
		private static final long serialVersionUID = 4157368786887732824L;
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RobotMsgStatPageResponse extends TaobaoObject {
		private static final long serialVersionUID = 1853391526893983138L;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("msg_stat_res_vo")
		private List<MsgStatResVo> list;
		/**
		 * pagination
		 */
		@ApiField("pagination")
		private PaginationVo pagination;
	
		public List<MsgStatResVo> getList() {
			return this.list;
		}
		public void setList(List<MsgStatResVo> list) {
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
