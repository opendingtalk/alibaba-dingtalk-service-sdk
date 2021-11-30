package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiSmartdeviceAtmachineUserUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.atmachine.user.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.01
 */
public class OapiSmartdeviceAtmachineUserUpdateRequest extends BaseTaobaoRequest<OapiSmartdeviceAtmachineUserUpdateResponse> {
	
	

	/** 
	* 变更智能考勤机员工参数模型
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(MachineUsersUpdateRequestVo param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.atmachine.user.update";
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

	public Class<OapiSmartdeviceAtmachineUserUpdateResponse> getResponseClass() {
		return OapiSmartdeviceAtmachineUserUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 变更智能考勤机员工参数模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MachineUsersUpdateRequestVo extends TaobaoObject {
		private static final long serialVersionUID = 1542978981578319627L;
		/**
		 * 新增的员工id列表
		 */
		@ApiListField("add_userid_list")
		@ApiField("string")
		private List<String> addUseridList;
		/**
		 * 移除的员工id列表
		 */
		@ApiListField("del_userid_list")
		@ApiField("string")
		private List<String> delUseridList;
		/**
		 * 设备唯一标识id列表，字符串数组
		 */
		@ApiListField("deviceid_list")
		@ApiField("string")
		private List<String> deviceidList;
		/**
		 * 设备唯一标识id列表，Long数组
		 */
		@ApiListField("devid_list")
		@ApiField("number")
		private List<Long> devidList;
	
		public List<String> getAddUseridList() {
			return this.addUseridList;
		}
		public void setAddUseridList(List<String> addUseridList) {
			this.addUseridList = addUseridList;
		}
		public List<String> getDelUseridList() {
			return this.delUseridList;
		}
		public void setDelUseridList(List<String> delUseridList) {
			this.delUseridList = delUseridList;
		}
		public List<String> getDeviceidList() {
			return this.deviceidList;
		}
		public void setDeviceidList(List<String> deviceidList) {
			this.deviceidList = deviceidList;
		}
		public List<Long> getDevidList() {
			return this.devidList;
		}
		public void setDevidList(List<Long> devidList) {
			this.devidList = devidList;
		}
	}
	

}