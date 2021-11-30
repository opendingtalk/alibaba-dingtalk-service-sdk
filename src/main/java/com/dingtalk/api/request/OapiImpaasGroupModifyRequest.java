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
import com.dingtalk.api.response.OapiImpaasGroupModifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.group.modify request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasGroupModifyRequest extends BaseTaobaoRequest<OapiImpaasGroupModifyResponse> {
	
	

	/** 
	* 请求入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GroupInfoModifyRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.group.modify";
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

	public Class<OapiImpaasGroupModifyResponse> getResponseClass() {
		return OapiImpaasGroupModifyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 修改后的群主，若为空或与当前群主相同，则不会对群主进行变更操作。
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseGroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 5274998382866651368L;
		/**
		 * 修改后的群主ID，ID类型由type字段决定
		 */
		@ApiField("id")
		private String id;
		/**
		 * ID类型，当type=staff时，id填写staffid，当type=channelUser时，id字段填写channelUserId
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
	 * 请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupInfoModifyRequest extends TaobaoObject {
		private static final long serialVersionUID = 2769557414722293393L;
		/**
		 * 群ID，由创建群接口返回
		 */
		@ApiField("chatid")
		private String chatid;
		/**
		 * 修改后的群名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 修改后的群主，若为空或与当前群主相同，则不会对群主进行变更操作。
		 */
		@ApiField("group_owner")
		private BaseGroupMemberInfo groupOwner;
		/**
		 * 新人进群是否能查看最近100条记录。0:不能；1:可以查看最近100条记录；不填默认为0
		 */
		@ApiField("show_history_type")
		private Long showHistoryType;
	
		public String getChatid() {
			return this.chatid;
		}
		public void setChatid(String chatid) {
			this.chatid = chatid;
		}
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public BaseGroupMemberInfo getGroupOwner() {
			return this.groupOwner;
		}
		public void setGroupOwner(BaseGroupMemberInfo groupOwner) {
			this.groupOwner = groupOwner;
		}
		public Long getShowHistoryType() {
			return this.showHistoryType;
		}
		public void setShowHistoryType(Long showHistoryType) {
			this.showHistoryType = showHistoryType;
		}
	}
	

}