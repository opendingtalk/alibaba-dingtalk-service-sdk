package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.size.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecClothesSizeCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4817689287324388836L;

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
	 * 返回结果
	 */
	@ApiListField("model")
	@ApiField("clothes_count_group_by_size_dto")
	private List<ClothesCountGroupBySizeDto> model;

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

	public void setModel(List<ClothesCountGroupBySizeDto> model) {
		this.model = model;
	}
	public List<ClothesCountGroupBySizeDto> getModel( ) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ClothesCountGroupBySizeDto extends TaobaoObject {
		private static final long serialVersionUID = 6554658312921612354L;
		/**
		 * 1
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 1
		 */
		@ApiField("size_code")
		private String sizeCode;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getSizeCode() {
			return this.sizeCode;
		}
		public void setSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
		}
	}
	


}
