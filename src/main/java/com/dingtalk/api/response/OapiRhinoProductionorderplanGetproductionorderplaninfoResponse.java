package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.productionorderplan.getproductionorderplaninfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoProductionorderplanGetproductionorderplaninfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5153376673747723345L;

	/** 
	 * code
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * message
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * model
	 */
	@ApiField("model")
	private DetailProductionOrderPlanDto model;


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

	public void setModel(DetailProductionOrderPlanDto model) {
		this.model = model;
	}
	public DetailProductionOrderPlanDto getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 事项排产计划
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ItemPlanDto extends TaobaoObject {
		private static final long serialVersionUID = 3437942499142829622L;
		/**
		 * 包大小
		 */
		@ApiField("batchSize")
		private Long batchSize;
		/**
		 * 事项code
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 事项名称
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * 计划完成时间
		 */
		@ApiField("planEndTime")
		private Long planEndTime;
		/**
		 * 计划开始时间
		 */
		@ApiField("planStartTime")
		private Long planStartTime;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * sam
		 */
		@ApiField("sam")
		private String sam;
		/**
		 * sam 比重
		 */
		@ApiField("samWeight")
		private String samWeight;
		/**
		 * 工段顺序
		 */
		@ApiField("sectionOrder")
		private Long sectionOrder;
		/**
		 * 此事项的排产使用人数
		 */
		@ApiField("useEmpNum")
		private Long useEmpNum;
	
		public Long getBatchSize() {
			return this.batchSize;
		}
		public void setBatchSize(Long batchSize) {
			this.batchSize = batchSize;
		}
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public Long getPlanEndTime() {
			return this.planEndTime;
		}
		public void setPlanEndTime(Long planEndTime) {
			this.planEndTime = planEndTime;
		}
		public Long getPlanStartTime() {
			return this.planStartTime;
		}
		public void setPlanStartTime(Long planStartTime) {
			this.planStartTime = planStartTime;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getSam() {
			return this.sam;
		}
		public void setSam(String sam) {
			this.sam = sam;
		}
		public String getSamWeight() {
			return this.samWeight;
		}
		public void setSamWeight(String samWeight) {
			this.samWeight = samWeight;
		}
		public Long getSectionOrder() {
			return this.sectionOrder;
		}
		public void setSectionOrder(Long sectionOrder) {
			this.sectionOrder = sectionOrder;
		}
		public Long getUseEmpNum() {
			return this.useEmpNum;
		}
		public void setUseEmpNum(Long useEmpNum) {
			this.useEmpNum = useEmpNum;
		}
	}
	
	/**
	 * 生产小组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProductionTeamPlanList extends TaobaoObject {
		private static final long serialVersionUID = 8222349825523822448L;
		/**
		 * 批大小
		 */
		@ApiField("batchSize")
		private String batchSize;
		/**
		 * 人时成本
		 */
		@ApiField("cost")
		private Long cost;
		/**
		 * 周期时间
		 */
		@ApiField("cycle_time")
		private Long cycleTime;
		/**
		 * detailProductionOrderPlanDTO
		 */
		@ApiField("detailProductionOrderPlanDTO")
		private String detailProductionOrderPlanDTO;
		/**
		 * 小组人数
		 */
		@ApiField("empNum")
		private Long empNum;
		/**
		 * 结束时间
		 */
		@ApiField("planEndTime")
		private Long planEndTime;
		/**
		 * 开始时间
		 */
		@ApiField("plan_start_time")
		private Long planStartTime;
		/**
		 * 生产小组Code
		 */
		@ApiField("productionTeamCode")
		private String productionTeamCode;
		/**
		 * 生产订单id
		 */
		@ApiField("production_order_id")
		private Long productionOrderId;
		/**
		 * 事项排产计划
		 */
		@ApiField("production_team_plan_detail_dtos")
		private String productionTeamPlanDetailDtos;
		/**
		 * 工段
		 */
		@ApiField("sectionCode")
		private String sectionCode;
		/**
		 * 小组时间策略
		 */
		@ApiField("teamTimePolicy")
		private String teamTimePolicy;
		/**
		 * 租户ID
		 */
		@ApiField("tenantId")
		private String tenantId;
		/**
		 * 使用的人数
		 */
		@ApiField("useEmpNum")
		private Long useEmpNum;
	
		public String getBatchSize() {
			return this.batchSize;
		}
		public void setBatchSize(String batchSize) {
			this.batchSize = batchSize;
		}
		public Long getCost() {
			return this.cost;
		}
		public void setCost(Long cost) {
			this.cost = cost;
		}
		public Long getCycleTime() {
			return this.cycleTime;
		}
		public void setCycleTime(Long cycleTime) {
			this.cycleTime = cycleTime;
		}
		public String getDetailProductionOrderPlanDTO() {
			return this.detailProductionOrderPlanDTO;
		}
		public void setDetailProductionOrderPlanDTO(String detailProductionOrderPlanDTO) {
			this.detailProductionOrderPlanDTO = detailProductionOrderPlanDTO;
		}
		public Long getEmpNum() {
			return this.empNum;
		}
		public void setEmpNum(Long empNum) {
			this.empNum = empNum;
		}
		public Long getPlanEndTime() {
			return this.planEndTime;
		}
		public void setPlanEndTime(Long planEndTime) {
			this.planEndTime = planEndTime;
		}
		public Long getPlanStartTime() {
			return this.planStartTime;
		}
		public void setPlanStartTime(Long planStartTime) {
			this.planStartTime = planStartTime;
		}
		public String getProductionTeamCode() {
			return this.productionTeamCode;
		}
		public void setProductionTeamCode(String productionTeamCode) {
			this.productionTeamCode = productionTeamCode;
		}
		public Long getProductionOrderId() {
			return this.productionOrderId;
		}
		public void setProductionOrderId(Long productionOrderId) {
			this.productionOrderId = productionOrderId;
		}
		public String getProductionTeamPlanDetailDtos() {
			return this.productionTeamPlanDetailDtos;
		}
		public void setProductionTeamPlanDetailDtos(String productionTeamPlanDetailDtos) {
			this.productionTeamPlanDetailDtos = productionTeamPlanDetailDtos;
		}
		public String getSectionCode() {
			return this.sectionCode;
		}
		public void setSectionCode(String sectionCode) {
			this.sectionCode = sectionCode;
		}
		public String getTeamTimePolicy() {
			return this.teamTimePolicy;
		}
		public void setTeamTimePolicy(String teamTimePolicy) {
			this.teamTimePolicy = teamTimePolicy;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public Long getUseEmpNum() {
			return this.useEmpNum;
		}
		public void setUseEmpNum(Long useEmpNum) {
			this.useEmpNum = useEmpNum;
		}
	}
	
	/**
	 * 工段排产
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SectionPlanList extends TaobaoObject {
		private static final long serialVersionUID = 4116975744888284917L;
		/**
		 * 修改时间
		 */
		@ApiField("gmt_modified")
		private Long gmtModified;
		/**
		 * 事项排产计划
		 */
		@ApiListField("item_plan_list")
		@ApiField("item_plan_dto")
		private List<ItemPlanDto> itemPlanList;
		/**
		 * 来源
		 */
		@ApiField("materialKittingSource")
		private String materialKittingSource;
		/**
		 * 修改人
		 */
		@ApiField("modifier")
		private String modifier;
		/**
		 * 结束时间
		 */
		@ApiField("planEndTime")
		private Long planEndTime;
		/**
		 * 开始时间
		 */
		@ApiField("plan_start_time")
		private Long planStartTime;
		/**
		 * 生产小组
		 */
		@ApiListField("production_team_plan_list")
		@ApiField("production_team_plan_list")
		private List<ProductionTeamPlanList> productionTeamPlanList;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * sam值
		 */
		@ApiField("sam")
		private String sam;
		/**
		 * 工段
		 */
		@ApiField("sectionName")
		private String sectionName;
		/**
		 * 工段
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * 建议
		 */
		@ApiField("suggest")
		private String suggest;
	
		public Long getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
		public List<ItemPlanDto> getItemPlanList() {
			return this.itemPlanList;
		}
		public void setItemPlanList(List<ItemPlanDto> itemPlanList) {
			this.itemPlanList = itemPlanList;
		}
		public String getMaterialKittingSource() {
			return this.materialKittingSource;
		}
		public void setMaterialKittingSource(String materialKittingSource) {
			this.materialKittingSource = materialKittingSource;
		}
		public String getModifier() {
			return this.modifier;
		}
		public void setModifier(String modifier) {
			this.modifier = modifier;
		}
		public Long getPlanEndTime() {
			return this.planEndTime;
		}
		public void setPlanEndTime(Long planEndTime) {
			this.planEndTime = planEndTime;
		}
		public Long getPlanStartTime() {
			return this.planStartTime;
		}
		public void setPlanStartTime(Long planStartTime) {
			this.planStartTime = planStartTime;
		}
		public List<ProductionTeamPlanList> getProductionTeamPlanList() {
			return this.productionTeamPlanList;
		}
		public void setProductionTeamPlanList(List<ProductionTeamPlanList> productionTeamPlanList) {
			this.productionTeamPlanList = productionTeamPlanList;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getSam() {
			return this.sam;
		}
		public void setSam(String sam) {
			this.sam = sam;
		}
		public String getSectionName() {
			return this.sectionName;
		}
		public void setSectionName(String sectionName) {
			this.sectionName = sectionName;
		}
		public String getSectionCode() {
			return this.sectionCode;
		}
		public void setSectionCode(String sectionCode) {
			this.sectionCode = sectionCode;
		}
		public String getSuggest() {
			return this.suggest;
		}
		public void setSuggest(String suggest) {
			this.suggest = suggest;
		}
	}
	
	/**
	 * model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DetailProductionOrderPlanDto extends TaobaoObject {
		private static final long serialVersionUID = 4127789258544677854L;
		/**
		 * id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 排产策略
		 */
		@ApiField("latest_plan_deliver_policy")
		private String latestPlanDeliverPolicy;
		/**
		 * 结束时间
		 */
		@ApiField("planEndTime")
		private Long planEndTime;
		/**
		 * 开始时间
		 */
		@ApiField("plan_start_time")
		private Long planStartTime;
		/**
		 * 排产策略
		 */
		@ApiField("policy")
		private String policy;
		/**
		 * 工段排产
		 */
		@ApiListField("section_plan_list")
		@ApiField("section_plan_list")
		private List<SectionPlanList> sectionPlanList;
		/**
		 * 订正状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 租户
		 */
		@ApiField("tenantId")
		private String tenantId;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLatestPlanDeliverPolicy() {
			return this.latestPlanDeliverPolicy;
		}
		public void setLatestPlanDeliverPolicy(String latestPlanDeliverPolicy) {
			this.latestPlanDeliverPolicy = latestPlanDeliverPolicy;
		}
		public Long getPlanEndTime() {
			return this.planEndTime;
		}
		public void setPlanEndTime(Long planEndTime) {
			this.planEndTime = planEndTime;
		}
		public Long getPlanStartTime() {
			return this.planStartTime;
		}
		public void setPlanStartTime(Long planStartTime) {
			this.planStartTime = planStartTime;
		}
		public String getPolicy() {
			return this.policy;
		}
		public void setPolicy(String policy) {
			this.policy = policy;
		}
		public List<SectionPlanList> getSectionPlanList() {
			return this.sectionPlanList;
		}
		public void setSectionPlanList(List<SectionPlanList> sectionPlanList) {
			this.sectionPlanList = sectionPlanList;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
