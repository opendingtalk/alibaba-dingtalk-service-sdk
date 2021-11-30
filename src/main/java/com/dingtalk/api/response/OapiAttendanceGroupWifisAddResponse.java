package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.wifis.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupWifisAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5821196271361751547L;

	/** 
	 * 出参
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 失败列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Wifi extends TaobaoObject {
		private static final long serialVersionUID = 8644329147785398475L;
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
		/**
		 * wifiKey
		 */
		@ApiField("wifi_key")
		private String wifiKey;
	
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
		public String getWifiKey() {
			return this.wifiKey;
		}
		public void setWifiKey(String wifiKey) {
			this.wifiKey = wifiKey;
		}
	}
	
	/**
	 * 错误列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ErrorInfo extends TaobaoObject {
		private static final long serialVersionUID = 2899591674587865774L;
		/**
		 * 错误码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 失败列表
		 */
		@ApiListField("failure_list")
		@ApiField("wifi")
		private List<Wifi> failureList;
		/**
		 * 错误描述
		 */
		@ApiField("msg")
		private String msg;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public List<Wifi> getFailureList() {
			return this.failureList;
		}
		public void setFailureList(List<Wifi> failureList) {
			this.failureList = failureList;
		}
		public String getMsg() {
			return this.msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
	}
	
	/**
	 * 添加wifi结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 1772663885985925269L;
		/**
		 * 错误列表
		 */
		@ApiListField("error_info_list")
		@ApiField("error_info")
		private List<ErrorInfo> errorInfoList;
		/**
		 * 成功列表
		 */
		@ApiListField("success_list")
		@ApiField("wifi")
		private List<Wifi> successList;
	
		public List<ErrorInfo> getErrorInfoList() {
			return this.errorInfoList;
		}
		public void setErrorInfoList(List<ErrorInfo> errorInfoList) {
			this.errorInfoList = errorInfoList;
		}
		public List<Wifi> getSuccessList() {
			return this.successList;
		}
		public void setSuccessList(List<Wifi> successList) {
			this.successList = successList;
		}
	}
	
	/**
	 * 出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2639279816788917629L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 错误信息
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 添加wifi结果
		 */
		@ApiField("result")
		private Result result;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public Result getResult() {
			return this.result;
		}
		public void setResult(Result result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
