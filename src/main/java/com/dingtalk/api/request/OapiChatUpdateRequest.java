package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiChatUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.03.11
 */
public class OapiChatUpdateRequest extends BaseTaobaoRequest<OapiChatUpdateResponse> {
	
	

	/** 
	* 添加外部联系人成员列表
	 */
	private List<String> addExtidlist;

	/** 
	* 添加成员列表
	 */
	private List<String> addUseridlist;

	/** 
	* 群禁言，0-默认，不禁言，1-全员禁言
	 */
	private Long chatBannedType;

	/** 
	* 群会话id
	 */
	private String chatid;

	/** 
	* 删除外部联系人成员列表
	 */
	private List<String> delExtidlist;

	/** 
	* 删除成员列表
	 */
	private List<String> delUseridlist;

	/** 
	* 群头像mediaId
	 */
	private String icon;

	/** 
	* 是否禁言
	 */
	private Boolean isBan;

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
	* 新成员可查看聊天历史 0否 1是
	 */
	private Long showHistoryType;

	/** 
	* 入群验证，0：不入群验证（默认） 1：入群验证
	 */
	private Long validationType;

	public void setAddExtidlist(List<String> addExtidlist) {
		this.addExtidlist = addExtidlist;
	}

	public List<String> getAddExtidlist() {
		return this.addExtidlist;
	}

	public void setAddUseridlist(List<String> addUseridlist) {
		this.addUseridlist = addUseridlist;
	}

	public List<String> getAddUseridlist() {
		return this.addUseridlist;
	}

	public void setChatBannedType(Long chatBannedType) {
		this.chatBannedType = chatBannedType;
	}

	public Long getChatBannedType() {
		return this.chatBannedType;
	}

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setDelExtidlist(List<String> delExtidlist) {
		this.delExtidlist = delExtidlist;
	}

	public List<String> getDelExtidlist() {
		return this.delExtidlist;
	}

	public void setDelUseridlist(List<String> delUseridlist) {
		this.delUseridlist = delUseridlist;
	}

	public List<String> getDelUseridlist() {
		return this.delUseridlist;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIsBan(Boolean isBan) {
		this.isBan = isBan;
	}

	public Boolean getIsBan() {
		return this.isBan;
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

	public void setValidationType(Long validationType) {
		this.validationType = validationType;
	}

	public Long getValidationType() {
		return this.validationType;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.update";
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
		txtParams.put("add_extidlist", TaobaoUtils.objectToJson(this.addExtidlist));
		txtParams.put("add_useridlist", TaobaoUtils.objectToJson(this.addUseridlist));
		txtParams.put("chatBannedType", this.chatBannedType);
		txtParams.put("chatid", this.chatid);
		txtParams.put("del_extidlist", TaobaoUtils.objectToJson(this.delExtidlist));
		txtParams.put("del_useridlist", TaobaoUtils.objectToJson(this.delUseridlist));
		txtParams.put("icon", this.icon);
		txtParams.put("isBan", this.isBan);
		txtParams.put("managementType", this.managementType);
		txtParams.put("mentionAllAuthority", this.mentionAllAuthority);
		txtParams.put("name", this.name);
		txtParams.put("owner", this.owner);
		txtParams.put("ownerType", this.ownerType);
		txtParams.put("searchable", this.searchable);
		txtParams.put("showHistoryType", this.showHistoryType);
		txtParams.put("validationType", this.validationType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatUpdateResponse> getResponseClass() {
		return OapiChatUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}