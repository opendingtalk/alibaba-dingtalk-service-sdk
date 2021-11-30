package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.wiki.doc.public.detail response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWikiDocPublicDetailResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5365322399916778877L;

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
	 * 知识页详情
	 */
	@ApiField("result")
	private OpenDocVo result;

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

	public void setResult(OpenDocVo result) {
		this.result = result;
	}
	public OpenDocVo getResult( ) {
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
	 * 知识页详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenDocVo extends TaobaoObject {
		private static final long serialVersionUID = 8384165756139174971L;
		/**
		 * 知识页所在知识库id（加密后的值）
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 知识页ID（加密后的值）
		 */
		@ApiField("id")
		private String id;
		/**
		 * 文档最近一次cp的url
		 */
		@ApiField("latest_cp_url")
		private String latestCpUrl;
		/**
		 * 知识页的名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 知识页所在知识本id（加密后的值）
		 */
		@ApiField("repo_id")
		private String repoId;
		/**
		 * 文档分享链接的url
		 */
		@ApiField("share_url")
		private String shareUrl;
	
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLatestCpUrl() {
			return this.latestCpUrl;
		}
		public void setLatestCpUrl(String latestCpUrl) {
			this.latestCpUrl = latestCpUrl;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRepoId() {
			return this.repoId;
		}
		public void setRepoId(String repoId) {
			this.repoId = repoId;
		}
		public String getShareUrl() {
			return this.shareUrl;
		}
		public void setShareUrl(String shareUrl) {
			this.shareUrl = shareUrl;
		}
	}
	


}
