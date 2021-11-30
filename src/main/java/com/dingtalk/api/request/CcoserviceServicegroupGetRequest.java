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

import com.dingtalk.api.response.CcoserviceServicegroupGetResponse;

/**
 * TOP DingTalk-API: dingtalk.ccoservice.servicegroup.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CcoserviceServicegroupGetRequest extends BaseTaobaoRequest<CcoserviceServicegroupGetResponse> {
	
	

	/** 
	* 服务群id
	 */
	private String openGroupId;

	public void setOpenGroupId(String openGroupId) {
		this.openGroupId = openGroupId;
	}

	public String getOpenGroupId() {
		return this.openGroupId;
	}

	public String getApiMethodName() {
		return "dingtalk.ccoservice.servicegroup.get";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("open_group_id", this.openGroupId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CcoserviceServicegroupGetResponse> getResponseClass() {
		return CcoserviceServicegroupGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(openGroupId, "openGroupId");
	}
	

}