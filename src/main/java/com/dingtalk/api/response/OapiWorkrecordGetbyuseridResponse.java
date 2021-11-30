package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workrecord.getbyuserid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkrecordGetbyuseridResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2285669326995471682L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("records")
	private PageResult records;


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

	public void setRecords(PageResult records) {
		this.records = records;
	}
	public PageResult getRecords( ) {
		return this.records;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * forms
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormItemVo extends TaobaoObject {
		private static final long serialVersionUID = 1557984812262729215L;
		/**
		 * content
		 */
		@ApiField("content")
		private String content;
		/**
		 * title
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
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WorkRecordVo extends TaobaoObject {
		private static final long serialVersionUID = 1153793831623324646L;
		/**
		 * createAt
		 */
		@ApiField("create_time")
		private Long createTime;
		/**
		 * forms
		 */
		@ApiListField("forms")
		@ApiField("form_item_vo")
		private List<FormItemVo> forms;
		/**
		 * recordId
		 */
		@ApiField("record_id")
		private String recordId;
		/**
		 * title
		 */
		@ApiField("title")
		private String title;
		/**
		 * url
		 */
		@ApiField("url")
		private String url;
	
		public Long getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
		public List<FormItemVo> getForms() {
			return this.forms;
		}
		public void setForms(List<FormItemVo> forms) {
			this.forms = forms;
		}
		public String getRecordId() {
			return this.recordId;
		}
		public void setRecordId(String recordId) {
			this.recordId = recordId;
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 6789534946768113771L;
		/**
		 * hasMore
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * list
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
