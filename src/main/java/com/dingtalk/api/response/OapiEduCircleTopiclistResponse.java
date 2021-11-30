package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.circle.topiclist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCircleTopiclistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4417522543978657214L;

	/** 
	 * 1
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 系统自动生成
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 系统自动生成
	 */
	@ApiListField("result")
	@ApiField("open_circle_topic_response")
	private List<OpenCircleTopicResponse> result;

	/** 
	 * 系统自动生成
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

	public void setResult(List<OpenCircleTopicResponse> result) {
		this.result = result;
	}
	public List<OpenCircleTopicResponse> getResult( ) {
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
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCircleTopicResponse extends TaobaoObject {
		private static final long serialVersionUID = 6383486344424538196L;
		/**
		 * 1
		 */
		@ApiField("album_media_id")
		private String albumMediaId;
		/**
		 * 1
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 1
		 */
		@ApiField("init_topic")
		private Boolean initTopic;
		/**
		 * 1
		 */
		@ApiField("name")
		private String name;
		/**
		 * 1
		 */
		@ApiField("post_count")
		private Long postCount;
		/**
		 * 1
		 */
		@ApiField("topic_id")
		private Long topicId;
	
		public String getAlbumMediaId() {
			return this.albumMediaId;
		}
		public void setAlbumMediaId(String albumMediaId) {
			this.albumMediaId = albumMediaId;
		}
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public Boolean getInitTopic() {
			return this.initTopic;
		}
		public void setInitTopic(Boolean initTopic) {
			this.initTopic = initTopic;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getPostCount() {
			return this.postCount;
		}
		public void setPostCount(Long postCount) {
			this.postCount = postCount;
		}
		public Long getTopicId() {
			return this.topicId;
		}
		public void setTopicId(Long topicId) {
			this.topicId = topicId;
		}
	}
	


}
