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
import com.dingtalk.api.response.OapiWorkspaceCorpMemberAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.corp.member.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.15
 */
public class OapiWorkspaceCorpMemberAddRequest extends BaseTaobaoRequest<OapiWorkspaceCorpMemberAddResponse> {
	
	

	/** 
	* 加人的成员列表
	 */
	private String memberAddDtoList;

	/** 
	* 目标加人组织
	 */
	private String targetCorpId;

	public void setMemberAddDtoList(String memberAddDtoList) {
		this.memberAddDtoList = memberAddDtoList;
	}

	public void setMemberAddDtoList(List<OpenMemberAddDto> memberAddDtoList) {
		this.memberAddDtoList = new JSONWriter(false,false,true).write(memberAddDtoList);
	}

	public String getMemberAddDtoList() {
		return this.memberAddDtoList;
	}

	public void setTargetCorpId(String targetCorpId) {
		this.targetCorpId = targetCorpId;
	}

	public String getTargetCorpId() {
		return this.targetCorpId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.corp.member.add";
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
		txtParams.put("member_add_dto_list", this.memberAddDtoList);
		txtParams.put("target_corp_id", this.targetCorpId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceCorpMemberAddResponse> getResponseClass() {
		return OapiWorkspaceCorpMemberAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(memberAddDtoList, 20, "memberAddDtoList");
	}
	
	/**
	 * 加人的成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberAddDto extends TaobaoObject {
		private static final long serialVersionUID = 1762547772323983965L;
		/**
		 * 成员来源组织
		 */
		@ApiField("from_corp_id")
		private String fromCorpId;
		/**
		 * 来源组织成员userId
		 */
		@ApiField("from_userid")
		private String fromUserid;
		/**
		 * 目标组织userId
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