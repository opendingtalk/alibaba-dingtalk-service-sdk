package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiRetailGroupBannersCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.group.banners.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.08
 */
public class OapiRetailGroupBannersCreateRequest extends BaseTaobaoRequest<OapiRetailGroupBannersCreateResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(GroupChatBannerCreationCmd param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.retail.group.banners.create";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRetailGroupBannersCreateResponse> getResponseClass() {
		return OapiRetailGroupBannersCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 标题格式化样式
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Style extends TaobaoObject {
		private static final long serialVersionUID = 2477766518132935331L;
		/**
		 * 字体颜色
		 */
		@ApiField("fontColor")
		private String fontColor;
		/**
		 * 字体类型
		 */
		@ApiField("fontFamily")
		private String fontFamily;
		/**
		 * 字体大小
		 */
		@ApiField("fontSize")
		private String fontSize;
		/**
		 * 字体粗细
		 */
		@ApiField("fontWeight")
		private String fontWeight;
	
		public String getFontColor() {
			return this.fontColor;
		}
		public void setFontColor(String fontColor) {
			this.fontColor = fontColor;
		}
		public String getFontFamily() {
			return this.fontFamily;
		}
		public void setFontFamily(String fontFamily) {
			this.fontFamily = fontFamily;
		}
		public String getFontSize() {
			return this.fontSize;
		}
		public void setFontSize(String fontSize) {
			this.fontSize = fontSize;
		}
		public String getFontWeight() {
			return this.fontWeight;
		}
		public void setFontWeight(String fontWeight) {
			this.fontWeight = fontWeight;
		}
	}
	
	/**
	 * 标题格式化参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormatParam extends TaobaoObject {
		private static final long serialVersionUID = 3826294816457828647L;
		/**
		 * 格式化参数值
		 */
		@ApiField("param")
		private String param;
		/**
		 * 标题格式化样式
		 */
		@ApiField("style")
		private Style style;
	
		public String getParam() {
			return this.param;
		}
		public void setParam(String param) {
			this.param = param;
		}
		public Style getStyle() {
			return this.style;
		}
		public void setStyle(Style style) {
			this.style = style;
		}
	}
	
	/**
	 * 群banner信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupChatBannerDto extends TaobaoObject {
		private static final long serialVersionUID = 4585969325581567952L;
		/**
		 * 按钮文案
		 */
		@ApiField("btnText")
		private String btnText;
		/**
		 * 按钮链接
		 */
		@ApiField("btnUrl")
		private String btnUrl;
		/**
		 * 内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 标题格式化参数
		 */
		@ApiListField("contentFormatParams")
		@ApiField("format_param")
		private List<FormatParam> contentFormatParams;
		/**
		 * 生效类型，1 永久生效 2 特定时间范围生效
		 */
		@ApiField("effectStrategy")
		private Long effectStrategy;
		/**
		 * 图片链接
		 */
		@ApiField("imgUrl")
		private String imgUrl;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 标题格式化参数
		 */
		@ApiListField("titleFormatParams")
		@ApiField("format_param")
		private List<FormatParam> titleFormatParams;
		/**
		 * 起始时间
		 */
		@ApiField("validTimeBegin")
		private Date validTimeBegin;
		/**
		 * 截止时间
		 */
		@ApiField("validTimeEnd")
		private Date validTimeEnd;
	
		public String getBtnText() {
			return this.btnText;
		}
		public void setBtnText(String btnText) {
			this.btnText = btnText;
		}
		public String getBtnUrl() {
			return this.btnUrl;
		}
		public void setBtnUrl(String btnUrl) {
			this.btnUrl = btnUrl;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public List<FormatParam> getContentFormatParams() {
			return this.contentFormatParams;
		}
		public void setContentFormatParams(List<FormatParam> contentFormatParams) {
			this.contentFormatParams = contentFormatParams;
		}
		public Long getEffectStrategy() {
			return this.effectStrategy;
		}
		public void setEffectStrategy(Long effectStrategy) {
			this.effectStrategy = effectStrategy;
		}
		public String getImgUrl() {
			return this.imgUrl;
		}
		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public List<FormatParam> getTitleFormatParams() {
			return this.titleFormatParams;
		}
		public void setTitleFormatParams(List<FormatParam> titleFormatParams) {
			this.titleFormatParams = titleFormatParams;
		}
		public Date getValidTimeBegin() {
			return this.validTimeBegin;
		}
		public void setValidTimeBegin(Date validTimeBegin) {
			this.validTimeBegin = validTimeBegin;
		}
		public Date getValidTimeEnd() {
			return this.validTimeEnd;
		}
		public void setValidTimeEnd(Date validTimeEnd) {
			this.validTimeEnd = validTimeEnd;
		}
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupChatBannerCreationCmd extends TaobaoObject {
		private static final long serialVersionUID = 1286779423183819733L;
		/**
		 * 群banner信息
		 */
		@ApiListField("banners")
		@ApiField("group_chat_banner_dto")
		private List<GroupChatBannerDto> banners;
		/**
		 * 更新群的id信息，可以是特定群、群类型、群成员三个纬度
		 */
		@ApiField("creationIdJson")
		private String creationIdJson;
		/**
		 * 更新类型，1 群类型、2 群id、3 群成员
		 */
		@ApiField("creationIdType")
		private Long creationIdType;
	
		public List<GroupChatBannerDto> getBanners() {
			return this.banners;
		}
		public void setBanners(List<GroupChatBannerDto> banners) {
			this.banners = banners;
		}
		public String getCreationIdJson() {
			return this.creationIdJson;
		}
		public void setCreationIdJson(String creationIdJson) {
			this.creationIdJson = creationIdJson;
		}
		public Long getCreationIdType() {
			return this.creationIdType;
		}
		public void setCreationIdType(Long creationIdType) {
			this.creationIdType = creationIdType;
		}
	}
	

}