package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.wiki.group.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWikiGroupListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8756623176544552537L;

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
	 * 结果数据
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
	 * 组织内知识库列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenGroupVo extends TaobaoObject {
		private static final long serialVersionUID = 3349193389397982955L;
		/**
		 * 知识库的描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 知识库的图标
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 知识库ID（加密后的）
		 */
		@ApiField("id")
		private String id;
		/**
		 * 知识库的名字
		 */
		@ApiField("name")
		private String name;
	
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
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
	 * 结果数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPageResult extends TaobaoObject {
		private static final long serialVersionUID = 5428641569785943263L;
		/**
		 * 组织内知识库列表
		 */
		@ApiListField("data")
		@ApiField("open_group_vo")
		private List<OpenGroupVo> data;
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
	
		public List<OpenGroupVo> getData() {
			return this.data;
		}
		public void setData(List<OpenGroupVo> data) {
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
