package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.listbyuserid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessListbyuseridResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3852569222743135857L;

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
	private HomePageProcessTemplateVo result;


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

	public void setResult(HomePageProcessTemplateVo result) {
		this.result = result;
	}
	public HomePageProcessTemplateVo getResult( ) {
		return this.result;
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
	public static class ProcessTopVo extends TaobaoObject {
		private static final long serialVersionUID = 8749498517997482192L;
		/**
		 * 图标url
		 */
		@ApiField("icon_url")
		private String iconUrl;
		/**
		 * 模板名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 模板唯一标识
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 模板url
		 */
		@ApiField("url")
		private String url;
	
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
	public static class HomePageProcessTemplateVo extends TaobaoObject {
		private static final long serialVersionUID = 3622946381653856697L;
		/**
		 * 下一次分页调用的offset值，当返回结果里没有nextCursor时，表示分页结束
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * list
		 */
		@ApiListField("process_list")
		@ApiField("process_top_vo")
		private List<ProcessTopVo> processList;
	
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public List<ProcessTopVo> getProcessList() {
			return this.processList;
		}
		public void setProcessList(List<ProcessTopVo> processList) {
			this.processList = processList;
		}
	}
	


}
