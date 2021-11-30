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
import com.dingtalk.api.response.OapiWorkspaceCircleTagCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.circle.tag.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.06
 */
public class OapiWorkspaceCircleTagCreateRequest extends BaseTaobaoRequest<OapiWorkspaceCircleTagCreateResponse> {
	
	

	/** 
	* 请求
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(FvTagCreateOpenDto req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.circle.tag.create";
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
		txtParams.put("req", this.req);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceCircleTagCreateResponse> getResponseClass() {
		return OapiWorkspaceCircleTagCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvTagCreateOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 1712611388897456932L;
		/**
		 * 话题名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 用户在圈子或项目内的userId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}