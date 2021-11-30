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
import com.dingtalk.api.response.OapiMessageMassSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.mass.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.23
 */
public class OapiMessageMassSendRequest extends BaseTaobaoRequest<OapiMessageMassSendResponse> {
	
	

	/** 
	* 接收者的部门id列表，接收者是部门id下(包括子部门下)的所有用户
	 */
	private String depIdList;

	/** 
	* 是否预览推送
	 */
	private Boolean isPreview;

	/** 
	* 是否群发给所有订阅者，true-是，false-否
	 */
	private Boolean isToAll;

	/** 
	* 消息卡片素材id
	 */
	private String mediaId;

	/** 
	* 消息体
	 */
	private String msgBody;

	/** 
	* msg_type, 消息类型：text，文本类型，此时文本内容填在text_content字段中；news_card，消息卡片，此时的media_id通过消息卡片上传接口得到； image，图片，此时的media_id通过图片上传接口得到
	 */
	private String msgType;

	/** 
	* 文本内容，当msg_type为text时有效
	 */
	private String textContent;

	/** 
	* 服务号的unionid
	 */
	private String unionid;

	/** 
	* 接收者的用户userid列表
	 */
	private String useridList;

	/** 
	* 调用时填写随机生成的UUID, 防止消息重复发送
	 */
	private String uuid;

	public void setDepIdList(String depIdList) {
		this.depIdList = depIdList;
	}

	public String getDepIdList() {
		return this.depIdList;
	}

	public void setIsPreview(Boolean isPreview) {
		this.isPreview = isPreview;
	}

	public Boolean getIsPreview() {
		return this.isPreview;
	}

	public void setIsToAll(Boolean isToAll) {
		this.isToAll = isToAll;
	}

	public Boolean getIsToAll() {
		return this.isToAll;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}

	public void setMsgBody(MessageBody msgBody) {
		this.msgBody = new JSONWriter(false,false,true).write(msgBody);
	}

