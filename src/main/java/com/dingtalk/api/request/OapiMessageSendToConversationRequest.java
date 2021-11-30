package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
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
import com.dingtalk.api.response.OapiMessageSendToConversationResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.send_to_conversation request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.16
 */
public class OapiMessageSendToConversationRequest extends BaseTaobaoRequest<OapiMessageSendToConversationResponse> {
	
	

	/** 
	* ActionCard消息
	 */
	private String actionCard;

	/** 
	* 群消息或者个人聊天会话Id，(通过JSAPI之pickConversation接口唤起联系人界面选择之后即可拿到会话ID，之后您可以使用获取到的cid调用此接口）
	 */
	private String cid;

	/** 
	* file消息
	 */
	private String file;

	/** 
	* image消息
	 */
	private String image;

	/** 
	* link消息
	 */
	private String link;

	/** 
	* markdown消息
	 */
	private String markdown;

	/** 
	* 消息内容
	 */
	private String msg;

	/** 
	* 消息类型
	 */
	private String msgtype;

	/** 
	* OA消息
	 */
	private String oa;

	/** 
	* 消息发送者员工ID
	 */
	private String sender;

	/** 
	* text消息
	 */
	private String text;

	/** 
	* voice消息
	 */
	private String voice;

	public void setActionCard(String actionCard) {
		this.actionCard = actionCard;
	}

	public void setActionCard(ActionCard actionCard) {
		this.actionCard = new JSONWriter(false,false,true).write(actionCard);
	}

