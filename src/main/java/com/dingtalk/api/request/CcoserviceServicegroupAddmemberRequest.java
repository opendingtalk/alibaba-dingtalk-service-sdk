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

import com.dingtalk.api.response.CcoserviceServicegroupAddmemberResponse;

/**
 * TOP DingTalk-API: dingtalk.ccoservice.servicegroup.addmember request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CcoserviceServicegroupAddmemberRequest extends BaseTaobaoRequest<CcoserviceServicegroupAddmemberResponse> {
	
	

	/** 
	* 服务群id
	 */
	private String openGroupId;

	/** 
	* 企业员工id
	 */
	private String userid;

	public void setOpenGroupId(String openGroupId) {
		this.openGroupId = openGroupId;
	}

	public String getOpenGroupId() {
		return this.openGroupId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.ccoservice.servicegroup.addmember";
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
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CcoserviceServicegroupAddmemberResponse> getResponseClass() {
		return CcoserviceServicegroupAddmemberResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(openGroupId, "openGroupId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}