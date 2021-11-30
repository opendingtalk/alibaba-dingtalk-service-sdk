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
import com.dingtalk.api.response.OapiEduCirclePostListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.circle.post.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.24
 */
public class OapiEduCirclePostListRequest extends BaseTaobaoRequest<OapiEduCirclePostListResponse> {
	
	

	/** 
	* 1
	 */
	private String openFeedQueryParam;

	public void setOpenFeedQueryParam(String openFeedQueryParam) {
		this.openFeedQueryParam = openFeedQueryParam;
	}

	public void setOpenFeedQueryParam(OpenFeedQueryParam openFeedQueryParam) {
		this.openFeedQueryParam = new JSONWriter(false,false,true).write(openFeedQueryParam);
	}

	public String getOpenFeedQueryParam() {
		return this.openFeedQueryParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.circle.post.list";
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
		txtParams.put("open_feed_query_param", this.openFeedQueryParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCirclePostListResponse> getResponseClass() {
		return OapiEduCirclePostListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenFeedQueryParam extends TaobaoObject {
		private static final long serialVersionUID = 4537526169391941531L;
		/**
		 * 1
		 */
		@ApiField("biz_type")
		private Long bizType;
		/**
		 * 1
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 1
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 1
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 1
		 */
		@ApiField("feed_type")
		private Long feedType;
		/**
		 * 1
		 */
		@ApiField("student_id")
		private String studentId;
		/**
		 * 1
		 */
		@ApiField("topic_id")
		private Long topicId;
		/**
		 * 1
		 */
		@ApiField("user_role")
		private String userRole;
		/**
		 * 1
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getBizType() {
			return this.bizType;
		}
		public void setBizType(Long bizType) {
			this.bizType = bizType;
		}
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public Long getFeedType() {
			return this.feedType;
		}
		public void setFeedType(Long feedType) {
			this.feedType = feedType;
		}
		public String getStudentId() {
			return this.studentId;
		}
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
		public Long getTopicId() {
			return this.topicId;
		}
		public void setTopicId(Long topicId) {
			this.topicId = topicId;
		}
		public String getUserRole() {
			return this.userRole;
		}
		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}