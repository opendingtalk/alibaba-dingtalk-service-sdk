package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.workrecord.task.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessWorkrecordTaskQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5673335966223213674L;

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
	 * 结果集
	 */
	@ApiField("result")
	private PageResult result;


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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 表单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormItemVo extends TaobaoObject {
		private static final long serialVersionUID = 6746684347624231221L;
		/**
		 * 内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WorkRecordVo extends TaobaoObject {
		private static final long serialVersionUID = 8641178672717346786L;
		/**
		 * 表单列表
		 */
		@ApiListField("forms")
		@ApiField("form_item_vo")
		private List<FormItemVo> forms;
		/**
		 * 实例id
		 */
		@ApiField("instance_id")
		private String instanceId;
		/**
		 * 任务id
		 */
		@ApiField("task_id")
		private String taskId;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 跳转链接
		 */
		@ApiField("url")
		private String url;
	
		public List<FormItemVo> getForms() {
			return this.forms;
		}
		public void setForms(List<FormItemVo> forms) {
			this.forms = forms;
		}
		public String getInstanceId() {
			return this.instanceId;
		}
		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	/**
	 * 结果集
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 8749927317893276257L;
		/**
		 * 是否有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 列表
		 */
		@ApiListField("list")
		@ApiField("work_record_vo")
		private List<WorkRecordVo> list;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<WorkRecordVo> getList() {
			return this.list;
		}
		public void setList(List<WorkRecordVo> list) {
			this.list = list;
		}
	}
	


}
