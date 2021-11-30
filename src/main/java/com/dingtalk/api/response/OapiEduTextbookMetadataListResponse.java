package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.textbook.metadata.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduTextbookMetadataListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6297358341783255347L;

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
	 * 教育列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TextbookMetadataDTO extends TaobaoObject {
		private static final long serialVersionUID = 6152937751657892429L;
		/**
		 * 教材id
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
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 系统自动生成
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 学科编码
		 */
		@ApiField("subject_code")
		private String subjectCode;
		/**
		 * 教材编码
		 */
		@ApiField("textbook_code")
		private String textbookCode;
		/**
		 * 教材版本名称
		 */
		@ApiField("textbook_name")
		private String textbookName;
	
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
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getSubjectCode() {
			return this.subjectCode;
		}
		public void setSubjectCode(String subjectCode) {
			this.subjectCode = subjectCode;
		}
		public String getTextbookCode() {
			return this.textbookCode;
		}
		public void setTextbookCode(String textbookCode) {
			this.textbookCode = textbookCode;
		}
		public String getTextbookName() {
			return this.textbookName;
		}
		public void setTextbookName(String textbookName) {
			this.textbookName = textbookName;
		}
	}
	
	/**
	 * 数据对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 3395633512524269389L;
		/**
		 * 是否还有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 教育列表
		 */
		@ApiListField("list")
		@ApiField("textbook_metadata_d_t_o")
		private List<TextbookMetadataDTO> list;
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
		public List<TextbookMetadataDTO> getList() {
			return this.list;
		}
		public void setList(List<TextbookMetadataDTO> list) {
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
