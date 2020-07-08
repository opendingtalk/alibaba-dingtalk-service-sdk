package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtech.craftform.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderDtechCraftformGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5117141137891536256L;

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
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 工艺单
	 */
	@ApiField("model")
	private DtechCraftFormDto model;

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

	public void setModel(DtechCraftFormDto model) {
		this.model = model;
	}
	public DtechCraftFormDto getModel( ) {
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
	 * 明细列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechCraftFormDetailDto extends TaobaoObject {
		private static final long serialVersionUID = 5769525688231459334L;
		/**
		 * 描述对象
		 */
		@ApiField("classification")
		private String classification;
		/**
		 * 内容
		 */
		@ApiField("content")
		private String content;
	
		public String getClassification() {
			return this.classification;
		}
		public void setClassification(String classification) {
			this.classification = classification;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
	}
	
	/**
	 * 摘要信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechCraftFormSummaryDto extends TaobaoObject {
		private static final long serialVersionUID = 4865639222763421495L;
		/**
		 * 工艺单bizId
		 */
		@ApiField("biz_id_craft_form")
		private String bizIdCraftForm;
		/**
		 * 外部订单号
		 */
		@ApiField("biz_id_external_order")
		private String bizIdExternalOrder;
		/**
		 * 类目名称
		 */
		@ApiField("category_name")
		private String categoryName;
		/**
		 * 图片
		 */
		@ApiField("craft_form_img_url")
		private String craftFormImgUrl;
		/**
		 * 商家货号
		 */
		@ApiField("goods_num")
		private String goodsNum;
		/**
		 * 款式名称
		 */
		@ApiField("style_name")
		private String styleName;
	
		public String getBizIdCraftForm() {
			return this.bizIdCraftForm;
		}
		public void setBizIdCraftForm(String bizIdCraftForm) {
			this.bizIdCraftForm = bizIdCraftForm;
		}
		public String getBizIdExternalOrder() {
			return this.bizIdExternalOrder;
		}
		public void setBizIdExternalOrder(String bizIdExternalOrder) {
			this.bizIdExternalOrder = bizIdExternalOrder;
		}
		public String getCategoryName() {
			return this.categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getCraftFormImgUrl() {
			return this.craftFormImgUrl;
		}
		public void setCraftFormImgUrl(String craftFormImgUrl) {
			this.craftFormImgUrl = craftFormImgUrl;
		}
		public String getGoodsNum() {
			return this.goodsNum;
		}
		public void setGoodsNum(String goodsNum) {
			this.goodsNum = goodsNum;
		}
		public String getStyleName() {
			return this.styleName;
		}
		public void setStyleName(String styleName) {
			this.styleName = styleName;
		}
	}
	
	/**
	 * 工艺单
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechCraftFormDto extends TaobaoObject {
		private static final long serialVersionUID = 2164295412243374493L;
		/**
		 * 明细列表
		 */
		@ApiListField("detail_list")
		@ApiField("dtech_craft_form_detail_dto")
		private List<DtechCraftFormDetailDto> detailList;
		/**
		 * 摘要信息
		 */
		@ApiField("summary")
		private DtechCraftFormSummaryDto summary;
	
		public List<DtechCraftFormDetailDto> getDetailList() {
			return this.detailList;
		}
		public void setDetailList(List<DtechCraftFormDetailDto> detailList) {
			this.detailList = detailList;
		}
		public DtechCraftFormSummaryDto getSummary() {
			return this.summary;
		}
		public void setSummary(DtechCraftFormSummaryDto summary) {
			this.summary = summary;
		}
	}
	


}
