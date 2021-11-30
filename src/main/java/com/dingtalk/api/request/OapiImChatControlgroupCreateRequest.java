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

import com.dingtalk.api.response.OapiImChatControlgroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.controlgroup.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.29
 */
public class OapiImChatControlgroupCreateRequest extends BaseTaobaoRequest<OapiImChatControlgroupCreateResponse> {
	
	

	/** 
	* 群的管理权限设置，0-所有人可管理（默认），1-仅群主和群管理员可管理
	 */
	private Long authorityType;

	/** 
	* goc模拟群：goc， 网商银行群：eCommerce
	 */
	private String groupType;

	/** 
	* 建群去重的业务id
	 */
	private String groupUniqId;

	/** 
	* 群成员在钉钉组织内的userid列表
	 */
	private String memberUserids;

	/** 
	* 群主在钉钉组织内的userid
	 */
	private String ownerUserid;

	/** 
	* 群标题
	 */
	private String title;

	public void setAuthorityType(Long authorityType) {
		this.authorityType = authorityType;
	}

	public Long getAuthorityType() {
		return this.authorityType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getGroupType() {
		return this.groupType;
	}

	public void setGroupUniqId(String groupUniqId) {
		this.groupUniqId = groupUniqId;
	}

	public String getGroupUniqId() {
		return this.groupUniqId;
	}

	public void setMemberUserids(String memberUserids) {
		this.memberUserids = memberUserids;
	}

	public String getMemberUserids() {
		return this.memberUserids;
	}

	public void setOwnerUserid(String ownerUserid) {
		this.ownerUserid = ownerUserid;
	}

	public String getOwnerUserid() {
		return this.ownerUserid;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.controlgroup.create";
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
		txtParams.put("authority_type", this.authorityType);
		txtParams.put("group_type", this.groupType);
		txtParams.put("group_uniq_id", this.groupUniqId);
		txtParams.put("member_userids", this.memberUserids);
		txtParams.put("owner_userid", this.ownerUserid);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatControlgroupCreateResponse> getResponseClass() {
		return OapiImChatControlgroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(memberUserids, "memberUserids");
		RequestCheckUtils.checkMaxListSize(memberUserids, 20, "memberUserids");
		RequestCheckUtils.checkNotEmpty(ownerUserid, "ownerUserid");
		RequestCheckUtils.checkNotEmpty(title, "title");
		RequestCheckUtils.checkMaxLength(title, 256, "title");
	}
	

}