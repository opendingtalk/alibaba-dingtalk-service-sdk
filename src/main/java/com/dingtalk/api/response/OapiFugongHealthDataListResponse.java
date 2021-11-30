package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.fugong.health_data.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFugongHealthDataListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6634438213368553333L;

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
	 * 结果
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
	 * 表单内容列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormData extends TaobaoObject {
		private static final long serialVersionUID = 3622134542468546341L;
		/**
		 * 名称。当label字段为空或不存在时，忽略这个label和value
		 */
		@ApiField("label")
		private String label;
		/**
		 * 表单值
		 */
		@ApiField("value")
		private String value;
	
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormInstanceResponse extends TaobaoObject {
		private static final long serialVersionUID = 8594724761727664129L;
		/**
		 * 毫秒级时间戳，填表提交时间
		 */
		@ApiField("create_time")
		private Date createTime;
		/**
		 * 表单内容列表
		 */
		@ApiListField("forms")
		@ApiField("form_data")
		private List<FormData> forms;
		/**
		 * 毫秒级时间戳，填表更新时间
		 */
		@ApiField("modify_time")
		private Date modifyTime;
		/**
		 * 提交人姓名
		 */
		@ApiField("submitter_user_name")
		private String submitterUserName;
		/**
		 * 提交人userid
		 */
		@ApiField("submitter_userid")
		private String submitterUserid;
	
		public Date getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public List<FormData> getForms() {
			return this.forms;
		}
		public void setForms(List<FormData> forms) {
			this.forms = forms;
		}
		public Date getModifyTime() {
			return this.modifyTime;
		}
		public void setModifyTime(Date modifyTime) {
			this.modifyTime = modifyTime;
		}
		public String getSubmitterUserName() {
			return this.submitterUserName;
		}
		public void setSubmitterUserName(String submitterUserName) {
			this.submitterUserName = submitterUserName;
		}
		public String getSubmitterUserid() {
			return this.submitterUserid;
		}
		public void setSubmitterUserid(String submitterUserid) {
			this.submitterUserid = submitterUserid;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 4566379399674169149L;
		/**
		 * 是否还有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 列表
		 */
		@ApiListField("list")
		@ApiField("form_instance_response")
		private List<FormInstanceResponse> list;
		/**
		 * 下一次分页offset的值
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<FormInstanceResponse> getList() {
			return this.list;
		}
		public void setList(List<FormInstanceResponse> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
