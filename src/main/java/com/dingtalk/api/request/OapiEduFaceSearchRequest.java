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

import com.dingtalk.api.response.OapiEduFaceSearchResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.face.search request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.09
 */
public class OapiEduFaceSearchRequest extends BaseTaobaoRequest<OapiEduFaceSearchResponse> {
	
	

	/** 
	* 班级id
	 */
	private Long classId;

	/** 
	* 图片宽度，同步调用时候必须
	 */
	private Long height;

	/** 
	* 是否同步调用，默认不同步
	 */
	private Boolean synchronous;

	/** 
	* https:img.alicdn.comtfsTB1._LRfUz1gK0jSZLeXXb9kVXa-36-32.png
	 */
	private String url;

	/** 
	* 用户id
	 */
	private String userid;

	/** 
	* 图片宽度，同步调用时候必须
	 */
	private Long width;

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getHeight() {
		return this.height;
	}

	public void setSynchronous(Boolean synchronous) {
		this.synchronous = synchronous;
	}

	public Boolean getSynchronous() {
		return this.synchronous;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setWidth(Long width) {
		this.width = width;
	}

	public Long getWidth() {
		return this.width;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.face.search";
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
		txtParams.put("class_id", this.classId);
		txtParams.put("height", this.height);
		txtParams.put("synchronous", this.synchronous);
		txtParams.put("url", this.url);
		txtParams.put("userid", this.userid);
		txtParams.put("width", this.width);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduFaceSearchResponse> getResponseClass() {
		return OapiEduFaceSearchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkNotEmpty(url, "url");
	}
	

}