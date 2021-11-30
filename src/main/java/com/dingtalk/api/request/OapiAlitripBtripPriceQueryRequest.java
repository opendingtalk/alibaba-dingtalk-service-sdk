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
import com.dingtalk.api.response.OapiAlitripBtripPriceQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.price.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.08.16
 */
public class OapiAlitripBtripPriceQueryRequest extends BaseTaobaoRequest<OapiAlitripBtripPriceQueryResponse> {
	
	

	/** 
	* 请求入参
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(OpenApiIntervalPriceRq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.price.query";
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

	public Class<OapiAlitripBtripPriceQueryResponse> getResponseClass() {
		return OapiAlitripBtripPriceQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiIntervalPriceRq extends TaobaoObject {
		private static final long serialVersionUID = 6859215616975436628L;
		/**
		 * 类目flight\hotel\train
		 */
		@ApiField("category")
		private String category;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 返程时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 从哪里出发
		 */
		@ApiField("from_where")
		private String fromWhere;
		/**
		 * 行程id
		 */
		@ApiField("itinerary_id")
		private String itineraryId;
		/**
		 * 根据key查询
		 */
		@ApiField("query_key")
		private String queryKey;
		/**
		 * 出发时间
		 */
		@ApiField("start_time")
		private Date startTime;
		/**
		 * 目的地
		 */
		@ApiField("to_where")
		private String toWhere;
		/**
		 * 钉用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCategory() {
			return this.category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public String getFromWhere() {
			return this.fromWhere;
		}
		public void setFromWhere(String fromWhere) {
			this.fromWhere = fromWhere;
		}
		public String getItineraryId() {
			return this.itineraryId;
		}
		public void setItineraryId(String itineraryId) {
			this.itineraryId = itineraryId;
		}
		public String getQueryKey() {
			return this.queryKey;
		}
		public void setQueryKey(String queryKey) {
			this.queryKey = queryKey;
		}
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
		public String getToWhere() {
			return this.toWhere;
		}
		public void setToWhere(String toWhere) {
			this.toWhere = toWhere;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}