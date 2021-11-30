package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.v2.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmEmployeeV2ListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2255797249258777471L;

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
	 * 返回结果
	 */
	@ApiListField("result")
	@ApiField("emp_roster_field_vo")
	private List<EmpRosterFieldVo> result;

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

	public void setResult(List<EmpRosterFieldVo> result) {
		this.result = result;
	}
	public List<EmpRosterFieldVo> getResult( ) {
		return this.result;
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
	 * 字段值列表（明细分组字段包含多条、非明细分组仅一条记录）
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FieldValueVo extends TaobaoObject {
		private static final long serialVersionUID = 8352886553983263413L;
		/**
		 * 标识第几条明细（下标从0开始）
		 */
		@ApiField("item_index")
		private Long itemIndex;
		/**
		 * 字段展示值（选项类型字段对应选项的value）
		 */
		@ApiField("label")
		private String label;
		/**
		 * 字段取值（选项类型字段对应选项的key）
		 */
		@ApiField("value")
		private String value;
	
		public Long getItemIndex() {
			return this.itemIndex;
		}
		public void setItemIndex(Long itemIndex) {
			this.itemIndex = itemIndex;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 字段信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpFieldDataVo extends TaobaoObject {
		private static final long serialVersionUID = 1589768727615876975L;
		/**
		 * 字段标识
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 字段名称
		 */
		@ApiField("field_name")
		private String fieldName;
		/**
		 * 字段值列表（明细分组字段包含多条、非明细分组仅一条记录）
		 */
		@ApiListField("field_value_list")
		@ApiField("field_value_vo")
		private List<FieldValueVo> fieldValueList;
		/**
		 * 分组标识
		 */
		@ApiField("group_id")
		private String groupId;
	
		public String getFieldCode() {
			return this.fieldCode;
		}
		public void setFieldCode(String fieldCode) {
			this.fieldCode = fieldCode;
		}
		public String getFieldName() {
			return this.fieldName;
		}
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
		public List<FieldValueVo> getFieldValueList() {
			return this.fieldValueList;
		}
		public void setFieldValueList(List<FieldValueVo> fieldValueList) {
			this.fieldValueList = fieldValueList;
		}
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpRosterFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 1732331469527311916L;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 字段信息列表
		 */
		@ApiListField("field_data_list")
		@ApiField("emp_field_data_vo")
		private List<EmpFieldDataVo> fieldDataList;
		/**
		 * 根据企业ID和钉钉用户ID生成的唯一ID
		 */
		@ApiField("unionid")
		private String unionid;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public List<EmpFieldDataVo> getFieldDataList() {
			return this.fieldDataList;
		}
		public void setFieldDataList(List<EmpFieldDataVo> fieldDataList) {
			this.fieldDataList = fieldDataList;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
