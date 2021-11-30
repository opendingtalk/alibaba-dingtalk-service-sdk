package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiEduCardUserPostUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.card.user.post.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.23
 */
public class OapiEduCardUserPostUpdateRequest extends BaseTaobaoRequest<OapiEduCardUserPostUpdateResponse> {
	
	

	/** 
	* 打卡动态修改入参
	 */
	private String updatePostParam;

	public void setUpdatePostParam(String updatePostParam) {
		this.updatePostParam = updatePostParam;
	}

	public void setUpdatePostParam(OpenUpdatePostParam updatePostParam) {
		this.updatePostParam = new JSONWriter(false,false,true).write(updatePostParam);
	}

	public String getUpdatePostParam() {
		return this.updatePostParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.card.user.post.update";
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
		txtParams.put("update_post_param", this.updatePostParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCardUserPostUpdateResponse> getResponseClass() {
		return OapiEduCardUserPostUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 打卡动态修改入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenUpdatePostParam extends TaobaoObject {
		private static final long serialVersionUID = 6367117572944967147L;
		/**
		 * 业务类型
		 */
		@ApiField("card_biz_code")
		private String cardBizCode;
		/**
		 * 班级ID
		 */
		@ApiField("card_biz_id")
		private String cardBizId;
		/**
		 * 卡片ID
		 */
		@ApiField("card_id")
		private String cardId;
		/**
		 * 提交的文本内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 详情的RUL
		 */
		@ApiField("detail_url")
		private String detailUrl;
		/**
		 * 编辑的URL
		 */
		@ApiField("edit_url")
		private String editUrl;
		/**
		 * 提交的多媒体信息
		 */
		@ApiField("medias")
		private String medias;
		/**
		 * 打卡：计量数
		 */
		@ApiField("metering_number")
		private String meteringNumber;
		/**
		 * 动态ID
		 */
		@ApiField("post_id")
		private Long postId;
		/**
		 * 打卡：补卡标示
		 */
		@ApiField("reissue_card")
		private Boolean reissueCard;
		/**
		 * 打卡：展示名称
		 */
		@ApiField("show_name")
		private String showName;
		/**
		 * 内容来源
		 */
		@ApiField("source_type")
		private String sourceType;
		/**
		 * 打卡：单位
		 */
		@ApiField("unit_of_measurement")
		private String unitOfMeasurement;
		/**
		 * 当前登录用户的staffId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCardBizCode() {
			return this.cardBizCode;
		}
		public void setCardBizCode(String cardBizCode) {
			this.cardBizCode = cardBizCode;
		}
		public String getCardBizId() {
			return this.cardBizId;
		}
		public void setCardBizId(String cardBizId) {
			this.cardBizId = cardBizId;
		}
		public String getCardId() {
			return this.cardId;
		}
		public void setCardId(String cardId) {
			this.cardId = cardId;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getDetailUrl() {
			return this.detailUrl;
		}
		public void setDetailUrl(String detailUrl) {
			this.detailUrl = detailUrl;
		}
		public String getEditUrl() {
			return this.editUrl;
		}
		public void setEditUrl(String editUrl) {
			this.editUrl = editUrl;
		}
		public String getMedias() {
			return this.medias;
		}
		public void setMedias(String medias) {
			this.medias = medias;
		}
		public String getMeteringNumber() {
			return this.meteringNumber;
		}
		public void setMeteringNumber(String meteringNumber) {
			this.meteringNumber = meteringNumber;
		}
		public Long getPostId() {
			return this.postId;
		}
		public void setPostId(Long postId) {
			this.postId = postId;
		}
		public Boolean getReissueCard() {
			return this.reissueCard;
		}
		public void setReissueCard(Boolean reissueCard) {
			this.reissueCard = reissueCard;
		}
		public String getShowName() {
			return this.showName;
		}
		public void setShowName(String showName) {
			this.showName = showName;
		}
		public String getSourceType() {
			return this.sourceType;
		}
		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
		public String getUnitOfMeasurement() {
			return this.unitOfMeasurement;
		}
		public void setUnitOfMeasurement(String unitOfMeasurement) {
			this.unitOfMeasurement = unitOfMeasurement;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}