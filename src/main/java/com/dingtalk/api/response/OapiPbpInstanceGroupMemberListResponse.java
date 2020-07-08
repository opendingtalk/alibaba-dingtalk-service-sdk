package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.group.member.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiPbpInstanceGroupMemberListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2496171923731936586L;

	/** 
	 * 错误结果
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 分页结果
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
	 * 列表结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PositionVo extends TaobaoObject {
		private static final long serialVersionUID = 3712488431357295639L;
		/**
		 * 成员id，根据类型不同表示不同
		 */
		@ApiField("member_id")
		private String memberId;
		/**
		 * 成员类型，0表示员工，1表示部门
		 */
		@ApiField("type")
		private Long type;
	
		public String getMemberId() {
			return this.memberId;
		}
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	
	/**
	 * 分页结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 6555759167514551962L;
		/**
		 * 是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 列表结果
		 */
		@ApiListField("list")
		@ApiField("position_vo")
		private List<PositionVo> list;
		/**
		 * 下次请求需要带的游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<PositionVo> getList() {
			return this.list;
		}
		public void setList(List<PositionVo> list) {
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
