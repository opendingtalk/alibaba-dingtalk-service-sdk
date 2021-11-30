package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiPlanetomFeedsUploadResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.planetom.feeds.upload request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.26
 */
public class OapiPlanetomFeedsUploadRequest extends BaseTaobaoRequest<OapiPlanetomFeedsUploadResponse> {
	
	

	/** 
	* 内容对应的应用ID
	 */
	private Long feedAppId;

	/** 
	* 课程列表
	 */
	private String feedInfoModels;

	/** 
	* 提交人的手机号码
	 */
	private String userPhone;

	public void setFeedAppId(Long feedAppId) {
		this.feedAppId = feedAppId;
	}

	public Long getFeedAppId() {
		return this.feedAppId;
	}

	public void setFeedInfoModels(String feedInfoModels) {
		this.feedInfoModels = feedInfoModels;
	}

	public void setFeedInfoModels(List<BatchUploadFeedInfoModel> feedInfoModels) {
		this.feedInfoModels = new JSONWriter(false,false,true).write(feedInfoModels);
	}

	public String getFeedInfoModels() {
		return this.feedInfoModels;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.planetom.feeds.upload";
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
		txtParams.put("feed_app_id", this.feedAppId);
		txtParams.put("feed_info_models", this.feedInfoModels);
		txtParams.put("user_phone", this.userPhone);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPlanetomFeedsUploadResponse> getResponseClass() {
		return OapiPlanetomFeedsUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(feedAppId, "feedAppId");
		RequestCheckUtils.checkObjectMaxListSize(feedInfoModels, 20, "feedInfoModels");
		RequestCheckUtils.checkNotEmpty(userPhone, "userPhone");
	}
	
	/**
	 * 内容列表，一个为单课，多个为系列课
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FeedContentModel extends TaobaoObject {
		private static final long serialVersionUID = 2784984895348816653L;
		/**
		 * 内容类型 2 视频 3 音频
		 */
		@ApiField("feed_type")
		private Long feedType;
		/**
		 * 内容标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 视频下载地址
		 */
		@ApiField("video_url")
		private String videoUrl;
	
		public Long getFeedType() {
			return this.feedType;
		}
		public void setFeedType(Long feedType) {
			this.feedType = feedType;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getVideoUrl() {
			return this.videoUrl;
		}
		public void setVideoUrl(String videoUrl) {
			this.videoUrl = videoUrl;
		}
	}
	
	/**
	 * 课程基础
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FeedBaseModel extends TaobaoObject {
		private static final long serialVersionUID = 7472761795567858228L;
		/**
		 * 课程封面URL
		 */
		@ApiField("cover_url")
		private String coverUrl;
		/**
		 * 课程自定义标签
		 */
		@ApiField("cust_tag")
		private String custTag;
		/**
		 * 课程简介
		 */
		@ApiField("introduction")
		private String introduction;
		/**
		 * 课程图片简介
		 */
		@ApiField("pic_introduction")
		private String picIntroduction;
		/**
		 * 课程标题
		 */
		@ApiField("title")
		private String title;
	
		public String getCoverUrl() {
			return this.coverUrl;
		}
		public void setCoverUrl(String coverUrl) {
			this.coverUrl = coverUrl;
		}
		public String getCustTag() {
			return this.custTag;
		}
		public void setCustTag(String custTag) {
			this.custTag = custTag;
		}
		public String getIntroduction() {
			return this.introduction;
		}
		public void setIntroduction(String introduction) {
			this.introduction = introduction;
		}
		public String getPicIntroduction() {
			return this.picIntroduction;
		}
		public void setPicIntroduction(String picIntroduction) {
			this.picIntroduction = picIntroduction;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 支付信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FeedPayModel extends TaobaoObject {
		private static final long serialVersionUID = 4112446444772938831L;
		/**
		 * 客服手机号码
		 */
		@ApiField("cs_phone")
		private String csPhone;
		/**
		 * 优惠结束时间
		 */
		@ApiField("dis_end_time")
		private Long disEndTime;
		/**
		 * 优惠后价格 单位分
		 */
		@ApiField("dis_price")
		private Long disPrice;
		/**
		 * 优惠开始时间
		 */
		@ApiField("dis_start_time")
		private Long disStartTime;
		/**
		 * 售卖份数
		 */
		@ApiField("limit_count")
		private Long limitCount;
		/**
		 * 是否付费
		 */
		@ApiField("need_pay")
		private Boolean needPay;
		/**
		 * 是否优惠
		 */
		@ApiField("preferential")
		private Boolean preferential;
		/**
		 * 价格 单位分
		 */
		@ApiField("price")
		private Long price;
	
		public String getCsPhone() {
			return this.csPhone;
		}
		public void setCsPhone(String csPhone) {
			this.csPhone = csPhone;
		}
		public Long getDisEndTime() {
			return this.disEndTime;
		}
		public void setDisEndTime(Long disEndTime) {
			this.disEndTime = disEndTime;
		}
		public Long getDisPrice() {
			return this.disPrice;
		}
		public void setDisPrice(Long disPrice) {
			this.disPrice = disPrice;
		}
		public Long getDisStartTime() {
			return this.disStartTime;
		}
		public void setDisStartTime(Long disStartTime) {
			this.disStartTime = disStartTime;
		}
		public Long getLimitCount() {
			return this.limitCount;
		}
		public void setLimitCount(Long limitCount) {
			this.limitCount = limitCount;
		}
		public Boolean getNeedPay() {
			return this.needPay;
		}
		public void setNeedPay(Boolean needPay) {
			this.needPay = needPay;
		}
		public Boolean getPreferential() {
			return this.preferential;
		}
		public void setPreferential(Boolean preferential) {
			this.preferential = preferential;
		}
		public Long getPrice() {
			return this.price;
		}
		public void setPrice(Long price) {
			this.price = price;
		}
	}
	
	/**
	 * 课程列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BatchUploadFeedInfoModel extends TaobaoObject {
		private static final long serialVersionUID = 4612733965245996414L;
		/**
		 * 课程基础
		 */
		@ApiField("base_model")
		private FeedBaseModel baseModel;
		/**
		 * 内容列表，一个为单课，多个为系列课
		 */
		@ApiListField("content_models")
		@ApiField("feed_content_model")
		private List<FeedContentModel> contentModels;
		/**
		 * 支付信息
		 */
		@ApiField("pay_model")
		private FeedPayModel payModel;
		/**
		 * 资源类型 0 免费公开课 4 平价引流课 5 专栏课 6 训练营课
		 */
		@ApiField("resource_type")
		private Long resourceType;
		/**
		 * 服务群名称
		 */
		@ApiField("work_group_name")
		private String workGroupName;
	
		public FeedBaseModel getBaseModel() {
			return this.baseModel;
		}
		public void setBaseModel(FeedBaseModel baseModel) {
			this.baseModel = baseModel;
		}
		public List<FeedContentModel> getContentModels() {
			return this.contentModels;
		}
		public void setContentModels(List<FeedContentModel> contentModels) {
			this.contentModels = contentModels;
		}
		public FeedPayModel getPayModel() {
			return this.payModel;
		}
		public void setPayModel(FeedPayModel payModel) {
			this.payModel = payModel;
		}
		public Long getResourceType() {
			return this.resourceType;
		}
		public void setResourceType(Long resourceType) {
			this.resourceType = resourceType;
		}
		public String getWorkGroupName() {
			return this.workGroupName;
		}
		public void setWorkGroupName(String workGroupName) {
			this.workGroupName = workGroupName;
		}
	}
	

}