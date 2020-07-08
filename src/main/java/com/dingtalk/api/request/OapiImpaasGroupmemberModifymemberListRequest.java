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
import com.dingtalk.api.response.OapiImpaasGroupmemberModifymemberListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.groupmember.modifymemberList request
 * 
 * @author top auto create
 * @since 1.0, 2019.03.13
 */
public class OapiImpaasGroupmemberModifymemberListRequest extends BaseTaobaoRequest<OapiImpaasGroupmemberModifymemberListResponse> {
	
	

	/** 
	* 修改群成员请求入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GroupMemberListModifyRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.groupmember.modifymemberList";
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

	public Class<OapiImpaasGroupmemberModifymemberListResponse> getResponseClass() {
		return OapiImpaasGroupmemberModifymemberListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 修改群成员请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMemberListModifyRequest extends TaobaoObject {
		private static final long serialVersionUID = 7274818752472456255L;
		/**
		 * 渠道信息taobao hema等
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 会话id
		 */
		@ApiField("cid")
		private String cid;
		/**
		 * 本次操作的成员列表
		 */
		@ApiListField("member_list")
		@ApiField("json")
		private List<String> memberList;
		/**
		 * 修改类型
		 */
		@ApiField("modify_type")
		private String modifyType;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getCid() {
			return this.cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public List<String> getMemberList() {
			return this.memberList;
		}
		public void setMemberList(List<String> memberList) {
			this.memberList = memberList;
		}
		public String getModifyType() {
			return this.modifyType;
		}
		public void setModifyType(String modifyType) {
			this.modifyType = modifyType;
		}
	}
	

}