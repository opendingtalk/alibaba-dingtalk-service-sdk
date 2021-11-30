package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.report.template.listbyuserid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiReportTemplateListbyuseridResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8512983323523229562L;

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
	 * result
	 */
	@ApiField("result")
	private HomePageReportTemplateVo result;


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

	public void setResult(HomePageReportTemplateVo result) {
		this.result = result;
	}
	public HomePageReportTemplateVo getResult( ) {
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
	public static class ReportTemplateTopVo extends TaobaoObject {
		private static final long serialVersionUID = 2554368363396857516L;
		/**
		 * 模板图标url
		 */
		@ApiField("icon_url")
		private String iconUrl;
		/**
		 * 日志模板名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 模板唯一标识
		 */
		@ApiField("report_code")
		private String reportCode;
		/**
		 * 模板的url
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
		public String getReportCode() {
			return this.reportCode;
		}
		public void setReportCode(String reportCode) {
			this.reportCode = reportCode;
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
	public static class HomePageReportTemplateVo extends TaobaoObject {
		private static final long serialVersionUID = 4877499773522737221L;
		/**
		 * 下一次分页调用的offset值，当返回结果里没有nextCursor时，表示分页结束
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * list
		 */
		@ApiListField("template_list")
		@ApiField("report_template_top_vo")
		private List<ReportTemplateTopVo> templateList;
	
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public List<ReportTemplateTopVo> getTemplateList() {
			return this.templateList;
		}
		public void setTemplateList(List<ReportTemplateTopVo> templateList) {
			this.templateList = templateList;
		}
	}
	


}
