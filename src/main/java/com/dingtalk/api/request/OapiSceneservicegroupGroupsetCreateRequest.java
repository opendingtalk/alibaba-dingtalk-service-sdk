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

import com.dingtalk.api.response.OapiSceneservicegroupGroupsetCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sceneservicegroup.groupset.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.27
 */
public class OapiSceneservicegroupGroupsetCreateRequest extends BaseTaobaoRequest<OapiSceneservicegroupGroupsetCreateResponse> {
	
	

	/** 
	* 开放模板id
	 */
	private String groupTemplateid;

	/** 
	* 群组名称
	 */
	private String groupsetName;

	/** 
	* 开放团队id
	 */
	private String openTeamid;

	public void setGroupTemplateid(String groupTemplateid) {
		this.groupTemplateid = groupTemplateid;
	}

	public String getGroupTemplateid() {
		return this.groupTemplateid;
	}

	public void setGroupsetName(String groupsetName) {
		this.groupsetName = groupsetName;
	}

	public String getGroupsetName() {
		return this.groupsetName;
	}

	public void setOpenTeamid(String openTeamid) {
		this.openTeamid = openTeamid;
	}

	public String getOpenTeamid() {
		return this.openTeamid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sceneservicegroup.groupset.create";
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
		txtParams.put("group_templateid", this.groupTemplateid);
		txtParams.put("groupset_name", this.groupsetName);
		txtParams.put("open_teamid", this.openTeamid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSceneservicegroupGroupsetCreateResponse> getResponseClass() {
		return OapiSceneservicegroupGroupsetCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(openTeamid, "openTeamid");
	}
	

}