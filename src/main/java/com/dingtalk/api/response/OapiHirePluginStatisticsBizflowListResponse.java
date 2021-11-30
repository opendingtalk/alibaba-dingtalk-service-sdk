package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hire.plugin.statistics.bizflow.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiHirePluginStatisticsBizflowListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6636757133363778128L;

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
	private DdAtsPageResult result;


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

	public void setResult(DdAtsPageResult result) {
		this.result = result;
	}
	public DdAtsPageResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 职位信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopBizFlowStatisticsVo extends TaobaoObject {
		private static final long serialVersionUID = 7441297198156565687L;
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
		 * 创建人userid
		 */
		@ApiField("creator_userid")
		private String creatorUserid;
		/**
		 * 应聘流程id
		 */
		@ApiField("flow_id")
		private String flowId;
		/**
		 * 应聘状态  11：待初筛  12：初筛通过 13：初筛不通过  21： 应聘流程中  22：应聘通过  23：应聘不通过(不录用)  31： offer流程中  32： offer通过(录用)  33：offer失败  34： offer取消(取消录用)  41：待入职  42：已入职
		 */
		@ApiField("flow_status")
		private Long flowStatus;
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
		 * 职位id
		 */
		@ApiField("job_id")
		private String jobId;
		/**
		 * 负责人userid
		 */
		@ApiField("owner_userid")
		private String ownerUserid;
		/**
		 * 应聘id
		 */
		@ApiField("recruit_id")
		private String recruitId;
		/**
		 * 简历id
		 */
		@ApiField("resume_id")
		private String resumeId;
	
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
		public String getCreatorUserid() {
			return this.creatorUserid;
		}
		public void setCreatorUserid(String creatorUserid) {
			this.creatorUserid = creatorUserid;
		}
		public String getFlowId() {
			return this.flowId;
		}
		public void setFlowId(String flowId) {
			this.flowId = flowId;
		}
		public Long getFlowStatus() {
			return this.flowStatus;
		}
		public void setFlowStatus(Long flowStatus) {
			this.flowStatus = flowStatus;
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
		public String getJobId() {
			return this.jobId;
		}
		public void setJobId(String jobId) {
			this.jobId = jobId;
		}
		public String getOwnerUserid() {
			return this.ownerUserid;
		}
		public void setOwnerUserid(String ownerUserid) {
			this.ownerUserid = ownerUserid;
		}
		public String getRecruitId() {
			return this.recruitId;
		}
		public void setRecruitId(String recruitId) {
			this.recruitId = recruitId;
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
	public static class DdAtsPageResult extends TaobaoObject {
		private static final long serialVersionUID = 5774864138515325523L;
		/**
		 * 是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 职位信息列表
		 */
		@ApiListField("list")
		@ApiField("top_biz_flow_statistics_vo")
		private List<TopBizFlowStatisticsVo> list;
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
		public List<TopBizFlowStatisticsVo> getList() {
			return this.list;
		}
		public void setList(List<TopBizFlowStatisticsVo> list) {
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