	public String getMsgBody() {
		return this.msgBody;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getTextContent() {
		return this.textContent;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUuid() {
		return this.uuid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.mass.send";
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
		txtParams.put("dep_id_list", this.depIdList);
		txtParams.put("is_preview", this.isPreview);
		txtParams.put("is_to_all", this.isToAll);
		txtParams.put("media_id", this.mediaId);
		txtParams.put("msg_body", this.msgBody);
		txtParams.put("msg_type", this.msgType);
		txtParams.put("text_content", this.textContent);
		txtParams.put("unionid", this.unionid);
		txtParams.put("userid_list", this.useridList);
		txtParams.put("uuid", this.uuid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageMassSendResponse> getResponseClass() {
		return OapiMessageMassSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(depIdList, 2000, "depIdList");
		RequestCheckUtils.checkNotEmpty(isToAll, "isToAll");
		RequestCheckUtils.checkMaxLength(mediaId, 256, "mediaId");
		RequestCheckUtils.checkNotEmpty(msgType, "msgType");
		RequestCheckUtils.checkMaxLength(msgType, 32, "msgType");
		RequestCheckUtils.checkMaxLength(textContent, 65535, "textContent");
		RequestCheckUtils.checkNotEmpty(unionid, "unionid");
		RequestCheckUtils.checkMaxLength(unionid, 128, "unionid");
		RequestCheckUtils.checkMaxListSize(useridList, 10000, "useridList");
		RequestCheckUtils.checkNotEmpty(uuid, "uuid");
		RequestCheckUtils.checkMaxLength(uuid, 128, "uuid");
	}
	
	/**
	 * 语音消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Voice extends TaobaoObject {
		private static final long serialVersionUID = 5411973593512478133L;
		/**
		 * 正整数，小于60，表示音频时长
		 */
		@ApiField("duration")
		private Long duration;
		/**
		 * 媒体文件id。2MB，播放长度不超过60s，AMR格式
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
	 * 消息头部内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Head extends TaobaoObject {
		private static final long serialVersionUID = 8231163945257685448L;
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
	 * 消息体的表单，最多显示6个，超过会被隐藏
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormItem extends TaobaoObject {
		private static final long serialVersionUID = 8253725952977576383L;
		/**
		 * 消息体的关键字
		 */
		@ApiField("key")
		private String key;
		/**
		 * 消息体的关键字对应的值
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
	public static class RichText extends TaobaoObject {
		private static final long serialVersionUID = 7383341166538745466L;
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
		private static final long serialVersionUID = 3832874945839792858L;
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
		private Long fileCount;
		/**
		 * 消息体的表单，最多显示6个，超过会被隐藏
		 */
		@ApiListField("form")
		@ApiField("form_item")
		private List<FormItem> form;
		/**
		 * 消息体中的图片，支持图片资源@mediaId
		 */
		@ApiField("image")
		private String image;
		/**
		 * 单行富文本信息
		 */
		@ApiField("rich")
		private RichText rich;
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
		public Long getFileCount() {
			return this.fileCount;
		}
		public void setFileCount(Long fileCount) {
			this.fileCount = fileCount;
		}
		public List<FormItem> getForm() {
			return this.form;
		}
		public void setForm(List<FormItem> form) {
			this.form = form;
		}
		public String getImage() {
			return this.image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public RichText getRich() {
			return this.rich;
		}
		public void setRich(RichText rich) {
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
	 * oa消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OA extends TaobaoObject {
		private static final long serialVersionUID = 7547853423733218389L;
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
		 * 消息点击链接地址，当发送消息为小程序时支持小程序跳转链接
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
		public String getPcMessageUrl() {
			return this.pcMessageUrl;
		}
		public void setPcMessageUrl(String pcMessageUrl) {
			this.pcMessageUrl = pcMessageUrl;
		}
	}
	
	/**
	 * 文件消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class File extends TaobaoObject {
		private static final long serialVersionUID = 4621917392225714976L;
		/**
		 * 媒体文件id。引用的媒体文件最大10MB
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
	 * 链接消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Link extends TaobaoObject {
		private static final long serialVersionUID = 2158376531743918368L;
		/**
		 * 消息点击链接地址，当发送消息为小程序时支持小程序跳转链接
		 */
		@ApiField("message_url")
		private String messageUrl;
		/**
		 * 图片地址
		 */
		@ApiField("pic_url")
		private String picUrl;
		/**
		 * 消息描述，建议500字符以内
		 */
		@ApiField("text")
		private String text;
		/**
		 * 消息标题，建议100字符以内
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
	 * markdown消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Markdown extends TaobaoObject {
		private static final long serialVersionUID = 7524216844639784175L;
		/**
		 * markdown格式的消息，建议5000字符以内
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
	public static class Button extends TaobaoObject {
		private static final long serialVersionUID = 1454393956548338338L;
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
	 * action_card卡片消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ActionCard extends TaobaoObject {
		private static final long serialVersionUID = 7691686462519938687L;
		/**
		 * 使用独立跳转ActionCard样式时的按钮排列方式，竖直排列(0)，横向排列(1)；必须与button_list同时设置
		 */
		@ApiField("btn_orientation")
		private String btnOrientation;
		/**
		 * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置
		 */
		@ApiListField("button_list")
		@ApiField("button")
		private List<Button> buttonList;
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
	
		public String getBtnOrientation() {
			return this.btnOrientation;
		}
		public void setBtnOrientation(String btnOrientation) {
			this.btnOrientation = btnOrientation;
		}
		public List<Button> getButtonList() {
			return this.buttonList;
		}
		public void setButtonList(List<Button> buttonList) {
			this.buttonList = buttonList;
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
	 * 消息体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MessageBody extends TaobaoObject {
		private static final long serialVersionUID = 2136149737779911235L;
		/**
		 * action_card卡片消息
		 */
		@ApiField("action_card")
		private ActionCard actionCard;
		/**
		 * 文件消息
		 */
		@ApiField("file")
		private File file;
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
		 * oa消息
		 */
		@ApiField("oa")
		private OA oa;
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
		public OA getOa() {
			return this.oa;
		}
		public void setOa(OA oa) {
			this.oa = oa;
		}
		public Voice getVoice() {
			return this.voice;
		}
		public void setVoice(Voice voice) {
			this.voice = voice;
		}
	}
	

}