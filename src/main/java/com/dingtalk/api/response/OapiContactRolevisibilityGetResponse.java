package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.contact.rolevisibility.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiContactRolevisibilityGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1465273286734132712L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 权限设置列表
	 */
	@ApiListField("result")
	@ApiField("open_role_permission_for_contact")
	private List<OpenRolePermissionForContact> result;

	/** 
	 * 是否成功: true表示成功，false表示失败
	 */
	@ApiField("success")
	private Boolean success;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(List<OpenRolePermissionForContact> result) {
		this.result = result;
	}
	public List<OpenRolePermissionForContact> getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 权限设置列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRolePermissionForContact extends TaobaoObject {
		private static final long serialVersionUID = 6527547413489861939L;
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
		 * SubjectSide(1) 还是 ObjectSide(2)
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
		@ApiField("string")
		private List<String> userIds;
		/**
		 * 可见性设置类型：5. permit_self_node_and_children(仅可见自己所在节点及子节点)    6. permit_self_node_only(仅可见自己所在的节点)    7. permit_self_only(仅可见自己)
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
		public List<String> getUserIds() {
			return this.userIds;
		}
		public void setUserIds(List<String> userIds) {
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
