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
import com.dingtalk.api.response.OapiSmartdeviceAtmachineGetByDeptidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.atmachine.get_by_deptid request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.01
 */
public class OapiSmartdeviceAtmachineGetByDeptidRequest extends BaseTaobaoRequest<OapiSmartdeviceAtmachineGetByDeptidResponse> {
	
	

	/** 
	* 查询智能考勤机列表参数模型
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(MachineInfoRequestVo param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.atmachine.get_by_deptid";
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

	public Class<OapiSmartdeviceAtmachineGetByDeptidResponse> getResponseClass() {
		return OapiSmartdeviceAtmachineGetByDeptidResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 查询智能考勤机列表参数模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MachineInfoRequestVo extends TaobaoObject {
		private static final long serialVersionUID = 3482819517892384434L;
		/**
		 * 部门id
		 */
		@ApiField("deptid")
		private Long deptid;
		/**
		 * 偏移值
		 */
		@ApiField("offset")
		private Long offset;
		/**
		 * 每页大小
		 */
		@ApiField("size")
		private Long size;
	
		public Long getDeptid() {
			return this.deptid;
		}
		public void setDeptid(Long deptid) {
			this.deptid = deptid;
		}
		public Long getOffset() {
			return this.offset;
		}
		public void setOffset(Long offset) {
			this.offset = offset;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
	}
	

}