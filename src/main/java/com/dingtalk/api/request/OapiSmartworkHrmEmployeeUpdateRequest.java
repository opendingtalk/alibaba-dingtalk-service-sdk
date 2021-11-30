package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiSmartworkHrmEmployeeUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.05
 */
public class OapiSmartworkHrmEmployeeUpdateRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeUpdateResponse> {
	
	

	/** 
	* 微应用在企业的AgentId
	 */
	private Long agentid;

	/** 
	* 添加待入职入参
	 */
	private String param;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(PreEntryEmployeeAddParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.update";
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
		txtParams.put("agentid", this.agentid);
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeUpdateResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
	}
	
	/**
	 * 单个组所有字段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 3439571494961428413L;
		/**
		 * 更新的字段code
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 更新的字段值
		 */
		@ApiField("value")
		private String value;
	
		public String getFieldCode() {
			return this.fieldCode;
		}
		public void setFieldCode(String fieldCode) {
			this.fieldCode = fieldCode;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 同类型组明细
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpListFieldVO extends TaobaoObject {
		private static final long serialVersionUID = 8241886698932957378L;
		/**
		 * 单个组所有字段
		 */
		@ApiListField("section")
		@ApiField("emp_field_vo")
		private List<EmpFieldVo> section;
	
		public List<EmpFieldVo> getSection() {
			return this.section;
		}
		public void setSection(List<EmpFieldVo> section) {
			this.section = section;
		}
	}
	
	/**
	 * 所有组明细
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMetaInfo extends TaobaoObject {
		private static final long serialVersionUID = 1116979392643972816L;
		/**
		 * 需改的字段所在组ID
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 同类型组明细
		 */
		@ApiListField("sections")
		@ApiField("emp_list_field_v_o")
		private List<EmpListFieldVO> sections;
	
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public List<EmpListFieldVO> getSections() {
			return this.sections;
		}
		public void setSections(List<EmpListFieldVO> sections) {
			this.sections = sections;
		}
	}
	
	/**
	 * 添加待入职入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PreEntryEmployeeAddParam extends TaobaoObject {
		private static final long serialVersionUID = 5132493469647232146L;
		/**
		 * 所有组明细
		 */
		@ApiListField("groups")
		@ApiField("group_meta_info")
		private List<GroupMetaInfo> groups;
		/**
		 * staff_id or userId用户在企业的唯一标识
		 */
		@ApiField("userid")
		private String userid;
	
		public List<GroupMetaInfo> getGroups() {
			return this.groups;
		}
		public void setGroups(List<GroupMetaInfo> groups) {
			this.groups = groups;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}