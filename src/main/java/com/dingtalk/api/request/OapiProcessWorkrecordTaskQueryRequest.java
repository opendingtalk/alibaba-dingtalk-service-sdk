package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiProcessWorkrecordTaskQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.workrecord.task.query request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.22
 */
public class OapiProcessWorkrecordTaskQueryRequest extends BaseTaobaoRequest<OapiProcessWorkrecordTaskQueryResponse> {
	
	

	/** 
	* 分页大小
	 */
	private Long count;

	/** 
	* 分页游标
	 */
	private Long offset;

	/** 
	* 状态
	 */
	private Long status;

	/** 
	* 用户id
	 */
	private String userid;

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getCount() {
		return this.count;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.workrecord.task.query";
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
		txtParams.put("count", this.count);
		txtParams.put("offset", this.offset);
		txtParams.put("status", this.status);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessWorkrecordTaskQueryResponse> getResponseClass() {
		return OapiProcessWorkrecordTaskQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(count, "count");
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}