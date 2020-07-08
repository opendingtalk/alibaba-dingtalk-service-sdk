package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.village.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiVillageUserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4387863268844586796L;

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
	 * 结果对象
	 */
	@ApiField("result")
	private VillagerInfo result;

	/** 
	 * 成功标志
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
		private static final long serialVersionUID = 2823595194871756357L;
		/**
		 * 地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 自定义字段
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
		@ApiField("relation")
		private String relation;
		/**
		 * 成员标签
		 */
		@ApiListField("tags")
		@ApiField("string")
		private List<String> tags;
		/**
		 * 成员ID
		 */
		@ApiField("userid")
		private String userid;
	
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
		public String getRelation() {
			return this.relation;
		}
		public void setRelation(String relation) {
			this.relation = relation;
		}
		public List<String> getTags() {
			return this.tags;
		}
		public void setTags(List<String> tags) {
			this.tags = tags;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
