package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.master.check response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmMasterCheckResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6547238761282112247L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 保存错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 保存结果
	 */
	@ApiListField("result")
	@ApiField("integrate_batch_result_vo")
	private List<IntegrateBatchResultVo> result;

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

	public void setResult(List<IntegrateBatchResultVo> result) {
		this.result = result;
	}
	public List<IntegrateBatchResultVo> getResult( ) {
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
	 * 一条数据的明细
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EntityFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 1683249338553212857L;
		/**
		 * 字段名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 字段string值
		 */
		@ApiField("valueStr")
		private String valueStr;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValueStr() {
			return this.valueStr;
		}
		public void setValueStr(String valueStr) {
			this.valueStr = valueStr;
		}
	}
	
	/**
	 * 保存结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IntegrateBatchResultVo extends TaobaoObject {
		private static final long serialVersionUID = 7883525416983951315L;
		/**
		 * 业务方唯一标识
		 */
		@ApiField("bizUk")
		private String bizUk;
		/**
		 * 一条数据的明细
		 */
		@ApiListField("fieldList")
		@ApiField("entity_field_vo")
		private List<EntityFieldVo> fieldList;
		/**
		 * 关联id, 一般为userId
		 */
		@ApiField("relationId")
		private String relationId;
	
		public String getBizUk() {
			return this.bizUk;
		}
		public void setBizUk(String bizUk) {
			this.bizUk = bizUk;
		}
		public List<EntityFieldVo> getFieldList() {
			return this.fieldList;
		}
		public void setFieldList(List<EntityFieldVo> fieldList) {
			this.fieldList = fieldList;
		}
		public String getRelationId() {
			return this.relationId;
		}
		public void setRelationId(String relationId) {
			this.relationId = relationId;
		}
	}
	


}
