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

import com.dingtalk.api.response.OapiWorkspaceProjectCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.09
 */
public class OapiWorkspaceProjectCreateRequest extends BaseTaobaoRequest<OapiWorkspaceProjectCreateResponse> {
	
	

	/** 
	* 创建人（主管理员）在归属组织内的userId
	 */
	private String belongCorpUserid;

	/** 
	* 是否建圈自动建群
	 */
	private Boolean createGroup;

	/** 
	* 描述，长度256字符以内
	 */
	private String desc;

	/** 
	* 组织名，长度3-50个字符以内，不允许中划线、下划线、逗号、空格
	 */
	private String name;

	/** 
	* 开放的cid，如果有值会把该群作为组织的默认群，否则会新创建1个默认群
	 */
	private String openConversationId;

	/** 
	* 允许调用者传入外部id用于做系统关联
	 */
	private String outerId;

	/** 
	* 模板id
	 */
	private Long templateId;

	/** 
	* 1项目组织  2圈子组织
	 */
	private Long type;

	/** 
	* 可以指定创建人在项目圈子组织内的userId，如果不填系统随机生成
	 */
	private String userid;

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

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.project.create";
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
		txtParams.put("name", this.name);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("template_id", this.templateId);
		txtParams.put("type", this.type);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceProjectCreateResponse> getResponseClass() {
		return OapiWorkspaceProjectCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(belongCorpUserid, "belongCorpUserid");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}