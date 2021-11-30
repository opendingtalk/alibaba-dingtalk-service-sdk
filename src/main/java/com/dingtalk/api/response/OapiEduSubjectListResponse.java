package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.subject.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduSubjectListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4193771853863359224L;

	/** 
	 * 错误编码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误msg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 数据对象
	 */
	@ApiField("result")
	private PageQueryResponse result;

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

	public void setResult(PageQueryResponse result) {
		this.result = result;
	}
	public PageQueryResponse getResult( ) {
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
	 * 学科实例列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubjectInstanceDTO extends TaobaoObject {
		private static final long serialVersionUID = 5528438898159894345L;
		/**
		 * 学段编码
		 */
		@ApiField("period_code")
		private String periodCode;
		/**
		 * 学科编码
		 */
		@ApiField("subject_code")
		private String subjectCode;
		/**
		 * 学科名称
		 */
		@ApiField("subject_name")
		private String subjectName;
	
		public String getPeriodCode() {
			return this.periodCode;
		}
		public void setPeriodCode(String periodCode) {
			this.periodCode = periodCode;
		}
		public String getSubjectCode() {
			return this.subjectCode;
		}
		public void setSubjectCode(String subjectCode) {
			this.subjectCode = subjectCode;
		}
		public String getSubjectName() {
			return this.subjectName;
		}
		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}
	}
	
	/**
	 * 数据对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 5466788432548345266L;
		/**
		 * 是否还有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 学科实例列表
		 */
		@ApiListField("list")
		@ApiField("subject_instance_d_t_o")
		private List<SubjectInstanceDTO> list;
		/**
		 * 下一页游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * 总数据条数
		 */
		@ApiField("total_count")
		private Long totalCount;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<SubjectInstanceDTO> getList() {
			return this.list;
		}
		public void setList(List<SubjectInstanceDTO> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public Long getTotalCount() {
			return this.totalCount;
		}
		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}
	}
	


}
