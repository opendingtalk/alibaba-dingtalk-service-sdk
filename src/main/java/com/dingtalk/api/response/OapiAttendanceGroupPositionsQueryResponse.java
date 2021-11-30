package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.positions.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupPositionsQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5495833888129184572L;

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
	 * position列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Position extends TaobaoObject {
		private static final long serialVersionUID = 6897247312338248528L;
		/**
		 * 地址描述
		 */
		@ApiField("address")
		private String address;
		/**
		 * 纬度(支持6位小数)
		 */
		@ApiField("latitude")
		private String latitude;
		/**
		 * 经度(支持6位小数)
		 */
		@ApiField("longitude")
		private String longitude;
		/**
		 * positionKey
		 */
		@ApiField("position_key")
		private String positionKey;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getLatitude() {
			return this.latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return this.longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getPositionKey() {
			return this.positionKey;
		}
		public void setPositionKey(String positionKey) {
			this.positionKey = positionKey;
		}
	}
	
	/**
	 * 查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 7257926261482251571L;
		/**
		 * 是否更多
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * position列表
		 */
		@ApiListField("position_list")
		@ApiField("position")
		private List<Position> positionList;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<Position> getPositionList() {
			return this.positionList;
		}
		public void setPositionList(List<Position> positionList) {
			this.positionList = positionList;
		}
	}
	
	/**
	 * 出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5893254377759375114L;
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
		 * 查询结果
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
