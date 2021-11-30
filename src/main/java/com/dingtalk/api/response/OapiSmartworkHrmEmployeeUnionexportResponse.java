package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.unionexport response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmEmployeeUnionexportResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6261323866797884718L;

	/** 
	 * 错误code
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误码
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 导出结果对象
	 */
	@ApiField("result")
	private ExportRsult result;


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

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setResult(ExportRsult result) {
		this.result = result;
	}
	public ExportRsult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 导出结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ExportRsult extends TaobaoObject {
		private static final long serialVersionUID = 8889177364187637888L;
		/**
		 * 导出记录id
		 */
		@ApiField("export_id")
		private String exportId;
	
		public String getExportId() {
			return this.exportId;
		}
		public void setExportId(String exportId) {
			this.exportId = exportId;
		}
	}
	


}
