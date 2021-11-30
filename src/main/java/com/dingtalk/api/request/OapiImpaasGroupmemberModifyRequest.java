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
import com.dingtalk.api.response.OapiImpaasGroupmemberModifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.groupmember.modify request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasGroupmemberModifyRequest extends BaseTaobaoRequest<OapiImpaasGroupmemberModifyResponse> {
	
	

	/** 
	* 修改群成员列表入参
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
		return "dingtalk.oapi.impaas.groupmember.modify";
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

	public Class<OapiImpaasGroupmemberModifyResponse> getResponseClass() {
		return OapiImpaasGroupmemberModifyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 待操作成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseGroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 7234361412312357728L;
		/**
		 * 待操作成员id，ID类型由type字段确定。当type为“staff”时，本字段填写staffid，当type为“channelUser”时，本字段填写channelUserId。
		 */
		@ApiField("id")
		private String id;
		/**
		 * 代操作成员ID类型，目前支持“staff” “channelUser”两种类型
		 */
		@ApiField("type")
		private String type;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 修改群成员列表入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMemberListModifyRequest extends TaobaoObject {
		private static final long serialVersionUID = 7242997814179984228L;
		/**
		 * 接入方channel信息，该值由接入方接入IMPaaS平台时，向IMPaaS平台申请，例如“hema”“eleme”等。
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 群ID，由创建群接口返回。
		 */
		@ApiField("chatid")
		private String chatid;
		/**
		 * 待操作成员列表
		 */
		@ApiListField("member_list")
		@ApiField("base_group_member_info")
		private List<BaseGroupMemberInfo> memberList;
		/**
		 * 该参数表示本次请求的操作类型，“1”表示添加成员，“2”表示删除成员。
		 */
		@ApiField("modify_type")
		private String modifyType;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getChatid() {
			return this.chatid;
		}
		public void setChatid(String chatid) {
			this.chatid = chatid;
		}
		public List<BaseGroupMemberInfo> getMemberList() {
			return this.memberList;
		}
		public void setMemberList(List<BaseGroupMemberInfo> memberList) {
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