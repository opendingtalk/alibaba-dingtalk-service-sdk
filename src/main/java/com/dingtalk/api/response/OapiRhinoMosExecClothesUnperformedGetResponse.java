package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.unperformed.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecClothesUnperformedGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1523473565245638536L;

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
	 * 衣服ID列表
	 */
	@ApiField("model")
	private PageResult model;

	/** 
	 * 是否成功
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

	public void setModel(PageResult model) {
		this.model = model;
	}
	public PageResult getModel( ) {
		return this.model;
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
	 * 衣服ID列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 3446722791847526663L;
		/**
		 * 起始位置
		 */
		@ApiField("current_start")
		private Long currentStart;
		/**
		 * 页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 结果
		 */
		@ApiListField("result")
		@ApiField("number")
		private List<Long> result;
		/**
		 * 总数
		 */
		@ApiField("total")
		private Long total;
	
		public Long getCurrentStart() {
			return this.currentStart;
		}
		public void setCurrentStart(Long currentStart) {
			this.currentStart = currentStart;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public List<Long> getResult() {
			return this.result;
		}
		public void setResult(List<Long> result) {
			this.result = result;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
	}
	


}
