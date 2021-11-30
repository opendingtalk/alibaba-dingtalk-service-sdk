package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRhinoOpenserviceGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.openservice.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiRhinoOpenserviceGetRequest extends BaseTaobaoRequest<OapiRhinoOpenserviceGetResponse> {
	
	

	/** 
	* 1
	 */
	private String code;

	/** 
	* 1
	 */
	private String codes;

	/** 
	* 1
	 */
	private Date gmtCreate;

	/** 
	* 1
	 */
	private Long id;

	/** 
	* 11
	 */
	private String ids;

	/** 
	* 1
	 */
	private String tenentId;

	/** 
	* 1
	 */
	private String userid;

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public void setCodes(String codes) {
		this.codes = codes;
	}

	public String getCodes() {
		return this.codes;
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

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getIds() {
		return this.ids;
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
		return "dingtalk.oapi.rhino.openservice.get";
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
		txtParams.put("codes", this.codes);
		txtParams.put("gmt_create", this.gmtCreate);
		txtParams.put("id", this.id);
		txtParams.put("ids", this.ids);
		txtParams.put("tenent_id", this.tenentId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoOpenserviceGetResponse> getResponseClass() {
		return OapiRhinoOpenserviceGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(codes, 20, "codes");
		RequestCheckUtils.checkMaxListSize(ids, 20, "ids");
	}
	

}