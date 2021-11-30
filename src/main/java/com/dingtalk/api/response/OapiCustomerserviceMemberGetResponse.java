package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.member.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCustomerserviceMemberGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5539123498119295733L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 会员卡片信息
	 */
	@ApiField("result")
	private MemberCardDto result;

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

	public void setResult(MemberCardDto result) {
		this.result = result;
	}
	public MemberCardDto getResult( ) {
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
	 * 会员卡片信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MemberCardDto extends TaobaoObject {
		private static final long serialVersionUID = 1596486233773358595L;
		/**
		 * 业务自定义参数
		 */
		@ApiField("customize_fields")
		private String customizeFields;
		/**
		 * 邮箱
		 */
		@ApiField("email")
		private String email;
		/**
		 * 昵称
		 */
		@ApiField("nick")
		private String nick;
	
		public String getCustomizeFields() {
			return this.customizeFields;
		}
		public void setCustomizeFields(String customizeFields) {
			this.customizeFields = customizeFields;
		}
		public void setCustomizeFieldsString(String customizeFields) {
			this.customizeFields = customizeFields;
		}
		
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
	}
	


}
