package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiKacDatavLivestaticsGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.livestatics.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.16
 */
public class OapiKacDatavLivestaticsGetRequest extends BaseTaobaoRequest<OapiKacDatavLivestaticsGetResponse> {
	
	

	/** 
	* 请求参数对象
	 */
	private String liveStatisticsRequest;

	public void setLiveStatisticsRequest(String liveStatisticsRequest) {
		this.liveStatisticsRequest = liveStatisticsRequest;
	}

	public void setLiveStatisticsRequest(LiveStatisticsRequest liveStatisticsRequest) {
		this.liveStatisticsRequest = new JSONWriter(false,false,true).write(liveStatisticsRequest);
	}

	public String getLiveStatisticsRequest() {
		return this.liveStatisticsRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.datav.livestatics.get";
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
		txtParams.put("live_statistics_request", this.liveStatisticsRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiKacDatavLivestaticsGetResponse> getResponseClass() {
		return OapiKacDatavLivestaticsGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LiveStatisticsRequest extends TaobaoObject {
		private static final long serialVersionUID = 8451144783813598912L;
		/**
		 * 会话id,必须
		 */
		@ApiField("cid")
		private String cid;
		/**
		 * 直播id,必须
		 */
		@ApiField("live_uuid")
		private String liveUuid;
		/**
		 * 是否需要返回观看人列表
		 */
		@ApiField("need_live_viewers_flag")
		private Boolean needLiveViewersFlag;
		/**
		 * 用户id,必须
		 */
		@ApiField("uid")
		private Long uid;
	
		public String getCid() {
			return this.cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public String getLiveUuid() {
			return this.liveUuid;
		}
		public void setLiveUuid(String liveUuid) {
			this.liveUuid = liveUuid;
		}
		public Boolean getNeedLiveViewersFlag() {
			return this.needLiveViewersFlag;
		}
		public void setNeedLiveViewersFlag(Boolean needLiveViewersFlag) {
			this.needLiveViewersFlag = needLiveViewersFlag;
		}
		public Long getUid() {
			return this.uid;
		}
		public void setUid(Long uid) {
			this.uid = uid;
		}
	}
	

}