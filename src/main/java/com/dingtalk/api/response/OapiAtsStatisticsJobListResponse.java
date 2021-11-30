package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.statistics.job.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAtsStatisticsJobListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1738438662248792817L;

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
	 * 职位信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopJobStatisticsVo extends TaobaoObject {
		private static final long serialVersionUID = 3681744558858447955L;
		/**
		 * 招聘业务标识
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 职位创建人id
		 */
		@ApiField("creator_userid")
		private String creatorUserid;
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
		 * 招聘人数
		 */
		@ApiField("head_count")
		private Long headCount;
		/**
		 * 职位id
		 */
		@ApiField("job_id")
		private String jobId;
		/**
		 * 职位归属部门id
		 */
		@ApiField("main_dept_id")
		private Long mainDeptId;
		/**
		 * 职位名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 职位负责人id
		 */
		@ApiField("owner_userid")
		private String ownerUserid;
		/**
		 * 0：新创建  1：已发布  2：废弃  3：招满
		 */
		@ApiField("status")
		private Long status;
	
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
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
		public Long getHeadCount() {
			return this.headCount;
		}
		public void setHeadCount(Long headCount) {
			this.headCount = headCount;
		}
		public String getJobId() {
			return this.jobId;
		}
		public void setJobId(String jobId) {
			this.jobId = jobId;
		}
		public Long getMainDeptId() {
			return this.mainDeptId;
		}
		public void setMainDeptId(Long mainDeptId) {
			this.mainDeptId = mainDeptId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOwnerUserid() {
			return this.ownerUserid;
		}
		public void setOwnerUserid(String ownerUserid) {
			this.ownerUserid = ownerUserid;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	
	/**
	 * 分页结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtsPageResult extends TaobaoObject {
		private static final long serialVersionUID = 1573592418833219267L;
		/**
		 * 是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 职位信息列表
		 */
		@ApiListField("list")
		@ApiField("top_job_statistics_vo")
		private List<TopJobStatisticsVo> list;
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
		public List<TopJobStatisticsVo> getList() {
			return this.list;
		}
		public void setList(List<TopJobStatisticsVo> list) {
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
