package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.collection.form.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCollectionFormListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7685441616769771187L;

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
	 * 结果
	 */
	@ApiField("result")
	private PageResult result;


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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormSchemaSettingVo extends TaobaoObject {
		private static final long serialVersionUID = 2375867386185164322L;
		/**
		 * 表单类型
		 */
		@ApiField("biz_type")
		private Long bizType;
		/**
		 * 创建时间
		 */
		@ApiField("create_time")
		private Date createTime;
		/**
		 * 填表截止时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 0表示通用智能填表，1表示教育版填表
		 */
		@ApiField("form_type")
		private Long formType;
		/**
		 * 填表周期，周一到周日分别用1-7表示
		 */
		@ApiListField("loop_days")
		@ApiField("number")
		private List<Long> loopDays;
		/**
		 * 填表时间
		 */
		@ApiField("loop_time")
		private String loopTime;
		/**
		 * 应填人数
		 */
		@ApiField("should_participation_cnt")
		private Long shouldParticipationCnt;
		/**
		 * 填表是否终止的标记
		 */
		@ApiField("stop")
		private Boolean stop;
	
		public Long getBizType() {
			return this.bizType;
		}
		public void setBizType(Long bizType) {
			this.bizType = bizType;
		}
		public Date getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public Long getFormType() {
			return this.formType;
		}
		public void setFormType(Long formType) {
			this.formType = formType;
		}
		public List<Long> getLoopDays() {
			return this.loopDays;
		}
		public void setLoopDays(List<Long> loopDays) {
			this.loopDays = loopDays;
		}
		public String getLoopTime() {
			return this.loopTime;
		}
		public void setLoopTime(String loopTime) {
			this.loopTime = loopTime;
		}
		public Long getShouldParticipationCnt() {
			return this.shouldParticipationCnt;
		}
		public void setShouldParticipationCnt(Long shouldParticipationCnt) {
			this.shouldParticipationCnt = shouldParticipationCnt;
		}
		public Boolean getStop() {
			return this.stop;
		}
		public void setStop(Boolean stop) {
			this.stop = stop;
		}
	}
	
	/**
	 * 列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormSchemaResponse extends TaobaoObject {
		private static final long serialVersionUID = 1421839645436969626L;
		/**
		 * 创建人
		 */
		@ApiField("creator")
		private String creator;
		/**
		 * 表单code
		 */
		@ApiField("form_code")
		private String formCode;
		/**
		 * 填表提示
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 填表名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 设置
		 */
		@ApiField("setting")
		private FormSchemaSettingVo setting;
	
		public String getCreator() {
			return this.creator;
		}
		public void setCreator(String creator) {
			this.creator = creator;
		}
		public String getFormCode() {
			return this.formCode;
		}
		public void setFormCode(String formCode) {
			this.formCode = formCode;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public FormSchemaSettingVo getSetting() {
			return this.setting;
		}
		public void setSetting(FormSchemaSettingVo setting) {
			this.setting = setting;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 5617942792282291253L;
		/**
		 * 是否有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 列表
		 */
		@ApiListField("list")
		@ApiField("form_schema_response")
		private List<FormSchemaResponse> list;
		/**
		 * 下次分页的起始offset
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<FormSchemaResponse> getList() {
			return this.list;
		}
		public void setList(List<FormSchemaResponse> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
