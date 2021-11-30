package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiSmartbotMsgPushResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartbot.msg.push request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.19
 */
public class OapiSmartbotMsgPushRequest extends BaseTaobaoRequest<OapiSmartbotMsgPushResponse> {
	
	

	/** 
	* 接收者的会话chatid列表
	 */
	private String chatIdList;

	/** 
	* 消息体，具体见文档
	 */
	private String msg;

	/** 
	* 是否发送给企业全部用户，”true“则忽略用户列表和会话列表
	 */
	private Boolean toAllUser;

	/** 
	* 接收者的用户userid列表
	 */
	private String userIdList;

	public void setChatIdList(String chatIdList) {
		this.chatIdList = chatIdList;
	}

	public String getChatIdList() {
		return this.chatIdList;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setMsg(Msg msg) {
		this.msg = new JSONWriter(false,false,true).write(msg);
	}

	public String getMsg() {
		return this.msg;
	}

	public void setToAllUser(Boolean toAllUser) {
		this.toAllUser = toAllUser;
	}

	public Boolean getToAllUser() {
		return this.toAllUser;
	}

	public void setUserIdList(String userIdList) {
		this.userIdList = userIdList;
	}

	public String getUserIdList() {
		return this.userIdList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartbot.msg.push";
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
		txtParams.put("chat_id_list", this.chatIdList);
		txtParams.put("msg", this.msg);
		txtParams.put("to_all_user", this.toAllUser);
		txtParams.put("user_id_list", this.userIdList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartbotMsgPushResponse> getResponseClass() {
		return OapiSmartbotMsgPushResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(chatIdList, 500, "chatIdList");
		RequestCheckUtils.checkMaxListSize(userIdList, 5000, "userIdList");
	}
	
	/**
	 * 文本消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Text extends TaobaoObject {
		private static final long serialVersionUID = 5579455748799757166L;
		/**
		 * 文本消息
		 */
		@ApiField("content")
		private String content;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
	}
	
	/**
	 * markdown消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Markdown extends TaobaoObject {
		private static final long serialVersionUID = 8414756518855296431L;
		/**
		 * markdown格式的消息，建议500字符以内
		 */
		@ApiField("text")
		private String text;
		/**
		 * 首屏会话透出的展示内容
		 */
		@ApiField("title")
		private String title;
	
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BtnJson extends TaobaoObject {
		private static final long serialVersionUID = 3844977748296742371L;
		/**
		 * 消息点击链接地址，当发送消息为小程序时支持小程序跳转链接，最长500个字符
		 */
		@ApiField("action_url")
		private String actionUrl;
		/**
		 * 使用独立跳转ActionCard样式时的按钮的标题，最长20个字符
		 */
		@ApiField("title")
		private String title;
	
		public String getActionUrl() {
			return this.actionUrl;
		}
		public void setActionUrl(String actionUrl) {
			this.actionUrl = actionUrl;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 卡片消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ActionCard extends TaobaoObject {
		private static final long serialVersionUID = 3187639536475683855L;
		/**
		 * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置
		 */
		@ApiListField("btn_json_list")
		@ApiField("btn_json")
		private List<BtnJson> btnJsonList;
		/**
		 * 使用独立跳转ActionCard样式时的按钮排列方式，竖直排列(0)，横向排列(1)；必须与btn_json_list同时设置
		 */
		@ApiField("btn_orientation")
		private String btnOrientation;
		/**
		 * 消息内容，支持markdown，语法参考标准markdown语法。建议1000个字符以内
		 */
		@ApiField("markdown")
		private String markdown;
		/**
		 * 使用整体跳转ActionCard样式时的标题，必须与single_url同时设置，最长20个字符
		 */
		@ApiField("single_title")
		private String singleTitle;
		/**
		 * 消息点击链接地址，当发送消息为小程序时支持小程序跳转链接，最长500个字符
		 */
		@ApiField("single_url")
		private String singleUrl;
		/**
		 * 透出到会话列表和通知的文案，最长64个字符
		 */
		@ApiField("title")
		private String title;
	
		public List<BtnJson> getBtnJsonList() {
			return this.btnJsonList;
		}
		public void setBtnJsonList(List<BtnJson> btnJsonList) {
			this.btnJsonList = btnJsonList;
		}
		public String getBtnOrientation() {
			return this.btnOrientation;
		}
		public void setBtnOrientation(String btnOrientation) {
			this.btnOrientation = btnOrientation;
		}
		public String getMarkdown() {
			return this.markdown;
		}
		public void setMarkdown(String markdown) {
			this.markdown = markdown;
		}
		public String getSingleTitle() {
			return this.singleTitle;
		}
		public void setSingleTitle(String singleTitle) {
			this.singleTitle = singleTitle;
		}
		public String getSingleUrl() {
			return this.singleUrl;
		}
		public void setSingleUrl(String singleUrl) {
			this.singleUrl = singleUrl;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 消息体，具体见文档
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Msg extends TaobaoObject {
		private static final long serialVersionUID = 8112559617323223216L;
		/**
		 * 卡片消息
		 */
		@ApiField("action_card")
		private ActionCard actionCard;
		/**
		 * markdown消息
		 */
		@ApiField("markdown")
		private Markdown markdown;
		/**
		 * 消息类型
		 */
		@ApiField("msgtype")
		private String msgtype;
		/**
		 * 文本消息
		 */
		@ApiField("text")
		private Text text;
	
		public ActionCard getActionCard() {
			return this.actionCard;
		}
		public void setActionCard(ActionCard actionCard) {
			this.actionCard = actionCard;
		}
		public Markdown getMarkdown() {
			return this.markdown;
		}
		public void setMarkdown(Markdown markdown) {
			this.markdown = markdown;
		}
		public String getMsgtype() {
			return this.msgtype;
		}
		public void setMsgtype(String msgtype) {
			this.msgtype = msgtype;
		}
		public Text getText() {
			return this.text;
		}
		public void setText(Text text) {
			this.text = text;
		}
	}
	

}