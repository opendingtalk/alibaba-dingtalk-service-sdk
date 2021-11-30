package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.comment.tips.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduHomeworkCommentTipsQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1454443782916479445L;

	/** 
	 * 错误编码
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
	@ApiListField("result")
	@ApiField("open_hw_comment_tips_response")
	private List<OpenHwCommentTipsResponse> result;

	/** 
	 * 是否成功
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

	public void setResult(List<OpenHwCommentTipsResponse> result) {
		this.result = result;
	}
	public List<OpenHwCommentTipsResponse> getResult( ) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenHwCommentTipsResponse extends TaobaoObject {
		private static final long serialVersionUID = 3867996545917633613L;
		/**
		 * 属性字段
		 */
		@ApiField("attributes")
		private String attributes;
		/**
		 * 音频
		 */
		@ApiField("audio")
		private String audio;
		/**
		 * 内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 视频
		 */
		@ApiField("media")
		private String media;
		/**
		 * 图片
		 */
		@ApiField("photo")
		private String photo;
		/**
		 * 用户userid
		 */
		@ApiField("userid")
		private String userid;
	
		public String getAttributes() {
			return this.attributes;
		}
		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}
		public String getAudio() {
			return this.audio;
		}
		public void setAudio(String audio) {
			this.audio = audio;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getMedia() {
			return this.media;
		}
		public void setMedia(String media) {
			this.media = media;
		}
		public String getPhoto() {
			return this.photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
