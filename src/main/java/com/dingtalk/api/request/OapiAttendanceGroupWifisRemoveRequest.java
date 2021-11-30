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

import com.dingtalk.api.response.OapiAttendanceGroupWifisRemoveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.wifis.remove request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiAttendanceGroupWifisRemoveRequest extends BaseTaobaoRequest<OapiAttendanceGroupWifisRemoveResponse> {
	
	

	/** 
	* 考勤组id
	 */
	private String groupKey;

	/** 
	* 操作人userId
	 */
	private String opUserid;

	/** 
	* wifiKeyList
	 */
	private String wifiKeyList;

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}

	public String getGroupKey() {
		return this.groupKey;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setWifiKeyList(String wifiKeyList) {
		this.wifiKeyList = wifiKeyList;
	}

	public String getWifiKeyList() {
		return this.wifiKeyList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.wifis.remove";
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
		txtParams.put("group_key", this.groupKey);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("wifi_key_list", this.wifiKeyList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupWifisRemoveResponse> getResponseClass() {
		return OapiAttendanceGroupWifisRemoveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupKey, "groupKey");
		RequestCheckUtils.checkNotEmpty(wifiKeyList, "wifiKeyList");
		RequestCheckUtils.checkMaxListSize(wifiKeyList, 100, "wifiKeyList");
	}
	

}