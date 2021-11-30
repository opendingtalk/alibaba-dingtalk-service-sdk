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

import com.dingtalk.api.response.OapiEduHomeworkUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.29
 */
public class OapiEduHomeworkUpdateRequest extends BaseTaobaoRequest<OapiEduHomeworkUpdateResponse> {
	
	

	/** 
	* 业务编码
	 */
	private String bizCode;

	/** 
	* 作业ID
	 */
	private Long hwId;

	/** 
	* 幂等标识
	 */
	private String identifier;

	/** 
	* 状态
	 */
	private String status;

	/** 
	* 老师UserId
	 */
	private String teacherUserid;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setHwId(Long hwId) {
		this.hwId = hwId;
	}

	public Long getHwId() {
		return this.hwId;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTeacherUserid(String teacherUserid) {
		this.teacherUserid = teacherUserid;
	}

	public String getTeacherUserid() {
		return this.teacherUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.update";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("hw_id", this.hwId);
		txtParams.put("identifier", this.identifier);
		txtParams.put("status", this.status);
		txtParams.put("teacher_userid", this.teacherUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkUpdateResponse> getResponseClass() {
		return OapiEduHomeworkUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(hwId, "hwId");
		RequestCheckUtils.checkNotEmpty(identifier, "identifier");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(teacherUserid, "teacherUserid");
	}
	

}