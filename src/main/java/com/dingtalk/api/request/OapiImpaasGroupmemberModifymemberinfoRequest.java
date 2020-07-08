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
import com.dingtalk.api.response.OapiImpaasGroupmemberModifymemberinfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.groupmember.modifymemberinfo request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasGroupmemberModifymemberinfoRequest extends BaseTaobaoRequest<OapiImpaasGroupmemberModifymemberinfoResponse> {
	
	

	/** 
	* 请求信息
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(ModifyGroupMemberInfoRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.groupmember.modifymemberinfo";
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

	public Class<OapiImpaasGroupmemberModifymemberinfoResponse> getResponseClass() {
		return OapiImpaasGroupmemberModifymemberinfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 要修改的成员信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 8277138767193711459L;
		/**
		 * 成员扩展属性，业务可以自定义，目前最大支持256B
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 账号ID，类型由type字段决定
		 */
		@ApiField("id")
		private String id;
		/**
		 * 用户昵称，要修改到的值
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 账号ID类型，当type=staff时，id填写staffid，当type=channelUser时，id字段填写channelUserId
		 */
		@ApiField("type")
		private String type;
	
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 请求信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ModifyGroupMemberInfoRequest extends TaobaoObject {
		private static final long serialVersionUID = 2789916478345748551L;
		/**
		 * 群ID
		 */
		@ApiField("chatid")
		private String chatid;
		/**
		 * 要修改的成员信息
		 */
		@ApiField("member_info")
		private GroupMemberInfo memberInfo;
	
		public String getChatid() {
			return this.chatid;
		}
		public void setChatid(String chatid) {
			this.chatid = chatid;
		}
		public GroupMemberInfo getMemberInfo() {
			return this.memberInfo;
		}
		public void setMemberInfo(GroupMemberInfo memberInfo) {
			this.memberInfo = memberInfo;
		}
	}
	

}