package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.monthbill.url.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripMonthbillUrlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3541534884438174964L;

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
	 * 结果对象
	 */
	@ApiListField("module")
	@ApiField("open_account_rs")
	private List<OpenAccountRs> module;

	/** 
	 * 成功标识
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

	public void setModule(List<OpenAccountRs> module) {
		this.module = module;
	}
	public List<OpenAccountRs> getModule( ) {
		return this.module;
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
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenAccountRs extends TaobaoObject {
		private static final long serialVersionUID = 8582891649289125614L;
		/**
		 * 账期结束时间
		 */
		@ApiField("end_date")
		private String endDate;
		/**
		 * 账期开始时间
		 */
		@ApiField("start_date")
		private String startDate;
		/**
		 * json数据下载链接，通过HttpClient 获取 并GBK格式解析，链接五分钟有效期
		 */
		@ApiField("url")
		private String url;
	
		public String getEndDate() {
			return this.endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getStartDate() {
			return this.startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	


}
