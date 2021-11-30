package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.user.bindquery response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRetailUserBindqueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6443452399657889629L;

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
	 * xx
	 */
	@ApiField("result")
	private UserBindDto result;

	/** 
	 * 成功失败
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

	public void setResult(UserBindDto result) {
		this.result = result;
	}
	public UserBindDto getResult( ) {
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
	 * 帐号列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ApplyUserDto extends TaobaoObject {
		private static final long serialVersionUID = 4748667669272596389L;
		/**
		 * 业务渠道
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 扩展字段
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 主帐号ID
		 */
		@ApiField("outer_id")
		private String outerId;
		/**
		 * 主帐号名称
		 */
		@ApiField("outer_nick")
		private String outerNick;
		/**
		 * 子帐号ID
		 */
		@ApiField("outer_sub_id")
		private String outerSubId;
		/**
		 * 子帐号名称
		 */
		@ApiField("outer_sub_nick")
		private String outerSubNick;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getOuterId() {
			return this.outerId;
		}
		public void setOuterId(String outerId) {
			this.outerId = outerId;
		}
		public String getOuterNick() {
			return this.outerNick;
		}
		public void setOuterNick(String outerNick) {
			this.outerNick = outerNick;
		}
		public String getOuterSubId() {
			return this.outerSubId;
		}
		public void setOuterSubId(String outerSubId) {
			this.outerSubId = outerSubId;
		}
		public String getOuterSubNick() {
			return this.outerSubNick;
		}
		public void setOuterSubNick(String outerSubNick) {
			this.outerSubNick = outerSubNick;
		}
	}
	
	/**
	 * xx
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserBindDto extends TaobaoObject {
		private static final long serialVersionUID = 6836466434351331799L;
		/**
		 * 中心组织唯一ID
		 */
		@ApiField("associate_union_id")
		private String associateUnionId;
		/**
		 * 扩展字段
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 帐号列表
		 */
		@ApiListField("outer_list")
		@ApiField("apply_user_dto")
		private List<ApplyUserDto> outerList;
		/**
		 * token
		 */
		@ApiField("token")
		private String token;
	
		public String getAssociateUnionId() {
			return this.associateUnionId;
		}
		public void setAssociateUnionId(String associateUnionId) {
			this.associateUnionId = associateUnionId;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public List<ApplyUserDto> getOuterList() {
			return this.outerList;
		}
		public void setOuterList(List<ApplyUserDto> outerList) {
			this.outerList = outerList;
		}
		public String getToken() {
			return this.token;
		}
		public void setToken(String token) {
			this.token = token;
		}
	}
	


}