	public String getActionCard() {
		return this.actionCard;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCid() {
		return this.cid;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public void setFile(File file) {
		this.file = new JSONWriter(false,false,true).write(file);
	}

	public String getFile() {
		return this.file;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setImage(Image image) {
		this.image = new JSONWriter(false,false,true).write(image);
	}

	public String getImage() {
		return this.image;
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

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setMsg(Msg msg) {
		this.msg = new JSONWriter(false,false,true).write(msg);
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getMsgtype() {
		return this.msgtype;
	}

	public void setOa(String oa) {
		this.oa = oa;
	}

	public void setOa(Oa oa) {
		this.oa = new JSONWriter(false,false,true).write(oa);
	}

	public String getOa() {
		return this.oa;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSender() {
		return this.sender;
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

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public void setVoice(Voice voice) {
		this.voice = new JSONWriter(false,false,true).write(voice);
	}

	public String getVoice() {
		return this.voice;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.send_to_conversation";
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
		txtParams.put("action_card", this.actionCard);
		txtParams.put("cid", this.cid);
		txtParams.put("file", this.file);
		txtParams.put("image", this.image);
		txtParams.put("link", this.link);
		txtParams.put("markdown", this.markdown);
		txtParams.put("msg", this.msg);
		txtParams.put("msgtype", this.msgtype);
		txtParams.put("oa", this.oa);
		txtParams.put("sender", this.sender);
		txtParams.put("text", this.text);
		txtParams.put("voice", this.voice);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageSendToConversationResponse> getResponseClass() {
		return OapiMessageSendToConversationResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * markdown消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Markdown extends TaobaoObject {
		private static final long serialVersionUID = 1276456459587559319L;
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
	 * 消息体的表单，最多显示6个，超过会被隐藏
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Form extends TaobaoObject {
		private static final long serialVersionUID = 2822162849549532822L;
		/**
		 * 消息体的关键字对应的值
		 */
		@ApiField("key")
		private String key;
		/**
		 * 消息体的关键字
		 */
		@ApiField("value")
		private String value;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 单行富文本信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Rich extends TaobaoObject {
		private static final long serialVersionUID = 7499672455814478635L;
		/**
		 * 单行富文本信息的数目
		 */
		@ApiField("num")
		private String num;
		/**
		 * 单行富文本信息的单位
		 */
		@ApiField("unit")
		private String unit;
	
		public String getNum() {
			return this.num;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 消息体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Body extends TaobaoObject {
		private static final long serialVersionUID = 5399858925381713218L;
		/**
		 * 自定义的作者名字
		 */
		@ApiField("author")
		private String author;
		/**
		 * 消息体的内容，最多显示3行
		 */
		@ApiField("content")
		private String content;
		/**
		 * 自定义的附件数目。此数字仅供显示，钉钉不作验证
		 */
		@ApiField("file_count")
		private String fileCount;
		/**
		 * 消息体的表单，最多显示6个，超过会被隐藏
		 */
		@ApiListField("form")
		@ApiField("form")
		private List<Form> form;
		/**
		 * 消息体中的图片，支持图片资源@mediaId
		 */
		@ApiField("image")
		private String image;
		/**
		 * 单行富文本信息
		 */
		@ApiField("rich")
		private Rich rich;
		/**
		 * 消息体的标题，建议50个字符以内
		 */
		@ApiField("title")
		private String title;
	
		public String getAuthor() {
			return this.author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getFileCount() {
			return this.fileCount;
		}
		public void setFileCount(String fileCount) {
			this.fileCount = fileCount;
		}
		public List<Form> getForm() {
			return this.form;
		}
		public void setForm(List<Form> form) {
			this.form = form;
		}
		public String getImage() {
			return this.image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public Rich getRich() {
			return this.rich;
		}
		public void setRich(Rich rich) {
			this.rich = rich;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 消息头部内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Head extends TaobaoObject {
		private static final long serialVersionUID = 1143859118559452425L;
		/**
		 * 消息头部的背景颜色。长度限制为8个英文字符，其中前2为表示透明度，后6位表示颜色值。不要添加0x
		 */
		@ApiField("bgcolor")
		private String bgcolor;
		/**
		 * 消息的头部标题 (向普通会话发送时有效，向企业会话发送时会被替换为微应用的名字)，长度限制为最多10个字符
		 */
		@ApiField("text")
		private String text;
	
		public String getBgcolor() {
			return this.bgcolor;
		}
		public void setBgcolor(String bgcolor) {
			this.bgcolor = bgcolor;
		}
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
	}
	
	/**
	 * OA消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Oa extends TaobaoObject {
		private static final long serialVersionUID = 4229154215614733426L;
		/**
		 * 消息体
		 */
		@ApiField("body")
		private Body body;
		/**
		 * 消息头部内容
		 */
		@ApiField("head")
		private Head head;
		/**
		 * 客户端点击消息时跳转到的H5地址
		 */
		@ApiField("message_url")
		private String messageUrl;
		/**
		 * PC端点击消息时跳转到的地址
		 */
		@ApiField("pc_message_url")
		private String pcMessageUrl;
	
		public Body getBody() {
			return this.body;
		}
		public void setBody(Body body) {
			this.body = body;
		}
		public Head getHead() {
			return this.head;
		}
		public void setHead(Head head) {
			this.head = head;
		}
		public String getMessageUrl() {
			return this.messageUrl;
		}
		public void setMessageUrl(String messageUrl) {
			this.messageUrl = messageUrl;
		}
		public void setMessageUrlString(String messageUrl) {
			this.messageUrl = messageUrl;
		}
		
		public String getPcMessageUrl() {
			return this.pcMessageUrl;
		}
		public void setPcMessageUrl(String pcMessageUrl) {
			this.pcMessageUrl = pcMessageUrl;
		}
	}
	
	/**
	 * voice消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Voice extends TaobaoObject {
		private static final long serialVersionUID = 8349525836476892991L;
		/**
		 * 语音时长
		 */
		@ApiField("duration")
		private Long duration;
		/**
		 * 语音媒体文件id，可以调用上传媒体文件接口获取。2MB，播放长度不超过60s，AMR格式
		 */
		@ApiField("media_id")
		private String mediaId;
	
		public Long getDuration() {
			return this.duration;
		}
		public void setDuration(Long duration) {
			this.duration = duration;
		}
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
	}
	
	/**
	 * file消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class File extends TaobaoObject {
		private static final long serialVersionUID = 1229594594724528954L;
		/**
		 * 媒体文件id，可以调用上传媒体文件接口获取。10MB
		 */
		@ApiField("media_id")
		private String mediaId;
	
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
	}
	
	/**
	 * link消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Link extends TaobaoObject {
		private static final long serialVersionUID = 3829287166299118328L;
		/**
		 * 消息点击链接地址
		 */
		@ApiField("messageUrl")
		private String messageUrl;
		/**
		 * 图片媒体文件id，可以调用上传媒体文件接口获取
		 */
		@ApiField("picUrl")
		private String picUrl;
		/**
		 * 消息描述
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
	 * image消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Image extends TaobaoObject {
		private static final long serialVersionUID = 6763334848451628355L;
		/**
		 * 图片媒体文件id，可以调用上传媒体文件接口获取。建议宽600像素 x 400像素，宽高比3：2
		 */
		@ApiField("media_id")
		private String mediaId;
	
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
	}
	
	/**
	 * text消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Text extends TaobaoObject {
		private static final long serialVersionUID = 6653618479266363819L;
		/**
		 * 消息内容
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
	 * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BtnJson extends TaobaoObject {
		private static final long serialVersionUID = 5732487245319312625L;
		/**
		 * 使用独立跳转ActionCard样式时的按钮的链接url
		 */
		@ApiField("action_url")
		private String actionUrl;
		/**
		 * 使用独立跳转ActionCard样式时的按钮的标题
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
	 * ActionCard消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ActionCard extends TaobaoObject {
		private static final long serialVersionUID = 6167238534935344643L;
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
		 * 消息内容，支持markdown，语法参考标准markdown语法。图片举例：![alt text](mediaId)
		 */
		@ApiField("markdown")
		private String markdown;
		/**
		 * 使用整体跳转ActionCard样式时的标题，必须与single_url同时设置
		 */
		@ApiField("single_title")
		private String singleTitle;
		/**
		 * 使用整体跳转ActionCard样式时的链接url，必须与single_title同时设置
		 */
		@ApiField("single_url")
		private String singleUrl;
		/**
		 * 透出到会话列表和通知的文案
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
	 * 消息内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Msg extends TaobaoObject {
		private static final long serialVersionUID = 1256635569779341392L;
		/**
		 * 消息内容，支持markdown，语法参考标准markdown语法。图片举例：![alt text](mediaId)
		 */
		@ApiField("action_card")
		private ActionCard actionCard;
		/**
		 * 文件消息
		 */
		@ApiField("file")
		private File file;
		/**
		 * 图片消息
		 */
		@ApiField("image")
		private Image image;
		/**
		 * 链接消息
		 */
		@ApiField("link")
		private Link link;
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
		 * oa消息
		 */
		@ApiField("oa")
		private Oa oa;
		/**
		 * 文本消息
		 */
		@ApiField("text")
		private Text text;
		/**
		 * 语音消息
		 */
		@ApiField("voice")
		private Voice voice;
	
		public ActionCard getActionCard() {
			return this.actionCard;
		}
		public void setActionCard(ActionCard actionCard) {
			this.actionCard = actionCard;
		}
		public File getFile() {
			return this.file;
		}
		public void setFile(File file) {
			this.file = file;
		}
		public Image getImage() {
			return this.image;
		}
		public void setImage(Image image) {
			this.image = image;
		}
		public Link getLink() {
			return this.link;
		}
		public void setLink(Link link) {
			this.link = link;
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
		public Oa getOa() {
			return this.oa;
		}
		public void setOa(Oa oa) {
			this.oa = oa;
		}
		public Text getText() {
			return this.text;
		}
		public void setText(Text text) {
			this.text = text;
		}
		public Voice getVoice() {
			return this.voice;
		}
		public void setVoice(Voice voice) {
			this.voice = voice;
		}
	}
	

}