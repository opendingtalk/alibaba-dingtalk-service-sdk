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

import com.dingtalk.api.response.CorpRoleAddrolesforempsResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.role.addrolesforemps request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpRoleAddrolesforempsRequest extends BaseTaobaoRequest<CorpRoleAddrolesforempsResponse> {
	
	

	/** 
	* 角色id list
	 */
	private String rolelidList;

	/** 
	* 员工id list
	 */
	private String useridList;

	public void setRolelidList(String rolelidList) {
		this.rolelidList = rolelidList;
	}

	public String getRolelidList() {
		return this.rolelidList;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.role.addrolesforemps";
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
		txtParams.put("rolelid_list", this.rolelidList);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpRoleAddrolesforempsResponse> getResponseClass() {
		return CorpRoleAddrolesforempsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(rolelidList, "rolelidList");
		RequestCheckUtils.checkMaxListSize(rolelidList, 20, "rolelidList");
		RequestCheckUtils.checkNotEmpty(useridList, "useridList");
		RequestCheckUtils.checkMaxListSize(useridList, 100, "useridList");
	}
	

}