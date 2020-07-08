package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.CorpRoleUpdaterolegroupResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.role.updaterolegroup request
 * 
 * @author top auto create
 * @since 1.0, 2017.06.27
 */
public class CorpRoleUpdaterolegroupRequest extends BaseTaobaoRequest<CorpRoleUpdaterolegroupResponse> {
	
	

	/** 
	* 角色组id
	 */
	private Long groupId;

	/** 
	* 角色组信息VO
	 */
	private String roleGroup;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setRoleGroup(String roleGroup) {
		this.roleGroup = roleGroup;
	}

	public void setRoleGroup(OpenRoleGroup roleGroup) {
		this.roleGroup = new JSONWriter(false,true).write(roleGroup);
	}

	public String getRoleGroup() {
		return this.roleGroup;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.role.updaterolegroup";
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
		txtParams.put("group_id", this.groupId);
		txtParams.put("role_group", this.roleGroup);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpRoleUpdaterolegroupResponse> getResponseClass() {
		return CorpRoleUpdaterolegroupResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupId, "groupId");
	}
	
	/**
	 * 角色列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Roles extends TaobaoObject {
		private static final long serialVersionUID = 4853651498359748477L;
		/**
		 * 角色名
		 */
		@ApiField("name")
		private String name;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 角色组信息VO
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRoleGroup extends TaobaoObject {
		private static final long serialVersionUID = 8284297891417636538L;
		/**
		 * 角色组的名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 角色列表
		 */
		@ApiListField("roles")
		@ApiField("roles")
		private List<Roles> roles;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Roles> getRoles() {
			return this.roles;
		}
		public void setRoles(List<Roles> roles) {
			this.roles = roles;
		}
	}
	

}