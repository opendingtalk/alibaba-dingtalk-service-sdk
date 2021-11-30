package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.simplelist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2UserSimplelistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4843839919699649915L;

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
	 * 用户id
	 */
	@ApiField("result")
	private PageResult result;


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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserSimpleListResponse extends TaobaoObject {
		private static final long serialVersionUID = 1593258114482422846L;
		/**
		 * 用户姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 用户id
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 1372796918232448667L;
		/**
		 * 是否有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 列表
		 */
		@ApiListField("list")
		@ApiField("user_simple_list_response")
		private List<UserSimpleListResponse> list;
		/**
		 * 下一页开始的偏移量
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<UserSimpleListResponse> getList() {
			return this.list;
		}
		public void setList(List<UserSimpleListResponse> list) {
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
