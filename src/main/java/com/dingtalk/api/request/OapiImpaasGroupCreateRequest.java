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
import com.dingtalk.api.response.OapiImpaasGroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.group.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasGroupCreateRequest extends BaseTaobaoRequest<OapiImpaasGroupCreateResponse> {
	
	

	/** 
	* 创建群请求对象
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(CreateGroupRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.group.create";
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

	public Class<OapiImpaasGroupCreateResponse> getResponseClass() {
		return OapiImpaasGroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 创建者
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseGroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 5168553336954566139L;
		/**
		 * 创建者账号ID，类型由type字段决定
		 */
		@ApiField("id")
		private String id;
		/**
		 * 账号ID类型，当type=staff时，id填写staffid，当type=channelUser时，id字段填写channelUserId
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
	 * 创建群请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateGroupRequest extends TaobaoObject {
		private static final long serialVersionUID = 3468817596871813314L;
		/**
		 * 接入方channel信息，该值由接入方接入IMPaaS平台时，向IMPaaS平台申请，例如“hema”“eleme”等。
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 创建者
		 */
		@ApiField("creater")
		private BaseGroupMemberInfo creater;
		/**
		 * 二级会话入口ID
		 */
		@ApiField("entrance_id")
		private Long entranceId;
		/**
		 * 扩展数据,业务可以自定义，目前最大支持256B
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 群成员列表
		 */
		@ApiListField("member_list")
		@ApiField("base_group_member_info")
		private List<BaseGroupMemberInfo> memberList;
		/**
		 * 群名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 新人进群是否能查看最近100条记录。0:不能；1:可以查看最近100条记录；不填默认为0
		 */
		@ApiField("show_history_type")
		private Long showHistoryType;
		/**
		 * 群类型,目前没有使用，填0即可
		 */
		@ApiField("type")
		private Long type;
		/**
		 * uuid, 用于防止弱网情况下超时导致重复创建, 一分钟内传递相同的uuid会返回同一个群，传空则不去重
		 */
		@ApiField("uuid")
		private String uuid;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public BaseGroupMemberInfo getCreater() {
			return this.creater;
		}
		public void setCreater(BaseGroupMemberInfo creater) {
			this.creater = creater;
		}
		public Long getEntranceId() {
			return this.entranceId;
		}
		public void setEntranceId(Long entranceId) {
			this.entranceId = entranceId;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public List<BaseGroupMemberInfo> getMemberList() {
			return this.memberList;
		}
		public void setMemberList(List<BaseGroupMemberInfo> memberList) {
			this.memberList = memberList;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getShowHistoryType() {
			return this.showHistoryType;
		}
		public void setShowHistoryType(Long showHistoryType) {
			this.showHistoryType = showHistoryType;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	

}