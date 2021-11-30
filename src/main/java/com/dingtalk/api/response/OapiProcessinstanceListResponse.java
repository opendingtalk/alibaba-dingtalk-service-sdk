package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessinstanceListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4866154321488433896L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
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
	 * 审批表单变量组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentValueVo extends TaobaoObject {
		private static final long serialVersionUID = 1785593735471487732L;
		/**
		 * 组件类型
		 */
		@ApiField("component_type")
		private String componentType;
		/**
		 * 表单额外值
		 */
		@ApiField("ext_value")
		private String extValue;
		/**
		 * 组件id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 表单标签名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 表单标签值
		 */
		@ApiField("value")
		private String value;
	
		public String getComponentType() {
			return this.componentType;
		}
		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}
		public String getExtValue() {
			return this.extValue;
		}
		public void setExtValue(String extValue) {
			this.extValue = extValue;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessInstanceTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5442563176822316649L;
		/**
		 * 审批人列表
		 */
		@ApiListField("approver_userid_list")
		@ApiField("string")
		private List<String> approverUseridList;
		/**
		 * 流程实例业务编号
		 */
		@ApiField("business_id")
		private String businessId;
		/**
		 * 抄送人列表
		 */
		@ApiListField("cc_userid_list")
		@ApiField("string")
		private List<String> ccUseridList;
		/**
		 * 开始时间
		 */
		@ApiField("create_time")
		private Date createTime;
		/**
		 * 结束时间
		 */
		@ApiField("finish_time")
		private Date finishTime;
		/**
		 * 审批表单变量组
		 */
		@ApiListField("form_component_values")
		@ApiField("form_component_value_vo")
		private List<FormComponentValueVo> formComponentValues;
		/**
		 * 发起人部门id
		 */
		@ApiField("originator_dept_id")
		private String originatorDeptId;
		/**
		 * 发起人userid
		 */
		@ApiField("originator_userid")
		private String originatorUserid;
		/**
		 * 审批实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 审批结果，分为agree和refuse
		 */
		@ApiField("process_instance_result")
		private String processInstanceResult;
		/**
		 * 审批状态，分为NEW（刚创建）|RUNNING（运行中）|TERMINATED（被终止）|COMPLETED（完成）|CANCELED（取消）
		 */
		@ApiField("status")
		private String status;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public List<String> getApproverUseridList() {
			return this.approverUseridList;
		}
		public void setApproverUseridList(List<String> approverUseridList) {
			this.approverUseridList = approverUseridList;
		}
		public String getBusinessId() {
			return this.businessId;
		}
		public void setBusinessId(String businessId) {
			this.businessId = businessId;
		}
		public List<String> getCcUseridList() {
			return this.ccUseridList;
		}
		public void setCcUseridList(List<String> ccUseridList) {
			this.ccUseridList = ccUseridList;
		}
		public Date getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public Date getFinishTime() {
			return this.finishTime;
		}
		public void setFinishTime(Date finishTime) {
			this.finishTime = finishTime;
		}
		public List<FormComponentValueVo> getFormComponentValues() {
			return this.formComponentValues;
		}
		public void setFormComponentValues(List<FormComponentValueVo> formComponentValues) {
			this.formComponentValues = formComponentValues;
		}
		public String getOriginatorDeptId() {
			return this.originatorDeptId;
		}
		public void setOriginatorDeptId(String originatorDeptId) {
			this.originatorDeptId = originatorDeptId;
		}
		public String getOriginatorUserid() {
			return this.originatorUserid;
		}
		public void setOriginatorUserid(String originatorUserid) {
			this.originatorUserid = originatorUserid;
		}
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
		public String getProcessInstanceResult() {
			return this.processInstanceResult;
		}
		public void setProcessInstanceResult(String processInstanceResult) {
			this.processInstanceResult = processInstanceResult;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 1128182892462991239L;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("process_instance_top_vo")
		private List<ProcessInstanceTopVo> list;
		/**
		 * 表示下次查询的游标，当返回结果没有该字段时表示没有更多数据了
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<ProcessInstanceTopVo> getList() {
			return this.list;
		}
		public void setList(List<ProcessInstanceTopVo> list) {
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
