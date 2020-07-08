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
import com.dingtalk.api.response.OapiWorkspaceTestappInstallResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.testapp.install request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.10
 */
public class OapiWorkspaceTestappInstallRequest extends BaseTaobaoRequest<OapiWorkspaceTestappInstallResponse> {
	
	

	/** 
	* 为isv组织下的圈子安装测试应用
	 */
	private String installTestapp;

	public void setInstallTestapp(String installTestapp) {
		this.installTestapp = installTestapp;
	}

	public void setInstallTestapp(AuthOpenIsvMicroAppDto installTestapp) {
		this.installTestapp = new JSONWriter(false,false,true).write(installTestapp);
	}

	public String getInstallTestapp() {
		return this.installTestapp;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.testapp.install";
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
		txtParams.put("install_testapp", this.installTestapp);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceTestappInstallResponse> getResponseClass() {
		return OapiWorkspaceTestappInstallResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 为isv组织下的圈子安装测试应用
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AuthOpenIsvMicroAppDto extends TaobaoObject {
		private static final long serialVersionUID = 4712342487867171341L;
		/**
		 * 圈子组织的corpId，圈子归属组织必须是isv组织
		 */
		@ApiField("circle_corp_id")
		private String circleCorpId;
	
		public String getCircleCorpId() {
			return this.circleCorpId;
		}
		public void setCircleCorpId(String circleCorpId) {
			this.circleCorpId = circleCorpId;
		}
	}
	

}