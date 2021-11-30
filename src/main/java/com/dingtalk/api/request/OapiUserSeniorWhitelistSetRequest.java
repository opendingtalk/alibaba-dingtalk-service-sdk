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
import com.dingtalk.api.response.OapiUserSeniorWhitelistSetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.senior.whitelist.set request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.15
 */
public class OapiUserSeniorWhitelistSetRequest extends BaseTaobaoRequest<OapiUserSeniorWhitelistSetResponse> {
	
	

	/** 
	* 高管白名单设置请求对象
	 */
	private String seniorWhitelistRequest;

	public void setSeniorWhitelistRequest(String seniorWhitelistRequest) {
		this.seniorWhitelistRequest = seniorWhitelistRequest;
	}

	public void setSeniorWhitelistRequest(SeniorWhitelistRequest seniorWhitelistRequest) {
		this.seniorWhitelistRequest = new JSONWriter(false,false,true).write(seniorWhitelistRequest);
	}

	public String getSeniorWhitelistRequest() {
		return this.seniorWhitelistRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.senior.whitelist.set";
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
		txtParams.put("senior_whitelist_request", this.seniorWhitelistRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserSeniorWhitelistSetResponse> getResponseClass() {
		return OapiUserSeniorWhitelistSetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 高管白名单设置请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SeniorWhitelistRequest extends TaobaoObject {
		private static final long serialVersionUID = 3783426551116321884L;
		/**
		 * 高管白名单部门列表
		 */
		@ApiListField("senior_permit_deptids")
		@ApiField("number")
		private List<Long> seniorPermitDeptids;
		/**
		 * 高管白名单角色列表
		 */
		@ApiListField("senior_permit_roleids")
		@ApiField("number")
		private List<Long> seniorPermitRoleids;
		/**
		 * 高管白名单员工列表
		 */
		@ApiListField("senior_permit_userids")
		@ApiField("string")
		private List<String> seniorPermitUserids;
		/**
		 * 高管工号
		 */
		@ApiField("senior_userid")
		private String seniorUserid;
	
		public List<Long> getSeniorPermitDeptids() {
			return this.seniorPermitDeptids;
		}
		public void setSeniorPermitDeptids(List<Long> seniorPermitDeptids) {
			this.seniorPermitDeptids = seniorPermitDeptids;
		}
		public List<Long> getSeniorPermitRoleids() {
			return this.seniorPermitRoleids;
		}
		public void setSeniorPermitRoleids(List<Long> seniorPermitRoleids) {
			this.seniorPermitRoleids = seniorPermitRoleids;
		}
		public List<String> getSeniorPermitUserids() {
			return this.seniorPermitUserids;
		}
		public void setSeniorPermitUserids(List<String> seniorPermitUserids) {
			this.seniorPermitUserids = seniorPermitUserids;
		}
		public String getSeniorUserid() {
			return this.seniorUserid;
		}
		public void setSeniorUserid(String seniorUserid) {
			this.seniorUserid = seniorUserid;
		}
	}
	

}