package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiLivePlaybackResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.playback request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiLivePlaybackRequest extends BaseTaobaoRequest<OapiLivePlaybackResponse> {
	
	

	/** 
	* 回放查询请求model
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(PlayBackReqModel request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.live.playback";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiLivePlaybackResponse> getResponseClass() {
		return OapiLivePlaybackResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 回放查询请求model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PlayBackReqModel extends TaobaoObject {
		private static final long serialVersionUID = 8441773875726281425L;
		/**
		 * 偏移量
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 页面大小
		 */
		@ApiField("offset")
		private Long offset;
		/**
		 * 直播结束时间
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 直播开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
	
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public Long getOffset() {
			return this.offset;
		}
		public void setOffset(Long offset) {
			this.offset = offset;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
	}
	

}