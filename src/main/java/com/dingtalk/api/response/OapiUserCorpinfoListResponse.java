package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.corpinfo.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserCorpinfoListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8236927413188997598L;

	/** 
	 * 企业列表
	 */
	@ApiListField("corp_list")
	@ApiField("corp_info_vo")
	private List<CorpInfoVo> corpList;

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


	public void setCorpList(List<CorpInfoVo> corpList) {
		this.corpList = corpList;
	}
	public List<CorpInfoVo> getCorpList( ) {
		return this.corpList;
	}

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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 企业列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CorpInfoVo extends TaobaoObject {
		private static final long serialVersionUID = 3177893872877278153L;
		/**
		 * 是否认证，0表示未认证，1表示认证
		 */
		@ApiField("auth_status")
		private Long authStatus;
		/**
		 * 企业名称
		 */
		@ApiField("corp_name")
		private String corpName;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
	
		public Long getAuthStatus() {
			return this.authStatus;
		}
		public void setAuthStatus(Long authStatus) {
			this.authStatus = authStatus;
		}
		public String getCorpName() {
			return this.corpName;
		}
		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
	}
	


}
