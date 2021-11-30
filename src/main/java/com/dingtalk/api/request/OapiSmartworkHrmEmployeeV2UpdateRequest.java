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
import com.dingtalk.api.response.OapiSmartworkHrmEmployeeV2UpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.v2.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.29
 */
public class OapiSmartworkHrmEmployeeV2UpdateRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeV2UpdateResponse> {
	
	

	/** 
	* 微应用在企业的AgentId
	 */
	private Long agentid;

	/** 
	* 编辑花名册入参
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

	public void setParam(EmpUpdateByCustomParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.v2.update";
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

	public Class<OapiSmartworkHrmEmployeeV2UpdateResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeV2UpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
	}
	
	/**
	 * 分组下字段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 8287695658978567821L;
		/**
		 * 字段标识
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 字段值
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
	 * 分组下明细（非明细分组仅一条明细）
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpListFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 8446788543191731949L;
		/**
		 * 明细下标（注意：当传入该值时，表示当前传入的section为编辑员工花名册现有的第oldIndex条明细，此时系统会只编辑该条明细中传入的字段；当不传入该值时，表示传入的是新增明细，此时系统会保存该条明细传入的字段，未传字段会清空）
		 */
		@ApiField("old_index")
		private Long oldIndex;
		/**
		 * 分组下字段列表
		 */
		@ApiListField("section")
		@ApiField("emp_field_vo")
		private List<EmpFieldVo> section;
	
		public Long getOldIndex() {
			return this.oldIndex;
		}
		public void setOldIndex(Long oldIndex) {
			this.oldIndex = oldIndex;
		}
		public List<EmpFieldVo> getSection() {
			return this.section;
		}
		public void setSection(List<EmpFieldVo> section) {
			this.section = section;
		}
	}
	
	/**
	 * 花名册分组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpGroupFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 3844237969361722282L;
		/**
		 * 分组标识
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 分组下明细（非明细分组仅一条明细）
		 */
		@ApiListField("sections")
		@ApiField("emp_list_field_vo")
		private List<EmpListFieldVo> sections;
	
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public List<EmpListFieldVo> getSections() {
			return this.sections;
		}
		public void setSections(List<EmpListFieldVo> sections) {
			this.sections = sections;
		}
	}
	
	/**
	 * 编辑花名册入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpUpdateByCustomParam extends TaobaoObject {
		private static final long serialVersionUID = 2251345417645131343L;
		/**
		 * 花名册分组
		 */
		@ApiListField("groups")
		@ApiField("emp_group_field_vo")
		private List<EmpGroupFieldVo> groups;
		/**
		 * 员工userId
		 */
		@ApiField("userid")
		private String userid;
	
		public List<EmpGroupFieldVo> getGroups() {
			return this.groups;
		}
		public void setGroups(List<EmpGroupFieldVo> groups) {
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