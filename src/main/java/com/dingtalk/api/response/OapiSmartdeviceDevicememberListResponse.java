package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.devicemember.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceDevicememberListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6496178684227886182L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误提示
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 查询结果
	 */
	@ApiField("result")
	private PagedList result;


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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PagedList extends TaobaoObject {
		private static final long serialVersionUID = 6344934397894158823L;
		/**
		 * 当 has_more 为true时，下次查询需要传入的游标
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 当前页所对应的userIds
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
