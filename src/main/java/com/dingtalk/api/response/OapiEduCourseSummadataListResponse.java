package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.summadata.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCourseSummadataListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1551786489273918977L;

	/** 
	 * 错误编码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private PageQueryResponse result;

	/** 
	 * 请求是否成功
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
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CourseSummaryDataDTO extends TaobaoObject {
		private static final long serialVersionUID = 3879782348241972147L;
		/**
		 * 数据类别业务唯一键
		 */
		@ApiField("category_biz_key")
		private String categoryBizKey;
		/**
		 * 数据类别编码
		 */
		@ApiField("category_code")
		private String categoryCode;
		/**
		 * 课程编码
		 */
		@ApiField("course_code")
		private String courseCode;
		/**
		 * 数据（key：数据因子编码，value： 对应的数据）
		 */
		@ApiField("data")
		private String data;
	
		public String getCategoryBizKey() {
			return this.categoryBizKey;
		}
		public void setCategoryBizKey(String categoryBizKey) {
			this.categoryBizKey = categoryBizKey;
		}
		public String getCategoryCode() {
			return this.categoryCode;
		}
		public void setCategoryCode(String categoryCode) {
			this.categoryCode = categoryCode;
		}
		public String getCourseCode() {
			return this.courseCode;
		}
		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public void setDataString(String data) {
			this.data = data;
		}
		
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 2457957488914153742L;
		/**
		 * 表示是否还有更多的数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("course_summary_data_d_t_o")
		private List<CourseSummaryDataDTO> list;
		/**
		 * 表示下一次分页的游标，如果next_corsor为null或者has_more为false，表示没有更多的分页数据
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<CourseSummaryDataDTO> getList() {
			return this.list;
		}
		public void setList(List<CourseSummaryDataDTO> list) {
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
