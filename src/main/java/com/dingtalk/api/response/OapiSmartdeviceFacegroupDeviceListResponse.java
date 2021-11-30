package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facegroup.device.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceFacegroupDeviceListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5562655184219669457L;

	/** 
	 * 错误代号
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误提示
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 符合条件的当前页数据
	 */
	@ApiField("result")
	private PagedList result;

	/** 
	 * 调用结果
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

	public void setResult(PagedList result) {
		this.result = result;
	}
	public PagedList getResult( ) {
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
	 * 符合条件的设备
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceDto extends TaobaoObject {
		private static final long serialVersionUID = 7687924421849842379L;
		/**
		 * 设备id
		 */
		@ApiField("device_id")
		private Long deviceId;
		/**
		 * 设备名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 在线是否在线
		 */
		@ApiField("online")
		private Boolean online;
		/**
		 * 是否启用识别（查询已绑定记录时有效）
		 */
		@ApiField("status")
		private Boolean status;
		/**
		 * 设备类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 是否已被使用（含被本组关联）
		 */
		@ApiField("used")
		private Boolean used;
	
		public Long getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(Long deviceId) {
			this.deviceId = deviceId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getOnline() {
			return this.online;
		}
		public void setOnline(Boolean online) {
			this.online = online;
		}
		public Boolean getStatus() {
			return this.status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Boolean getUsed() {
			return this.used;
		}
		public void setUsed(Boolean used) {
			this.used = used;
		}
	}
	
	/**
	 * 符合条件的当前页数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PagedList extends TaobaoObject {
		private static final long serialVersionUID = 3598939598283995128L;
		/**
		 * 游标，下一次请求需要传入的下一次请求时需传入的游标值
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 是否还有下一页数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 符合条件的设备
		 */
		@ApiListField("items")
		@ApiField("device_dto")
		private List<DeviceDto> items;
	
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<DeviceDto> getItems() {
			return this.items;
		}
		public void setItems(List<DeviceDto> items) {
			this.items = items;
		}
	}
	


}
