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
import com.dingtalk.api.response.OapiKacDatavVideoliveViewerListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.videolive.viewer.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.10.11
 */
public class OapiKacDatavVideoliveViewerListRequest extends BaseTaobaoRequest<OapiKacDatavVideoliveViewerListResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GroupLiveViewerReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.datav.videolive.viewer.list";
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

	public Class<OapiKacDatavVideoliveViewerListResponse> getResponseClass() {
		return OapiKacDatavVideoliveViewerListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupLiveViewerReq extends TaobaoObject {
		private static final long serialVersionUID = 3685578791772118743L;
		/**
		 * 群标识id
		 */
		@ApiField("cid")
		private String cid;
		/**
		 * 分页游标；首页请使用0，之后直接使用返回结果中的next_cursor
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 直播uuid
		 */
		@ApiField("live_uuid")
		private String liveUuid;
		/**
		 * 对外群id
		 */
		@ApiField("openConversationId")
		private String openConversationId;
		/**
		 * 分页大小;不超过500
		 */
		@ApiField("size")
		private Long size;
	
		public String getCid() {
			return this.cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public String getLiveUuid() {
			return this.liveUuid;
		}
		public void setLiveUuid(String liveUuid) {
			this.liveUuid = liveUuid;
		}
		public String getOpenConversationId() {
			return this.openConversationId;
		}
		public void setOpenConversationId(String openConversationId) {
			this.openConversationId = openConversationId;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
	}
	

}