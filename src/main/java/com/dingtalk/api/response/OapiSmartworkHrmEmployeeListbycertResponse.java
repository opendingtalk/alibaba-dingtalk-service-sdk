package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.listbycert response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmEmployeeListbycertResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3479333984828332967L;

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
	 * 结果列表
	 */
	@ApiListField("result")
	@ApiField("simple_emp_personal_info_vo")
	private List<SimpleEmpPersonalInfoVo> result;

	/** 
	 * 调用是否成功
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

	public void setResult(List<SimpleEmpPersonalInfoVo> result) {
		this.result = result;
	}
	public List<SimpleEmpPersonalInfoVo> getResult( ) {
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
	 * 结果列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SimpleEmpPersonalInfoVo extends TaobaoObject {
		private static final long serialVersionUID = 6197241172388582732L;
		/**
		 * 身份证号
		 */
		@ApiField("cert_no")
		private String certNo;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCertNo() {
			return this.certNo;
		}
		public void setCertNo(String certNo) {
			this.certNo = certNo;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
