package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiEduTeacherGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.teacher.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.09
 */
public class OapiEduTeacherGetRequest extends BaseTaobaoRequest<OapiEduTeacherGetResponse> {
	
	

	/** 
	* 班级ID
	 */
	private Long classId;

	/** 
	* 用户ID
	 */
	private String teacherUserid;

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setTeacherUserid(String teacherUserid) {
		this.teacherUserid = teacherUserid;
	}

	public String getTeacherUserid() {
		return this.teacherUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.teacher.get";
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
		txtParams.put("class_id", this.classId);
		txtParams.put("teacher_userid", this.teacherUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduTeacherGetResponse> getResponseClass() {
		return OapiEduTeacherGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkNotEmpty(teacherUserid, "teacherUserid");
	}
	

}