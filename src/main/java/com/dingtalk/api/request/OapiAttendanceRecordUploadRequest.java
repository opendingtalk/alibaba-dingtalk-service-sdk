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

import com.dingtalk.api.response.OapiAttendanceRecordUploadResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.record.upload request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.04
 */
public class OapiAttendanceRecordUploadRequest extends BaseTaobaoRequest<OapiAttendanceRecordUploadResponse> {
	
	

	/** 
	* 设备唯一标识
	 */
	private String deviceId;

	/** 
	* 打卡设备名称
	 */
	private String deviceName;

	/** 
	* 打卡备注图片地址，必须是公网可访问的地址
	 */
	private String photoUrl;

	/** 
	* 员工打卡的时间
	 */
	private Long userCheckTime;

	/** 
	* 员工id
	 */
	private String userid;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setUserCheckTime(Long userCheckTime) {
		this.userCheckTime = userCheckTime;
	}

	public Long getUserCheckTime() {
		return this.userCheckTime;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.record.upload";
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
		txtParams.put("device_id", this.deviceId);
		txtParams.put("device_name", this.deviceName);
		txtParams.put("photo_url", this.photoUrl);
		txtParams.put("user_check_time", this.userCheckTime);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceRecordUploadResponse> getResponseClass() {
		return OapiAttendanceRecordUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deviceId, "deviceId");
		RequestCheckUtils.checkNotEmpty(deviceName, "deviceName");
		RequestCheckUtils.checkNotEmpty(userCheckTime, "userCheckTime");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}