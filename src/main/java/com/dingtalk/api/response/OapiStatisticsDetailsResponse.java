package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.statistics.details response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiStatisticsDetailsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8646383145864727829L;

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
	 * 企业具体数据
	 */
	@ApiListField("result")
	@ApiField("enterprise_data_vo")
	private List<EnterpriseDataVo> result;


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

	public void setResult(List<EnterpriseDataVo> result) {
		this.result = result;
	}
	public List<EnterpriseDataVo> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 企业具体数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EnterpriseDataVo extends TaobaoObject {
		private static final long serialVersionUID = 3871488113747189342L;
		/**
		 * 数据的日期,格式为yyyy-MM-dd
		 */
		@ApiField("date")
		private String date;
		/**
		 * 返回的数据列
		 */
		@ApiField("return_fields")
		private String returnFields;
		/**
		 * 业务类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 数据的下载地址
		 */
		@ApiField("url")
		private String url;
	
		public String getDate() {
			return this.date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getReturnFields() {
			return this.returnFields;
		}
		public void setReturnFields(String returnFields) {
			this.returnFields = returnFields;
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
	


}
