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

import com.dingtalk.api.response.OapiSceneservicegroupGroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sceneservicegroup.group.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.13
 */
public class OapiSceneservicegroupGroupCreateRequest extends BaseTaobaoRequest<OapiSceneservicegroupGroupCreateResponse> {
	
	

	/** 
	* 业务关联
	 */
	private String bizid;

	/** 
	* 群名称
	 */
	private String groupName;

	/** 
	* 群标签
	 */
	private String groupTagNames;

	/** 
	* 标签列表
	 */
	private String groupTagids;

	/** 
	* 成员员工列表
	 */
	private String memberStaffids;

	/** 
	* 服务群群组ID
	 */
	private String openGroupsetid;

	/** 
	* 服务群团队ID
	 */
	private String openTeamid;

	/** 
	* 群主员工id
	 */
	private String ownerStaffId;

	public void setBizid(String bizid) {
		this.bizid = bizid;
	}

	public String getBizid() {
		return this.bizid;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupTagNames(String groupTagNames) {
		this.groupTagNames = groupTagNames;
	}

	public String getGroupTagNames() {
		return this.groupTagNames;
	}

	public void setGroupTagids(String groupTagids) {
		this.groupTagids = groupTagids;
	}

	public String getGroupTagids() {
		return this.groupTagids;
	}

	public void setMemberStaffids(String memberStaffids) {
		this.memberStaffids = memberStaffids;
	}

	public String getMemberStaffids() {
		return this.memberStaffids;
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

	public void setOwnerStaffId(String ownerStaffId) {
		this.ownerStaffId = ownerStaffId;
	}

	public String getOwnerStaffId() {
		return this.ownerStaffId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sceneservicegroup.group.create";
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
		txtParams.put("bizid", this.bizid);
		txtParams.put("group_name", this.groupName);
		txtParams.put("group_tag_names", this.groupTagNames);
		txtParams.put("group_tagids", this.groupTagids);
		txtParams.put("member_staffids", this.memberStaffids);
		txtParams.put("open_groupsetid", this.openGroupsetid);
		txtParams.put("open_teamid", this.openTeamid);
		txtParams.put("owner_staffId", this.ownerStaffId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSceneservicegroupGroupCreateResponse> getResponseClass() {
		return OapiSceneservicegroupGroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupName, "groupName");
		RequestCheckUtils.checkMaxListSize(groupTagNames, 999, "groupTagNames");
		RequestCheckUtils.checkMaxListSize(groupTagids, 999, "groupTagids");
		RequestCheckUtils.checkMaxListSize(memberStaffids, 999, "memberStaffids");
		RequestCheckUtils.checkNotEmpty(openGroupsetid, "openGroupsetid");
		RequestCheckUtils.checkNotEmpty(openTeamid, "openTeamid");
		RequestCheckUtils.checkNotEmpty(ownerStaffId, "ownerStaffId");
	}
	

}