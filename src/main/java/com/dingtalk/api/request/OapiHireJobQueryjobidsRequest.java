package com.dingtalk.api.request;

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
import com.dingtalk.api.response.OapiHireJobQueryjobidsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hire.job.queryjobids request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.02
 */
public class OapiHireJobQueryjobidsRequest extends BaseTaobaoRequest<OapiHireJobQueryjobidsResponse> {
	
	

	/** 
	* 查询参数
	 */
	private String queryParam;

	/** 
	* 员工标识
	 */
	private String userid;

	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}

	public void setQueryParam(TopQueryJobIdsParam queryParam) {
		this.queryParam = new JSONWriter(false,false,true).write(queryParam);
	}

	public String getQueryParam() {
		return this.queryParam;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.hire.job.queryjobids";
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
		txtParams.put("query_param", this.queryParam);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiHireJobQueryjobidsResponse> getResponseClass() {
		return OapiHireJobQueryjobidsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	
	/**
	 * 查询参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopQueryJobIdsParam extends TaobaoObject {
		private static final long serialVersionUID = 4399545772179129228L;
		/**
		 * 角色类型：2表示职位负责人，4表示用人经理
		 */
		@ApiField("role_type")
		private Long roleType;
	
		public Long getRoleType() {
			return this.roleType;
		}
		public void setRoleType(Long roleType) {
			this.roleType = roleType;
		}
	}
	

}