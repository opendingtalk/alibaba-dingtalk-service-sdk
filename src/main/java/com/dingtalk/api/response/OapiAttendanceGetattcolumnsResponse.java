package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getattcolumns response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetattcolumnsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5285896176221512132L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private AttColumnsForTopVo result;


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

	public void setResult(AttColumnsForTopVo result) {
		this.result = result;
	}
	public AttColumnsForTopVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 列信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ColumnForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 7627237422857942715L;
		/**
		 * 列别名
		 */
		@ApiField("alias")
		private String alias;
		/**
		 * 列表达式id
		 */
		@ApiField("expression_id")
		private Long expressionId;
		/**
		 * 扩展字段
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 列id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 列名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 列的状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 子类型
		 */
		@ApiField("sub_type")
		private Long subType;
		/**
		 * 列类型
		 */
		@ApiField("type")
		private Long type;
	
		public String getAlias() {
			return this.alias;
		}
		public void setAlias(String alias) {
			this.alias = alias;
		}
		public Long getExpressionId() {
			return this.expressionId;
		}
		public void setExpressionId(Long expressionId) {
			this.expressionId = expressionId;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getSubType() {
			return this.subType;
		}
		public void setSubType(Long subType) {
			this.subType = subType;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AttColumnsForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 3131847344728924294L;
		/**
		 * 列信息
		 */
		@ApiListField("columns")
		@ApiField("column_for_top_vo")
		private List<ColumnForTopVo> columns;
	
		public List<ColumnForTopVo> getColumns() {
			return this.columns;
		}
		public void setColumns(List<ColumnForTopVo> columns) {
			this.columns = columns;
		}
	}
	


}
