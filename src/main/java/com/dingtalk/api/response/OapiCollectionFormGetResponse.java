package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.collection.form.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCollectionFormGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2371394148558949599L;

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
	 * 发送范围
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessVisibleValueVo extends TaobaoObject {
		private static final long serialVersionUID = 3433838746542921798L;
		/**
		 * 可见性类型 0部门 1人员 2角色 3群组cid
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 值
		 */
		@ApiField("value")
		private String value;
	
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormSchemaSettingVo extends TaobaoObject {
		private static final long serialVersionUID = 1258467385575612264L;
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
		 * 是否循环填表
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 6334737377987576128L;
		/**
		 * schema
		 */
		@ApiField("content")
		private String content;
		/**
		 * 创建人
		 */
		@ApiField("creator")
		private String creator;
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
		/**
		 * 应参与人数
		 */
		@ApiField("should_participation_cnt")
		private Long shouldParticipationCnt;
		/**
		 * 发送范围
		 */
		@ApiListField("visible_list")
		@ApiField("process_visible_value_vo")
		private List<ProcessVisibleValueVo> visibleList;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getCreator() {
			return this.creator;
		}
		public void setCreator(String creator) {
			this.creator = creator;
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
		public Long getShouldParticipationCnt() {
			return this.shouldParticipationCnt;
		}
		public void setShouldParticipationCnt(Long shouldParticipationCnt) {
			this.shouldParticipationCnt = shouldParticipationCnt;
		}
		public List<ProcessVisibleValueVo> getVisibleList() {
			return this.visibleList;
		}
		public void setVisibleList(List<ProcessVisibleValueVo> visibleList) {
			this.visibleList = visibleList;
		}
	}
	


}
