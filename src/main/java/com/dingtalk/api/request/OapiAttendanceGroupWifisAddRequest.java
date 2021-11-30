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
import com.dingtalk.api.response.OapiAttendanceGroupWifisAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.wifis.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiAttendanceGroupWifisAddRequest extends BaseTaobaoRequest<OapiAttendanceGroupWifisAddResponse> {
	
	

	/** 
	* 考勤组id
	 */
	private String groupKey;

	/** 
	* 操作人userId
	 */
	private String opUserid;

	/** 
	* wifi列表
	 */
	private String wifiList;

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

	public void setWifiList(String wifiList) {
		this.wifiList = wifiList;
	}

	public void setWifiList(List<Wifi> wifiList) {
		this.wifiList = new JSONWriter(false,false,true).write(wifiList);
	}

	public String getWifiList() {
		return this.wifiList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.wifis.add";
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
		txtParams.put("wifi_list", this.wifiList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupWifisAddResponse> getResponseClass() {
		return OapiAttendanceGroupWifisAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupKey, "groupKey");
		RequestCheckUtils.checkObjectMaxListSize(wifiList, 100, "wifiList");
	}
	
	/**
	 * wifi列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Wifi extends TaobaoObject {
		private static final long serialVersionUID = 3868282899843382117L;
		/**
		 * 业务方wifiId
		 */
		@ApiField("foreign_id")
		private String foreignId;
		/**
		 * mac地址
		 */
		@ApiField("mac_addr")
		private String macAddr;
		/**
		 * mac名称
		 */
		@ApiField("ssid")
		private String ssid;
	
		public String getForeignId() {
			return this.foreignId;
		}
		public void setForeignId(String foreignId) {
			this.foreignId = foreignId;
		}
		public String getMacAddr() {
			return this.macAddr;
		}
		public void setMacAddr(String macAddr) {
			this.macAddr = macAddr;
		}
		public String getSsid() {
			return this.ssid;
		}
		public void setSsid(String ssid) {
			this.ssid = ssid;
		}
	}
	

}