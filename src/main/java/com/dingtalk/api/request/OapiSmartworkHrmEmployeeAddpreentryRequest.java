package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiSmartworkHrmEmployeeAddpreentryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.addpreentry request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartworkHrmEmployeeAddpreentryRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeAddpreentryResponse> {
	
	

	/** 
	* 添加待入职入参
	 */
	private String param;

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
		return "dingtalk.oapi.smartwork.hrm.employee.addpreentry";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeAddpreentryResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeAddpreentryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 添加待入职入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PreEntryEmployeeAddParam extends TaobaoObject {
		private static final long serialVersionUID = 4623888244863627246L;
		/**
		 * 扩展信息，json串格式，按要求传入有效信息，无效信息不会保存。有效信息有：depts--部门id列表，"|"分隔多个；mainDeptId--主部门id； mainDeptName--主部门名称； position--职位； workPlace--工作地点；employeeType--员工类型枚举值（0，无类型;1，全职;2，兼职;3，实习;4，劳务派遣;5，退休返聘;6，劳务外包）
		 */
		@ApiField("extend_info")
		private String extendInfo;
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
	
		public String getExtendInfo() {
			return this.extendInfo;
		}
		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
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