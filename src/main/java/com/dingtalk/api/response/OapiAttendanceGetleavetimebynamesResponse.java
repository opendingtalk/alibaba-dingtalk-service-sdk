package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getleavetimebynames response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetleavetimebynamesResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1687976743298555744L;

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
	private ColumnValListForTopVo result;


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

	public void setResult(ColumnValListForTopVo result) {
		this.result = result;
	}
	public ColumnValListForTopVo getResult( ) {
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
		private static final long serialVersionUID = 8521251518922676792L;
		/**
		 * 别名
		 */
		@ApiField("alias")
		private String alias;
		/**
		 * 表达式id
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
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * 列状态
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
	 * 列值数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ColumnDayAndVal extends TaobaoObject {
		private static final long serialVersionUID = 5763868993919292814L;
		/**
		 * 时间
		 */
		@ApiField("date")
		private Date date;
		/**
		 * 列值
		 */
		@ApiField("value")
		private String value;
	
		public Date getDate() {
			return this.date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 列信息与列值数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ColumnValForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 4418226437962443788L;
		/**
		 * 列值数据
		 */
		@ApiListField("columnvals")
		@ApiField("column_day_and_val")
		private List<ColumnDayAndVal> columnvals;
		/**
		 * 列信息
		 */
		@ApiField("columnvo")
		private ColumnForTopVo columnvo;
	
		public List<ColumnDayAndVal> getColumnvals() {
			return this.columnvals;
		}
		public void setColumnvals(List<ColumnDayAndVal> columnvals) {
			this.columnvals = columnvals;
		}
		public ColumnForTopVo getColumnvo() {
			return this.columnvo;
		}
		public void setColumnvo(ColumnForTopVo columnvo) {
			this.columnvo = columnvo;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ColumnValListForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5718966499427614871L;
		/**
		 * 列信息与列值数据
		 */
		@ApiListField("columns")
		@ApiField("column_val_for_top_vo")
		private List<ColumnValForTopVo> columns;
	
		public List<ColumnValForTopVo> getColumns() {
			return this.columns;
		}
		public void setColumns(List<ColumnValForTopVo> columns) {
			this.columns = columns;
		}
	}
	


}
