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
import com.dingtalk.api.response.OapiCrmObjectdataContactCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectdata.contact.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.04
 */
public class OapiCrmObjectdataContactCreateRequest extends BaseTaobaoRequest<OapiCrmObjectdataContactCreateResponse> {
	
	

	/** 
	* 联系人数据
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
		return "dingtalk.oapi.crm.objectdata.contact.create";
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

	public Class<OapiCrmObjectdataContactCreateResponse> getResponseClass() {
		return OapiCrmObjectdataContactCreateResponse.class;
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
		private static final long serialVersionUID = 4189314615493338295L;
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
	 * 联系人数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ObjectDataInstanceVo extends TaobaoObject {
		private static final long serialVersionUID = 6213557266899235941L;
		/**
		 * 记录创建人的昵称
		 */
		@ApiField("creator_nick")
		private String creatorNick;
		/**
		 * 记录创建人的用户ID
		 */
		@ApiField("creator_userid")
		private String creatorUserid;
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
		 * 权限
		 */
		@ApiField("permission")
		private DataPermissionVo permission;
	
		public String getCreatorNick() {
			return this.creatorNick;
		}
		public void setCreatorNick(String creatorNick) {
			this.creatorNick = creatorNick;
		}
		public String getCreatorUserid() {
			return this.creatorUserid;
		}
		public void setCreatorUserid(String creatorUserid) {
			this.creatorUserid = creatorUserid;
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
		
		public DataPermissionVo getPermission() {
			return this.permission;
		}
		public void setPermission(DataPermissionVo permission) {
			this.permission = permission;
		}
	}
	

}