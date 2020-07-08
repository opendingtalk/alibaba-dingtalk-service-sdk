package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.dept.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduDeptGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6273833132671965136L;

	/** 
	 * 错误码，只有在success为false时才有效
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息，只有在success为false时才有效
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果集
	 */
	@ApiField("result")
	private Result result;

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

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
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
	 * 部门详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduDeptDetail extends TaobaoObject {
		private static final long serialVersionUID = 1118643541914661692L;
		/**
		 * 部门链，不包括当前部门
		 */
		@ApiField("chain")
		private String chain;
		/**
		 * 通讯录类型。自定义or经典模型
		 */
		@ApiField("contact_type")
		private String contactType;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 部门节点类型
		 */
		@ApiField("dept_type")
		private String deptType;
		/**
		 * 部门节点特有属性
		 */
		@ApiField("feature")
		private String feature;
		/**
		 * 部门名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 部门nick
		 */
		@ApiField("nick")
		private String nick;
	
		public String getChain() {
			return this.chain;
		}
		public void setChain(String chain) {
			this.chain = chain;
		}
		public String getContactType() {
			return this.contactType;
		}
		public void setContactType(String contactType) {
			this.contactType = contactType;
		}
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getDeptType() {
			return this.deptType;
		}
		public void setDeptType(String deptType) {
			this.deptType = deptType;
		}
		public String getFeature() {
			return this.feature;
		}
		public void setFeature(String feature) {
			this.feature = feature;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
	}
	
	/**
	 * 结果集
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3643331463273716245L;
		/**
		 * 部门详情
		 */
		@ApiField("detail")
		private OpenEduDeptDetail detail;
	
		public OpenEduDeptDetail getDetail() {
			return this.detail;
		}
		public void setDetail(OpenEduDeptDetail detail) {
			this.detail = detail;
		}
	}
	


}
