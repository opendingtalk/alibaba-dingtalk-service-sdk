package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtech.sizechart.instancemapping.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderDtechSizechartInstancemappingGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8123487969675196635L;

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
	 * 错误信息
	 */
	@ApiField("external_msgInfo")
	private String externalMsgInfo;

	/** 
	 * 调用结果
	 */
	@ApiField("model")
	private SizeChartInstanceMappingVo model;

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

	public void setModel(SizeChartInstanceMappingVo model) {
		this.model = model;
	}
	public SizeChartInstanceMappingVo getModel( ) {
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
	 * 调用结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SizeChartInstanceMappingVo extends TaobaoObject {
		private static final long serialVersionUID = 4416461258773675118L;
		/**
		 * 类目Id
		 */
		@ApiField("category_id")
		private String categoryId;
		/**
		 * 成衣尺码实例bizId
		 */
		@ApiField("garment_bizId_size_chart_instance")
		private String garmentBizIdSizeChartInstance;
		/**
		 * 纸样尺码实例bizId
		 */
		@ApiField("pattern_biz_id_size_chart_instance")
		private String patternBizIdSizeChartInstance;
		/**
		 * 尺码阶段列表1成衣2纸样
		 */
		@ApiListField("phase_list")
		@ApiField("number")
		private List<Long> phaseList;
		/**
		 * 号型是否可修改
		 */
		@ApiField("size_type_editable")
		private Boolean sizeTypeEditable;
	
		public String getCategoryId() {
			return this.categoryId;
		}
		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}
		public String getGarmentBizIdSizeChartInstance() {
			return this.garmentBizIdSizeChartInstance;
		}
		public void setGarmentBizIdSizeChartInstance(String garmentBizIdSizeChartInstance) {
			this.garmentBizIdSizeChartInstance = garmentBizIdSizeChartInstance;
		}
		public String getPatternBizIdSizeChartInstance() {
			return this.patternBizIdSizeChartInstance;
		}
		public void setPatternBizIdSizeChartInstance(String patternBizIdSizeChartInstance) {
			this.patternBizIdSizeChartInstance = patternBizIdSizeChartInstance;
		}
		public List<Long> getPhaseList() {
			return this.phaseList;
		}
		public void setPhaseList(List<Long> phaseList) {
			this.phaseList = phaseList;
		}
		public Boolean getSizeTypeEditable() {
			return this.sizeTypeEditable;
		}
		public void setSizeTypeEditable(Boolean sizeTypeEditable) {
			this.sizeTypeEditable = sizeTypeEditable;
		}
	}
	


}
