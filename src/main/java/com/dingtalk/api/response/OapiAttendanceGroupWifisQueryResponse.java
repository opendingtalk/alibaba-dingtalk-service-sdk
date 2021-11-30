package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.wifis.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupWifisQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7172262523367792337L;

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
	 * wifi列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Wifi extends TaobaoObject {
		private static final long serialVersionUID = 7835158959517174211L;
		/**
		 * mac地址
		 */
		@ApiField("mac_addr")
		private String macAddr;
		/**
		 * wifi名称
		 */
		@ApiField("ssid")
		private String ssid;
		/**
		 * wifiKey
		 */
		@ApiField("wifi_key")
		private String wifiKey;
	
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
	 * 查询wifi列表结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 7394548954599647129L;
		/**
		 * 是否更多
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * wifi列表
		 */
		@ApiListField("wifi_list")
		@ApiField("wifi")
		private List<Wifi> wifiList;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<Wifi> getWifiList() {
			return this.wifiList;
		}
		public void setWifiList(List<Wifi> wifiList) {
			this.wifiList = wifiList;
		}
	}
	
	/**
	 * 出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7625584177957536313L;
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
		 * 查询wifi列表结果
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
