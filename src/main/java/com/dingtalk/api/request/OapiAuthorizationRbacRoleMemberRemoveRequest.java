package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiAuthorizationRbacRoleMemberRemoveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.member.remove request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.20
 */
public class OapiAuthorizationRbacRoleMemberRemoveRequest extends BaseTaobaoRequest<OapiAuthorizationRbacRoleMemberRemoveResponse> {
	
	

	/** 
	* 微应用agenId,需要联系权限平台配置
	 */
	private String agentId;

	/** 
	* 管理组id
	 */
	private String openRoleId;

	/** 
	* 被删除的成员类表
	 */
	private String removeMembers;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setOpenRoleId(String openRoleId) {
		this.openRoleId = openRoleId;
	}

	public String getOpenRoleId() {
		return this.openRoleId;
	}

	public void setRemoveMembers(String removeMembers) {
		this.removeMembers = removeMembers;
	}

	public void setRemoveMembers(List<OpenMemberVo> removeMembers) {
		this.removeMembers = new JSONWriter(false,false,true).write(removeMembers);
	}

	public String getRemoveMembers() {
		return this.removeMembers;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.authorization.rbac.role.member.remove";
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("open_role_id", this.openRoleId);
		txtParams.put("remove_members", this.removeMembers);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAuthorizationRbacRoleMemberRemoveResponse> getResponseClass() {
		return OapiAuthorizationRbacRoleMemberRemoveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(openRoleId, "openRoleId");
		RequestCheckUtils.checkObjectMaxListSize(removeMembers, 999, "removeMembers");
	}
	
	/**
	 * 被删除的成员类表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberVo extends TaobaoObject {
		private static final long serialVersionUID = 2236812673552963914L;
		/**
		 * member所属corpid
		 */
		@ApiField("belong_corpid")
		private String belongCorpid;
		/**
		 * 成员id
		 */
		@ApiField("member_id")
		private String memberId;
		/**
		 * 成员类型
		 */
		@ApiField("member_type")
		private String memberType;
		/**
		 * 操作人userid
		 */
		@ApiField("operate_userid")
		private String operateUserid;
	
		public String getBelongCorpid() {
			return this.belongCorpid;
		}
		public void setBelongCorpid(String belongCorpid) {
			this.belongCorpid = belongCorpid;
		}
		public String getMemberId() {
			return this.memberId;
		}
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public String getMemberType() {
			return this.memberType;
		}
		public void setMemberType(String memberType) {
			this.memberType = memberType;
		}
		public String getOperateUserid() {
			return this.operateUserid;
		}
		public void setOperateUserid(String operateUserid) {
			this.operateUserid = operateUserid;
		}
	}
	

}