package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.position.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiPbpInstancePositionListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7877354294184325414L;

	/** 
	 * 系统自动生成
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
	 * 位置列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PositionVo extends TaobaoObject {
		private static final long serialVersionUID = 3212677846823942931L;
		/**
		 * 位置唯一标识，根据type不同类型不同，如硬件类型代表硬件设备唯一标识
		 */
		@ApiField("position_id")
		private String positionId;
		/**
		 * 位置名称
		 */
		@ApiField("position_name")
		private String positionName;
		/**
		 * 位置类型，如100代表硬件B1设备
		 */
		@ApiField("type")
		private Long type;
	
		public String getPositionId() {
			return this.positionId;
		}
		public void setPositionId(String positionId) {
			this.positionId = positionId;
		}
		public String getPositionName() {
			return this.positionName;
		}
		public void setPositionName(String positionName) {
			this.positionName = positionName;
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
		private static final long serialVersionUID = 5153125237296618185L;
		/**
		 * 是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 位置列表
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
