package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.serviceaccount.menu.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServiceaccountMenuGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8793678495674517266L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 菜单
	 */
	@ApiField("menu")
	private MenuConfigDTO menu;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setMenu(MenuConfigDTO menu) {
		this.menu = menu;
	}
	public MenuConfigDTO getMenu( ) {
		return this.menu;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 子菜单按钮列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MenuSubButtonDTO extends TaobaoObject {
		private static final long serialVersionUID = 3736916956662323911L;
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
		private static final long serialVersionUID = 6845421571143538946L;
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
		private static final long serialVersionUID = 6327575741566256188L;
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
