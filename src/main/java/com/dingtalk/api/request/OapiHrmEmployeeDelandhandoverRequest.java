package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiHrmEmployeeDelandhandoverResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hrm.employee.delandhandover request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.16
 */
public class OapiHrmEmployeeDelandhandoverRequest extends BaseTaobaoRequest<OapiHrmEmployeeDelandhandoverResponse> {
	
	

	/** 
	* 确认离职对象
	 */
	private String dismissionInfoWithHandOver;

	/** 
	* 操作人userid
	 */
	private String opUserid;

	public void setDismissionInfoWithHandOver(String dismissionInfoWithHandOver) {
		this.dismissionInfoWithHandOver = dismissionInfoWithHandOver;
	}

	public void setDismissionInfoWithHandOver(EmpDismissionInfoWithHandOverVo dismissionInfoWithHandOver) {
		this.dismissionInfoWithHandOver = new JSONWriter(false,false,true).write(dismissionInfoWithHandOver);
	}

	public String getDismissionInfoWithHandOver() {
		return this.dismissionInfoWithHandOver;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.hrm.employee.delandhandover";
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
		txtParams.put("dismission_info_with_hand_over", this.dismissionInfoWithHandOver);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiHrmEmployeeDelandhandoverResponse> getResponseClass() {
		return OapiHrmEmployeeDelandhandoverResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	
	/**
	 * 确认离职对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpDismissionInfoWithHandOverVo extends TaobaoObject {
		private static final long serialVersionUID = 2223962525854365177L;
		/**
		 * 离职描述
		 */
		@ApiField("dismission_memo")
		private String dismissionMemo;
		/**
		 * 离职原因（1：家庭原因，2:个人原因，3：发展原因，4：合同到期不续签，5：协议解除，6：无法胜任工作，7：经济性裁员，8：严重违法违纪，9：其他）
		 */
		@ApiField("dismission_reason")
		private String dismissionReason;
		/**
		 * 离职人userid
		 */
		@ApiField("dismission_userid")
		private String dismissionUserid;
		/**
		 * 交接人userid
		 */
		@ApiField("hand_over_userid")
		private String handOverUserid;
		/**
		 * 最后工作日
		 */
		@ApiField("last_work_date")
		private Date lastWorkDate;
	
		public String getDismissionMemo() {
			return this.dismissionMemo;
		}
		public void setDismissionMemo(String dismissionMemo) {
			this.dismissionMemo = dismissionMemo;
		}
		public String getDismissionReason() {
			return this.dismissionReason;
		}
		public void setDismissionReason(String dismissionReason) {
			this.dismissionReason = dismissionReason;
		}
		public String getDismissionUserid() {
			return this.dismissionUserid;
		}
		public void setDismissionUserid(String dismissionUserid) {
			this.dismissionUserid = dismissionUserid;
		}
		public String getHandOverUserid() {
			return this.handOverUserid;
		}
		public void setHandOverUserid(String handOverUserid) {
			this.handOverUserid = handOverUserid;
		}
		public Date getLastWorkDate() {
			return this.lastWorkDate;
		}
		public void setLastWorkDate(Date lastWorkDate) {
			this.lastWorkDate = lastWorkDate;
		}
	}
	

}