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
import com.dingtalk.api.response.OapiCrmObjectdataCustomobjectUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectdata.customobject.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.19
 */
public class OapiCrmObjectdataCustomobjectUpdateRequest extends BaseTaobaoRequest<OapiCrmObjectdataCustomobjectUpdateResponse> {
	
	

	/** 
	* 自定义对象数据
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
		return "dingtalk.oapi.crm.objectdata.customobject.update";
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

	public Class<OapiCrmObjectdataCustomobjectUpdateResponse> getResponseClass() {
		return OapiCrmObjectdataCustomobjectUpdateResponse.class;
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
		private static final long serialVersionUID = 4296615532581329799L;
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
	 * 自定义对象数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ObjectDataInstanceVo extends TaobaoObject {
		private static final long serialVersionUID = 3199381877758442285L;
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
		 * 自定义对象表单code
		 */
		@ApiField("form_code")
		private String formCode;
		/**
		 * 自定义对象数据id
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
		
		public String getFormCode() {
			return this.formCode;
		}
		public void setFormCode(String formCode) {
			this.formCode = formCode;
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
	}
	

}