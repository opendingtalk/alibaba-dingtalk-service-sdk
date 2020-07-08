package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.device.querylist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceDeviceQuerylistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6692187767977894967L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private PageResult result;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 设备类别
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceDetailVO extends TaobaoObject {
		private static final long serialVersionUID = 5624166382668971459L;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 设备id
		 */
		@ApiField("device_id")
		private String deviceId;
		/**
		 * 设备mac
		 */
		@ApiField("device_mac")
		private String deviceMac;
		/**
		 * 设备名称
		 */
		@ApiField("device_name")
		private String deviceName;
		/**
		 * 备注信息
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 设备nick
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 产品标识
		 */
		@ApiField("pk")
		private String pk;
		/**
		 * 设备序列号
		 */
		@ApiField("sn")
		private String sn;
		/**
		 * 绑定的员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
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
		public String getDeviceName() {
			return this.deviceName;
		}
		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getPk() {
			return this.pk;
		}
		public void setPk(String pk) {
			this.pk = pk;
		}
		public String getSn() {
			return this.sn;
		}
		public void setSn(String sn) {
			this.sn = sn;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 2442874669879699263L;
		/**
		 * 是否有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 设备类别
		 */
		@ApiListField("list")
		@ApiField("device_detail_v_o")
		private List<DeviceDetailVO> list;
		/**
		 * 下一页的游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<DeviceDetailVO> getList() {
			return this.list;
		}
		public void setList(List<DeviceDetailVO> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
