package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.visible.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRoleVisibleGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4262223146355364383L;

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
	private PageVo result;


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

	public void setResult(PageVo result) {
		this.result = result;
	}
	public PageVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageVo extends TaobaoObject {
		private static final long serialVersionUID = 4855356652928351726L;
		/**
		 * 是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * roleIdList
		 */
		@ApiListField("list")
		@ApiField("number")
		private List<Long> list;
		/**
		 * 下次请求的游标
		 */
		@ApiField("next_cursor")
		private String nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<Long> getList() {
			return this.list;
		}
		public void setList(List<Long> list) {
			this.list = list;
		}
		public String getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(String nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
