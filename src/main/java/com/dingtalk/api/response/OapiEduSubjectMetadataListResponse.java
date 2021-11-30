package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.subject.metadata.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduSubjectMetadataListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3352568318534147587L;

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
	 * 数据结果
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
	 * 学科元数据列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubjectMetadataDTO extends TaobaoObject {
		private static final long serialVersionUID = 1561638263353724518L;
		/**
		 * 区域编码
		 */
		@ApiField("area_code")
		private String areaCode;
		/**
		 * 学科元数据id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 层级
		 */
		@ApiField("level")
		private Long level;
		/**
		 * 父id
		 */
		@ApiField("parent_id")
		private Long parentId;
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
	
		public String getAreaCode() {
			return this.areaCode;
		}
		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getLevel() {
			return this.level;
		}
		public void setLevel(Long level) {
			this.level = level;
		}
		public Long getParentId() {
			return this.parentId;
		}
		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}
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
	 * 数据结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 6181914756218624857L;
		/**
		 * 是否还有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 学科元数据列表
		 */
		@ApiListField("list")
		@ApiField("subject_metadata_d_t_o")
		private List<SubjectMetadataDTO> list;
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
		public List<SubjectMetadataDTO> getList() {
			return this.list;
		}
		public void setList(List<SubjectMetadataDTO> list) {
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
