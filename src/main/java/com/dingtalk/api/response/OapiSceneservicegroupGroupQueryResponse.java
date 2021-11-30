package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sceneservicegroup.group.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSceneservicegroupGroupQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1897819569289187464L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 分页对象
	 */
	@ApiField("result")
	private Page result;


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

	public void setResult(Page result) {
		this.result = result;
	}
	public Page getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupResponse extends TaobaoObject {
		private static final long serialVersionUID = 8247772222653457282L;
		/**
		 * 群名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 开放群id
		 */
		@ApiField("open_conversationid")
		private String openConversationid;
		/**
		 * 开放群组id
		 */
		@ApiField("open_groupsetid")
		private String openGroupsetid;
		/**
		 * 开放团队ID
		 */
		@ApiField("open_teamid")
		private String openTeamid;
	
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public String getOpenConversationid() {
			return this.openConversationid;
		}
		public void setOpenConversationid(String openConversationid) {
			this.openConversationid = openConversationid;
		}
		public String getOpenGroupsetid() {
			return this.openGroupsetid;
		}
		public void setOpenGroupsetid(String openGroupsetid) {
			this.openGroupsetid = openGroupsetid;
		}
		public String getOpenTeamid() {
			return this.openTeamid;
		}
		public void setOpenTeamid(String openTeamid) {
			this.openTeamid = openTeamid;
		}
	}
	
	/**
	 * 分页对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Page extends TaobaoObject {
		private static final long serialVersionUID = 2454491291273649574L;
		/**
		 * 表示是否还有更多的数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 表示下一次分页的游标，如果next_corsor为null或者has_more为false，表示没有更多的分页数据
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * 返回对象
		 */
		@ApiListField("records")
		@ApiField("group_response")
		private List<GroupResponse> records;
		/**
		 * 总记录数
		 */
		@ApiField("total_count")
		private Long totalCount;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public List<GroupResponse> getRecords() {
			return this.records;
		}
		public void setRecords(List<GroupResponse> records) {
			this.records = records;
		}
		public Long getTotalCount() {
			return this.totalCount;
		}
		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}
	}
	


}
