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
import com.dingtalk.api.response.OapiEduCardUserTaskSubmitResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.card.user.task.submit request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.29
 */
public class OapiEduCardUserTaskSubmitRequest extends BaseTaobaoRequest<OapiEduCardUserTaskSubmitResponse> {
	
	

	/** 
	* 参数
	 */
	private String taskparam;

	public void setTaskparam(String taskparam) {
		this.taskparam = taskparam;
	}

	public void setTaskparam(OpenCardTaskSubmitParam taskparam) {
		this.taskparam = new JSONWriter(false,false,true).write(taskparam);
	}

	public String getTaskparam() {
		return this.taskparam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.card.user.task.submit";
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
		txtParams.put("taskparam", this.taskparam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCardUserTaskSubmitResponse> getResponseClass() {
		return OapiEduCardUserTaskSubmitResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCardTaskSubmitParam extends TaobaoObject {
		private static final long serialVersionUID = 7285183393969137631L;
		/**
		 * 班级ID
		 */
		@ApiField("card_biz_id")
		private String cardBizId;
		/**
		 * 业务类型
		 */
		@ApiField("card_bizcode")
		private String cardBizcode;
		/**
		 * 卡片ID cardId
		 */
		@ApiField("card_id")
		private Long cardId;
		/**
		 * 任务Code
		 */
		@ApiField("card_task_code")
		private String cardTaskCode;
		/**
		 * 当前人的任务ID
		 */
		@ApiField("card_task_id")
		private Long cardTaskId;
		/**
		 * 打卡的内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 详情的URL
		 */
		@ApiField("detail_url")
		private String detailUrl;
		/**
		 * 编辑的URL
		 */
		@ApiField("edit_url")
		private String editUrl;
		/**
		 * 用户打卡传入的音视频类型
		 */
		@ApiField("medias")
		private String medias;
		/**
		 * 计数
		 */
		@ApiField("metering_number")
		private String meteringNumber;
		/**
		 * 当前是否为补卡
		 */
		@ApiField("reissue_card")
		private Boolean reissueCard;
		/**
		 * 结果评定文案
		 */
		@ApiField("result_evaluation")
		private String resultEvaluation;
		/**
		 * 内容来源,需申请
		 */
		@ApiField("source_type")
		private String sourceType;
		/**
		 * 单位
		 */
		@ApiField("unit_of_measurement")
		private String unitOfMeasurement;
		/**
		 * 当前人的staffId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCardBizId() {
			return this.cardBizId;
		}
		public void setCardBizId(String cardBizId) {
			this.cardBizId = cardBizId;
		}
		public String getCardBizcode() {
			return this.cardBizcode;
		}
		public void setCardBizcode(String cardBizcode) {
			this.cardBizcode = cardBizcode;
		}
		public Long getCardId() {
			return this.cardId;
		}
		public void setCardId(Long cardId) {
			this.cardId = cardId;
		}
		public String getCardTaskCode() {
			return this.cardTaskCode;
		}
		public void setCardTaskCode(String cardTaskCode) {
			this.cardTaskCode = cardTaskCode;
		}
		public Long getCardTaskId() {
			return this.cardTaskId;
		}
		public void setCardTaskId(Long cardTaskId) {
			this.cardTaskId = cardTaskId;
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
		public Boolean getReissueCard() {
			return this.reissueCard;
		}
		public void setReissueCard(Boolean reissueCard) {
			this.reissueCard = reissueCard;
		}
		public String getResultEvaluation() {
			return this.resultEvaluation;
		}
		public void setResultEvaluation(String resultEvaluation) {
			this.resultEvaluation = resultEvaluation;
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