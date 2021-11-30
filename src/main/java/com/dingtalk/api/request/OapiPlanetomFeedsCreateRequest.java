package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiPlanetomFeedsCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.planetom.feeds.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.26
 */
public class OapiPlanetomFeedsCreateRequest extends BaseTaobaoRequest<OapiPlanetomFeedsCreateResponse> {
	
	

	/** 
	* 主播在组织内的id（staffId）
	 */
	private String anchorId;

	/** 
	* 约定开播时间戳（未来时间）
	 */
	private Long appointBeginTime;

	/** 
	* 封面url
	 */
	private String coverUrl;

	/** 
	* 课程类型
	 */
	private Long feedType;

	/** 
	* 1 chatId  2 openConversationId，不传默认为OpenConversationId
	 */
	private Long groupIdType;

	/** 
	* 绑定群列表,如果不传，默认为公开直播
	 */
	private String groupIds;

	/** 
	* 简介
	 */
	private String introduction;

	/** 
	* 开放平台中应用的appId
	 */
	private Long openAppId;

	/** 
	* 图片简介url
	 */
	private String picIntroductionUrl;

	/** 
	* 预告片视频
	 */
	private String preVideoUrl;

	/** 
	* 课程标题
	 */
	private String title;

	public void setAnchorId(String anchorId) {
		this.anchorId = anchorId;
	}

	public String getAnchorId() {
		return this.anchorId;
	}

	public void setAppointBeginTime(Long appointBeginTime) {
		this.appointBeginTime = appointBeginTime;
	}

	public Long getAppointBeginTime() {
		return this.appointBeginTime;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public String getCoverUrl() {
		return this.coverUrl;
	}

	public void setFeedType(Long feedType) {
		this.feedType = feedType;
	}

	public Long getFeedType() {
		return this.feedType;
	}

	public void setGroupIdType(Long groupIdType) {
		this.groupIdType = groupIdType;
	}

	public Long getGroupIdType() {
		return this.groupIdType;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}

	public String getGroupIds() {
		return this.groupIds;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setOpenAppId(Long openAppId) {
		this.openAppId = openAppId;
	}

	public Long getOpenAppId() {
		return this.openAppId;
	}

	public void setPicIntroductionUrl(String picIntroductionUrl) {
		this.picIntroductionUrl = picIntroductionUrl;
	}

	public String getPicIntroductionUrl() {
		return this.picIntroductionUrl;
	}

	public void setPreVideoUrl(String preVideoUrl) {
		this.preVideoUrl = preVideoUrl;
	}

	public String getPreVideoUrl() {
		return this.preVideoUrl;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.planetom.feeds.create";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("anchor_id", this.anchorId);
		txtParams.put("appoint_begin_time", this.appointBeginTime);
		txtParams.put("cover_url", this.coverUrl);
		txtParams.put("feed_type", this.feedType);
		txtParams.put("group_id_type", this.groupIdType);
		txtParams.put("group_ids", this.groupIds);
		txtParams.put("introduction", this.introduction);
		txtParams.put("open_app_id", this.openAppId);
		txtParams.put("pic_introduction_url", this.picIntroductionUrl);
		txtParams.put("pre_video_url", this.preVideoUrl);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPlanetomFeedsCreateResponse> getResponseClass() {
		return OapiPlanetomFeedsCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(anchorId, "anchorId");
		RequestCheckUtils.checkNotEmpty(appointBeginTime, "appointBeginTime");
		RequestCheckUtils.checkNotEmpty(feedType, "feedType");
		RequestCheckUtils.checkMaxListSize(groupIds, 999, "groupIds");
		RequestCheckUtils.checkNotEmpty(openAppId, "openAppId");
		RequestCheckUtils.checkNotEmpty(title, "title");
	}
	

}