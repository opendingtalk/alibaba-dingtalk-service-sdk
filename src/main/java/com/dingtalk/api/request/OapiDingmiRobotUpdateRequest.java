package com.dingtalk.api.request;

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
import com.dingtalk.api.response.OapiDingmiRobotUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.robot.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.26
 */
public class OapiDingmiRobotUpdateRequest extends BaseTaobaoRequest<OapiDingmiRobotUpdateResponse> {
	
	

	/** 
	* 服务号(1) | 群(2)
	 */
	private String type;

	/** 
	* 系统自动生成
	 */
	private String updateBotModel;

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setUpdateBotModel(String updateBotModel) {
		this.updateBotModel = updateBotModel;
	}

	public void setUpdateBotModel(UpdateBotRequestDTO updateBotModel) {
		this.updateBotModel = new JSONWriter(false,false,true).write(updateBotModel);
	}

	public String getUpdateBotModel() {
		return this.updateBotModel;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingmi.robot.update";
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
		txtParams.put("type", this.type);
		txtParams.put("update_bot_model", this.updateBotModel);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingmiRobotUpdateResponse> getResponseClass() {
		return OapiDingmiRobotUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UpdateBotRequestDTO extends TaobaoObject {
		private static final long serialVersionUID = 6531137965187184245L;
		/**
		 * 头像资源ID
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * 机器人简介描述
		 */
		@ApiField("brief")
		private String brief;
		/**
		 * 对机器人的描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 机器人名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 预览图资源地址
		 */
		@ApiField("preview_media_url")
		private String previewMediaUrl;
	
		public String getAvatar() {
			return this.avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public String getBrief() {
			return this.brief;
		}
		public void setBrief(String brief) {
			this.brief = brief;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPreviewMediaUrl() {
			return this.previewMediaUrl;
		}
		public void setPreviewMediaUrl(String previewMediaUrl) {
			this.previewMediaUrl = previewMediaUrl;
		}
	}
	

}