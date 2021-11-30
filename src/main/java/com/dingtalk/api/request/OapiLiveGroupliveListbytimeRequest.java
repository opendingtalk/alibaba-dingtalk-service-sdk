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
import com.dingtalk.api.response.OapiLiveGroupliveListbytimeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.listbytime request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.30
 */
public class OapiLiveGroupliveListbytimeRequest extends BaseTaobaoRequest<OapiLiveGroupliveListbytimeResponse> {
	
	

	/** 
	* 查询直播参数
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(GroupLiveRecordReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.live.grouplive.listbytime";
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

	public Class<OapiLiveGroupliveListbytimeResponse> getResponseClass() {
		return OapiLiveGroupliveListbytimeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 查询直播参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupLiveRecordReq extends TaobaoObject {
		private static final long serialVersionUID = 1426732936142433984L;
		/**
		 * 直播所属群对应的部门
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 结束时间，单位秒
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 开始时间，单位秒
		 */
		@ApiField("start_time")
		private Long startTime;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
	}
	

}