package com.dingtalk.api.request;

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
import com.dingtalk.api.response.OapiProcessUpdateprocesspropResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.updateprocessprop request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.02
 */
public class OapiProcessUpdateprocesspropRequest extends BaseTaobaoRequest<OapiProcessUpdateprocesspropResponse> {
	
	

	/** 
	* 控件id
	 */
	private String componentId;

	/** 
	* 模板code
	 */
	private String processCode;

	/** 
	* 控件属性
	 */
	private String props;

	/** 
	* 员工工号 企业唯一
	 */
	private String userid;

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public String getComponentId() {
		return this.componentId;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public void setProps(ProcessTemplatePropsVo props) {
		this.props = new JSONWriter(false,false,true).write(props);
	}

	public String getProps() {
		return this.props;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.updateprocessprop";
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
		txtParams.put("component_id", this.componentId);
		txtParams.put("process_code", this.processCode);
		txtParams.put("props", this.props);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessUpdateprocesspropResponse> getResponseClass() {
		return OapiProcessUpdateprocesspropResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(componentId, "componentId");
		RequestCheckUtils.checkNotEmpty(processCode, "processCode");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	
	/**
	 * 控件属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessTemplatePropsVo extends TaobaoObject {
		private static final long serialVersionUID = 5516696587514181746L;
		/**
		 * 单个控件属性
		 */
		@ApiField("pay_enable")
		private Boolean payEnable;
	
		public Boolean getPayEnable() {
			return this.payEnable;
		}
		public void setPayEnable(Boolean payEnable) {
			this.payEnable = payEnable;
		}
	}
	

}