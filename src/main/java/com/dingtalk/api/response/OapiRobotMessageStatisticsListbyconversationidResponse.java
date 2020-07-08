package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.statistics.listbyconversationid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRobotMessageStatisticsListbyconversationidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1255365713642328541L;

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
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MsgStatByCIdResVo extends TaobaoObject {
		private static final long serialVersionUID = 1643895322325811287L;
		/**
		 * 群Id
		 */
		@ApiField("conversation_id")
		private String conversationId;
		/**
		 * 钉钉id
		 */
		@ApiField("dingtalk_id")
		private String dingtalkId;
		/**
		 * 成员名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 机器人消息推送Id
		 */
		@ApiField("push_id")
		private String pushId;
		/**
		 * 是否已读
		 */
		@ApiField("read_status")
		private Boolean readStatus;
	
		public String getConversationId() {
			return this.conversationId;
		}
		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}
		public String getDingtalkId() {
			return this.dingtalkId;
		}
		public void setDingtalkId(String dingtalkId) {
			this.dingtalkId = dingtalkId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPushId() {
			return this.pushId;
		}
		public void setPushId(String pushId) {
			this.pushId = pushId;
		}
		public Boolean getReadStatus() {
			return this.readStatus;
		}
		public void setReadStatus(Boolean readStatus) {
			this.readStatus = readStatus;
		}
	}
	
	/**
	 * pagination
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PaginationVo extends TaobaoObject {
		private static final long serialVersionUID = 8566353634214969123L;
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
		private static final long serialVersionUID = 4529336589436679466L;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("msg_stat_by_c_id_res_vo")
		private List<MsgStatByCIdResVo> list;
		/**
		 * pagination
		 */
		@ApiField("pagination")
		private PaginationVo pagination;
	
		public List<MsgStatByCIdResVo> getList() {
			return this.list;
		}
		public void setList(List<MsgStatByCIdResVo> list) {
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
