package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiAlitripBtripReimbursementUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.reimbursement.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.23
 */
public class OapiAlitripBtripReimbursementUpdateRequest extends BaseTaobaoRequest<OapiAlitripBtripReimbursementUpdateResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String rq;

	public void setRq(String rq) {
		this.rq = rq;
	}

	public void setRq(OpenApiUpdateReimbursementRq rq) {
		this.rq = new JSONWriter(false,false,true).write(rq);
	}

	public String getRq() {
		return this.rq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.reimbursement.update";
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
		txtParams.put("rq", this.rq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripReimbursementUpdateResponse> getResponseClass() {
		return OapiAlitripBtripReimbursementUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 审批人列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Auditlist extends TaobaoObject {
		private static final long serialVersionUID = 1826843736385393468L;
		/**
		 * 备注
		 */
		@ApiField("note")
		private String note;
		/**
		 * 审批操作时间
		 */
		@ApiField("operate_time")
		private Date operateTime;
		/**
		 * 审批状态：0审批中 1已同意 2已拒绝 3已转交，4已取消 5已终止
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 审批人id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getNote() {
			return this.note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		public Date getOperateTime() {
			return this.operateTime;
		}
		public void setOperateTime(Date operateTime) {
			this.operateTime = operateTime;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiUpdateReimbursementRq extends TaobaoObject {
		private static final long serialVersionUID = 7427787877963411456L;
		/**
		 * 审批人列表
		 */
		@ApiListField("audit_list")
		@ApiField("auditlist")
		private List<Auditlist> auditList;
		/**
		 * corp id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 审批单号
		 */
		@ApiField("flow_no")
		private Long flowNo;
		/**
		 * 审批操作时间
		 */
		@ApiField("operate_time")
		private Date operateTime;
		/**
		 * 审批状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 第三方报销单id
		 */
		@ApiField("thirdparty_flow_id")
		private String thirdpartyFlowId;
	
		public List<Auditlist> getAuditList() {
			return this.auditList;
		}
		public void setAuditList(List<Auditlist> auditList) {
			this.auditList = auditList;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public Long getFlowNo() {
			return this.flowNo;
		}
		public void setFlowNo(Long flowNo) {
			this.flowNo = flowNo;
		}
		public Date getOperateTime() {
			return this.operateTime;
		}
		public void setOperateTime(Date operateTime) {
			this.operateTime = operateTime;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getThirdpartyFlowId() {
			return this.thirdpartyFlowId;
		}
		public void setThirdpartyFlowId(String thirdpartyFlowId) {
			this.thirdpartyFlowId = thirdpartyFlowId;
		}
	}
	

}