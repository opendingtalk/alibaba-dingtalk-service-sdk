package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceShiftAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6748117934757318839L;

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
	 * 班次信息
	 */
	@ApiField("result")
	private TopAtClassVo result;

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

	public void setResult(TopAtClassVo result) {
		this.result = result;
	}
	public TopAtClassVo getResult( ) {
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
	 * 班次信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopAtClassVo extends TaobaoObject {
		private static final long serialVersionUID = 8751994391484994818L;
		/**
		 * 班次id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 班次名称
		 */
		@ApiField("name")
		private String name;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	


}
