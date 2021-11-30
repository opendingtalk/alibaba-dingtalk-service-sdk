package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiChatCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.03.11
 */
public class OapiChatCreateRequest extends BaseTaobaoRequest<OapiChatCreateResponse> {
	
	

	/** 
	* 群禁言，0-默认，不禁言，1-全员禁言
	 */
	private Long chatBannedType;

	/** 
	* 群类型，2：企业群，0：普通群
	 */
	private Long conversationTag;

	/** 
	* 外部联系人成员列表
	 */
	private List<String> extidlist;

	/** 
	* 群头像资源id
	 */
	private String icon;

	/** 
	* 管理类型，0-默认，所有人可管理，1-仅群主可管理
	 */
	private Long managementType;

	/** 
	* @all 权限，0-默认，所有人，1-仅群主可@all
	 */
	private Long mentionAllAuthority;

	/** 
	* 群名称
	 */
	private String name;

	/** 
	* 群主的userId
	 */
	private String owner;

	/** 
	* 群主类型，emp：企业员工，ext：外部联系人
	 */
	private String ownerType;

	/** 
	* 群可搜索，0-默认，不可搜索，1-可搜索
	 */
	private Long searchable;

	/** 
	* 新成员可查看100条聊天历史消息的类型，1：可查看，默认或0：不可查看
	 */
	private Long showHistoryType;

	/** 
	* 群成员userId列表
	 */
	private List<String> useridlist;

	/** 
	* 入群验证，0：不入群验证（默认） 1：入群验证
	 */
	private Long validationType;

	public void setChatBannedType(Long chatBannedType) {
		this.chatBannedType = chatBannedType;
	}

	public Long getChatBannedType() {
		return this.chatBannedType;
	}

	public void setConversationTag(Long conversationTag) {
		this.conversationTag = conversationTag;
	}

	public Long getConversationTag() {
		return this.conversationTag;
	}

	public void setExtidlist(List<String> extidlist) {
		this.extidlist = extidlist;
	}

	public List<String> getExtidlist() {
		return this.extidlist;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setManagementType(Long managementType) {
		this.managementType = managementType;
	}

	public Long getManagementType() {
		return this.managementType;
	}

	public void setMentionAllAuthority(Long mentionAllAuthority) {
		this.mentionAllAuthority = mentionAllAuthority;
	}

	public Long getMentionAllAuthority() {
		return this.mentionAllAuthority;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getOwnerType() {
		return this.ownerType;
	}

	public void setSearchable(Long searchable) {
		this.searchable = searchable;
	}

	public Long getSearchable() {
		return this.searchable;
	}

	public void setShowHistoryType(Long showHistoryType) {
		this.showHistoryType = showHistoryType;
	}

	public Long getShowHistoryType() {
		return this.showHistoryType;
	}

	public void setUseridlist(List<String> useridlist) {
		this.useridlist = useridlist;
	}

	public List<String> getUseridlist() {
		return this.useridlist;
	}

	public void setValidationType(Long validationType) {
		this.validationType = validationType;
	}

	public Long getValidationType() {
		return this.validationType;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.create";
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
		txtParams.put("chatBannedType", this.chatBannedType);
		txtParams.put("conversationTag", this.conversationTag);
		txtParams.put("extidlist", TaobaoUtils.objectToJson(this.extidlist));
		txtParams.put("icon", this.icon);
		txtParams.put("managementType", this.managementType);
		txtParams.put("mentionAllAuthority", this.mentionAllAuthority);
		txtParams.put("name", this.name);
		txtParams.put("owner", this.owner);
		txtParams.put("ownerType", this.ownerType);
		txtParams.put("searchable", this.searchable);
		txtParams.put("showHistoryType", this.showHistoryType);
		txtParams.put("useridlist", TaobaoUtils.objectToJson(this.useridlist));
		txtParams.put("validationType", this.validationType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatCreateResponse> getResponseClass() {
		return OapiChatCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}