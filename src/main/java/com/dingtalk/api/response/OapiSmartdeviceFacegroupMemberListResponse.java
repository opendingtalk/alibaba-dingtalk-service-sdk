package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facegroup.member.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceFacegroupMemberListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2324893668487453266L;

	/** 
	 * 错误代号
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误提示
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 符合条件的当前页数据
	 */
	@ApiField("result")
	private PagedList result;

	/** 
	 * API调用结果
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

	public void setResult(PagedList result) {
		this.result = result;
	}
	public PagedList getResult( ) {
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
	 * 符合条件的当前页数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PagedList extends TaobaoObject {
		private static final long serialVersionUID = 5241377885276922276L;
		/**
		 * 游标，下一次请求需要传入的下一次请求时需传入的游标值
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 是否还有下一页数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 已在识别组的用户ids
		 */
		@ApiListField("items")
		@ApiField("string")
		private List<String> items;
	
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
		public List<String> getItems() {
			return this.items;
		}
		public void setItems(List<String> items) {
			this.items = items;
		}
	}
	


}
