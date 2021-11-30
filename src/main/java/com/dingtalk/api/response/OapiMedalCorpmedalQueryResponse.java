package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.medal.corpmedal.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMedalCorpmedalQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2146844379299358972L;

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
	 * 返回结果
	 */
	@ApiField("result")
	private CorpMedalQueryResponse result;

	/** 
	 * 调用结果
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

	public void setResult(CorpMedalQueryResponse result) {
		this.result = result;
	}
	public CorpMedalQueryResponse getResult( ) {
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
	 * 勋章列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CorpMedalDTO extends TaobaoObject {
		private static final long serialVersionUID = 2829876131234679441L;
		/**
		 * 勋章授予时间
		 */
		@ApiField("grant_time")
		private Date grantTime;
		/**
		 * 勋章模板ID
		 */
		@ApiField("template_id")
		private Long templateId;
		/**
		 * 是否佩戴勋章
		 */
		@ApiField("wear")
		private Boolean wear;
	
		public Date getGrantTime() {
			return this.grantTime;
		}
		public void setGrantTime(Date grantTime) {
			this.grantTime = grantTime;
		}
		public Long getTemplateId() {
			return this.templateId;
		}
		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}
		public Boolean getWear() {
			return this.wear;
		}
		public void setWear(Boolean wear) {
			this.wear = wear;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CorpMedalQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 6144936588968139645L;
		/**
		 * 勋章列表
		 */
		@ApiListField("corp_medal_list")
		@ApiField("corp_medal_d_t_o")
		private List<CorpMedalDTO> corpMedalList;
	
		public List<CorpMedalDTO> getCorpMedalList() {
			return this.corpMedalList;
		}
		public void setCorpMedalList(List<CorpMedalDTO> corpMedalList) {
			this.corpMedalList = corpMedalList;
		}
	}
	


}
