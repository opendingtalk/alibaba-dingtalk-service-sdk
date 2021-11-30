package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiWorkspaceUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.17
 */
public class OapiWorkspaceUpdateRequest extends BaseTaobaoRequest<OapiWorkspaceUpdateResponse> {
	
	

	/** 
	* 修改项目圈子信息
	 */
	private String updateInfo;

	public void setUpdateInfo(String updateInfo) {
		this.updateInfo = updateInfo;
	}

	public void setUpdateInfo(OpenUpdateWorkspaceDto updateInfo) {
		this.updateInfo = new JSONWriter(false,false,true).write(updateInfo);
	}

	public String getUpdateInfo() {
		return this.updateInfo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.update";
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
		txtParams.put("update_info", this.updateInfo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceUpdateResponse> getResponseClass() {
		return OapiWorkspaceUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 修改项目/圈子信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenUpdateWorkspaceDto extends TaobaoObject {
		private static final long serialVersionUID = 4164692778189827351L;
		/**
		 * 非必填。描述，长度256字符以内
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 非必填。mediaId格式，参考https:ding-doc.dingtalk.comdoc#serverapi2bcmg0i
		 */
		@ApiField("logo_media_id")
		private String logoMediaId;
		/**
		 * 非必填必填。组织名，长度3-50个字符以内，不允许中划线、下划线、逗号、空格
		 */
		@ApiField("name")
		private String name;
		/**
		 * 非必填。修改项目负责人，传新负责人在项目组织内的userId（注意不是归属组织的）
		 */
		@ApiField("owner_userid")
		private String ownerUserid;
	
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getLogoMediaId() {
			return this.logoMediaId;
		}
		public void setLogoMediaId(String logoMediaId) {
			this.logoMediaId = logoMediaId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOwnerUserid() {
			return this.ownerUserid;
		}
		public void setOwnerUserid(String ownerUserid) {
			this.ownerUserid = ownerUserid;
		}
	}
	

}