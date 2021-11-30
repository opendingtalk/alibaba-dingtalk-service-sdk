package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiEduClassListbyteacherResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.class.listbyteacher request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.15
 */
public class OapiEduClassListbyteacherRequest extends BaseTaobaoRequest<OapiEduClassListbyteacherResponse> {
	
	

	/** 
	* 过滤入参
	 */
	private String filterParam;

	/** 
	* 是否跨组织查询
	 */
	private Boolean queryFromAllOrgs;

	/** 
	* 返回的扩展信息设置(不支持跨组织)
	 */
	private String retExtFields;

	/** 
	* 用户ID
	 */
	private String userid;

	public void setFilterParam(String filterParam) {
		this.filterParam = filterParam;
	}

	public void setFilterParam(OpenClassParam filterParam) {
		this.filterParam = new JSONWriter(false,false,true).write(filterParam);
	}

	public String getFilterParam() {
		return this.filterParam;
	}

	public void setQueryFromAllOrgs(Boolean queryFromAllOrgs) {
		this.queryFromAllOrgs = queryFromAllOrgs;
	}

	public Boolean getQueryFromAllOrgs() {
		return this.queryFromAllOrgs;
	}

	public void setRetExtFields(String retExtFields) {
		this.retExtFields = retExtFields;
	}

	public void setRetExtFields(OpenEduSelectClassExtFields retExtFields) {
		this.retExtFields = new JSONWriter(false,false,true).write(retExtFields);
	}

	public String getRetExtFields() {
		return this.retExtFields;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.class.listbyteacher";
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
		txtParams.put("filter_param", this.filterParam);
		txtParams.put("queryFromAllOrgs", this.queryFromAllOrgs);
		txtParams.put("ret_ext_fields", this.retExtFields);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduClassListbyteacherResponse> getResponseClass() {
		return OapiEduClassListbyteacherResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 过滤入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenClassParam extends TaobaoObject {
		private static final long serialVersionUID = 7191564414765127513L;
		/**
		 * 群类型
		 */
		@ApiField("group_type")
		private String groupType;
		/**
		 * 角色
		 */
		@ApiField("role")
		private String role;
	
		public String getGroupType() {
			return this.groupType;
		}
		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}
		public String getRole() {
			return this.role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	}
	
	/**
	 * 返回的扩展信息设置(不支持跨组织)
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduSelectClassExtFields extends TaobaoObject {
		private static final long serialVersionUID = 7594671665985662256L;
		/**
		 * 返回群信息
		 */
		@ApiField("ret_conversation_list")
		private Boolean retConversationList;
	
		public Boolean getRetConversationList() {
			return this.retConversationList;
		}
		public void setRetConversationList(Boolean retConversationList) {
			this.retConversationList = retConversationList;
		}
	}
	

}