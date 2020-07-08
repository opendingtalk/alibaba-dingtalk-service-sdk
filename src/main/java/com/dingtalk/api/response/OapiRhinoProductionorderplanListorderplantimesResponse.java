package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.productionorderplan.listorderplantimes response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoProductionorderplanListorderplantimesResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6829166589971387116L;

	/** 
	 * code
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 其他信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回值
	 */
	@ApiListField("model")
	@ApiField("production_order_info_dto")
	private List<ProductionOrderInfoDto> model;


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

	public void setModel(List<ProductionOrderInfoDto> model) {
		this.model = model;
	}
	public List<ProductionOrderInfoDto> getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 小组信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TeamPlanDto extends TaobaoObject {
		private static final long serialVersionUID = 6253438272816678627L;
		/**
		 * 结束时间
		 */
		@ApiField("plan_end_time")
		private Long planEndTime;
		/**
		 * 开始时间
		 */
		@ApiField("plan_star_time")
		private Long planStarTime;
		/**
		 * 小组Code
		 */
		@ApiField("production_team_code")
		private String productionTeamCode;
	
		public Long getPlanEndTime() {
			return this.planEndTime;
		}
		public void setPlanEndTime(Long planEndTime) {
			this.planEndTime = planEndTime;
		}
		public Long getPlanStarTime() {
			return this.planStarTime;
		}
		public void setPlanStarTime(Long planStarTime) {
			this.planStarTime = planStarTime;
		}
		public String getProductionTeamCode() {
			return this.productionTeamCode;
		}
		public void setProductionTeamCode(String productionTeamCode) {
			this.productionTeamCode = productionTeamCode;
		}
	}
	
	/**
	 * 返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SectionTimeDto extends TaobaoObject {
		private static final long serialVersionUID = 4477872754487127921L;
		/**
		 * 结束时间
		 */
		@ApiField("plan_end_time")
		private Long planEndTime;
		/**
		 * 开始时间
		 */
		@ApiField("plan_start_time")
		private Long planStartTime;
		/**
		 * 版本
		 */
		@ApiField("plan_version")
		private String planVersion;
		/**
		 * 订单ID
		 */
		@ApiField("production_order_id")
		private Long productionOrderId;
		/**
		 * 计划ID
		 */
		@ApiField("production_order_plan_id")
		private String productionOrderPlanId;
		/**
		 * 工段
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * 小组信息
		 */
		@ApiListField("teams")
		@ApiField("team_plan_dto")
		private List<TeamPlanDto> teams;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
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
		public String getPlanVersion() {
			return this.planVersion;
		}
		public void setPlanVersion(String planVersion) {
			this.planVersion = planVersion;
		}
		public Long getProductionOrderId() {
			return this.productionOrderId;
		}
		public void setProductionOrderId(Long productionOrderId) {
			this.productionOrderId = productionOrderId;
		}
		public String getProductionOrderPlanId() {
			return this.productionOrderPlanId;
		}
		public void setProductionOrderPlanId(String productionOrderPlanId) {
			this.productionOrderPlanId = productionOrderPlanId;
		}
		public String getSectionCode() {
			return this.sectionCode;
		}
		public void setSectionCode(String sectionCode) {
			this.sectionCode = sectionCode;
		}
		public List<TeamPlanDto> getTeams() {
			return this.teams;
		}
		public void setTeams(List<TeamPlanDto> teams) {
			this.teams = teams;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	
	/**
	 * 返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProductionOrderInfoDto extends TaobaoObject {
		private static final long serialVersionUID = 3518221199541959661L;
		/**
		 * 订单ID
		 */
		@ApiField("production_order_id")
		private Long productionOrderId;
		/**
		 * 返回值
		 */
		@ApiListField("section_time_dtos")
		@ApiField("section_time_dto")
		private List<SectionTimeDto> sectionTimeDtos;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public Long getProductionOrderId() {
			return this.productionOrderId;
		}
		public void setProductionOrderId(Long productionOrderId) {
			this.productionOrderId = productionOrderId;
		}
		public List<SectionTimeDto> getSectionTimeDtos() {
			return this.sectionTimeDtos;
		}
		public void setSectionTimeDtos(List<SectionTimeDto> sectionTimeDtos) {
			this.sectionTimeDtos = sectionTimeDtos;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
