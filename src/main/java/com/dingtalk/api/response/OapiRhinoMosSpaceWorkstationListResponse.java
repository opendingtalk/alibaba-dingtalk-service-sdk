package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.workstation.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosSpaceWorkstationListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1365792945748818486L;

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
	 * 结果
	 */
	@ApiListField("model")
	@ApiField("prod_workstation_dto")
	private List<ProdWorkstationDto> model;


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

	public void setModel(List<ProdWorkstationDto> model) {
		this.model = model;
	}
	public List<ProdWorkstationDto> getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProdWorkstationDto extends TaobaoObject {
		private static final long serialVersionUID = 8311152985291335229L;
		/**
		 * 类目code
		 */
		@ApiField("category_code")
		private String categoryCode;
		/**
		 * 类目子code
		 */
		@ApiField("category_sub_code")
		private String categorySubCode;
		/**
		 * 兴趣点code
		 */
		@ApiField("poi_code")
		private String poiCode;
		/**
		 * 站位code
		 */
		@ApiField("prod_workstation_code")
		private String prodWorkstationCode;
		/**
		 * 站位name
		 */
		@ApiField("prod_workstation_name")
		private String prodWorkstationName;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public String getCategoryCode() {
			return this.categoryCode;
		}
		public void setCategoryCode(String categoryCode) {
			this.categoryCode = categoryCode;
		}
		public String getCategorySubCode() {
			return this.categorySubCode;
		}
		public void setCategorySubCode(String categorySubCode) {
			this.categorySubCode = categorySubCode;
		}
		public String getPoiCode() {
			return this.poiCode;
		}
		public void setPoiCode(String poiCode) {
			this.poiCode = poiCode;
		}
		public String getProdWorkstationCode() {
			return this.prodWorkstationCode;
		}
		public void setProdWorkstationCode(String prodWorkstationCode) {
			this.prodWorkstationCode = prodWorkstationCode;
		}
		public String getProdWorkstationName() {
			return this.prodWorkstationName;
		}
		public void setProdWorkstationName(String prodWorkstationName) {
			this.prodWorkstationName = prodWorkstationName;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
