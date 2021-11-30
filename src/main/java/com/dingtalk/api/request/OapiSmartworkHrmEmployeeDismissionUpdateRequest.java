package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiSmartworkHrmEmployeeDismissionUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.dismission.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.16
 */
public class OapiSmartworkHrmEmployeeDismissionUpdateRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeDismissionUpdateResponse> {
	
	

	/** 
	* 微应用在企业的AgentId
	 */
	private String agentid;

	/** 
	* 离职信息
	 */
	private String param;

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public String getAgentid() {
		return this.agentid;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(EmpDismissionUpdateParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.dismission.update";
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
		txtParams.put("agentid", this.agentid);
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeDismissionUpdateResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeDismissionUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
	}
	
	/**
	 * 离职信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpDismissionUpdateParam extends TaobaoObject {
		private static final long serialVersionUID = 2577917683812334379L;
		/**
		 * 离职备注
		 */
		@ApiField("dismission_memo")
		private String dismissionMemo;
		/**
		 * 最后工作日期
		 */
		@ApiField("last_work_date")
		private Date lastWorkDate;
		/**
		 * 是否计入离职不统计
		 */
		@ApiField("partner")
		private Boolean partner;
		/**
		 * 主动原因
		 */
		@ApiListField("terminationReasonPassive")
		@ApiField("string")
		private List<String> terminationReasonPassive;
		/**
		 * 被动原因
		 */
		@ApiListField("terminationReasonVoluntary")
		@ApiField("string")
		private List<String> terminationReasonVoluntary;
		/**
		 * 员工userId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getDismissionMemo() {
			return this.dismissionMemo;
		}
		public void setDismissionMemo(String dismissionMemo) {
			this.dismissionMemo = dismissionMemo;
		}
		public Date getLastWorkDate() {
			return this.lastWorkDate;
		}
		public void setLastWorkDate(Date lastWorkDate) {
			this.lastWorkDate = lastWorkDate;
		}
		public Boolean getPartner() {
			return this.partner;
		}
		public void setPartner(Boolean partner) {
			this.partner = partner;
		}
		public List<String> getTerminationReasonPassive() {
			return this.terminationReasonPassive;
		}
		public void setTerminationReasonPassive(List<String> terminationReasonPassive) {
			this.terminationReasonPassive = terminationReasonPassive;
		}
		public List<String> getTerminationReasonVoluntary() {
			return this.terminationReasonVoluntary;
		}
		public void setTerminationReasonVoluntary(List<String> terminationReasonVoluntary) {
			this.terminationReasonVoluntary = terminationReasonVoluntary;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}