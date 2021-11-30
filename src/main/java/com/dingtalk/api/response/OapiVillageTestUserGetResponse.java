package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.village_test.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiVillageTestUserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5895332264739732381L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误原因
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private VillagerInfo result;

	/** 
	 * 成功标识
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
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class VillagerInfo extends TaobaoObject {
		private static final long serialVersionUID = 1238152821386679479L;
		/**
		 * 地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 扩展字段
		 */
		@ApiField("extField")
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
		@ApiField("relateType")
		private String relateType;
		/**
		 * 用户ID
		 */
		@ApiField("staffId")
		private String staffId;
		/**
		 * 用户标签
		 */
		@ApiListField("tags")
		@ApiField("string")
		private List<String> tags;
	
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
		public String getStaffId() {
			return this.staffId;
		}
		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}
		public List<String> getTags() {
			return this.tags;
		}
		public void setTags(List<String> tags) {
			this.tags = tags;
		}
	}
	


}
