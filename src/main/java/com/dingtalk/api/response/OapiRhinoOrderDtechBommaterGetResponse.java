package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtech.bommater.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderDtechBommaterGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3435547521753858577L;

	/** 
	 * 钉钉响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 响应信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 额外的错误信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 处理结果
	 */
	@ApiListField("model")
	@ApiField("get_bom_info_and_mater_info_item")
	private List<GetBomInfoAndMaterInfoItem> model;

	/** 
	 * 是否调用成功
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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(List<GetBomInfoAndMaterInfoItem> model) {
		this.model = model;
	}
	public List<GetBomInfoAndMaterInfoItem> getModel( ) {
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
	 * 物料信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechBomDto extends TaobaoObject {
		private static final long serialVersionUID = 8825828469868435672L;
		/**
		 * Bom编号
		 */
		@ApiField("biz_id_bom")
		private String bizIdBom;
		/**
		 * 物料编号
		 */
		@ApiField("biz_id_material")
		private String bizIdMaterial;
		/**
		 * 颜色编号
		 */
		@ApiField("color_code")
		private String colorCode;
		/**
		 * 颜色名称
		 */
		@ApiField("color_name")
		private String colorName;
		/**
		 * 备注
		 */
		@ApiField("comment")
		private String comment;
		/**
		 * 数字工艺包id
		 */
		@ApiField("dtech_pkg_id")
		private Long dtechPkgId;
		/**
		 * 面料幅宽
		 */
		@ApiField("fabric_breadth")
		private String fabricBreadth;
		/**
		 * 是否默认带出的面料
		 */
		@ApiField("fabric_default")
		private Boolean fabricDefault;
		/**
		 * 长度
		 */
		@ApiField("length")
		private String length;
		/**
		 * 物料编码
		 */
		@ApiField("material_code")
		private String materialCode;
		/**
		 * 物料ID
		 */
		@ApiField("material_id")
		private Long materialId;
		/**
		 * 物料名称
		 */
		@ApiField("material_name")
		private String materialName;
		/**
		 * 物料SKU编号
		 */
		@ApiField("material_sku_id")
		private Long materialSkuId;
		/**
		 * 物料来源
		 */
		@ApiField("material_source")
		private String materialSource;
		/**
		 * 物料类型
		 */
		@ApiField("material_type")
		private String materialType;
		/**
		 * 物料用途
		 */
		@ApiField("material_usage")
		private String materialUsage;
		/**
		 * 采购类型，客供还是其他
		 */
		@ApiField("purchase_desc")
		private String purchaseDesc;
		/**
		 * 采购类型，客供还是其他
		 */
		@ApiField("purchase_enum")
		private String purchaseEnum;
		/**
		 * 采购类型，客供还是其他
		 */
		@ApiField("purchase_type")
		private Long purchaseType;
		/**
		 * 数量
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * 工段编码
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * 尺码编号
		 */
		@ApiField("size_code")
		private String sizeCode;
		/**
		 * 排序字段
		 */
		@ApiField("sort")
		private Long sort;
		/**
		 * 面辅料唯一ID
		 */
		@ApiField("uk_material")
		private String ukMaterial;
		/**
		 * 单位
		 */
		@ApiField("unit")
		private String unit;
		/**
		 * 物料单位
		 */
		@ApiField("unit_code")
		private String unitCode;
	
		public String getBizIdBom() {
			return this.bizIdBom;
		}
		public void setBizIdBom(String bizIdBom) {
			this.bizIdBom = bizIdBom;
		}
		public String getBizIdMaterial() {
			return this.bizIdMaterial;
		}
		public void setBizIdMaterial(String bizIdMaterial) {
			this.bizIdMaterial = bizIdMaterial;
		}
		public String getColorCode() {
			return this.colorCode;
		}
		public void setColorCode(String colorCode) {
			this.colorCode = colorCode;
		}
		public String getColorName() {
			return this.colorName;
		}
		public void setColorName(String colorName) {
			this.colorName = colorName;
		}
		public String getComment() {
			return this.comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public Long getDtechPkgId() {
			return this.dtechPkgId;
		}
		public void setDtechPkgId(Long dtechPkgId) {
			this.dtechPkgId = dtechPkgId;
		}
		public String getFabricBreadth() {
			return this.fabricBreadth;
		}
		public void setFabricBreadth(String fabricBreadth) {
			this.fabricBreadth = fabricBreadth;
		}
		public Boolean getFabricDefault() {
			return this.fabricDefault;
		}
		public void setFabricDefault(Boolean fabricDefault) {
			this.fabricDefault = fabricDefault;
		}
		public String getLength() {
			return this.length;
		}
		public void setLength(String length) {
			this.length = length;
		}
		public String getMaterialCode() {
			return this.materialCode;
		}
		public void setMaterialCode(String materialCode) {
			this.materialCode = materialCode;
		}
		public Long getMaterialId() {
			return this.materialId;
		}
		public void setMaterialId(Long materialId) {
			this.materialId = materialId;
		}
		public String getMaterialName() {
			return this.materialName;
		}
		public void setMaterialName(String materialName) {
			this.materialName = materialName;
		}
		public Long getMaterialSkuId() {
			return this.materialSkuId;
		}
		public void setMaterialSkuId(Long materialSkuId) {
			this.materialSkuId = materialSkuId;
		}
		public String getMaterialSource() {
			return this.materialSource;
		}
		public void setMaterialSource(String materialSource) {
			this.materialSource = materialSource;
		}
		public String getMaterialType() {
			return this.materialType;
		}
		public void setMaterialType(String materialType) {
			this.materialType = materialType;
		}
		public String getMaterialUsage() {
			return this.materialUsage;
		}
		public void setMaterialUsage(String materialUsage) {
			this.materialUsage = materialUsage;
		}
		public String getPurchaseDesc() {
			return this.purchaseDesc;
		}
		public void setPurchaseDesc(String purchaseDesc) {
			this.purchaseDesc = purchaseDesc;
		}
		public String getPurchaseEnum() {
			return this.purchaseEnum;
		}
		public void setPurchaseEnum(String purchaseEnum) {
			this.purchaseEnum = purchaseEnum;
		}
		public Long getPurchaseType() {
			return this.purchaseType;
		}
		public void setPurchaseType(Long purchaseType) {
			this.purchaseType = purchaseType;
		}
		public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getSectionCode() {
			return this.sectionCode;
		}
		public void setSectionCode(String sectionCode) {
			this.sectionCode = sectionCode;
		}
		public String getSizeCode() {
			return this.sizeCode;
		}
		public void setSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
		}
		public Long getSort() {
			return this.sort;
		}
		public void setSort(Long sort) {
			this.sort = sort;
		}
		public String getUkMaterial() {
			return this.ukMaterial;
		}
		public void setUkMaterial(String ukMaterial) {
			this.ukMaterial = ukMaterial;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public String getUnitCode() {
			return this.unitCode;
		}
		public void setUnitCode(String unitCode) {
			this.unitCode = unitCode;
		}
	}
	
	/**
	 * 来自版房工单系统的物料信息,有可能为空
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MaterialInfoDto extends TaobaoObject {
		private static final long serialVersionUID = 2114475141487373964L;
		/**
		 * 颜色id
		 */
		@ApiField("ali_color_id")
		private String aliColorId;
		/**
		 * 展示名称
		 */
		@ApiField("display_name")
		private String displayName;
		/**
		 * 面幅宽度
		 */
		@ApiField("fabricBreadth")
		private String fabricBreadth;
		/**
		 * 面料id
		 */
		@ApiField("fabric_id")
		private Long fabricId;
		/**
		 * 物料id
		 */
		@ApiField("material_id")
		private String materialId;
		/**
		 * 物料名称
		 */
		@ApiField("material_name")
		private String materialName;
	
		public String getAliColorId() {
			return this.aliColorId;
		}
		public void setAliColorId(String aliColorId) {
			this.aliColorId = aliColorId;
		}
		public String getDisplayName() {
			return this.displayName;
		}
		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}
		public String getFabricBreadth() {
			return this.fabricBreadth;
		}
		public void setFabricBreadth(String fabricBreadth) {
			this.fabricBreadth = fabricBreadth;
		}
		public Long getFabricId() {
			return this.fabricId;
		}
		public void setFabricId(Long fabricId) {
			this.fabricId = fabricId;
		}
		public String getMaterialId() {
			return this.materialId;
		}
		public void setMaterialId(String materialId) {
			this.materialId = materialId;
		}
		public String getMaterialName() {
			return this.materialName;
		}
		public void setMaterialName(String materialName) {
			this.materialName = materialName;
		}
	}
	
	/**
	 * 处理结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetBomInfoAndMaterInfoItem extends TaobaoObject {
		private static final long serialVersionUID = 6283842255889769372L;
		/**
		 * 物料信息
		 */
		@ApiField("dtech_bom")
		private DtechBomDto dtechBom;
		/**
		 * 来自版房工单系统的物料信息,有可能为空
		 */
		@ApiField("material_info")
		private MaterialInfoDto materialInfo;
	
		public DtechBomDto getDtechBom() {
			return this.dtechBom;
		}
		public void setDtechBom(DtechBomDto dtechBom) {
			this.dtechBom = dtechBom;
		}
		public MaterialInfoDto getMaterialInfo() {
			return this.materialInfo;
		}
		public void setMaterialInfo(MaterialInfoDto materialInfo) {
			this.materialInfo = materialInfo;
		}
	}
	


}
