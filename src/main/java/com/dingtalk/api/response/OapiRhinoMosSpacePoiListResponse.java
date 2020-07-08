package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.poi.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosSpacePoiListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8763288539486549276L;

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
	@ApiField("space_poi_dto")
	private List<SpacePoiDto> model;


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

	public void setModel(List<SpacePoiDto> model) {
		this.model = model;
	}
	public List<SpacePoiDto> getModel( ) {
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
	public static class SpacePoiDto extends TaobaoObject {
		private static final long serialVersionUID = 4548141674715266474L;
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
		 * 兴趣点name
		 */
		@ApiField("poi_name")
		private String poiName;
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
		public String getPoiName() {
			return this.poiName;
		}
		public void setPoiName(String poiName) {
			this.poiName = poiName;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
