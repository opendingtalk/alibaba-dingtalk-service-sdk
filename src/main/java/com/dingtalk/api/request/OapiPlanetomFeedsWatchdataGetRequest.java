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

import com.dingtalk.api.response.OapiPlanetomFeedsWatchdataGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.planetom.feeds.watchdata.get request
 * 
 * @author top auto create
 * @since 1.0, 2021.05.27
 */
public class OapiPlanetomFeedsWatchdataGetRequest extends BaseTaobaoRequest<OapiPlanetomFeedsWatchdataGetResponse> {
	
	

	/** 
	* 主播在组织内的id（staffId）
	 */
	private String anchorId;

	/** 
	* 群的openconversationId(群对外的id)
	 */
	private String chatId;

	/** 
	* 课程id
	 */
	private String feedId;

	/** 
	* 分页起始位置（不传默认获取前10个）
	 */
	private Long index;

	/** 
	* 分页大小(默认0开始)
	 */
	private Long pageSize;

	public void setAnchorId(String anchorId) {
		this.anchorId = anchorId;
	}

	public String getAnchorId() {
		return this.anchorId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setFeedId(String feedId) {
		this.feedId = feedId;
	}

	public String getFeedId() {
		return this.feedId;
	}

	public void setIndex(Long index) {
		this.index = index;
	}

	public Long getIndex() {
		return this.index;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.planetom.feeds.watchdata.get";
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
		txtParams.put("chat_id", this.chatId);
		txtParams.put("feed_id", this.feedId);
		txtParams.put("index", this.index);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPlanetomFeedsWatchdataGetResponse> getResponseClass() {
		return OapiPlanetomFeedsWatchdataGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(anchorId, "anchorId");
		RequestCheckUtils.checkNotEmpty(feedId, "feedId");
	}
	

}