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
import com.dingtalk.api.response.OapiEduClassStudentBatchgetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.class.student.batchget request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.19
 */
public class OapiEduClassStudentBatchgetRequest extends BaseTaobaoRequest<OapiEduClassStudentBatchgetResponse> {
	
	

	/** 
	* 请求体
	 */
	private String requestParam;

	public void setRequestParam(String requestParam) {
		this.requestParam = requestParam;
	}

	public void setRequestParam(List<OpenEduSelectStudentRequest> requestParam) {
		this.requestParam = new JSONWriter(false,false,true).write(requestParam);
	}

	public String getRequestParam() {
		return this.requestParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.class.student.batchget";
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
		txtParams.put("request_param", this.requestParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduClassStudentBatchgetResponse> getResponseClass() {
		return OapiEduClassStudentBatchgetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(requestParam, 999, "requestParam");
	}
	
	/**
	 * 学生入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenStudentParam extends TaobaoObject {
		private static final long serialVersionUID = 3223445576397339482L;
		/**
		 * 班级id
		 */
		@ApiField("classId")
		private String classId;
		/**
		 * 班级列表
		 */
		@ApiListField("studentIds")
		@ApiField("string")
		private List<String> studentIds;
	
		public String getClassId() {
			return this.classId;
		}
		public void setClassId(String classId) {
			this.classId = classId;
		}
		public List<String> getStudentIds() {
			return this.studentIds;
		}
		public void setStudentIds(List<String> studentIds) {
			this.studentIds = studentIds;
		}
	}
	
	/**
	 * 请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduSelectStudentRequest extends TaobaoObject {
		private static final long serialVersionUID = 6674212976736797215L;
		/**
		 * 班级id
		 */
		@ApiField("classId")
		private Long classId;
		/**
		 * corpId
		 */
		@ApiField("corpId")
		private String corpId;
		/**
		 * 学生入参
		 */
		@ApiListField("studentParam")
		@ApiField("open_student_param")
		private List<OpenStudentParam> studentParam;
		/**
		 * 用户id
		 */
		@ApiField("userId")
		private String userId;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public List<OpenStudentParam> getStudentParam() {
			return this.studentParam;
		}
		public void setStudentParam(List<OpenStudentParam> studentParam) {
			this.studentParam = studentParam;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
	}
	

}