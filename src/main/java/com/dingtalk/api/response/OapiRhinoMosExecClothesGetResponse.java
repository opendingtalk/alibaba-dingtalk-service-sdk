package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecClothesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3113692923213786469L;

	/** 
	 * 钉钉平台错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 额外错误信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 衣服详情
	 */
	@ApiListField("model")
	@ApiField("clothes_dto")
	private List<ClothesDto> model;

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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(List<ClothesDto> model) {
		this.model = model;
	}
	public List<ClothesDto> getModel( ) {
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
	 * 衣服详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ClothesDto extends TaobaoObject {
		private static final long serialVersionUID = 7289621786386198189L;
		/**
		 * 业务类型
		 */
		@ApiField("biz_type")
		private String bizType;
		/**
		 * 颜色ID
		 */
		@ApiField("color_id")
		private Long colorId;
		/**
		 * 颜色名称
		 */
		@ApiField("color_name")
		private String colorName;
		/**
		 * 创建类型
		 */
		@ApiField("create_type")
		private String createType;
		/**
		 * 衣服ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 订单ID
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 尺码Code
		 */
		@ApiField("size_code")
		private String sizeCode;
		/**
		 * 尺码名称
		 */
		@ApiField("size_name")
		private String sizeName;
		/**
		 * 来源ID
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 来源类型
		 */
		@ApiField("source_type")
		private String sourceType;
		/**
		 * 状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public String getBizType() {
			return this.bizType;
		}
		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
		public Long getColorId() {
			return this.colorId;
		}
		public void setColorId(Long colorId) {
			this.colorId = colorId;
		}
		public String getColorName() {
			return this.colorName;
		}
		public void setColorName(String colorName) {
			this.colorName = colorName;
		}
		public String getCreateType() {
			return this.createType;
		}
		public void setCreateType(String createType) {
			this.createType = createType;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public String getSizeCode() {
			return this.sizeCode;
		}
		public void setSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
		}
		public String getSizeName() {
			return this.sizeName;
		}
		public void setSizeName(String sizeName) {
			this.sizeName = sizeName;
		}
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public String getSourceType() {
			return this.sourceType;
		}
		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
