package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.queryallprocesstemplate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessQueryallprocesstemplateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2687669652144795743L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private CorpTemplateVo result;

	/** 
	 * 是否正确访问
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(CorpTemplateVo result) {
		this.result = result;
	}
	public CorpTemplateVo getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Templatelist extends TaobaoObject {
		private static final long serialVersionUID = 1455776792229379958L;
		/**
		 * 是否有管理权限
		 */
		@ApiField("can_modify")
		private Boolean canModify;
		/**
		 * 模板内容
		 */
		@ApiField("form_content")
		private String formContent;
		/**
		 * 模板图标url
		 */
		@ApiField("icon_url")
		private String iconUrl;
		/**
		 * 模板名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 模板ocde
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 模板跳转地址
		 */
		@ApiField("url")
		private String url;
	
		public Boolean getCanModify() {
			return this.canModify;
		}
		public void setCanModify(Boolean canModify) {
			this.canModify = canModify;
		}
		public String getFormContent() {
			return this.formContent;
		}
		public void setFormContent(String formContent) {
			this.formContent = formContent;
		}
		public String getIconUrl() {
			return this.iconUrl;
		}
		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CorpTemplateVo extends TaobaoObject {
		private static final long serialVersionUID = 1657326326112686179L;
		/**
		 * 下次调用时的offset入参
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * list
		 */
		@ApiListField("template_list")
		@ApiField("templatelist")
		private List<Templatelist> templateList;
	
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public List<Templatelist> getTemplateList() {
			return this.templateList;
		}
		public void setTemplateList(List<Templatelist> templateList) {
			this.templateList = templateList;
		}
	}
	


}
