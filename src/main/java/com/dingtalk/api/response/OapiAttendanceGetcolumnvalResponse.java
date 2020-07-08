package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getcolumnval response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetcolumnvalResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1478582473749527965L;

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
	 * 列值数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ColumnDayAndVal extends TaobaoObject {
		private static final long serialVersionUID = 4829843282279232957L;
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
	 * 列信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ColumnForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5747426248761837195L;
		/**
		 * 列id
		 */
		@ApiField("id")
		private Long id;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	}
	
	/**
	 * 列信息与列值数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ColumnValForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 4371584997865638466L;
		/**
		 * 列值数据
		 */
		@ApiListField("column_vals")
		@ApiField("column_day_and_val")
		private List<ColumnDayAndVal> columnVals;
		/**
		 * 列信息
		 */
		@ApiField("column_vo")
		private ColumnForTopVo columnVo;
		/**
		 * 一些不需要计算得固定值，如出勤天数等
		 */
		@ApiField("fixed_value")
		private String fixedValue;
	
		public List<ColumnDayAndVal> getColumnVals() {
			return this.columnVals;
		}
		public void setColumnVals(List<ColumnDayAndVal> columnVals) {
			this.columnVals = columnVals;
		}
		public ColumnForTopVo getColumnVo() {
			return this.columnVo;
		}
		public void setColumnVo(ColumnForTopVo columnVo) {
			this.columnVo = columnVo;
		}
		public String getFixedValue() {
			return this.fixedValue;
		}
		public void setFixedValue(String fixedValue) {
			this.fixedValue = fixedValue;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ColumnValListForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5195188516665438333L;
		/**
		 * 列信息与列值数据
		 */
		@ApiListField("column_vals")
		@ApiField("column_val_for_top_vo")
		private List<ColumnValForTopVo> columnVals;
	
		public List<ColumnValForTopVo> getColumnVals() {
			return this.columnVals;
		}
		public void setColumnVals(List<ColumnValForTopVo> columnVals) {
			this.columnVals = columnVals;
		}
	}
	


}
