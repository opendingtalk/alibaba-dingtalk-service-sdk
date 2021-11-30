package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiSmartworkHrmEmployeeRichAddpreentryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.rich.addpreentry request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.08
 */
public class OapiSmartworkHrmEmployeeRichAddpreentryRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeRichAddpreentryResponse> {
	
	

	/** 
	* 微应用在企业的AgentId
	 */
	private String agentid;

	/** 
	* 添加待入职入参
	 */
	private String param;

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public String getAgentid() {
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
		return "dingtalk.oapi.smartwork.hrm.employee.rich.addpreentry";
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

	public Class<OapiSmartworkHrmEmployeeRichAddpreentryResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeRichAddpreentryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
	}
	
	/**
	 * 组内字段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 7688883951531826389L;
		/**
		 * 更新的字段code
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 更新的字段value
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
	 * 同类组明细
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpListFieldVO extends TaobaoObject {
		private static final long serialVersionUID = 8138664633437434354L;
		/**
		 * 组内字段
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
	public static class EmpGroupFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 1614428782674211166L;
		/**
		 * 修改的字段所在组ID
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 同类组明细
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
		private static final long serialVersionUID = 3392392479423173556L;
		/**
		 * 所有组明细
		 */
		@ApiListField("groups")
		@ApiField("emp_group_field_vo")
		private List<EmpGroupFieldVo> groups;
		/**
		 * 待入职员工手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 待入职员工姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 操作人userid
		 */
		@ApiField("op_userid")
		private String opUserid;
		/**
		 * 预期入职时间
		 */
		@ApiField("pre_entry_time")
		private Date preEntryTime;
	
		public List<EmpGroupFieldVo> getGroups() {
			return this.groups;
		}
		public void setGroups(List<EmpGroupFieldVo> groups) {
			this.groups = groups;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOpUserid() {
			return this.opUserid;
		}
		public void setOpUserid(String opUserid) {
			this.opUserid = opUserid;
		}
		public Date getPreEntryTime() {
			return this.preEntryTime;
		}
		public void setPreEntryTime(Date preEntryTime) {
			this.preEntryTime = preEntryTime;
		}
	}
	

}