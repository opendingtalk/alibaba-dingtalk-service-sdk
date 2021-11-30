package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.candidate.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAtsCandidateGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1445819869615914233L;

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
	 * 候选人信息
	 */
	@ApiField("result")
	private TopCandidateVO result;


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

	public void setResult(TopCandidateVO result) {
		this.result = result;
	}
	public TopCandidateVO getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 候选人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopCandidateVO extends TaobaoObject {
		private static final long serialVersionUID = 5264211218139118526L;
		/**
		 * 候选人id
		 */
		@ApiField("candidate_id")
		private String candidateId;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 创建时间，unix毫秒时间戳
		 */
		@ApiField("gmt_create_mils")
		private Long gmtCreateMils;
		/**
		 * 修改时间，unix毫秒时间戳
		 */
		@ApiField("gmt_modified_mils")
		private Long gmtModifiedMils;
		/**
		 * 候选人姓名
		 */
		@ApiField("name")
		private String name;
	
		public String getCandidateId() {
			return this.candidateId;
		}
		public void setCandidateId(String candidateId) {
			this.candidateId = candidateId;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Long getGmtCreateMils() {
			return this.gmtCreateMils;
		}
		public void setGmtCreateMils(Long gmtCreateMils) {
			this.gmtCreateMils = gmtCreateMils;
		}
		public Long getGmtModifiedMils() {
			return this.gmtModifiedMils;
		}
		public void setGmtModifiedMils(Long gmtModifiedMils) {
			this.gmtModifiedMils = gmtModifiedMils;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	


}
