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

import com.dingtalk.api.response.OapiPlanetomFeedsStatisticGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.planetom.feeds.statistic.get request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.26
 */
public class OapiPlanetomFeedsStatisticGetRequest extends BaseTaobaoRequest<OapiPlanetomFeedsStatisticGetResponse> {
	
	

	/** 
	* 主播在对应组织的id(staffId)
	 */
	private String anchorId;

	/** 
	* 课程id
	 */
	private String feedId;

	public void setAnchorId(String anchorId) {
		this.anchorId = anchorId;
	}

	public String getAnchorId() {
		return this.anchorId;
	}

	public void setFeedId(String feedId) {
		this.feedId = feedId;
	}

	public String getFeedId() {
		return this.feedId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.planetom.feeds.statistic.get";
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
		txtParams.put("feed_id", this.feedId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPlanetomFeedsStatisticGetResponse> getResponseClass() {
		return OapiPlanetomFeedsStatisticGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(anchorId, "anchorId");
		RequestCheckUtils.checkNotEmpty(feedId, "feedId");
	}
	

}