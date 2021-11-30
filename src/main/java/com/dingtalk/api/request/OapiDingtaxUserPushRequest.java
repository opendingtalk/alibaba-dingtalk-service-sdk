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
import com.dingtalk.api.response.OapiDingtaxUserPushResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingtax.user.push request
 * 
 * @author top auto create
 * @since 1.0, 2021.08.24
 */
public class OapiDingtaxUserPushRequest extends BaseTaobaoRequest<OapiDingtaxUserPushResponse> {
	
	

	/** 
	* 运营区域
	 */
	private String sourceRegion;

	/** 
	* 运营数据
	 */
	private String userInfoList;

	public void setSourceRegion(String sourceRegion) {
		this.sourceRegion = sourceRegion;
	}

	public String getSourceRegion() {
		return this.sourceRegion;
	}

	public void setUserInfoList(String userInfoList) {
		this.userInfoList = userInfoList;
	}

	public void setUserInfoList(List<DingTaxUserInfoDTO> userInfoList) {
		this.userInfoList = new JSONWriter(false,false,true).write(userInfoList);
	}

	public String getUserInfoList() {
		return this.userInfoList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingtax.user.push";
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
		txtParams.put("source_region", this.sourceRegion);
		txtParams.put("user_info_list", this.userInfoList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingtaxUserPushResponse> getResponseClass() {
		return OapiDingtaxUserPushResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(sourceRegion, "sourceRegion");
		RequestCheckUtils.checkObjectMaxListSize(userInfoList, 20, "userInfoList");
	}
	
	/**
	 * 运营数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingTaxUserInfoDTO extends TaobaoObject {
		private static final long serialVersionUID = 1215233755816822738L;
		/**
		 * YN;Y代表新增用户，N代表存量用户
		 */
		@ApiField("new_user")
		private String newUser;
		/**
		 * 自然人企业个体户
		 */
		@ApiField("taxation_type")
		private String taxationType;
		/**
		 * 手机号
		 */
		@ApiField("user_mobile")
		private String userMobile;
		/**
		 * CWFR
		 */
		@ApiField("user_role")
		private String userRole;
	
		public String getNewUser() {
			return this.newUser;
		}
		public void setNewUser(String newUser) {
			this.newUser = newUser;
		}
		public String getTaxationType() {
			return this.taxationType;
		}
		public void setTaxationType(String taxationType) {
			this.taxationType = taxationType;
		}
		public String getUserMobile() {
			return this.userMobile;
		}
		public void setUserMobile(String userMobile) {
			this.userMobile = userMobile;
		}
		public String getUserRole() {
			return this.userRole;
		}
		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}
	}
	

}