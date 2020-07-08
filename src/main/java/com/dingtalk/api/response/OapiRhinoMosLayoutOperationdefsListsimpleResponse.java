package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.layout.operationdefs.listsimple response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosLayoutOperationdefsListsimpleResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8644558364948263255L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误提示
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 工序定义图
	 */
	@ApiListField("result")
	@ApiField("operation_def_dto")
	private List<OperationDefDto> result;


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

	public void setResult(List<OperationDefDto> result) {
		this.result = result;
	}
	public List<OperationDefDto> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 工序定义图
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationDefDto extends TaobaoObject {
		private static final long serialVersionUID = 7818427527191343976L;
		/**
		 * 适用尺码
		 */
		@ApiField("applicable_size_code")
		private String applicableSizeCode;
		/**
		 * 是否需要调度
		 */
		@ApiField("auto_schedule")
		private Boolean autoSchedule;
		/**
		 * 业务编码
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 业务来源
		 */
		@ApiField("biz_source")
		private String bizSource;
		/**
		 * 进入条件：ANY_MATCHALL_MATCH
		 */
		@ApiField("enter_condition")
		private String enterCondition;
		/**
		 * 执行系统
		 */
		@ApiField("exec_system")
		private String execSystem;
		/**
		 * PaaSflowID（只用于返回，保存会自增）
		 */
		@ApiField("flow_id")
		private Long flowId;
		/**
		 * 工序定义版本
		 */
		@ApiField("flow_version")
		private Long flowVersion;
		/**
		 * 工序名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 工序外部ID
		 */
		@ApiField("operation_external_id")
		private String operationExternalId;
		/**
		 * 工序类型：ASSISTQUALITY_INSPECTTECHNOLOGY
		 */
		@ApiField("operation_type")
		private String operationType;
		/**
		 * 工序唯一ID
		 */
		@ApiField("operation_uid")
		private Long operationUid;
		/**
		 * 工序能力类型：SJPPTR等
		 */
		@ApiField("process_type_code")
		private String processTypeCode;
		/**
		 * 工段CODE：F-SLC..
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * 工段名称：缝制-碎料裁床..
		 */
		@ApiField("section_name")
		private String sectionName;
		/**
		 * 是否跳过(不生产)
		 */
		@ApiField("skip")
		private Boolean skip;
		/**
		 * 标准工时秒
		 */
		@ApiField("std_cost")
		private String stdCost;
	
		public String getApplicableSizeCode() {
			return this.applicableSizeCode;
		}
		public void setApplicableSizeCode(String applicableSizeCode) {
			this.applicableSizeCode = applicableSizeCode;
		}
		public Boolean getAutoSchedule() {
			return this.autoSchedule;
		}
		public void setAutoSchedule(Boolean autoSchedule) {
			this.autoSchedule = autoSchedule;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public String getBizSource() {
			return this.bizSource;
		}
		public void setBizSource(String bizSource) {
			this.bizSource = bizSource;
		}
		public String getEnterCondition() {
			return this.enterCondition;
		}
		public void setEnterCondition(String enterCondition) {
			this.enterCondition = enterCondition;
		}
		public String getExecSystem() {
			return this.execSystem;
		}
		public void setExecSystem(String execSystem) {
			this.execSystem = execSystem;
		}
		public Long getFlowId() {
			return this.flowId;
		}
		public void setFlowId(Long flowId) {
			this.flowId = flowId;
		}
		public Long getFlowVersion() {
			return this.flowVersion;
		}
		public void setFlowVersion(Long flowVersion) {
			this.flowVersion = flowVersion;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOperationExternalId() {
			return this.operationExternalId;
		}
		public void setOperationExternalId(String operationExternalId) {
			this.operationExternalId = operationExternalId;
		}
		public String getOperationType() {
			return this.operationType;
		}
		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}
		public Long getOperationUid() {
			return this.operationUid;
		}
		public void setOperationUid(Long operationUid) {
			this.operationUid = operationUid;
		}
		public String getProcessTypeCode() {
			return this.processTypeCode;
		}
		public void setProcessTypeCode(String processTypeCode) {
			this.processTypeCode = processTypeCode;
		}
		public String getSectionCode() {
			return this.sectionCode;
		}
		public void setSectionCode(String sectionCode) {
			this.sectionCode = sectionCode;
		}
		public String getSectionName() {
			return this.sectionName;
		}
		public void setSectionName(String sectionName) {
			this.sectionName = sectionName;
		}
		public Boolean getSkip() {
			return this.skip;
		}
		public void setSkip(Boolean skip) {
			this.skip = skip;
		}
		public String getStdCost() {
			return this.stdCost;
		}
		public void setStdCost(String stdCost) {
			this.stdCost = stdCost;
		}
	}
	


}
