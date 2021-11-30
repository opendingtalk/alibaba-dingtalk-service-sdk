package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.enterprise.microapp.usedata.stat response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEnterpriseMicroappUsedataStatResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7475394432986895957L;

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
	 * 系统自动生成
	 */
	@ApiListField("result")
	@ApiField("micro_app_data_v_o")
	private List<MicroAppDataVO> result;

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

	public void setResult(List<MicroAppDataVO> result) {
		this.result = result;
	}
	public List<MicroAppDataVO> getResult( ) {
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
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MicroAppDataVO extends TaobaoObject {
		private static final long serialVersionUID = 7762219687925265697L;
		/**
		 * 组织微应用名称
		 */
		@ApiField("agent_name")
		private String agentName;
		/**
		 * 企业ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 最近1天打开微应用用户数
		 */
		@ApiField("open_micro_user_cnt_1d")
		private String openMicroUserCnt1d;
		/**
		 * 最近7天打开微应用用户数
		 */
		@ApiField("open_micro_user_cnt_1w")
		private String openMicroUserCnt1w;
		/**
		 * 查询时间
		 */
		@ApiField("stat_date")
		private String statDate;
	
		public String getAgentName() {
			return this.agentName;
		}
		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getOpenMicroUserCnt1d() {
			return this.openMicroUserCnt1d;
		}
		public void setOpenMicroUserCnt1d(String openMicroUserCnt1d) {
			this.openMicroUserCnt1d = openMicroUserCnt1d;
		}
		public String getOpenMicroUserCnt1w() {
			return this.openMicroUserCnt1w;
		}
		public void setOpenMicroUserCnt1w(String openMicroUserCnt1w) {
			this.openMicroUserCnt1w = openMicroUserCnt1w;
		}
		public String getStatDate() {
			return this.statDate;
		}
		public void setStatDate(String statDate) {
			this.statDate = statDate;
		}
	}
	


}
