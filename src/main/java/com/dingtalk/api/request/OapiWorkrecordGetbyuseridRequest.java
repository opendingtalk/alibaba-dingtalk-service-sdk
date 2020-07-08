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

import com.dingtalk.api.response.OapiWorkrecordGetbyuseridResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workrecord.getbyuserid request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiWorkrecordGetbyuseridRequest extends BaseTaobaoRequest<OapiWorkrecordGetbyuseridResponse> {
	
	

	/** 
	* 分页大小，最多50
	 */
	private Long limit;

	/** 
	* 分页游标，从0开始，如返回结果中has_more为true，则表示还有数据，offset再传上一次的offset+limit
	 */
	private Long offset;

	/** 
	* 待办事项状态，0表示未完成，1表示完成
	 */
	private Long status;

	/** 
	* 用户唯一ID
	 */
	private String userid;

	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getLimit() {
		return this.limit;
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
		return "dingtalk.oapi.workrecord.getbyuserid";
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
		txtParams.put("limit", this.limit);
		txtParams.put("offset", this.offset);
		txtParams.put("status", this.status);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkrecordGetbyuseridResponse> getResponseClass() {
		return OapiWorkrecordGetbyuseridResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(limit, "limit");
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}