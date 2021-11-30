package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.serviceaccount.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServiceaccountListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5856384374931524623L;

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
	 * 当前记录数
	 */
	@ApiField("item_count")
	private Long itemCount;

	/** 
	 * 服务号列表
	 */
	@ApiListField("items")
	@ApiField("publisher_d_t_o")
	private List<PublisherDTO> items;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;


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

	public void setItemCount(Long itemCount) {
		this.itemCount = itemCount;
	}
	public Long getItemCount( ) {
		return this.itemCount;
	}

	public void setItems(List<PublisherDTO> items) {
		this.items = items;
	}
	public List<PublisherDTO> getItems( ) {
		return this.items;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 服务号列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PublisherDTO extends TaobaoObject {
		private static final long serialVersionUID = 8183989673695442637L;
		/**
		 * 头像图片mediaId
		 */
		@ApiField("avatar_media_id")
		private String avatarMediaId;
		/**
		 * 机器人管理列表中的简介
		 */
		@ApiField("brief")
		private String brief;
		/**
		 * 机器人主页中的服务号功能简介
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 服务号名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 机器人主页中，消息预览图片的mediaId
		 */
		@ApiField("preview_media_id")
		private String previewMediaId;
		/**
		 * 状态，normal-正常，disabled-停用
		 */
		@ApiField("status")
		private String status;
		/**
		 * 服务号的unionid
		 */
		@ApiField("unionid")
		private String unionid;
	
		public String getAvatarMediaId() {
			return this.avatarMediaId;
		}
		public void setAvatarMediaId(String avatarMediaId) {
			this.avatarMediaId = avatarMediaId;
		}
		public String getBrief() {
			return this.brief;
		}
		public void setBrief(String brief) {
			this.brief = brief;
		}
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPreviewMediaId() {
			return this.previewMediaId;
		}
		public void setPreviewMediaId(String previewMediaId) {
			this.previewMediaId = previewMediaId;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
	}
	


}
