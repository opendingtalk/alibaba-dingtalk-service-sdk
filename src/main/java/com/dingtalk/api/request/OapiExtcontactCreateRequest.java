package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiExtcontactCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.extcontact.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiExtcontactCreateRequest extends BaseTaobaoRequest<OapiExtcontactCreateResponse> {
	
	

	/** 
	* 外部联系人信息
	 */
	private String contact;

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setContact(OpenExtContact contact) {
		this.contact = new JSONWriter(false,false,true).write(contact);
	}

	public String getContact() {
		return this.contact;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.extcontact.create";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("contact", this.contact);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiExtcontactCreateResponse> getResponseClass() {
		return OapiExtcontactCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 外部联系人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenExtContact extends TaobaoObject {
		private static final long serialVersionUID = 5376261123136313423L;
		/**
		 * 地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 企业名
		 */
		@ApiField("company_name")
		private String companyName;
		/**
		 * 负责人userId
		 */
		@ApiField("follower_user_id")
		private String followerUserId;
		/**
		 * 标签列表
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
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 共享给的部门ID
		 */
		@ApiListField("share_dept_ids")
		@ApiField("number")
		private List<Long> shareDeptIds;
		/**
		 * 共享给的员工userId列表
		 */
		@ApiListField("share_user_ids")
		@ApiField("string")
		private List<String> shareUserIds;
		/**
		 * 手机号国家码
		 */
		@ApiField("state_code")
		private String stateCode;
		/**
		 * 职位
		 */
		@ApiField("title")
		private String title;
	
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
	}
	

}