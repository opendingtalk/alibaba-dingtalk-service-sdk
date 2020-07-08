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
import com.dingtalk.api.response.MicroappIndustryOrderQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.microapp.industry.order.query request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.23
 */
public class MicroappIndustryOrderQueryRequest extends BaseTaobaoRequest<MicroappIndustryOrderQueryResponse> {
	
	

	/** 
	* 请求体
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(IndustryOrderQueryOpenRequest param) {
		this.param = new JSONWriter(false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.microapp.industry.order.query";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<MicroappIndustryOrderQueryResponse> getResponseClass() {
		return MicroappIndustryOrderQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IndustryOrderQueryOpenRequest extends TaobaoObject {
		private static final long serialVersionUID = 8432997653532723942L;
		/**
		 * 微应用标识
		 */
		@ApiField("agent_id")
		private String agentId;
		/**
		 * 业务码
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 外部流水号
		 */
		@ApiField("out_biz_no")
		private String outBizNo;
		/**
		 * 用户标识
		 */
		@ApiField("user_id")
		private String userId;
	
		public String getAgentId() {
			return this.agentId;
		}
		public void setAgentId(String agentId) {
			this.agentId = agentId;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public String getOutBizNo() {
			return this.outBizNo;
		}
		public void setOutBizNo(String outBizNo) {
			this.outBizNo = outBizNo;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
	}
	

}