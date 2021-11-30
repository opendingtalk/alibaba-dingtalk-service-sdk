package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiAttendanceCorpConfirmResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.corp.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAttendanceCorpConfirmRequest extends BaseTaobaoRequest<OapiAttendanceCorpConfirmResponse> {
	
	

	/** 
	* 企业id
	 */
	private String corpId;

	/** 
	* 企业明细
	 */
	private String corpList;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpList(String corpList) {
		this.corpList = corpList;
	}

	public void setCorpList(List<Corp> corpList) {
		this.corpList = new JSONWriter(false,false,true).write(corpList);
	}

	public String getCorpList() {
		return this.corpList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.corp.confirm";
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
		txtParams.put("corp_id", this.corpId);
		txtParams.put("corp_list", this.corpList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceCorpConfirmResponse> getResponseClass() {
		return OapiAttendanceCorpConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpId, "corpId");
		RequestCheckUtils.checkObjectMaxListSize(corpList, 10, "corpList");
	}
	
	/**
	 * 企业明细
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Corp extends TaobaoObject {
		private static final long serialVersionUID = 8886929689777177772L;
		/**
		 * 管理员名称
		 */
		@ApiField("admin_name")
		private String adminName;
		/**
		 * 管理员手机号
		 */
		@ApiField("admin_phone")
		private String adminPhone;
		/**
		 * 企业人数
		 */
		@ApiField("staff_amount")
		private Long staffAmount;
	
		public String getAdminName() {
			return this.adminName;
		}
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
		public String getAdminPhone() {
			return this.adminPhone;
		}
		public void setAdminPhone(String adminPhone) {
			this.adminPhone = adminPhone;
		}
		public Long getStaffAmount() {
			return this.staffAmount;
		}
		public void setStaffAmount(Long staffAmount) {
			this.staffAmount = staffAmount;
		}
	}
	

}