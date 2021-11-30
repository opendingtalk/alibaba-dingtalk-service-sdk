package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.cost.center.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripCostCenterQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6694741729357437215L;

	/** 
	 * 成本中心列表
	 */
	@ApiListField("cost_center_list")
	@ApiField("open_cost_center_query_rs")
	private List<OpenCostCenterQueryRs> costCenterList;

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
	 * 成功标识
	 */
	@ApiField("success")
	private Boolean success;


	public void setCostCenterList(List<OpenCostCenterQueryRs> costCenterList) {
		this.costCenterList = costCenterList;
	}
	public List<OpenCostCenterQueryRs> getCostCenterList( ) {
		return this.costCenterList;
	}

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
	 * 绑定人员信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenOrgEntityDo extends TaobaoObject {
		private static final long serialVersionUID = 5395133914338171437L;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 用户部门角色id
		 */
		@ApiField("entity_id")
		private String entityId;
		/**
		 * 人员类型：1用户，2部门，3角色
		 */
		@ApiField("entity_type")
		private String entityType;
		/**
		 * 用户部门角色名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 角色部门下面员工人数
		 */
		@ApiField("user_num")
		private Long userNum;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getEntityId() {
			return this.entityId;
		}
		public void setEntityId(String entityId) {
			this.entityId = entityId;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getUserNum() {
			return this.userNum;
		}
		public void setUserNum(Long userNum) {
			this.userNum = userNum;
		}
	}
	
	/**
	 * 成本中心列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCostCenterQueryRs extends TaobaoObject {
		private static final long serialVersionUID = 8228563599827165428L;
		/**
		 * 绑定支付宝账号
		 */
		@ApiField("alipay_no")
		private String alipayNo;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 绑定人员信息
		 */
		@ApiListField("entity_list")
		@ApiField("open_org_entity_do")
		private List<OpenOrgEntityDo> entityList;
		/**
		 * 商旅成本中心id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 成本中心编号
		 */
		@ApiField("number")
		private String number;
		/**
		 * 适用范围: 1全员，2部分员工
		 */
		@ApiField("scope")
		private Long scope;
		/**
		 * 第三方成本中心id
		 */
		@ApiField("thirdpart_id")
		private String thirdpartId;
		/**
		 * 成本中心名称
		 */
		@ApiField("title")
		private String title;
	
		public String getAlipayNo() {
			return this.alipayNo;
		}
		public void setAlipayNo(String alipayNo) {
			this.alipayNo = alipayNo;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public List<OpenOrgEntityDo> getEntityList() {
			return this.entityList;
		}
		public void setEntityList(List<OpenOrgEntityDo> entityList) {
			this.entityList = entityList;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNumber() {
			return this.number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public Long getScope() {
			return this.scope;
		}
		public void setScope(Long scope) {
			this.scope = scope;
		}
		public String getThirdpartId() {
			return this.thirdpartId;
		}
		public void setThirdpartId(String thirdpartId) {
			this.thirdpartId = thirdpartId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
