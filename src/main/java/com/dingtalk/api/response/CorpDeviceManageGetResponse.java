package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.device.manage.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpDeviceManageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5787545355854247947L;

	/** 
	 * result
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenDeviceDetailVo extends TaobaoObject {
		private static final long serialVersionUID = 5141179683591596422L;
		/**
		 * 设备ID
		 */
		@ApiField("device_id")
		private String deviceId;
		/**
		 * 设备Mac地址
		 */
		@ApiField("device_mac")
		private String deviceMac;
		/**
		 * 设备类型名称
		 */
		@ApiField("device_type_name")
		private String deviceTypeName;
		/**
		 * 设备昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 设备硬件版本号
		 */
		@ApiField("version")
		private String version;
	
		public String getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
		public String getDeviceMac() {
			return this.deviceMac;
		}
		public void setDeviceMac(String deviceMac) {
			this.deviceMac = deviceMac;
		}
		public String getDeviceTypeName() {
			return this.deviceTypeName;
		}
		public void setDeviceTypeName(String deviceTypeName) {
			this.deviceTypeName = deviceTypeName;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7729275475732831384L;
		/**
		 * 错误码
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiField("result")
		private OpenDeviceDetailVo result;
		/**
		 * 请求是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public OpenDeviceDetailVo getResult() {
			return this.result;
		}
		public void setResult(OpenDeviceDetailVo result) {
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
