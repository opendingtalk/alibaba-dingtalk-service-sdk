package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.dept.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduDeptListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5458471889127668237L;

	/** 
	 * 错误码，只有success为false时有效
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息，只有success为false有效
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 数据集，不为空。
	 */
	@ApiField("result")
	private OpenEduDeptListResponse result;

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

	public void setResult(OpenEduDeptListResponse result) {
		this.result = result;
	}
	public OpenEduDeptListResponse getResult( ) {
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
	 * 部门节点列表，不空。
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduDeptDetails extends TaobaoObject {
		private static final long serialVersionUID = 4149593794416276164L;
		/**
		 * 部门链
		 */
		@ApiField("chain")
		private String chain;
		/**
		 * 家校通讯录类型。自定义or标准
		 */
		@ApiField("contact_type")
		private String contactType;
		/**
		 * 节点id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 节点类型
		 */
		@ApiField("dept_type")
		private String deptType;
		/**
		 * 节点特有属性
		 */
		@ApiField("feature")
		private String feature;
		/**
		 * 节点名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 可空
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
	 * 数据集，不为空。
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduDeptListResponse extends TaobaoObject {
		private static final long serialVersionUID = 7336238335866566487L;
		/**
		 * 部门节点列表，不空。
		 */
		@ApiListField("details")
		@ApiField("open_edu_dept_details")
		private List<OpenEduDeptDetails> details;
		/**
		 * 是否有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 父部门id
		 */
		@ApiField("super_id")
		private Long superId;
	
		public List<OpenEduDeptDetails> getDetails() {
			return this.details;
		}
		public void setDetails(List<OpenEduDeptDetails> details) {
			this.details = details;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getSuperId() {
			return this.superId;
		}
		public void setSuperId(Long superId) {
			this.superId = superId;
		}
	}
	


}
