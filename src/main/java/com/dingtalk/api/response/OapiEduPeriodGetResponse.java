package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.period.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduPeriodGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7275323131979692721L;

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
	 * result
	 */
	@ApiField("result")
	private PeriodResponse result;

	/** 
	 * 成功状态
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

	public void setResult(PeriodResponse result) {
		this.result = result;
	}
	public PeriodResponse getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PeriodResponse extends TaobaoObject {
		private static final long serialVersionUID = 5662259977248661683L;
		/**
		 * 校区ID
		 */
		@ApiField("campus_id")
		private Long campusId;
		/**
		 * 学段名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 学段名称类型，text表示文本型，如中学为七年级，八年级，九年级，number表示数字型，如初中一年级1班，二年级1班等
		 */
		@ApiField("name_mode")
		private String nameMode;
		/**
		 * 学段别名
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 学段ID
		 */
		@ApiField("period_id")
		private Long periodId;
		/**
		 * 学段类型（幼儿园：kindergarten、小学：primary_school，初中：middle_school，高中：high_school）
		 */
		@ApiField("period_type")
		private String periodType;
	
		public Long getCampusId() {
			return this.campusId;
		}
		public void setCampusId(Long campusId) {
			this.campusId = campusId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNameMode() {
			return this.nameMode;
		}
		public void setNameMode(String nameMode) {
			this.nameMode = nameMode;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public Long getPeriodId() {
			return this.periodId;
		}
		public void setPeriodId(Long periodId) {
			this.periodId = periodId;
		}
		public String getPeriodType() {
			return this.periodType;
		}
		public void setPeriodType(String periodType) {
			this.periodType = periodType;
		}
	}
	


}
