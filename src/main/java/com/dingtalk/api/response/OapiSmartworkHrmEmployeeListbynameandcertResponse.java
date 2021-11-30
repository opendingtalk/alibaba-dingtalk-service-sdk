package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.listbynameandcert response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmEmployeeListbynameandcertResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3724497499271944958L;

	/** 
	 * 系统自动生成
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
	 * 结果列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SimpleEmpPersonalInfoVo extends TaobaoObject {
		private static final long serialVersionUID = 6772441788979297978L;
		/**
		 * 身份证号
		 */
		@ApiField("cert_no")
		private String certNo;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 姓名
		 */
		@ApiField("real_name")
		private String realName;
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
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getRealName() {
			return this.realName;
		}
		public void setRealName(String realName) {
			this.realName = realName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5681251893764312332L;
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
		public List<SimpleEmpPersonalInfoVo> getResult() {
			return this.result;
		}
		public void setResult(List<SimpleEmpPersonalInfoVo> result) {
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
