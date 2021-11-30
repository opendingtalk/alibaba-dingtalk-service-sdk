package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.employee.process.capacity.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoHumanresEmployeeProcessCapacityQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8699573627831251346L;

	/** 
	 * 1
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 1
	 */
	@ApiField("externalMsgInfo")
	private String externalMsgInfo;

	/** 
	 * 返回code
	 */
	@ApiField("hsfcode")
	private Long hsfcode;

	/** 
	 * 返回结果
	 */
	@ApiListField("model")
	@ApiField("employee_process_capacity_statistic_dto")
	private List<EmployeeProcessCapacityStatisticDto> model;

	/** 
	 * 是否成功
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

	public void setHsfcode(Long hsfcode) {
		this.hsfcode = hsfcode;
	}
	public Long getHsfcode( ) {
		return this.hsfcode;
	}

	public void setModel(List<EmployeeProcessCapacityStatisticDto> model) {
		this.model = model;
	}
	public List<EmployeeProcessCapacityStatisticDto> getModel( ) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmployeeProcessCapacityStatisticDto extends TaobaoObject {
		private static final long serialVersionUID = 5535225627131556967L;
		/**
		 * 订单品类
		 */
		@ApiField("category")
		private String category;
		/**
		 * 工序技能id
		 */
		@ApiField("process_capacity_id")
		private Long processCapacityId;
		/**
		 * 结构化工序id
		 */
		@ApiField("process_structural_cluster_id")
		private Long processStructuralClusterId;
		/**
		 * 经验值
		 */
		@ApiField("production_quantity")
		private Long productionQuantity;
		/**
		 * 统计类型
		 */
		@ApiField("statistic_category")
		private Long statisticCategory;
		/**
		 * 统计值
		 */
		@ApiField("statistics_value")
		private String statisticsValue;
		/**
		 * 租户
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 工号
		 */
		@ApiField("work_no")
		private String workNo;
	
		public String getCategory() {
			return this.category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public Long getProcessCapacityId() {
			return this.processCapacityId;
		}
		public void setProcessCapacityId(Long processCapacityId) {
			this.processCapacityId = processCapacityId;
		}
		public Long getProcessStructuralClusterId() {
			return this.processStructuralClusterId;
		}
		public void setProcessStructuralClusterId(Long processStructuralClusterId) {
			this.processStructuralClusterId = processStructuralClusterId;
		}
		public Long getProductionQuantity() {
			return this.productionQuantity;
		}
		public void setProductionQuantity(Long productionQuantity) {
			this.productionQuantity = productionQuantity;
		}
		public Long getStatisticCategory() {
			return this.statisticCategory;
		}
		public void setStatisticCategory(Long statisticCategory) {
			this.statisticCategory = statisticCategory;
		}
		public String getStatisticsValue() {
			return this.statisticsValue;
		}
		public void setStatisticsValue(String statisticsValue) {
			this.statisticsValue = statisticsValue;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getWorkNo() {
			return this.workNo;
		}
		public void setWorkNo(String workNo) {
			this.workNo = workNo;
		}
	}
	


}
