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
import com.dingtalk.api.response.OapiLiveGroupliveDetailGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.detail.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.30
 */
public class OapiLiveGroupliveDetailGetRequest extends BaseTaobaoRequest<OapiLiveGroupliveDetailGetResponse> {
	
	

	/** 
	* 群直播详情请求
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(GroupLiveStatisticsReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.live.grouplive.detail.get";
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
		txtParams.put("req", this.req);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiLiveGroupliveDetailGetResponse> getResponseClass() {
		return OapiLiveGroupliveDetailGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 群直播详情请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupLiveStatisticsReq extends TaobaoObject {
		private static final long serialVersionUID = 4492366745764753768L;
		/**
		 * 直播所属群对应部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 群直播id
		 */
		@ApiField("live_uuid")
		private String liveUuid;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getLiveUuid() {
			return this.liveUuid;
		}
		public void setLiveUuid(String liveUuid) {
			this.liveUuid = liveUuid;
		}
	}
	

}