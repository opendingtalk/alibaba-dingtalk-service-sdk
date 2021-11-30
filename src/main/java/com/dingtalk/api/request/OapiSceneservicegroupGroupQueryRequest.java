package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSceneservicegroupGroupQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sceneservicegroup.group.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.21
 */
public class OapiSceneservicegroupGroupQueryRequest extends BaseTaobaoRequest<OapiSceneservicegroupGroupQueryResponse> {
	
	

	/** 
	* 表示分页游标，从0开始
	 */
	private Long cursor;

	/** 
	* 群名称
	 */
	private String groupName;

	/** 
	* 开放群ID
	 */
	private String openConversationid;

	/** 
	* 群组id
	 */
	private String openGroupsetid;

	/** 
	* 团队id
	 */
	private String openTeamid;

	/** 
	* 表示分页大小，size最大不超过100
	 */
	private Long size;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setOpenConversationid(String openConversationid) {
		this.openConversationid = openConversationid;
	}

	public String getOpenConversationid() {
		return this.openConversationid;
	}

	public void setOpenGroupsetid(String openGroupsetid) {
		this.openGroupsetid = openGroupsetid;
	}

	public String getOpenGroupsetid() {
		return this.openGroupsetid;
	}

	public void setOpenTeamid(String openTeamid) {
		this.openTeamid = openTeamid;
	}

	public String getOpenTeamid() {
		return this.openTeamid;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sceneservicegroup.group.query";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("group_name", this.groupName);
		txtParams.put("open_conversationid", this.openConversationid);
		txtParams.put("open_groupsetid", this.openGroupsetid);
		txtParams.put("open_teamid", this.openTeamid);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSceneservicegroupGroupQueryResponse> getResponseClass() {
		return OapiSceneservicegroupGroupQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}