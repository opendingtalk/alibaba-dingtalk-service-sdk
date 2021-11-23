package com.taobao.api.internal.tmc;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * 消息服务-通用消息结构。
 * 
 * @author fengsheng
 * @since 1.0, May 4, 2013
 */
public class Message implements Serializable {

	private static final long serialVersionUID = 3770198526461322514L;

	private Long id;
	private String topic;
	private String pubAppKey;
	private Date pubTime;
	private Date outgoingTime;
	private Long userId;
	private String dataId;
	private String userNick;
	private String content;
	private Map<String, Object> raw;
	private Map<?, ?> contentMap;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPubAppKey() {
		return this.pubAppKey;
	}

	public void setPubAppKey(String pubAppKey) {
		this.pubAppKey = pubAppKey;
	}

	public Date getPubTime() {
		return this.pubTime;
	}

	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	public Date getOutgoingTime() {
		return this.outgoingTime;
	}

	public void setOutgoingTime(Date outgoingTime) {
		this.outgoingTime = outgoingTime;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Map<String, Object> getRaw() {
		return this.raw;
	}

	protected void setRaw(Map<String, Object> raw) {
		this.raw = raw;
	}

	public Map<?, ?> getContentMap() {
		return this.contentMap;
	}

	public void setContentMap(Map<?, ?> contentMap) {
		this.contentMap = contentMap;
	}

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
}
