package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
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
import com.dingtalk.api.response.OapiCrmObjectdataCustomerUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectdata.customer.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.09.10
 */
public class OapiCrmObjectdataCustomerUpdateRequest extends BaseTaobaoRequest<OapiCrmObjectdataCustomerUpdateResponse> {
	
	

	/** 
	* 客户数据
	 */
	private String instance;

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public void setInstance(ObjectDataInstanceVo instance) {
		this.instance = new JSONWriter(false,false,true).write(instance);
	}

	public String getInstance() {
		return this.instance;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.objectdata.customer.update";
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
		txtParams.put("instance", this.instance);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCrmObjectdataCustomerUpdateResponse> getResponseClass() {
		return OapiCrmObjectdataCustomerUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 权限
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DataPermissionVo extends TaobaoObject {
		private static final long serialVersionUID = 5772766662744364997L;
		/**
		 * 负责人的用户ID
		 */
		@ApiListField("owner_userids")
		@ApiField("string")
		private List<String> ownerUserids;
		/**
		 * 协同人的用户ID
		 */
		@ApiListField("participant_userids")
		@ApiField("string")
		private List<String> participantUserids;
	
		public List<String> getOwnerUserids() {
			return this.ownerUserids;
		}
		public void setOwnerUserids(List<String> ownerUserids) {
			this.ownerUserids = ownerUserids;
		}
		public List<String> getParticipantUserids() {
			return this.participantUserids;
		}
		public void setParticipantUserids(List<String> participantUserids) {
			this.participantUserids = participantUserids;
		}
	}
	
	/**
	 * 客户数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ObjectDataInstanceVo extends TaobaoObject {
		private static final long serialVersionUID = 3299777678282445439L;
		/**
		 * 公海领取客户：publicDraw 公海分配客户：publicAssign 其余场景：（不用传）
		 */
		@ApiField("action")
		private String action;
		/**
		 * 数据内容
		 */
		@ApiField("data")
		private String data;
		/**
		 * 扩展数据内容
		 */
		@ApiField("extend_data")
		private String extendData;
		/**
		 * 客户数据id
		 */
		@ApiField("instance_id")
		private String instanceId;
		/**
		 * 修改的钉钉用户nick
		 */
		@ApiField("modifier_nick")
		private String modifierNick;
		/**
		 * 修改的钉钉用户id
		 */
		@ApiField("modifier_userid")
		private String modifierUserid;
		/**
		 * 权限
		 */
		@ApiField("permission")
		private DataPermissionVo permission;
		/**
		 * 跳过查重
		 */
		@ApiField("skip_duplicate_check")
		private Boolean skipDuplicateCheck;
	
		public String getAction() {
			return this.action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public void setDataString(String data) {
			this.data = data;
		}
		
		public String getExtendData() {
			return this.extendData;
		}
		public void setExtendData(String extendData) {
			this.extendData = extendData;
		}
		public void setExtendDataString(String extendData) {
			this.extendData = extendData;
		}
		
		public String getInstanceId() {
			return this.instanceId;
		}
		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
		public String getModifierNick() {
			return this.modifierNick;
		}
		public void setModifierNick(String modifierNick) {
			this.modifierNick = modifierNick;
		}
		public String getModifierUserid() {
			return this.modifierUserid;
		}
		public void setModifierUserid(String modifierUserid) {
			this.modifierUserid = modifierUserid;
		}
		public DataPermissionVo getPermission() {
			return this.permission;
		}
		public void setPermission(DataPermissionVo permission) {
			this.permission = permission;
		}
		public Boolean getSkipDuplicateCheck() {
			return this.skipDuplicateCheck;
		}
		public void setSkipDuplicateCheck(Boolean skipDuplicateCheck) {
			this.skipDuplicateCheck = skipDuplicateCheck;
		}
	}
	

}