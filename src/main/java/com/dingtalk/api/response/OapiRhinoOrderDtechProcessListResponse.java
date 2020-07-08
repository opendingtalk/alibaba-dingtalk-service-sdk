package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtech.process.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderDtechProcessListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2653798854186238399L;

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
	@ApiField("mes_dtech_process_dto")
	private List<MesDtechProcessDto> model;

	/** 
	 * 是否调用成功
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

	public void setModel(List<MesDtechProcessDto> model) {
		this.model = model;
	}
	public List<MesDtechProcessDto> getModel( ) {
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
	 * 符合的标准列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechStandardDto extends TaobaoObject {
		private static final long serialVersionUID = 2416915855241587639L;
		/**
		 * 标准id
		 */
		@ApiField("bizId_production_standard")
		private String bizIdProductionStandard;
		/**
		 * 标准id code
		 */
		@ApiField("production_standard_name")
		private String productionStandardName;
		/**
		 * 标准属性
		 */
		@ApiField("standard_feature")
		private String standardFeature;
	
		public String getBizIdProductionStandard() {
			return this.bizIdProductionStandard;
		}
		public void setBizIdProductionStandard(String bizIdProductionStandard) {
			this.bizIdProductionStandard = bizIdProductionStandard;
		}
		public String getProductionStandardName() {
			return this.productionStandardName;
		}
		public void setProductionStandardName(String productionStandardName) {
			this.productionStandardName = productionStandardName;
		}
		public String getStandardFeature() {
			return this.standardFeature;
		}
		public void setStandardFeature(String standardFeature) {
			this.standardFeature = standardFeature;
		}
		public void setStandardFeatureString(String standardFeature) {
			this.standardFeature = standardFeature;
		}
		
	}
	
	/**
	 * 工序参数列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechProcessExtParamDto extends TaobaoObject {
		private static final long serialVersionUID = 4455838611694656152L;
		/**
		 * 实际属性
		 */
		@ApiField("actual_feature")
		private String actualFeature;
		/**
		 * 符合的标准列表
		 */
		@ApiListField("implemented_standard_list")
		@ApiField("dtech_standard_dto")
		private List<DtechStandardDto> implementedStandardList;
		/**
		 * 尺码名称
		 */
		@ApiField("size_type")
		private String sizeType;
	
		public String getActualFeature() {
			return this.actualFeature;
		}
		public void setActualFeature(String actualFeature) {
			this.actualFeature = actualFeature;
		}
		public void setActualFeatureString(String actualFeature) {
			this.actualFeature = actualFeature;
		}
		
		public List<DtechStandardDto> getImplementedStandardList() {
			return this.implementedStandardList;
		}
		public void setImplementedStandardList(List<DtechStandardDto> implementedStandardList) {
			this.implementedStandardList = implementedStandardList;
		}
		public String getSizeType() {
			return this.sizeType;
		}
		public void setSizeType(String sizeType) {
			this.sizeType = sizeType;
		}
	}
	
	/**
	 * 工序信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MesDtechProcessDto extends TaobaoObject {
		private static final long serialVersionUID = 1695396733164441946L;
		/**
		 * 工序编号
		 */
		@ApiField("biz_id_process")
		private String bizIdProcess;
		/**
		 * 数字工艺包id
		 */
		@ApiField("dtech_pkg_id")
		private Long dtechPkgId;
		/**
		 * 是否绣印花设备
		 */
		@ApiField("embro_machine")
		private Boolean embroMachine;
		/**
		 * 工序参数列表
		 */
		@ApiListField("ext_params")
		@ApiField("dtech_process_ext_param_dto")
		private List<DtechProcessExtParamDto> extParams;
		/**
		 * 面料操作难度
		 */
		@ApiField("fabric_level")
		private String fabricLevel;
		/**
		 * 主键id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 机器设备
		 */
		@ApiField("machine_code")
		private String machineCode;
		/**
		 * 机器名称
		 */
		@ApiField("machine_name")
		private String machineName;
		/**
		 * 机器时长
		 */
		@ApiField("machine_time")
		private String machineTime;
		/**
		 * 版本号
		 */
		@ApiField("machine_version")
		private String machineVersion;
		/**
		 * 人工时长
		 */
		@ApiField("manual_time")
		private String manualTime;
		/**
		 * 下一级工序code
		 */
		@ApiField("next_process_code")
		private String nextProcessCode;
		/**
		 * 部件编号
		 */
		@ApiField("part_code")
		private String partCode;
		/**
		 * 部件名称
		 */
		@ApiField("part_name")
		private String partName;
		/**
		 * 工序编号
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 工序描述
		 */
		@ApiField("process_desc")
		private String processDesc;
		/**
		 * 工序难度
		 */
		@ApiField("process_level")
		private String processLevel;
		/**
		 * 工序名称
		 */
		@ApiField("process_name")
		private String processName;
		/**
		 * 工序类型code
		 */
		@ApiField("process_type_code")
		private String processTypeCode;
		/**
		 * 工序类型名称
		 */
		@ApiField("process_type_name")
		private String processTypeName;
		/**
		 * 品质要求
		 */
		@ApiField("quality_desc")
		private String qualityDesc;
		/**
		 * 工艺要求
		 */
		@ApiField("requirement")
		private String requirement;
		/**
		 * 工段分类
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * 工段名称
		 */
		@ApiField("section_name")
		private String sectionName;
		/**
		 * 标准时长
		 */
		@ApiField("standard_time")
		private String standardTime;
		/**
		 * 工具
		 */
		@ApiField("tools")
		private String tools;
		/**
		 * 视频url
		 */
		@ApiField("video")
		private String video;
	
		public String getBizIdProcess() {
			return this.bizIdProcess;
		}
		public void setBizIdProcess(String bizIdProcess) {
			this.bizIdProcess = bizIdProcess;
		}
		public Long getDtechPkgId() {
			return this.dtechPkgId;
		}
		public void setDtechPkgId(Long dtechPkgId) {
			this.dtechPkgId = dtechPkgId;
		}
		public Boolean getEmbroMachine() {
			return this.embroMachine;
		}
		public void setEmbroMachine(Boolean embroMachine) {
			this.embroMachine = embroMachine;
		}
		public List<DtechProcessExtParamDto> getExtParams() {
			return this.extParams;
		}
		public void setExtParams(List<DtechProcessExtParamDto> extParams) {
			this.extParams = extParams;
		}
		public String getFabricLevel() {
			return this.fabricLevel;
		}
		public void setFabricLevel(String fabricLevel) {
			this.fabricLevel = fabricLevel;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getMachineCode() {
			return this.machineCode;
		}
		public void setMachineCode(String machineCode) {
			this.machineCode = machineCode;
		}
		public String getMachineName() {
			return this.machineName;
		}
		public void setMachineName(String machineName) {
			this.machineName = machineName;
		}
		public String getMachineTime() {
			return this.machineTime;
		}
		public void setMachineTime(String machineTime) {
			this.machineTime = machineTime;
		}
		public String getMachineVersion() {
			return this.machineVersion;
		}
		public void setMachineVersion(String machineVersion) {
			this.machineVersion = machineVersion;
		}
		public String getManualTime() {
			return this.manualTime;
		}
		public void setManualTime(String manualTime) {
			this.manualTime = manualTime;
		}
		public String getNextProcessCode() {
			return this.nextProcessCode;
		}
		public void setNextProcessCode(String nextProcessCode) {
			this.nextProcessCode = nextProcessCode;
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
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public String getProcessDesc() {
			return this.processDesc;
		}
		public void setProcessDesc(String processDesc) {
			this.processDesc = processDesc;
		}
		public String getProcessLevel() {
			return this.processLevel;
		}
		public void setProcessLevel(String processLevel) {
			this.processLevel = processLevel;
		}
		public String getProcessName() {
			return this.processName;
		}
		public void setProcessName(String processName) {
			this.processName = processName;
		}
		public String getProcessTypeCode() {
			return this.processTypeCode;
		}
		public void setProcessTypeCode(String processTypeCode) {
			this.processTypeCode = processTypeCode;
		}
		public String getProcessTypeName() {
			return this.processTypeName;
		}
		public void setProcessTypeName(String processTypeName) {
			this.processTypeName = processTypeName;
		}
		public String getQualityDesc() {
			return this.qualityDesc;
		}
		public void setQualityDesc(String qualityDesc) {
			this.qualityDesc = qualityDesc;
		}
		public String getRequirement() {
			return this.requirement;
		}
		public void setRequirement(String requirement) {
			this.requirement = requirement;
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
		public String getStandardTime() {
			return this.standardTime;
		}
		public void setStandardTime(String standardTime) {
			this.standardTime = standardTime;
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
