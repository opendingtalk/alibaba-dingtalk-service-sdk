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
import com.dingtalk.api.response.OapiSnsSendMsgResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.send_msg request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSnsSendMsgRequest extends BaseTaobaoRequest<OapiSnsSendMsgResponse> {
	
	

	/** 
	* form表单提交成功后获取的formId
	 */
	private String code;

	/** 
	* 消息内容
	 */
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
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

	public String getApiMethodName() {
		return "dingtalk.oapi.sns.send_msg";
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
		txtParams.put("code", this.code);
		txtParams.put("msg", this.msg);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSnsSendMsgResponse> getResponseClass() {
		return OapiSnsSendMsgResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 消息内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Eapp extends TaobaoObject {
		private static final long serialVersionUID = 3622925833219896598L;
		/**
		 * 消息内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 消息图片资源id
		 */
		@ApiField("img")
		private String img;
		/**
		 * 消息链接
		 */
		@ApiField("link")
		private String link;
		/**
		 * 消息标题
		 */
		@ApiField("title")
		private String title;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getImg() {
			return this.img;
		}
		public void setImg(String img) {
			this.img = img;
		}
		public String getLink() {
			return this.link;
		}
		public void setLink(String link) {
			this.link = link;
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
		private static final long serialVersionUID = 6881998978842728399L;
		/**
		 * 消息内容
		 */
		@ApiField("eapp")
		private Eapp eapp;
		/**
		 * 消息类型
		 */
		@ApiField("msgtype")
		private String msgtype;
	
		public Eapp getEapp() {
			return this.eapp;
		}
		public void setEapp(Eapp eapp) {
			this.eapp = eapp;
		}
		public String getMsgtype() {
			return this.msgtype;
		}
		public void setMsgtype(String msgtype) {
			this.msgtype = msgtype;
		}
	}
	

}