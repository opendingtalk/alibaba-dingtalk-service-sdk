package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.CorpRoleAddrolegroupResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.role.addrolegroup request
 * 
 * @author top auto create
 * @since 1.0, 2018.02.05
 */
public class CorpRoleAddrolegroupRequest extends BaseTaobaoRequest<CorpRoleAddrolegroupResponse> {
	
	

	/** 
	* 角色组数据
	 */
	private String roleGroup;

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
		return "dingtalk.corp.role.addrolegroup";
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
		txtParams.put("role_group", this.roleGroup);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpRoleAddrolegroupResponse> getResponseClass() {
		return CorpRoleAddrolegroupResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 角色list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Roles extends TaobaoObject {
		private static final long serialVersionUID = 8384474991414928256L;
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
	 * 角色组数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRoleGroup extends TaobaoObject {
		private static final long serialVersionUID = 7821389999887747941L;
		/**
		 * 角色组名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 角色list
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