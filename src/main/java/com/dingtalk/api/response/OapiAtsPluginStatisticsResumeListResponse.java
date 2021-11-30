package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.plugin.statistics.resume.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAtsPluginStatisticsResumeListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3444743984469936219L;

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
	 * 分页结果
	 */
	@ApiField("result")
	private AtsPageResult result;


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

	public void setResult(AtsPageResult result) {
		this.result = result;
	}
	public AtsPageResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 简历信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopResumeStatisticsVo extends TaobaoObject {
		private static final long serialVersionUID = 2363747635357462636L;
		/**
		 * 招聘业务标识
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 候选人id
		 */
		@ApiField("candidate_id")
		private String candidateId;
		/**
		 * lagou,51job,58tongcheng,zhilian,liepin,boss,other
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 创建时间，unix时间戳，单位毫秒
		 */
		@ApiField("gmt_create_mils")
		private Long gmtCreateMils;
		/**
		 * 更新时间，unix时间戳，单位毫秒
		 */
		@ApiField("gmt_modified_mils")
		private Long gmtModifiedMils;
		/**
		 * 简历id
		 */
		@ApiField("resume_id")
		private String resumeId;
	
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public String getCandidateId() {
			return this.candidateId;
		}
		public void setCandidateId(String candidateId) {
			this.candidateId = candidateId;
		}
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
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
		public String getResumeId() {
			return this.resumeId;
		}
		public void setResumeId(String resumeId) {
			this.resumeId = resumeId;
		}
	}
	
	/**
	 * 分页结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtsPageResult extends TaobaoObject {
		private static final long serialVersionUID = 1548452847952195782L;
		/**
		 * 是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 简历信息列表
		 */
		@ApiListField("list")
		@ApiField("top_resume_statistics_vo")
		private List<TopResumeStatisticsVo> list;
		/**
		 * 游标，下次分页请求使用
		 */
		@ApiField("next_cursor")
		private String nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<TopResumeStatisticsVo> getList() {
			return this.list;
		}
		public void setList(List<TopResumeStatisticsVo> list) {
			this.list = list;
		}
		public String getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(String nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
