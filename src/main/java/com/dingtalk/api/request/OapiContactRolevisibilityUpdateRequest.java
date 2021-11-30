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
import com.dingtalk.api.response.OapiContactRolevisibilityUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.contact.rolevisibility.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.08.09
 */
public class OapiContactRolevisibilityUpdateRequest extends BaseTaobaoRequest<OapiContactRolevisibilityUpdateResponse> {
	
	

	/** 
	* 权限设置列表
	 */
	private String permissions;

	/** 
	* 角色id
	 */
	private Long roleId;

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public void setPermissions(List<OpenRolePermissionForContact> permissions) {
		this.permissions = new JSONWriter(false,false,true).write(permissions);
	}

	public String getPermissions() {
		return this.permissions;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.contact.rolevisibility.update";
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
		txtParams.put("permissions", this.permissions);
		txtParams.put("role_id", this.roleId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiContactRolevisibilityUpdateResponse> getResponseClass() {
		return OapiContactRolevisibilityUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(permissions, 999, "permissions");
		RequestCheckUtils.checkNotEmpty(roleId, "roleId");
	}
	
	/**
	 * 权限设置列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRolePermissionForContact extends TaobaoObject {
		private static final long serialVersionUID = 3231945351196569136L;
		/**
		 * 部门id列表
		 */
		@ApiListField("dept_ids")
		@ApiField("number")
		private List<Long> deptIds;
		/**
		 * 角色id列表
		 */
		@ApiListField("role_ids")
		@ApiField("number")
		private List<Long> roleIds;
		/**
		 * subject规则(1)还是object规则(2)
		 */
		@ApiField("side")
		private Long side;
		/**
		 * permit(1) 还是 deny(2)
		 */
		@ApiField("type")
		private Long type;
		/**
		 * staffid列表
		 */
		@ApiListField("user_ids")
		@ApiField("number")
		private List<Long> userIds;
		/**
		 * 可见性类型： 5. permit_self_node_and_children(仅可见自己所在节点及子节点)     6. permit_self_node_only(仅可见自己所在的节点)    7. permit_self_only(仅可见自己)
		 */
		@ApiField("visibility_type")
		private Long visibilityType;
	
		public List<Long> getDeptIds() {
			return this.deptIds;
		}
		public void setDeptIds(List<Long> deptIds) {
			this.deptIds = deptIds;
		}
		public List<Long> getRoleIds() {
			return this.roleIds;
		}
		public void setRoleIds(List<Long> roleIds) {
			this.roleIds = roleIds;
		}
		public Long getSide() {
			return this.side;
		}
		public void setSide(Long side) {
			this.side = side;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public List<Long> getUserIds() {
			return this.userIds;
		}
		public void setUserIds(List<Long> userIds) {
			this.userIds = userIds;
		}
		public Long getVisibilityType() {
			return this.visibilityType;
		}
		public void setVisibilityType(Long visibilityType) {
			this.visibilityType = visibilityType;
		}
	}
	

}