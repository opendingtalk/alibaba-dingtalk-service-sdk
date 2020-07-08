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

import com.dingtalk.api.response.OapiAttendanceGetleaverecordsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getleaverecords request
 * 
 * @author top auto create
 * @since 1.0, 2019.03.28
 */
public class OapiAttendanceGetleaverecordsRequest extends BaseTaobaoRequest<OapiAttendanceGetleaverecordsResponse> {
	
	

	/** 
	* 系统自动生成
	 */
	private String corpid;

	/** 
	* leave_code
	 */
	private String leaveCode;

	/** 
	* offset
	 */
	private Long offset;

	/** 
	* opUserId
	 */
	private String opUserid;

	/** 
	* size
	 */
	private Long size;

	/** 
	* suiteKey
	 */
	private String suiteKey;

	/** 
	* tokenGrantType
	 */
	private Long tokenGrantType;

	/** 
	* userIds
	 */
	private String userIds;

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setLeaveCode(String leaveCode) {
		this.leaveCode = leaveCode;
	}

	public String getLeaveCode() {
		return this.leaveCode;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public void setTokenGrantType(Long tokenGrantType) {
		this.tokenGrantType = tokenGrantType;
	}

	public Long getTokenGrantType() {
		return this.tokenGrantType;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.getleaverecords";
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
		txtParams.put("corpid", this.corpid);
		txtParams.put("leave_code", this.leaveCode);
		txtParams.put("offset", this.offset);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("size", this.size);
		txtParams.put("suite_key", this.suiteKey);
		txtParams.put("token_grant_type", this.tokenGrantType);
		txtParams.put("userIds", this.userIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGetleaverecordsResponse> getResponseClass() {
		return OapiAttendanceGetleaverecordsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpid, "corpid");
		RequestCheckUtils.checkNotEmpty(leaveCode, "leaveCode");
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkNotEmpty(suiteKey, "suiteKey");
		RequestCheckUtils.checkNotEmpty(tokenGrantType, "tokenGrantType");
		RequestCheckUtils.checkMaxListSize(userIds, 20, "userIds");
	}
	

}