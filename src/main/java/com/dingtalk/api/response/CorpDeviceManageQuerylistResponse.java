package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.device.manage.querylist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpDeviceManageQuerylistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2856568516277572478L;

	/** 
	 * 返回结果
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
	 * 设备列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenDeviceVo extends TaobaoObject {
		private static final long serialVersionUID = 1714214598548975158L;
		/**
		 * 设备头像
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * 设备ID
		 */
		@ApiField("device_id")
		private String deviceId;
		/**
		 * 设备MAC地址
		 */
		@ApiField("device_mac")
		private String deviceMac;
		/**
		 * 设备SN
		 */
		@ApiField("device_sn")
		private String deviceSn;
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
		 * 设备在线状态{1:在线，0:不在线}
		 */
		@ApiField("on_line_status")
		private Long onLineStatus;
	
		public String getAvatar() {
			return this.avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
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
		public String getDeviceSn() {
			return this.deviceSn;
		}
		public void setDeviceSn(String deviceSn) {
			this.deviceSn = deviceSn;
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
		public Long getOnLineStatus() {
			return this.onLineStatus;
		}
		public void setOnLineStatus(Long onLineStatus) {
			this.onLineStatus = onLineStatus;
		}
	}
	
	/**
	 * 返回的Page对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageVo extends TaobaoObject {
		private static final long serialVersionUID = 5574275615339735315L;
		/**
		 * 设备列表
		 */
		@ApiListField("list")
		@ApiField("open_device_vo")
		private List<OpenDeviceVo> list;
		/**
		 * 下次拉取列表的游标，如果为Null，代表没有数据了
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<OpenDeviceVo> getList() {
			return this.list;
		}
		public void setList(List<OpenDeviceVo> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 1779141654936833542L;
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
		 * 返回的Page对象
		 */
		@ApiField("result")
		private PageVo result;
		/**
		 * request是否成功
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
		public PageVo getResult() {
			return this.result;
		}
		public void setResult(PageVo result) {
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
