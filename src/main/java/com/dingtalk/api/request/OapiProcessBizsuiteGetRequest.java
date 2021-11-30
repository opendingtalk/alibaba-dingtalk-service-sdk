package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiProcessBizsuiteGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.bizsuite.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.23
 */
public class OapiProcessBizsuiteGetRequest extends BaseTaobaoRequest<OapiProcessBizsuiteGetResponse> {
	
	

	/** 
	* 请求入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(BaseSuiteRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.bizsuite.get";
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

	public Class<OapiProcessBizsuiteGetResponse> getResponseClass() {
		return OapiProcessBizsuiteGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 表单数据列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OAPIFormDataReqVO extends TaobaoObject {
		private static final long serialVersionUID = 2179534884937563331L;
		/**
		 * 扩展字段
		 */
		@ApiField("extend_value")
		private String extendValue;
		/**
		 * 表单标签
		 */
		@ApiField("label")
		private String label;
		/**
		 * 表单值value
		 */
		@ApiField("value")
		private String value;
	
		public String getExtendValue() {
			return this.extendValue;
		}
		public void setExtendValue(String extendValue) {
			this.extendValue = extendValue;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseSuiteRequest extends TaobaoObject {
		private static final long serialVersionUID = 1712448443668352952L;
		/**
		 * 业务请求标识
		 */
		@ApiField("action_type")
		private String actionType;
		/**
		 * 企业应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 套件业务标识
		 */
		@ApiField("biz_type")
		private String bizType;
		/**
		 * 表单数据列表
		 */
		@ApiListField("form_data_list")
		@ApiField("o_a_p_i_form_data_req_v_o")
		private List<OAPIFormDataReqVO> formDataList;
		/**
		 * 流程processCode
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 请求唯一标识
		 */
		@ApiField("seq_id")
		private Long seqId;
		/**
		 * 操作人userId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getActionType() {
			return this.actionType;
		}
		public void setActionType(String actionType) {
			this.actionType = actionType;
		}
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getBizType() {
			return this.bizType;
		}
		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
		public List<OAPIFormDataReqVO> getFormDataList() {
			return this.formDataList;
		}
		public void setFormDataList(List<OAPIFormDataReqVO> formDataList) {
			this.formDataList = formDataList;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public Long getSeqId() {
			return this.seqId;
		}
		public void setSeqId(Long seqId) {
			this.seqId = seqId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}