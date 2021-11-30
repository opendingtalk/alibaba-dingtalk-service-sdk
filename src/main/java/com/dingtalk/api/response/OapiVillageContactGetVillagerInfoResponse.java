package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.village.contact.getVillagerInfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiVillageContactGetVillagerInfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3847661667826139571L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * *
	 */
	@ApiField("result")
	private VillagerInfo result;

	/** 
	 * success
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

	public void setResult(VillagerInfo result) {
		this.result = result;
	}
	public VillagerInfo getResult( ) {
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
	 * *
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class VillagerInfo extends TaobaoObject {
		private static final long serialVersionUID = 8469522487856313182L;
		/**
		 * 租客地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 扩展字段
		 */
		@ApiField("ext_field")
		private String extField;
		/**
		 * 电话号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 与户主关系
		 */
		@ApiField("relate_type")
		private String relateType;
		/**
		 * 成员标签
		 */
		@ApiListField("tags")
		@ApiField("string")
		private List<String> tags;
		/**
		 * 成员ID
		 */
		@ApiField("user_id")
		private String userId;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getExtField() {
			return this.extField;
		}
		public void setExtField(String extField) {
			this.extField = extField;
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
		public String getRelateType() {
			return this.relateType;
		}
		public void setRelateType(String relateType) {
			this.relateType = relateType;
		}
		public List<String> getTags() {
			return this.tags;
		}
		public void setTags(List<String> tags) {
			this.tags = tags;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
	}
	


}
