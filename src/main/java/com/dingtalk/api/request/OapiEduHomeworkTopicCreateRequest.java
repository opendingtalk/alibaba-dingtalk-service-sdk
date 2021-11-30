package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiEduHomeworkTopicCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.topic.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.27
 */
public class OapiEduHomeworkTopicCreateRequest extends BaseTaobaoRequest<OapiEduHomeworkTopicCreateResponse> {
	
	

	/** 
	* 题目列表
	 */
	private String topicItems;

	public void setTopicItems(String topicItems) {
		this.topicItems = topicItems;
	}

	public void setTopicItems(List<SyncTopicItem> topicItems) {
		this.topicItems = new JSONWriter(false,false,true).write(topicItems);
	}

	public String getTopicItems() {
		return this.topicItems;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.topic.create";
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
		txtParams.put("topic_items", this.topicItems);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkTopicCreateResponse> getResponseClass() {
		return OapiEduHomeworkTopicCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(topicItems, 20, "topicItems");
	}
	
	/**
	 * 题目列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SyncTopicItem extends TaobaoObject {
		private static final long serialVersionUID = 2572255247898381783L;
		/**
		 * 题目内容扩展
		 */
		@ApiField("addition")
		private String addition;
		/**
		 * 解析
		 */
		@ApiField("analysis")
		private String analysis;
		/**
		 * 答案
		 */
		@ApiField("answer")
		private String answer;
		/**
		 * 扩展属性
		 */
		@ApiField("attributes")
		private String attributes;
		/**
		 * 业务编码
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 知识点
		 */
		@ApiField("point")
		private String point;
		/**
		 * 题目内容
		 */
		@ApiField("question_content")
		private String questionContent;
		/**
		 * 题目ID
		 */
		@ApiField("question_id")
		private String questionId;
		/**
		 * 题目类型
		 */
		@ApiField("question_type")
		private String questionType;
		/**
		 * 学科编码
		 */
		@ApiField("subject_code")
		private String subjectCode;
	
		public String getAddition() {
			return this.addition;
		}
		public void setAddition(String addition) {
			this.addition = addition;
		}
		public String getAnalysis() {
			return this.analysis;
		}
		public void setAnalysis(String analysis) {
			this.analysis = analysis;
		}
		public String getAnswer() {
			return this.answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		public String getAttributes() {
			return this.attributes;
		}
		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public String getPoint() {
			return this.point;
		}
		public void setPoint(String point) {
			this.point = point;
		}
		public String getQuestionContent() {
			return this.questionContent;
		}
		public void setQuestionContent(String questionContent) {
			this.questionContent = questionContent;
		}
		public String getQuestionId() {
			return this.questionId;
		}
		public void setQuestionId(String questionId) {
			this.questionId = questionId;
		}
		public String getQuestionType() {
			return this.questionType;
		}
		public void setQuestionType(String questionType) {
			this.questionType = questionType;
		}
		public String getSubjectCode() {
			return this.subjectCode;
		}
		public void setSubjectCode(String subjectCode) {
			this.subjectCode = subjectCode;
		}
	}
	

}