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
import com.dingtalk.api.response.OapiProjectInviteDataQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.project.invite.data.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.28
 */
public class OapiProjectInviteDataQueryRequest extends BaseTaobaoRequest<OapiProjectInviteDataQueryResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String inviteDataQuery;

	public void setInviteDataQuery(String inviteDataQuery) {
		this.inviteDataQuery = inviteDataQuery;
	}

	public void setInviteDataQuery(InviteDataQuery inviteDataQuery) {
		this.inviteDataQuery = new JSONWriter(false,false,true).write(inviteDataQuery);
	}

	public String getInviteDataQuery() {
		return this.inviteDataQuery;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.project.invite.data.query";
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
		txtParams.put("invite_data_query", this.inviteDataQuery);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProjectInviteDataQueryResponse> getResponseClass() {
		return OapiProjectInviteDataQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InviteDataQuery extends TaobaoObject {
		private static final long serialVersionUID = 7687544362612591225L;
		/**
		 * 数据游标，初始传0。后续传入返回参数中的next_cursor值
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 每次查询数据量，最大100
		 */
		@ApiField("size")
		private Long size;
		/**
		 * 状态0:无效（包括过程数据），1:有效(默认)，不传表示查询全部
		 */
		@ApiField("status")
		private Long status;
	
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	

}