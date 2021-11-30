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
import com.dingtalk.api.response.OapiAlitripBtripApprovalUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.approval.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAlitripBtripApprovalUpdateRequest extends BaseTaobaoRequest<OapiAlitripBtripApprovalUpdateResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String rq;

	public void setRq(String rq) {
		this.rq = rq;
	}

	public void setRq(OpenApiUpdateApplyRq rq) {
		this.rq = new JSONWriter(false,false,true).write(rq);
	}

	public String getRq() {
		return this.rq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.approval.update";
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

	public Class<OapiAlitripBtripApprovalUpdateResponse> getResponseClass() {
		return OapiAlitripBtripApprovalUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiUpdateApplyRq extends TaobaoObject {
		private static final long serialVersionUID = 3874134955759323225L;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 备注
		 */
		@ApiField("note")
		private String note;
		/**
		 * 操作时间
		 */
		@ApiField("operate_time")
		private Date operateTime;
		/**
		 * 1已同意 2已拒绝 3已转交 4已取消
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 外部申请单id
		 */
		@ApiField("thirdpart_apply_id")
		private String thirdpartApplyId;
		/**
		 * 审批人名字
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 审批人id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
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
		public String getThirdpartApplyId() {
			return this.thirdpartApplyId;
		}
		public void setThirdpartApplyId(String thirdpartApplyId) {
			this.thirdpartApplyId = thirdpartApplyId;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}