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
import com.dingtalk.api.response.OapiRobotSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.28
 */
public class OapiRobotSendRequest extends BaseTaobaoRequest<OapiRobotSendResponse> {
	
	

	/** 
	* 此消息类型为固定actionCard
	 */
	private String actionCard;

	/** 
	* 被@人的手机号
	 */
	private String at;

	/** 
	* 此消息类型为固定feedCard
	 */
	private String feedCard;

	/** 
	* 消息类型，此时固定为:link
	 */
	private String link;

	/** 
	* 此消息类型为固定markdown
	 */
	private String markdown;

	/** 
	* 消息类型
	 */
	private String msgtype;

	/** 
	* text类型
	 */
	private String text;

	public void setActionCard(String actionCard) {
		this.actionCard = actionCard;
	}

	public void setActionCard(Actioncard actionCard) {
		this.actionCard = new JSONWriter(false,false,true).write(actionCard);
	}

	public String getActionCard() {
		return this.actionCard;
	}

	public void setAt(String at) {
		this.at = at;
	}

	public void setAt(At at) {
		this.at = new JSONWriter(false,false,true).write(at);
	}

	public String getAt() {
		return this.at;
	}

	public void setFeedCard(String feedCard) {
		this.feedCard = feedCard;
	}

	public void setFeedCard(Feedcard feedCard) {
		this.feedCard = new JSONWriter(false,false,true).write(feedCard);
	}

