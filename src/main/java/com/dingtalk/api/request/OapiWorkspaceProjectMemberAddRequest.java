package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiWorkspaceProjectMemberAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.member.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.16
 */
public class OapiWorkspaceProjectMemberAddRequest extends BaseTaobaoRequest<OapiWorkspaceProjectMemberAddResponse> {
	
	

	/** 
	* 添加成员 最多20个
	 */
	private String members;

	public void setMembers(String members) {
		this.members = members;
	}

	public void setMembers(List<OpenMemberAddDto> members) {
		this.members = new JSONWriter(false,false,true).write(members);
	}

	public String getMembers() {
		return this.members;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.project.member.add";
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
		txtParams.put("members", this.members);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceProjectMemberAddResponse> getResponseClass() {
		return OapiWorkspaceProjectMemberAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(members, 20, "members");
	}
	
	/**
	 * 添加成员 最多20个
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberAddDto extends TaobaoObject {
		private static final long serialVersionUID = 4397513296983239896L;
		/**
		 * 从哪个组织选人
		 */
		@ApiField("from_corp_id")
		private String fromCorpId;
		/**
		 * 配合fromCorpId，在那个组织内的userid
		 */
		@ApiField("from_userid")
		private String fromUserid;
		/**
		 * 添加到新组织后，允许指定1个userId，但是有可能由于该userId与已新组织内已存在的员工userId重复报错。非必填。长度4-32位之间，仅允许（字母 数字 _ -）
		 */
		@ApiField("userid")
		private String userid;
	
		public String getFromCorpId() {
			return this.fromCorpId;
		}
		public void setFromCorpId(String fromCorpId) {
			this.fromCorpId = fromCorpId;
		}
		public String getFromUserid() {
			return this.fromUserid;
		}
		public void setFromUserid(String fromUserid) {
			this.fromUserid = fromUserid;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}