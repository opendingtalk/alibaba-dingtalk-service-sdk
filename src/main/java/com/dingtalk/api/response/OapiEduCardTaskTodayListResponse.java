package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.card.task.today.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCardTaskTodayListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6876372122325251965L;

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
	 * 返回数据
	 */
	@ApiListField("result")
	@ApiField("card_task_d_t_o")
	private List<CardTaskDTO> result;

	/** 
	 * 表示结果是否成功
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

	public void setResult(List<CardTaskDTO> result) {
		this.result = result;
	}
	public List<CardTaskDTO> getResult( ) {
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
	 * 返回数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CardTaskDTO extends TaobaoObject {
		private static final long serialVersionUID = 3592554788696393354L;
		/**
		 * 卡片id
		 */
		@ApiField("card_id")
		private Long cardId;
		/**
		 * 班级名称
		 */
		@ApiField("class_name")
		private String className;
		/**
		 * 打卡内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 打卡日期
		 */
		@ApiField("date")
		private Date date;
		/**
		 * 是否完成打卡 N当日未完成打卡  Y完成打卡
		 */
		@ApiField("is_finish_task")
		private String isFinishTask;
		/**
		 * 学生名字
		 */
		@ApiField("student_name")
		private String studentName;
		/**
		 * 打卡任务名字
		 */
		@ApiField("title")
		private String title;
		/**
		 * 任务id
		 */
		@ApiField("user_card_task_id")
		private Long userCardTaskId;
	
		public Long getCardId() {
			return this.cardId;
		}
		public void setCardId(Long cardId) {
			this.cardId = cardId;
		}
		public String getClassName() {
			return this.className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Date getDate() {
			return this.date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getIsFinishTask() {
			return this.isFinishTask;
		}
		public void setIsFinishTask(String isFinishTask) {
			this.isFinishTask = isFinishTask;
		}
		public String getStudentName() {
			return this.studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Long getUserCardTaskId() {
			return this.userCardTaskId;
		}
		public void setUserCardTaskId(Long userCardTaskId) {
			this.userCardTaskId = userCardTaskId;
		}
	}
	


}
