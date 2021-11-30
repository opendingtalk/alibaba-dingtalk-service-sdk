package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.listwithrule response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceShiftListwithruleResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7889858868532988653L;

	/** 
	 * 接口返回model
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 班次列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopMinimalismShiftVo extends TaobaoObject {
		private static final long serialVersionUID = 2145491142928787849L;
		/**
		 * 班次id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 班次名
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
	 * 班次分页查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 6889519582576316942L;
		/**
		 * 游标，用于继续查询入参
		 */
		@ApiField("cursor")
		private String cursor;
		/**
		 * 是否还有班次，用于分页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 班次列表
		 */
		@ApiListField("shift_list")
		@ApiField("top_minimalism_shift_vo")
		private List<TopMinimalismShiftVo> shiftList;
	
		public String getCursor() {
			return this.cursor;
		}
		public void setCursor(String cursor) {
			this.cursor = cursor;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<TopMinimalismShiftVo> getShiftList() {
			return this.shiftList;
		}
		public void setShiftList(List<TopMinimalismShiftVo> shiftList) {
			this.shiftList = shiftList;
		}
	}
	


}
