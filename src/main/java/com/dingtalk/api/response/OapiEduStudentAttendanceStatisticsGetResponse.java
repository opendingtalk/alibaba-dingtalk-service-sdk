package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.student.attendance.statistics.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduStudentAttendanceStatisticsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5554716387443122116L;

	/** 
	 * 错误编码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private GetStudentAttendanceStatisticsResponse result;

	/** 
	 * 请求是否成功
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

	public void setResult(GetStudentAttendanceStatisticsResponse result) {
		this.result = result;
	}
	public GetStudentAttendanceStatisticsResponse getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetStudentAttendanceStatisticsResponse extends TaobaoObject {
		private static final long serialVersionUID = 1295293113288345684L;
		/**
		 * 数据(key:统计项名称，value: 统计数量)
		 */
		@ApiField("data")
		private String data;
	
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public void setDataString(String data) {
			this.data = data;
		}
		
	}
	


}
