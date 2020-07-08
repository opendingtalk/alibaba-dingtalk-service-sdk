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
import com.dingtalk.api.response.OapiMessageCorpconversationAsyncsendV2Response;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.corpconversation.asyncsend_v2 request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.22
 */
public class OapiMessageCorpconversationAsyncsendV2Request extends BaseTaobaoRequest<OapiMessageCorpconversationAsyncsendV2Response> {
	
	

	/** 
	* 微应用的id
	 */
	private Long agentId;

	/** 
	* 接收者的部门id列表
	 */
	private String deptIdList;

	/** 
	* 消息体，具体见文档
	 */
	private String msg;

	/** 
	* 是否发送给企业全部用户
	 */
	private Boolean toAllUser;

	/** 
	* 接收者的用户userid列表
	 */
	private String useridList;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setDeptIdList(String deptIdList) {
		this.deptIdList = deptIdList;
	}

	public String getDeptIdList() {
		return this.deptIdList;
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

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.corpconversation.asyncsend_v2";
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("dept_id_list", this.deptIdList);
		txtParams.put("msg", this.msg);
		txtParams.put("to_all_user", this.toAllUser);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageCorpconversationAsyncsendV2Response> getResponseClass() {
		return OapiMessageCorpconversationAsyncsendV2Response.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkMaxListSize(deptIdList, 500, "deptIdList");
		RequestCheckUtils.checkMaxListSize(useridList, 5000, "useridList");
	}
	
	/**
	 * 文本消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Text extends TaobaoObject {
		private static final long serialVersionUID = 5292199218783824395L;
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
	 * 图片消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Image extends TaobaoObject {
		private static final long serialVersionUID = 1429292457849636878L;
		/**
		 * 图片消息
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
		private static final long serialVersionUID = 6889583996271416461L;
		/**
		 * 图片地址
		 */
		@ApiField("messageUrl")
		private String messageUrl;
		/**
		 * 消息点击链接地址，当发送消息为小程序时支持小程序跳转链接
		 */
		@ApiField("picUrl")
		private String picUrl;
		/**
		 * 消息标题，建议100字符以内
		 */
		@ApiField("text")
		private String text;
		/**
		 * 消息描述，建议500字符以内
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
	 * 文件消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class File extends TaobaoObject {
		private static final long serialVersionUID = 4294562331364627218L;
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
	 * 语音消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Voice extends TaobaoObject {
		private static final long serialVersionUID = 7649498512459325891L;
		/**
		 * 正整数，小于60，表示音频时长
		 */
		@ApiField("duration")
		private String duration;
		/**
		 * 媒体文件id。2MB，播放长度不超过60s，AMR格式
		 */
		@ApiField("media_id")
		private String mediaId;
	
		public String getDuration() {
			return this.duration;
		}
		public void setDuration(String duration) {
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
	 * 单行富文本信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Rich extends TaobaoObject {
		private static final long serialVersionUID = 7525387494274772379L;
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
	 * 消息体的表单，最多显示6个，超过会被隐藏
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Form extends TaobaoObject {
		private static final long serialVersionUID = 7359914826466994664L;
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
	 * 消息体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Body extends TaobaoObject {
		private static final long serialVersionUID = 6297194291735871539L;
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
		private static final long serialVersionUID = 6168927155945945996L;
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
	public static class OA extends TaobaoObject {
		private static final long serialVersionUID = 5154651894645736347L;
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
	 * markdown消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Markdown extends TaobaoObject {
		private static final long serialVersionUID = 4459343539279411278L;
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
	public static class BtnJsonList extends TaobaoObject {
		private static final long serialVersionUID = 4633667378854462131L;
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
		private static final long serialVersionUID = 3766842344151639336L;
		/**
		 * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置
		 */
		@ApiListField("btn_json_list")
		@ApiField("btn_json_list")
		private List<BtnJsonList> btnJsonList;
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
	
		public List<BtnJsonList> getBtnJsonList() {
			return this.btnJsonList;
		}
		public void setBtnJsonList(List<BtnJsonList> btnJsonList) {
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
		private static final long serialVersionUID = 3263892561694624889L;
		/**
		 * 卡片消息
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
		 * OA消息
		 */
		@ApiField("oa")
		private OA oa;
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
		public OA getOa() {
			return this.oa;
		}
		public void setOa(OA oa) {
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