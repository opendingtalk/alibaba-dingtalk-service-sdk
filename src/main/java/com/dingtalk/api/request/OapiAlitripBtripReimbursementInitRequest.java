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
import com.dingtalk.api.response.OapiAlitripBtripReimbursementInitResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.reimbursement.init request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.22
 */
public class OapiAlitripBtripReimbursementInitRequest extends BaseTaobaoRequest<OapiAlitripBtripReimbursementInitResponse> {
	
	

	/** 
	* 入参，创建报销单参数
	 */
	private String rq;

	public void setRq(String rq) {
		this.rq = rq;
	}

	public void setRq(OpenApiNewReimbursementRq rq) {
		this.rq = new JSONWriter(false,false,true).write(rq);
	}

	public String getRq() {
		return this.rq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.reimbursement.init";
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

	public Class<OapiAlitripBtripReimbursementInitResponse> getResponseClass() {
		return OapiAlitripBtripReimbursementInitResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 报销人
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenUserInfo extends TaobaoObject {
		private static final long serialVersionUID = 6862193757294389463L;
		/**
		 * 报销人id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 审批列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ApproverNode extends TaobaoObject {
		private static final long serialVersionUID = 4435896683217218194L;
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
		 * 报销审批单状态：0审批中 1已同意 2已拒绝 3已转交，4已取消 5已终止
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
	 * 入参，创建报销单参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiNewReimbursementRq extends TaobaoObject {
		private static final long serialVersionUID = 2668346496191685945L;
		/**
		 * 申请单编号
		 */
		@ApiField("apply_flow_no")
		private Long applyFlowNo;
		/**
		 * 审批列表
		 */
		@ApiListField("audit_list")
		@ApiField("approver_node")
		private List<ApproverNode> auditList;
		/**
		 * corp id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 部门ID，不填时取用户所在部门id
		 */
		@ApiField("depart_id")
		private String departId;
		/**
		 * 部门名称，不填时取用户所在部门id
		 */
		@ApiField("depart_name")
		private String departName;
		/**
		 * 报销单详情
		 */
		@ApiField("detail_url")
		private String detailUrl;
		/**
		 * isv标识
		 */
		@ApiField("isv_code")
		private String isvCode;
		/**
		 * 报销人
		 */
		@ApiField("operator")
		private OpenUserInfo operator;
		/**
		 * 报销金额
		 */
		@ApiField("pay_amount")
		private Long payAmount;
		/**
		 * 状态  0：审批中，1：已同意，2：已拒绝，4：已撤销
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 第三方流程id
		 */
		@ApiField("thirdparty_flow_id")
		private String thirdpartyFlowId;
		/**
		 * 报销单标题
		 */
		@ApiField("title")
		private String title;
	
		public Long getApplyFlowNo() {
			return this.applyFlowNo;
		}
		public void setApplyFlowNo(Long applyFlowNo) {
			this.applyFlowNo = applyFlowNo;
		}
		public List<ApproverNode> getAuditList() {
			return this.auditList;
		}
		public void setAuditList(List<ApproverNode> auditList) {
			this.auditList = auditList;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getDepartId() {
			return this.departId;
		}
		public void setDepartId(String departId) {
			this.departId = departId;
		}
		public String getDepartName() {
			return this.departName;
		}
		public void setDepartName(String departName) {
			this.departName = departName;
		}
		public String getDetailUrl() {
			return this.detailUrl;
		}
		public void setDetailUrl(String detailUrl) {
			this.detailUrl = detailUrl;
		}
		public String getIsvCode() {
			return this.isvCode;
		}
		public void setIsvCode(String isvCode) {
			this.isvCode = isvCode;
		}
		public OpenUserInfo getOperator() {
			return this.operator;
		}
		public void setOperator(OpenUserInfo operator) {
			this.operator = operator;
		}
		public Long getPayAmount() {
			return this.payAmount;
		}
		public void setPayAmount(Long payAmount) {
			this.payAmount = payAmount;
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
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	

}