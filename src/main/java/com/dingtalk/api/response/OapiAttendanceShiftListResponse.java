package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceShiftListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6863223134268228181L;

	/** 
	 * 请求错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 请求错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 业务值结果
	 */
	@ApiField("result")
	private PageResult result;

	/** 
	 * 请求成功
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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
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
	 * 业务具体值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopMinimalismShiftVo extends TaobaoObject {
		private static final long serialVersionUID = 7625672169724924458L;
		/**
		 * 班次id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 班次名称
		 */
		@ApiField("name")
		private String name;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 业务值结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 8754993243854465115L;
		/**
		 * 下一次访问游标
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 是否还有
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 业务具体值
		 */
		@ApiListField("result")
		@ApiField("top_minimalism_shift_vo")
		private List<TopMinimalismShiftVo> result;
	
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<TopMinimalismShiftVo> getResult() {
			return this.result;
		}
		public void setResult(List<TopMinimalismShiftVo> result) {
			this.result = result;
		}
	}
	


}
