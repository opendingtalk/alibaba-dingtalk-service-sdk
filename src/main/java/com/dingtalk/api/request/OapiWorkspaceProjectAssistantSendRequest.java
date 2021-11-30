package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiWorkspaceProjectAssistantSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.assistant.send request
 * 
 * @author top auto create
 * @since 1.0, 2021.09.02
 */
public class OapiWorkspaceProjectAssistantSendRequest extends BaseTaobaoRequest<OapiWorkspaceProjectAssistantSendResponse> {
	
	

	/** 
	* 跳转链接
	 */
	private String actionUrl;

	/** 
	* 文章内容，最大支持10个文章段落
	 */
	private String content;

	/** 
	* 链接图片
	 */
	private String picUrl;

	/** 
	* 消息接收人，最大支持 100人
	 */
	private String recieverUserids;

	/** 
	* 卡片样式，支持 动态卡片：ActionCardMessage，链接卡片：LinkMessage，markdown卡片：MarkdownMessage
	 */
	private String style;

	/** 
	* 标题模板KEY
	 */
	private String title;

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(List<Section> content) {
		this.content = new JSONWriter(false,false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setRecieverUserids(String recieverUserids) {
		this.recieverUserids = recieverUserids;
	}

	public String getRecieverUserids() {
		return this.recieverUserids;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getStyle() {
		return this.style;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.project.assistant.send";
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
		txtParams.put("action_url", this.actionUrl);
		txtParams.put("content", this.content);
		txtParams.put("pic_url", this.picUrl);
		txtParams.put("reciever_userids", this.recieverUserids);
		txtParams.put("style", this.style);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceProjectAssistantSendResponse> getResponseClass() {
		return OapiWorkspaceProjectAssistantSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actionUrl, "actionUrl");
		RequestCheckUtils.checkObjectMaxListSize(content, 999, "content");
		RequestCheckUtils.checkNotEmpty(recieverUserids, "recieverUserids");
		RequestCheckUtils.checkMaxListSize(recieverUserids, 999, "recieverUserids");
		RequestCheckUtils.checkNotEmpty(style, "style");
		RequestCheckUtils.checkNotEmpty(title, "title");
	}
	
	/**
	 * 文章内容，最大支持10个文章段落
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Section extends TaobaoObject {
		private static final long serialVersionUID = 5371363529948453837L;
		/**
		 * 段落模板KEY
		 */
		@ApiField("msg_key")
		private String msgKey;
		/**
		 * 段落模板参数
		 */
		@ApiField("msg_param")
		private String msgParam;
	
		public String getMsgKey() {
			return this.msgKey;
		}
		public void setMsgKey(String msgKey) {
			this.msgKey = msgKey;
		}
		public String getMsgParam() {
			return this.msgParam;
		}
		public void setMsgParam(String msgParam) {
			this.msgParam = msgParam;
		}
	}
	

}