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
import com.dingtalk.api.response.OapiCrmAppCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.app.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.24
 */
public class OapiCrmAppCreateRequest extends BaseTaobaoRequest<OapiCrmAppCreateResponse> {
	
	

	/** 
	* 创建应用入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(CreateCrmMicroAppRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.app.create";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCrmAppCreateResponse> getResponseClass() {
		return OapiCrmAppCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 创建应用入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateCrmMicroAppRequest extends TaobaoObject {
		private static final long serialVersionUID = 3874361363189329325L;
		/**
		 * app_desc
		 */
		@ApiField("app_desc")
		private String appDesc;
		/**
		 * app_icon
		 */
		@ApiField("app_icon")
		private String appIcon;
		/**
		 * biz_key
		 */
		@ApiField("biz_key")
		private String bizKey;
		/**
		 * homepage
		 */
		@ApiField("homepage")
		private String homepage;
		/**
		 * ip_white_list
		 */
		@ApiField("ip_white_list")
		private String ipWhiteList;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * pc_homepage
		 */
		@ApiField("pc_homepage")
		private String pcHomepage;
	
		public String getAppDesc() {
			return this.appDesc;
		}
		public void setAppDesc(String appDesc) {
			this.appDesc = appDesc;
		}
		public String getAppIcon() {
			return this.appIcon;
		}
		public void setAppIcon(String appIcon) {
			this.appIcon = appIcon;
		}
		public String getBizKey() {
			return this.bizKey;
		}
		public void setBizKey(String bizKey) {
			this.bizKey = bizKey;
		}
		public String getHomepage() {
			return this.homepage;
		}
		public void setHomepage(String homepage) {
			this.homepage = homepage;
		}
		public String getIpWhiteList() {
			return this.ipWhiteList;
		}
		public void setIpWhiteList(String ipWhiteList) {
			this.ipWhiteList = ipWhiteList;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPcHomepage() {
			return this.pcHomepage;
		}
		public void setPcHomepage(String pcHomepage) {
			this.pcHomepage = pcHomepage;
		}
	}
	

}