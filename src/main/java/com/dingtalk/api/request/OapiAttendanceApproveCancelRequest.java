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

import com.dingtalk.api.response.OapiAttendanceApproveCancelResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.approve.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.03
 */
public class OapiAttendanceApproveCancelRequest extends BaseTaobaoRequest<OapiAttendanceApproveCancelResponse> {
	
	

	/** 
	* 审批单全局唯一id，最大长度100个字符
	 */
	private String approveId;

	/** 
	* 钉钉侧审批单全局唯一id，最大长度64个字符
	 */
	private String dingtalkApproveId;

	/** 
	* 子类型名称，最大长度20个字符
	 */
	private String subType;

	/** 
	* 审批单类型名称，最大长度20个字符
	 */
	private String tagName;

	/** 
	* 员工的user_id
	 */
	private String userid;

	public void setApproveId(String approveId) {
		this.approveId = approveId;
	}

	public String getApproveId() {
		return this.approveId;
	}

	public void setDingtalkApproveId(String dingtalkApproveId) {
		this.dingtalkApproveId = dingtalkApproveId;
	}

	public String getDingtalkApproveId() {
		return this.dingtalkApproveId;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getSubType() {
		return this.subType;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.approve.cancel";
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
		txtParams.put("approve_id", this.approveId);
		txtParams.put("dingtalk_approve_id", this.dingtalkApproveId);
		txtParams.put("sub_type", this.subType);
		txtParams.put("tag_name", this.tagName);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceApproveCancelResponse> getResponseClass() {
		return OapiAttendanceApproveCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(approveId, 100, "approveId");
		RequestCheckUtils.checkMaxLength(dingtalkApproveId, 64, "dingtalkApproveId");
		RequestCheckUtils.checkMaxLength(subType, 20, "subType");
		RequestCheckUtils.checkMaxLength(tagName, 20, "tagName");
	}
	

}