package com.dingtalk.api.request;

import java.util.List;
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
import com.dingtalk.api.response.OapiSmartworkHrmNavigationbarConfigGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.navigationbar.config.get request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.19
 */
public class OapiSmartworkHrmNavigationbarConfigGetRequest extends BaseTaobaoRequest<OapiSmartworkHrmNavigationbarConfigGetResponse> {
	
	

	/** 
	* isv变更导航栏属性
	 */
	private String changeParam;

	/** 
	* 基础导航了类型，枚举值, "pc"-PC端, "oa"-OA端
	 */
	private String type;

	/** 
	* 导航栏访问员工ID
	 */
	private String userid;

	public void setChangeParam(String changeParam) {
		this.changeParam = changeParam;
	}

	public void setChangeParam(List<HrmNavChangeVo> changeParam) {
		this.changeParam = new JSONWriter(false,false,true).write(changeParam);
	}

	public String getChangeParam() {
		return this.changeParam;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.navigationbar.config.get";
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
		txtParams.put("change_param", this.changeParam);
		txtParams.put("type", this.type);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmNavigationbarConfigGetResponse> getResponseClass() {
		return OapiSmartworkHrmNavigationbarConfigGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(changeParam, 20, "changeParam");
		RequestCheckUtils.checkNotEmpty(type, "type");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	
	/**
	 * isv变更导航栏属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HrmNavChangeVo extends TaobaoObject {
		private static final long serialVersionUID = 5312439178298347218L;
		/**
		 * 变更的节点code
		 */
		@ApiField("code")
		private String code;
		/**
		 * 变更的链接
		 */
		@ApiField("url")
		private String url;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	

}