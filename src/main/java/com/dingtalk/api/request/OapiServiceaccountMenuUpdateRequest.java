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
import com.dingtalk.api.response.OapiServiceaccountMenuUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.serviceaccount.menu.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.26
 */
public class OapiServiceaccountMenuUpdateRequest extends BaseTaobaoRequest<OapiServiceaccountMenuUpdateResponse> {
	
	

	/** 
	* 菜单
	 */
	private String menu;

	/** 
	* 服务号的unionid
	 */
	private String unionid;

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public void setMenu(MenuConfigDTO menu) {
		this.menu = new JSONWriter(false,false,true).write(menu);
	}

	public String getMenu() {
		return this.menu;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.serviceaccount.menu.update";
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
		txtParams.put("menu", this.menu);
		txtParams.put("unionid", this.unionid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceaccountMenuUpdateResponse> getResponseClass() {
		return OapiServiceaccountMenuUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(unionid, "unionid");
	}
	
	/**
	 * 子菜单按钮列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MenuSubButtonDTO extends TaobaoObject {
		private static final long serialVersionUID = 5588327318678851853L;
		/**
		 * 菜单绑定的key值
		 */
		@ApiField("key")
		private String key;
		/**
		 * 素材id
		 */
		@ApiField("media_id")
		private String mediaId;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 菜单绑定的URL
		 */
		@ApiField("url")
		private String url;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	/**
	 * 菜单按钮列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MenuButtonDTO extends TaobaoObject {
		private static final long serialVersionUID = 4627286171989241598L;
		/**
		 * 菜单绑定的key值
		 */
		@ApiField("key")
		private String key;
		/**
		 * 素材id
		 */
		@ApiField("media_id")
		private String mediaId;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 子菜单按钮列表
		 */
		@ApiListField("sub_button")
		@ApiField("menu_sub_button_d_t_o")
		private List<MenuSubButtonDTO> subButton;
		/**
		 * 类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 菜单绑定的URL
		 */
		@ApiField("url")
		private String url;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<MenuSubButtonDTO> getSubButton() {
			return this.subButton;
		}
		public void setSubButton(List<MenuSubButtonDTO> subButton) {
			this.subButton = subButton;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	/**
	 * 菜单
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MenuConfigDTO extends TaobaoObject {
		private static final long serialVersionUID = 8742675472475978139L;
		/**
		 * 菜单按钮列表
		 */
		@ApiListField("button")
		@ApiField("menu_button_d_t_o")
		private List<MenuButtonDTO> button;
		/**
		 * 是否允许用户输入
		 */
		@ApiField("enable_input")
		private Boolean enableInput;
		/**
		 * 状态，0-正常，1-停用
		 */
		@ApiField("status")
		private Long status;
	
		public List<MenuButtonDTO> getButton() {
			return this.button;
		}
		public void setButton(List<MenuButtonDTO> button) {
			this.button = button;
		}
		public Boolean getEnableInput() {
			return this.enableInput;
		}
		public void setEnableInput(Boolean enableInput) {
			this.enableInput = enableInput;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	

}