	public String getFeedCard() {
		return this.feedCard;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setLink(Link link) {
		this.link = new JSONWriter(false,false,true).write(link);
	}

	public String getLink() {
		return this.link;
	}

	public void setMarkdown(String markdown) {
		this.markdown = markdown;
	}

	public void setMarkdown(Markdown markdown) {
		this.markdown = new JSONWriter(false,false,true).write(markdown);
	}

	public String getMarkdown() {
		return this.markdown;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getMsgtype() {
		return this.msgtype;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setText(Text text) {
		this.text = new JSONWriter(false,false,true).write(text);
	}

	public String getText() {
		return this.text;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.robot.send";
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
		txtParams.put("actionCard", this.actionCard);
		txtParams.put("at", this.at);
		txtParams.put("feedCard", this.feedCard);
		txtParams.put("link", this.link);
		txtParams.put("markdown", this.markdown);
		txtParams.put("msgtype", this.msgtype);
		txtParams.put("text", this.text);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRobotSendResponse> getResponseClass() {
		return OapiRobotSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(msgtype, "msgtype");
	}
	
	/**
	 * text类型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Text extends TaobaoObject {
		private static final long serialVersionUID = 2321535988963798236L;
		/**
		 * text类型
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
	 * 被@人的手机号
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class At extends TaobaoObject {
		private static final long serialVersionUID = 2337681671698293257L;
		/**
		 * 被@人的手机号
		 */
		@ApiListField("atMobiles")
		@ApiField("string")
		private List<String> atMobiles;
		/**
		 * @所有人时:true,否则为:false
		 */
		@ApiField("isAtAll")
		private Boolean isAtAll;
	
		public List<String> getAtMobiles() {
			return this.atMobiles;
		}
		public void setAtMobiles(List<String> atMobiles) {
			this.atMobiles = atMobiles;
		}
		public Boolean getIsAtAll() {
			return this.isAtAll;
		}
		public void setIsAtAll(Boolean isAtAll) {
			this.isAtAll = isAtAll;
		}
	}
	
	/**
	 * 消息类型，此时固定为:link
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Link extends TaobaoObject {
		private static final long serialVersionUID = 8174227413946785172L;
		/**
		 * 点击消息跳转的URL
		 */
		@ApiField("messageUrl")
		private String messageUrl;
		/**
		 * 图片URL
		 */
		@ApiField("picUrl")
		private String picUrl;
		/**
		 * 消息内容。如果太长只会部分展示
		 */
		@ApiField("text")
		private String text;
		/**
		 * 消息标题
		 */
		@ApiField("title")
		private String title;
	
		public String getMessageUrl() {
			return this.messageUrl;
		}
		public void setMessageUrl(String messageUrl) {
			this.messageUrl = messageUrl;
		}
		public String getPicUrl() {
			return this.picUrl;
		}
		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}
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
	 * 此消息类型为固定markdown
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Markdown extends TaobaoObject {
		private static final long serialVersionUID = 2745822811418684237L;
		/**
		 * markdown格式的消息
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
	 * 按钮的信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Btns extends TaobaoObject {
		private static final long serialVersionUID = 7266788722698969169L;
		/**
		 * 按钮方案，
		 */
		@ApiField("actionURL")
		private String actionURL;
		/**
		 * 点击按钮触发的URL此消息类型为固定feedCard
		 */
		@ApiField("title")
		private String title;
	
		public String getActionURL() {
			return this.actionURL;
		}
		public void setActionURL(String actionURL) {
			this.actionURL = actionURL;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 此消息类型为固定actionCard
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Actioncard extends TaobaoObject {
		private static final long serialVersionUID = 7686195773623675237L;
		/**
		 * 0-按钮竖直排列，1-按钮横向排列
		 */
		@ApiField("btnOrientation")
		private String btnOrientation;
		/**
		 * 按钮的信息
		 */
		@ApiListField("btns")
		@ApiField("btns")
		private List<Btns> btns;
		/**
		 * 0-正常发消息者头像,1-隐藏发消息者头像
		 */
		@ApiField("hideAvatar")
		private String hideAvatar;
		/**
		 * 单个按钮的方案。(设置此项和singleURL后btns无效。)
		 */
		@ApiField("singleTitle")
		private String singleTitle;
		/**
		 * 点击singleTitle按钮触发的URL
		 */
		@ApiField("singleURL")
		private String singleURL;
		/**
		 * markdown格式的消息
		 */
		@ApiField("text")
		private String text;
		/**
		 * 首屏会话透出的展示内容
		 */
		@ApiField("title")
		private String title;
	
		public String getBtnOrientation() {
			return this.btnOrientation;
		}
		public void setBtnOrientation(String btnOrientation) {
			this.btnOrientation = btnOrientation;
		}
		public List<Btns> getBtns() {
			return this.btns;
		}
		public void setBtns(List<Btns> btns) {
			this.btns = btns;
		}
		public String getHideAvatar() {
			return this.hideAvatar;
		}
		public void setHideAvatar(String hideAvatar) {
			this.hideAvatar = hideAvatar;
		}
		public String getSingleTitle() {
			return this.singleTitle;
		}
		public void setSingleTitle(String singleTitle) {
			this.singleTitle = singleTitle;
		}
		public String getSingleURL() {
			return this.singleURL;
		}
		public void setSingleURL(String singleURL) {
			this.singleURL = singleURL;
		}
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
	 * links
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Links extends TaobaoObject {
		private static final long serialVersionUID = 5548995959572914666L;
		/**
		 * 点击单条信息到跳转链接
		 */
		@ApiField("messageURL")
		private String messageURL;
		/**
		 * 单条信息文本
		 */
		@ApiField("picURL")
		private String picURL;
		/**
		 * 单条信息后面图片的URL
		 */
		@ApiField("title")
		private String title;
	
		public String getMessageURL() {
			return this.messageURL;
		}
		public void setMessageURL(String messageURL) {
			this.messageURL = messageURL;
		}
		public String getPicURL() {
			return this.picURL;
		}
		public void setPicURL(String picURL) {
			this.picURL = picURL;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 此消息类型为固定feedCard
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Feedcard extends TaobaoObject {
		private static final long serialVersionUID = 8699748237761367767L;
		/**
		 * links
		 */
		@ApiListField("links")
		@ApiField("links")
		private List<Links> links;
	
		public List<Links> getLinks() {
			return this.links;
		}
		public void setLinks(List<Links> links) {
			this.links = links;
		}
	}
	

}