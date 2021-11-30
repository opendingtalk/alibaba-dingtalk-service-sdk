package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.workrecord.task.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessWorkrecordTaskCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1381388646588265849L;

	/** 
	 * 0
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 成功
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 任务列表
	 */
	@ApiListField("tasks")
	@ApiField("task_top_vo")
	private List<TaskTopVo> tasks;


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

	public void setTasks(List<TaskTopVo> tasks) {
		this.tasks = tasks;
	}
	public List<TaskTopVo> getTasks( ) {
		return this.tasks;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 任务列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskTopVo extends TaobaoObject {
		private static final long serialVersionUID = 8714551566977185282L;
		/**
		 * 任务id
		 */
		@ApiField("task_id")
		private Long taskId;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getTaskId() {
			return this.taskId;
		}
		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
