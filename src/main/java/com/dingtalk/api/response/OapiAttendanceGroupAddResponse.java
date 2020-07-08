package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4595978427464215413L;

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
	 * 考勤组结果
	 */
	@ApiField("result")
	private TopGroupVo result;

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

	public void setResult(TopGroupVo result) {
		this.result = result;
	}
	public TopGroupVo getResult( ) {
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
	 * 考勤组结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopGroupVo extends TaobaoObject {
		private static final long serialVersionUID = 3729729874544926288L;
		/**
		 * 考勤组id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 考勤组名
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
