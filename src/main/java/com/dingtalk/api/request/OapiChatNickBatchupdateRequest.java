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
import com.dingtalk.api.response.OapiChatNickBatchupdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.nick.batchupdate request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.01
 */
public class OapiChatNickBatchupdateRequest extends BaseTaobaoRequest<OapiChatNickBatchupdateResponse> {
	
	

	/** 
	* 会话id
	 */
	private String chatid;

	/** 
	* userId和nick的模型
	 */
	private String userNickModel;

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setUserNickModel(String userNickModel) {
		this.userNickModel = userNickModel;
	}

	public void setUserNickModel(List<OpenStaffIdAndNickModel> userNickModel) {
		this.userNickModel = new JSONWriter(false,false,true).write(userNickModel);
	}

	public String getUserNickModel() {
		return this.userNickModel;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.nick.batchupdate";
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
		txtParams.put("chatid", this.chatid);
		txtParams.put("user_nick_model", this.userNickModel);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatNickBatchupdateResponse> getResponseClass() {
		return OapiChatNickBatchupdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatid, "chatid");
		RequestCheckUtils.checkObjectMaxListSize(userNickModel, 500, "userNickModel");
	}
	
	/**
	 * userId和nick的模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenStaffIdAndNickModel extends TaobaoObject {
		private static final long serialVersionUID = 1527515824787415599L;
		/**
		 * 昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * userId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}