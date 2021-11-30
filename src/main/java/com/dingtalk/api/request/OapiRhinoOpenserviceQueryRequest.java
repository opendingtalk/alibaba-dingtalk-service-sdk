package com.dingtalk.api.request;

import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRhinoOpenserviceQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.openservice.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.17
 */
public class OapiRhinoOpenserviceQueryRequest extends BaseTaobaoRequest<OapiRhinoOpenserviceQueryResponse> {
	
	

	/** 
	* 编码
	 */
	private String code;

	/** 
	* 创建时间
	 */
	private Date gmtCreate;

	/** 
	* ID
	 */
	private Long id;

	/** 
	* 租户ID
	 */
	private String tenentId;

	/** 
	* 用户ID
	 */
	private String userid;

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setTenentId(String tenentId) {
		this.tenentId = tenentId;
	}

	public String getTenentId() {
		return this.tenentId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.openservice.query";
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
		txtParams.put("code", this.code);
		txtParams.put("gmt_create", this.gmtCreate);
		txtParams.put("id", this.id);
		txtParams.put("tenent_id", this.tenentId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoOpenserviceQueryResponse> getResponseClass() {
		return OapiRhinoOpenserviceQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}