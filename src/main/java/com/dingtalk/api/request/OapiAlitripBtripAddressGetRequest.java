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
import com.dingtalk.api.response.OapiAlitripBtripAddressGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.address.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.20
 */
public class OapiAlitripBtripAddressGetRequest extends BaseTaobaoRequest<OapiAlitripBtripAddressGetResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(OpenApiJumpInfoRq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.address.get";
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

	public Class<OapiAlitripBtripAddressGetResponse> getResponseClass() {
		return OapiAlitripBtripAddressGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiJumpInfoRq extends TaobaoObject {
		private static final long serialVersionUID = 1342841769585486326L;
		/**
		 * 操作类型：1：预订，2：我的订单列表，3：商旅管理后台（其他参数可不要，只需corpid，userid）
		 */
		@ApiField("action_type")
		private Long actionType;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 第三方行程id（存在代表通过审批单预订，不存在代表特殊场景：普通员工是预览，特殊授权人和代订人是免审批预订场景）
		 */
		@ApiField("itinerary_id")
		private String itineraryId;
		/**
		 * 员工第一次使用用车需要手机号，与司机联系
		 */
		@ApiField("phone")
		private String phone;
		/**
		 * 类目类型：1：机票，2：火车票，3：酒店，4：用车
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getActionType() {
			return this.actionType;
		}
		public void setActionType(Long actionType) {
			this.actionType = actionType;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getItineraryId() {
			return this.itineraryId;
		}
		public void setItineraryId(String itineraryId) {
			this.itineraryId = itineraryId;
		}
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}