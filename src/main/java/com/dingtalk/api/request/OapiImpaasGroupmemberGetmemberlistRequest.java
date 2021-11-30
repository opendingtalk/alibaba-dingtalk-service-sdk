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
import com.dingtalk.api.response.OapiImpaasGroupmemberGetmemberlistResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.groupmember.getmemberlist request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasGroupmemberGetmemberlistRequest extends BaseTaobaoRequest<OapiImpaasGroupmemberGetmemberlistResponse> {
	
	

	/** 
	* 请求结构体
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GetGroupMemberListRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.groupmember.getmemberlist";
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

	public Class<OapiImpaasGroupmemberGetmemberlistResponse> getResponseClass() {
		return OapiImpaasGroupmemberGetmemberlistResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求结构体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetGroupMemberListRequest extends TaobaoObject {
		private static final long serialVersionUID = 5399576327324478297L;
		/**
		 * 群ID
		 */
		@ApiField("chatid")
		private String chatid;
		/**
		 * 本次请求返回的群成员列表数量
		 */
		@ApiField("length")
		private Long length;
		/**
		 * 群成员列表偏移
		 */
		@ApiField("offset")
		private Long offset;
	
		public String getChatid() {
			return this.chatid;
		}
		public void setChatid(String chatid) {
			this.chatid = chatid;
		}
		public Long getLength() {
			return this.length;
		}
		public void setLength(Long length) {
			this.length = length;
		}
		public Long getOffset() {
			return this.offset;
		}
		public void setOffset(Long offset) {
			this.offset = offset;
		}
	}
	

}