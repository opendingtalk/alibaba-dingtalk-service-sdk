package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.wiki.repo.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWikiRepoListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6392571729996372652L;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 对返回码的文本描述内容
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private OpenPageResult result;

	/** 
	 * 是否操作成功
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

	public void setResult(OpenPageResult result) {
		this.result = result;
	}
	public OpenPageResult getResult( ) {
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
	 * 知识本列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRepoVo extends TaobaoObject {
		private static final long serialVersionUID = 2427695581485436213L;
		/**
		 * 知识库的描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 知识库ID（加密后的）
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 知识本的图标
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 知识本ID（加密后的）
		 */
		@ApiField("id")
		private String id;
		/**
		 * 知识本的名字
		 */
		@ApiField("name")
		private String name;
	
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPageResult extends TaobaoObject {
		private static final long serialVersionUID = 4758829981325671948L;
		/**
		 * 知识本列表
		 */
		@ApiListField("data")
		@ApiField("open_repo_vo")
		private List<OpenRepoVo> data;
		/**
		 * 是否还有更多的数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一次分页的游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<OpenRepoVo> getData() {
			return this.data;
		}
		public void setData(List<OpenRepoVo> data) {
			this.data = data;
		}
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
	}
	


}
