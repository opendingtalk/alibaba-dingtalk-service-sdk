package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.condition.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecClothesConditionGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7194645842737223125L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 系统自动生成
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 错误信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 返回值
	 */
	@ApiField("model")
	private PageResult model;


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

	public void setModel(PageResult model) {
		this.model = model;
	}
	public PageResult getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 页信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ClothesDto extends TaobaoObject {
		private static final long serialVersionUID = 5665731689135976843L;
		/**
		 * 颜色id
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
		 * 实体id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 订单id
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 尺码code
		 */
		@ApiField("size_code")
		private String sizeCode;
		/**
		 * 尺码名称
		 */
		@ApiField("size_name")
		private String sizeName;
		/**
		 * 源id
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 源类型
		 */
		@ApiField("source_type")
		private String sourceType;
		/**
		 * 状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 租户
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
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
	
	/**
	 * 返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 5458577818626183815L;
		/**
		 * 当前起始
		 */
		@ApiField("current_start")
		private Long currentStart;
		/**
		 * 页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 页信息
		 */
		@ApiListField("result_list")
		@ApiField("clothes_dto")
		private List<ClothesDto> resultList;
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
		public List<ClothesDto> getResultList() {
			return this.resultList;
		}
		public void setResultList(List<ClothesDto> resultList) {
			this.resultList = resultList;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
	}
	


}
