package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.extcontact.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpExtcontactListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6357549832888224774L;

	/** 
	 * result
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenExtContact extends TaobaoObject {
		private static final long serialVersionUID = 3531775154339397626L;
		/**
		 * 地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 公司名
		 */
		@ApiField("company_name")
		private String companyName;
		/**
		 * 负责人UserID
		 */
		@ApiField("follower_user_id")
		private String followerUserId;
		/**
		 * 标签
		 */
		@ApiListField("label_ids")
		@ApiField("number")
		private List<Long> labelIds;
		/**
		 * 手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 共享部门ID列表
		 */
		@ApiListField("share_dept_ids")
		@ApiField("number")
		private List<Long> shareDeptIds;
		/**
		 * 共享员工UserID列表
		 */
		@ApiListField("share_user_ids")
		@ApiField("string")
		private List<String> shareUserIds;
		/**
		 * 国家码
		 */
		@ApiField("state_code")
		private String stateCode;
		/**
		 * 职位
		 */
		@ApiField("title")
		private String title;
		/**
		 * 外部联系人UserID
		 */
		@ApiField("userid")
		private String userid;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCompanyName() {
			return this.companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getFollowerUserId() {
			return this.followerUserId;
		}
		public void setFollowerUserId(String followerUserId) {
			this.followerUserId = followerUserId;
		}
		public List<Long> getLabelIds() {
			return this.labelIds;
		}
		public void setLabelIds(List<Long> labelIds) {
			this.labelIds = labelIds;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public List<Long> getShareDeptIds() {
			return this.shareDeptIds;
		}
		public void setShareDeptIds(List<Long> shareDeptIds) {
			this.shareDeptIds = shareDeptIds;
		}
		public List<String> getShareUserIds() {
			return this.shareUserIds;
		}
		public void setShareUserIds(List<String> shareUserIds) {
			this.shareUserIds = shareUserIds;
		}
		public String getStateCode() {
			return this.stateCode;
		}
		public void setStateCode(String stateCode) {
			this.stateCode = stateCode;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7793636397939768413L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiListField("results")
		@ApiField("open_ext_contact")
		private List<OpenExtContact> results;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public List<OpenExtContact> getResults() {
			return this.results;
		}
		public void setResults(List<OpenExtContact> results) {
			this.results = results;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
