package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.minimalism.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupMinimalismListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1266367837336775234L;

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
	 * demo
	 */
	@ApiField("result")
	private PageResult result;

	/** 
	 * 成功标记
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
	 * demo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopMinimalismGroupVo extends TaobaoObject {
		private static final long serialVersionUID = 6356442556259656388L;
		/**
		 * 考勤组id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 考勤组名称
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
	 * demo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 3555791625933867161L;
		/**
		 * 游标位置
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 更多标记
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * demo
		 */
		@ApiListField("result")
		@ApiField("top_minimalism_group_vo")
		private List<TopMinimalismGroupVo> result;
	
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
		public List<TopMinimalismGroupVo> getResult() {
			return this.result;
		}
		public void setResult(List<TopMinimalismGroupVo> result) {
			this.result = result;
		}
	}
	


}
