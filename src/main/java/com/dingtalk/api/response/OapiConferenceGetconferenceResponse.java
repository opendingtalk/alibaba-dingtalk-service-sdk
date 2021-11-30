package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.conference.getconference response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiConferenceGetconferenceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2414293635945845663L;

	/** 
	 * 服务调用结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务调用结果码描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 服务调用结果对象
	 */
	@ApiField("result")
	private ConferenceInfoDo result;


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

	public void setResult(ConferenceInfoDo result) {
		this.result = result;
	}
	public ConferenceInfoDo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 服务调用结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ConferenceInfoDo extends TaobaoObject {
		private static final long serialVersionUID = 8825989115137619457L;
		/**
		 * 会务地点
		 */
		@ApiField("address")
		private String address;
		/**
		 * 会务管理员userid
		 */
		@ApiField("admin_userid")
		private String adminUserid;
		/**
		 * 会务筹备者userid列表
		 */
		@ApiListField("arrange_userid_list")
		@ApiField("string")
		private List<String> arrangeUseridList;
		/**
		 * 会务Id
		 */
		@ApiField("conference_id")
		private String conferenceId;
		/**
		 * 会务简介
		 */
		@ApiField("content")
		private String content;
		/**
		 * 举办会务的企业Id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 会务创建者userid
		 */
		@ApiField("create_userid")
		private String createUserid;
		/**
		 * 会务结束时间，时间戳格式，单位为毫秒
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 最近更新会务信息的userid
		 */
		@ApiField("modified_userid")
		private String modifiedUserid;
		/**
		 * 会务地址经纬度信息
		 */
		@ApiField("poi")
		private String poi;
		/**
		 * 会务开始时间，时间戳格式，单位为毫秒
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 会务状态，2 - 筹备中，3 - 已发布，10 - 已结束
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 会务主题
		 */
		@ApiField("topic")
		private String topic;
		/**
		 * 会务主题图片地址
		 */
		@ApiField("topic_pic_url")
		private String topicPicUrl;
		/**
		 * 会务类型，1 - 年会，2 - 沙龙
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 会务信息版本号，信息更新时进行递增
		 */
		@ApiField("version")
		private Long version;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAdminUserid() {
			return this.adminUserid;
		}
		public void setAdminUserid(String adminUserid) {
			this.adminUserid = adminUserid;
		}
		public List<String> getArrangeUseridList() {
			return this.arrangeUseridList;
		}
		public void setArrangeUseridList(List<String> arrangeUseridList) {
			this.arrangeUseridList = arrangeUseridList;
		}
		public String getConferenceId() {
			return this.conferenceId;
		}
		public void setConferenceId(String conferenceId) {
			this.conferenceId = conferenceId;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getCreateUserid() {
			return this.createUserid;
		}
		public void setCreateUserid(String createUserid) {
			this.createUserid = createUserid;
		}
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public String getModifiedUserid() {
			return this.modifiedUserid;
		}
		public void setModifiedUserid(String modifiedUserid) {
			this.modifiedUserid = modifiedUserid;
		}
		public String getPoi() {
			return this.poi;
		}
		public void setPoi(String poi) {
			this.poi = poi;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getTopic() {
			return this.topic;
		}
		public void setTopic(String topic) {
			this.topic = topic;
		}
		public String getTopicPicUrl() {
			return this.topicPicUrl;
		}
		public void setTopicPicUrl(String topicPicUrl) {
			this.topicPicUrl = topicPicUrl;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public Long getVersion() {
			return this.version;
		}
		public void setVersion(Long version) {
			this.version = version;
		}
	}
	


}
