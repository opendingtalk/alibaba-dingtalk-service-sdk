package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtech.process.batch.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderDtechProcessBatchGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2827191572182446244L;

	/** 
	 * 钉钉响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 响应信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 错误信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 工序信息
	 */
	@ApiListField("model")
	@ApiField("dtech_process_dto")
	private List<DtechProcessDto> model;

	/** 
	 * 调用是否成功
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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(List<DtechProcessDto> model) {
		this.model = model;
	}
	public List<DtechProcessDto> getModel( ) {
		return this.model;
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
	 * 工序实体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessEntityDto extends TaobaoObject {
		private static final long serialVersionUID = 2513122798651972174L;
		/**
		 * 实体对象主数据编码，可能为空
		 */
		@ApiField("bizIdDtechEntity")
		private String bizIdDtechEntity;
		/**
		 * 对象名称
		 */
		@ApiField("entityName")
		private String entityName;
		/**
		 * 对象类型，part：部件，position：部位，action：动作，accessory：辅料，technology：工艺
		 */
		@ApiField("entityType")
		private String entityType;
		/**
		 * 对象名称
		 */
		@ApiField("originEntityName")
		private String originEntityName;
	
		public String getBizIdDtechEntity() {
			return this.bizIdDtechEntity;
		}
		public void setBizIdDtechEntity(String bizIdDtechEntity) {
			this.bizIdDtechEntity = bizIdDtechEntity;
		}
		public String getEntityName() {
			return this.entityName;
		}
		public void setEntityName(String entityName) {
			this.entityName = entityName;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
		public String getOriginEntityName() {
			return this.originEntityName;
		}
		public void setOriginEntityName(String originEntityName) {
			this.originEntityName = originEntityName;
		}
	}
	
	/**
	 * 反馈选项列表，无需反馈时为空列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RuleResultFeedbackDto extends TaobaoObject {
		private static final long serialVersionUID = 6263568978683588872L;
		/**
		 * 是否可接受用户输入
		 */
		@ApiField("accept_user_input")
		private Boolean acceptUserInput;
		/**
		 * 选项bizId
		 */
		@ApiField("bizId_feedback_option")
		private String bizIdFeedbackOption;
		/**
		 * 反馈结果bizId
		 */
		@ApiField("bizId_feedback_result")
		private String bizIdFeedbackResult;
		/**
		 * 备注
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 选项内容
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否选中
		 */
		@ApiField("selected")
		private Boolean selected;
		/**
		 * 排序
		 */
		@ApiField("sort")
		private Long sort;
	
		public Boolean getAcceptUserInput() {
			return this.acceptUserInput;
		}
		public void setAcceptUserInput(Boolean acceptUserInput) {
			this.acceptUserInput = acceptUserInput;
		}
		public String getBizIdFeedbackOption() {
			return this.bizIdFeedbackOption;
		}
		public void setBizIdFeedbackOption(String bizIdFeedbackOption) {
			this.bizIdFeedbackOption = bizIdFeedbackOption;
		}
		public String getBizIdFeedbackResult() {
			return this.bizIdFeedbackResult;
		}
		public void setBizIdFeedbackResult(String bizIdFeedbackResult) {
			this.bizIdFeedbackResult = bizIdFeedbackResult;
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
		public Boolean getSelected() {
			return this.selected;
		}
		public void setSelected(Boolean selected) {
			this.selected = selected;
		}
		public Long getSort() {
			return this.sort;
		}
		public void setSort(Long sort) {
			this.sort = sort;
		}
	}
	
	/**
	 * 规则校验信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RuleResultDto extends TaobaoObject {
		private static final long serialVersionUID = 4242476145312449146L;
		/**
		 * 规则校验结果bizId
		 */
		@ApiField("bizId_rule_result")
		private String bizIdRuleResult;
		/**
		 * 规则平台rule code
		 */
		@ApiField("bp_rule_code")
		private String bpRuleCode;
		/**
		 * 上下文key
		 */
		@ApiField("context_key")
		private String contextKey;
		/**
		 * 反馈选项列表，无需反馈时为空列表
		 */
		@ApiListField("feedback_list")
		@ApiField("rule_result_feedback_dto")
		private List<RuleResultFeedbackDto> feedbackList;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 修改时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 是否有异常
		 */
		@ApiField("has_exception")
		private Boolean hasException;
		/**
		 * 是否命中规则（不通过）
		 */
		@ApiField("hit")
		private Boolean hit;
		/**
		 * 是否匹配（满足执行条件）
		 */
		@ApiField("match")
		private Boolean match;
		/**
		 * 校验结果文案
		 */
		@ApiField("message")
		private String message;
		/**
		 * 特征结果输出变量
		 */
		@ApiField("result_variables")
		private String resultVariables;
		/**
		 * 校验规则名称
		 */
		@ApiField("rule_name")
		private String ruleName;
		/**
		 * 规则结果间的排序
		 */
		@ApiField("sort")
		private Long sort;
	
		public String getBizIdRuleResult() {
			return this.bizIdRuleResult;
		}
		public void setBizIdRuleResult(String bizIdRuleResult) {
			this.bizIdRuleResult = bizIdRuleResult;
		}
		public String getBpRuleCode() {
			return this.bpRuleCode;
		}
		public void setBpRuleCode(String bpRuleCode) {
			this.bpRuleCode = bpRuleCode;
		}
		public String getContextKey() {
			return this.contextKey;
		}
		public void setContextKey(String contextKey) {
			this.contextKey = contextKey;
		}
		public List<RuleResultFeedbackDto> getFeedbackList() {
			return this.feedbackList;
		}
		public void setFeedbackList(List<RuleResultFeedbackDto> feedbackList) {
			this.feedbackList = feedbackList;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Boolean getHasException() {
			return this.hasException;
		}
		public void setHasException(Boolean hasException) {
			this.hasException = hasException;
		}
		public Boolean getHit() {
			return this.hit;
		}
		public void setHit(Boolean hit) {
			this.hit = hit;
		}
		public Boolean getMatch() {
			return this.match;
		}
		public void setMatch(Boolean match) {
			this.match = match;
		}
		public String getMessage() {
			return this.message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getResultVariables() {
			return this.resultVariables;
		}
		public void setResultVariables(String resultVariables) {
			this.resultVariables = resultVariables;
		}
		public String getRuleName() {
			return this.ruleName;
		}
		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}
		public Long getSort() {
			return this.sort;
		}
		public void setSort(Long sort) {
			this.sort = sort;
		}
	}
	
	/**
	 * 工序信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechProcessDto extends TaobaoObject {
		private static final long serialVersionUID = 6366334119812654263L;
		/**
		 * 动作要求
		 */
		@ApiField("action_requirement")
		private String actionRequirement;
		/**
		 * 部件编号
		 */
		@ApiField("bizId_part")
		private String bizIdPart;
		/**
		 * 工序编号
		 */
		@ApiField("bizId_process")
		private String bizIdProcess;
		/**
		 * 工序能力编号
		 */
		@ApiField("bizId_process_capability")
		private String bizIdProcessCapability;
		/**
		 * 工序编码编号
		 */
		@ApiField("bizId_process_code")
		private String bizIdProcessCode;
		/**
		 * 工段分类
		 */
		@ApiField("bizId_process_section")
		private String bizIdProcessSection;
		/**
		 * 设备编号
		 */
		@ApiField("biz_id_machine")
		private String bizIdMachine;
		/**
		 * 工序说明
		 */
		@ApiField("description")
		private String description;
		/**
		 * 工序难度
		 */
		@ApiField("difficulty")
		private String difficulty;
		/**
		 * 面料操作难度
		 */
		@ApiField("fabric_difficulty")
		private String fabricDifficulty;
		/**
		 * 机器时长
		 */
		@ApiField("machine_time")
		private String machineTime;
		/**
		 * 人工时长
		 */
		@ApiField("manual_time")
		private String manualTime;
		/**
		 * 工序名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 此工序是否外发工序
		 */
		@ApiField("out_work")
		private Boolean outWork;
		/**
		 * 部件编码
		 */
		@ApiField("part_code")
		private String partCode;
		/**
		 * 部件名称
		 */
		@ApiField("part_name")
		private String partName;
		/**
		 * 工序实体
		 */
		@ApiListField("processEntityList")
		@ApiField("process_entity_dto")
		private List<ProcessEntityDto> processEntityList;
		/**
		 * 工序能力编码
		 */
		@ApiField("process_capability_code")
		private String processCapabilityCode;
		/**
		 * 工序能力名称
		 */
		@ApiField("process_capability_name")
		private String processCapabilityName;
		/**
		 * 工序编码
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 工段名称
		 */
		@ApiField("process_section_name")
		private String processSectionName;
		/**
		 * 品质要求
		 */
		@ApiField("quality_requirement")
		private String qualityRequirement;
		/**
		 * 规则校验信息
		 */
		@ApiListField("ruleResultList")
		@ApiField("rule_result_dto")
		private List<RuleResultDto> ruleResultList;
		/**
		 * 工序适合的尺码名，默认是：ALL
		 */
		@ApiField("size_key")
		private String sizeKey;
		/**
		 * 标准时长
		 */
		@ApiField("standard_time")
		private String standardTime;
		/**
		 * 工艺要求
		 */
		@ApiField("technological_requirement")
		private String technologicalRequirement;
		/**
		 * 辅助工具
		 */
		@ApiField("tools")
		private String tools;
		/**
		 * 视频文件
		 */
		@ApiField("video")
		private String video;
	
		public String getActionRequirement() {
			return this.actionRequirement;
		}
		public void setActionRequirement(String actionRequirement) {
			this.actionRequirement = actionRequirement;
		}
		public String getBizIdPart() {
			return this.bizIdPart;
		}
		public void setBizIdPart(String bizIdPart) {
			this.bizIdPart = bizIdPart;
		}
		public String getBizIdProcess() {
			return this.bizIdProcess;
		}
		public void setBizIdProcess(String bizIdProcess) {
			this.bizIdProcess = bizIdProcess;
		}
		public String getBizIdProcessCapability() {
			return this.bizIdProcessCapability;
		}
		public void setBizIdProcessCapability(String bizIdProcessCapability) {
			this.bizIdProcessCapability = bizIdProcessCapability;
		}
		public String getBizIdProcessCode() {
			return this.bizIdProcessCode;
		}
		public void setBizIdProcessCode(String bizIdProcessCode) {
			this.bizIdProcessCode = bizIdProcessCode;
		}
		public String getBizIdProcessSection() {
			return this.bizIdProcessSection;
		}
		public void setBizIdProcessSection(String bizIdProcessSection) {
			this.bizIdProcessSection = bizIdProcessSection;
		}
		public String getBizIdMachine() {
			return this.bizIdMachine;
		}
		public void setBizIdMachine(String bizIdMachine) {
			this.bizIdMachine = bizIdMachine;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getDifficulty() {
			return this.difficulty;
		}
		public void setDifficulty(String difficulty) {
			this.difficulty = difficulty;
		}
		public String getFabricDifficulty() {
			return this.fabricDifficulty;
		}
		public void setFabricDifficulty(String fabricDifficulty) {
			this.fabricDifficulty = fabricDifficulty;
		}
		public String getMachineTime() {
			return this.machineTime;
		}
		public void setMachineTime(String machineTime) {
			this.machineTime = machineTime;
		}
		public String getManualTime() {
			return this.manualTime;
		}
		public void setManualTime(String manualTime) {
			this.manualTime = manualTime;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getOutWork() {
			return this.outWork;
		}
		public void setOutWork(Boolean outWork) {
			this.outWork = outWork;
		}
		public String getPartCode() {
			return this.partCode;
		}
		public void setPartCode(String partCode) {
			this.partCode = partCode;
		}
		public String getPartName() {
			return this.partName;
		}
		public void setPartName(String partName) {
			this.partName = partName;
		}
		public List<ProcessEntityDto> getProcessEntityList() {
			return this.processEntityList;
		}
		public void setProcessEntityList(List<ProcessEntityDto> processEntityList) {
			this.processEntityList = processEntityList;
		}
		public String getProcessCapabilityCode() {
			return this.processCapabilityCode;
		}
		public void setProcessCapabilityCode(String processCapabilityCode) {
			this.processCapabilityCode = processCapabilityCode;
		}
		public String getProcessCapabilityName() {
			return this.processCapabilityName;
		}
		public void setProcessCapabilityName(String processCapabilityName) {
			this.processCapabilityName = processCapabilityName;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public String getProcessSectionName() {
			return this.processSectionName;
		}
		public void setProcessSectionName(String processSectionName) {
			this.processSectionName = processSectionName;
		}
		public String getQualityRequirement() {
			return this.qualityRequirement;
		}
		public void setQualityRequirement(String qualityRequirement) {
			this.qualityRequirement = qualityRequirement;
		}
		public List<RuleResultDto> getRuleResultList() {
			return this.ruleResultList;
		}
		public void setRuleResultList(List<RuleResultDto> ruleResultList) {
			this.ruleResultList = ruleResultList;
		}
		public String getSizeKey() {
			return this.sizeKey;
		}
		public void setSizeKey(String sizeKey) {
			this.sizeKey = sizeKey;
		}
		public String getStandardTime() {
			return this.standardTime;
		}
		public void setStandardTime(String standardTime) {
			this.standardTime = standardTime;
		}
		public String getTechnologicalRequirement() {
			return this.technologicalRequirement;
		}
		public void setTechnologicalRequirement(String technologicalRequirement) {
			this.technologicalRequirement = technologicalRequirement;
		}
		public String getTools() {
			return this.tools;
		}
		public void setTools(String tools) {
			this.tools = tools;
		}
		public String getVideo() {
			return this.video;
		}
		public void setVideo(String video) {
			this.video = video;
		}
	}
	


}
