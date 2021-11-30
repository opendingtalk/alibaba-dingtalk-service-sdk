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

import com.dingtalk.api.response.OapiWorkspaceProjectCreateV2Response;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.create.v2 request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.23
 */
public class OapiWorkspaceProjectCreateV2Request extends BaseTaobaoRequest<OapiWorkspaceProjectCreateV2Response> {
	
	

	/** 
	* 项目创建人userid
	 */
	private String belongCorpUserid;

	/** 
	* 是否创建群
	 */
	private Boolean createGroup;

	/** 
	* 描述，长度256字符以内
	 */
	private String desc;

	/** 
	* 项目logo media id
	 */
	private String logoMediaId;

	/** 
	* 组织名，长度3-50个字符以内，不允许中划线、下划线、逗号、空格
	 */
	private String name;

	/** 
	* 群ID
	 */
	private String openConversationId;

	/** 
	* sourceid
	 */
	private String outerId;

	/** 
	* 默认创建项目，可不用入参
	 */
	private Long type;

	public void setBelongCorpUserid(String belongCorpUserid) {
		this.belongCorpUserid = belongCorpUserid;
	}

	public String getBelongCorpUserid() {
		return this.belongCorpUserid;
	}

	public void setCreateGroup(Boolean createGroup) {
		this.createGroup = createGroup;
	}

	public Boolean getCreateGroup() {
		return this.createGroup;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setLogoMediaId(String logoMediaId) {
		this.logoMediaId = logoMediaId;
	}

	public String getLogoMediaId() {
		return this.logoMediaId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.project.create.v2";
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
		txtParams.put("belong_corp_userid", this.belongCorpUserid);
		txtParams.put("create_group", this.createGroup);
		txtParams.put("desc", this.desc);
		txtParams.put("logo_media_id", this.logoMediaId);
		txtParams.put("name", this.name);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceProjectCreateV2Response> getResponseClass() {
		return OapiWorkspaceProjectCreateV2Response.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(name, "name");
	}
	

}