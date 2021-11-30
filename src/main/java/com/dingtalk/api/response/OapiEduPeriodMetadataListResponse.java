package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.period.metadata.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduPeriodMetadataListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1632889794343942136L;

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
	 * 学段元数据列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PeriodMetadataDTO extends TaobaoObject {
		private static final long serialVersionUID = 2148883646885896286L;
		/**
		 * 区域编码
		 */
		@ApiField("area_code")
		private String areaCode;
		/**
		 * 学段id
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
		 * 学段名称
		 */
		@ApiField("period_name")
		private String periodName;
	
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
		public String getPeriodName() {
			return this.periodName;
		}
		public void setPeriodName(String periodName) {
			this.periodName = periodName;
		}
	}
	
	/**
	 * 数据对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 8138226185766714796L;
		/**
		 * 是否还有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 学段元数据列表
		 */
		@ApiListField("list")
		@ApiField("period_metadata_d_t_o")
		private List<PeriodMetadataDTO> list;
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
		public List<PeriodMetadataDTO> getList() {
			return this.list;
		}
		public void setList(List<PeriodMetadataDTO> list) {
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
