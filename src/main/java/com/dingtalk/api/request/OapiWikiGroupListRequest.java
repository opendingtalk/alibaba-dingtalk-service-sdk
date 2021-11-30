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

import com.dingtalk.api.response.OapiWikiGroupListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.wiki.group.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.16
 */
public class OapiWikiGroupListRequest extends BaseTaobaoRequest<OapiWikiGroupListResponse> {
	
	

	/** 
	* 个人授权信息
	 */
	private String authCode;

	/** 
	* 分页游标（默认0）
	 */
	private Long cursor;

	/** 
	* 1:组织内公开可见 2:非组织内公开可见
	 */
	private Long groupType;

	/** 
	* 1:管理员 2:编辑权限 3:只读权限
	 */
	private Long roleType;

	/** 
	* 分页大小（默认20）
	 */
	private Long size;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setGroupType(Long groupType) {
		this.groupType = groupType;
	}

	public Long getGroupType() {
		return this.groupType;
	}

	public void setRoleType(Long roleType) {
		this.roleType = roleType;
	}

	public Long getRoleType() {
		return this.roleType;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.wiki.group.list";
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
		txtParams.put("auth_code", this.authCode);
		txtParams.put("cursor", this.cursor);
		txtParams.put("group_type", this.groupType);
		txtParams.put("role_type", this.roleType);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWikiGroupListResponse> getResponseClass() {
		return OapiWikiGroupListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(authCode, "authCode");
		RequestCheckUtils.checkNotEmpty(groupType, "groupType");
		RequestCheckUtils.checkNotEmpty(roleType, "roleType");
	}
	

}