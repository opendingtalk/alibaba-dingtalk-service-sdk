package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.union.cooperate.joined.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUnionCooperateJoinedListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2144158352444166422L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误msg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 空间信息
	 */
	@ApiListField("result")
	@ApiField("open_cooperate_org_vo")
	private List<OpenCooperateOrgVo> result;

	/** 
	 * 成功
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

	public void setResult(List<OpenCooperateOrgVo> result) {
		this.result = result;
	}
	public List<OpenCooperateOrgVo> getResult( ) {
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
	 * 空间信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCooperateOrgVo extends TaobaoObject {
		private static final long serialVersionUID = 1179619586696385171L;
		/**
		 * 空间归属企业corpId
		 */
		@ApiField("belong_corp_id")
		private String belongCorpId;
		/**
		 * 空间归属企业名称
		 */
		@ApiField("belong_org_name")
		private String belongOrgName;
		/**
		 * 空间底层组织corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 空间名称
		 */
		@ApiField("org_name")
		private String orgName;
	
		public String getBelongCorpId() {
			return this.belongCorpId;
		}
		public void setBelongCorpId(String belongCorpId) {
			this.belongCorpId = belongCorpId;
		}
		public String getBelongOrgName() {
			return this.belongOrgName;
		}
		public void setBelongOrgName(String belongOrgName) {
			this.belongOrgName = belongOrgName;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
	}
	


}
