package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.positions.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupPositionsAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5578265885673821114L;

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
	public static class Position extends TaobaoObject {
		private static final long serialVersionUID = 8849553657628157478L;
		/**
		 * 地址描述
		 */
		@ApiField("address")
		private String address;
		/**
		 * 业务方positionId
		 */
		@ApiField("foreign_id")
		private String foreignId;
		/**
		 * 经度(支持6位小数)
		 */
		@ApiField("latitude")
		private String latitude;
		/**
		 * 纬度(支持6位小数)
		 */
		@ApiField("longitude")
		private String longitude;
		/**
		 * positionKey，失败时为空
		 */
		@ApiField("position_key")
		private String positionKey;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getForeignId() {
			return this.foreignId;
		}
		public void setForeignId(String foreignId) {
			this.foreignId = foreignId;
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
	 * 错误列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ErrorInfo extends TaobaoObject {
		private static final long serialVersionUID = 1136493554397764458L;
		/**
		 * 错误码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 失败列表
		 */
		@ApiListField("failure_list")
		@ApiField("position")
		private List<Position> failureList;
		/**
		 * 错误信息
		 */
		@ApiField("msg")
		private String msg;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public List<Position> getFailureList() {
			return this.failureList;
		}
		public void setFailureList(List<Position> failureList) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 7735377736911298763L;
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
		@ApiField("position")
		private List<Position> successList;
	
		public List<ErrorInfo> getErrorInfoList() {
			return this.errorInfoList;
		}
		public void setErrorInfoList(List<ErrorInfo> errorInfoList) {
			this.errorInfoList = errorInfoList;
		}
		public List<Position> getSuccessList() {
			return this.successList;
		}
		public void setSuccessList(List<Position> successList) {
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
		private static final long serialVersionUID = 7571182697241745597L;
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
		 * 结果
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
