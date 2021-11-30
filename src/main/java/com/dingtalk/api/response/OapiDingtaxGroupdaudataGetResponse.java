package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingtax.groupdaudata.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingtaxGroupdaudataGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4858816529492661383L;

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
	 * 结果返回一个记录列表，列表中每一项包含union_id，open_conversation_id，stat_date三个属性
	 */
	@ApiListField("result")
	@ApiField("dingtax_group_dau_record")
	private List<DingtaxGroupDauRecord> result;

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

	public void setResult(List<DingtaxGroupDauRecord> result) {
		this.result = result;
	}
	public List<DingtaxGroupDauRecord> getResult( ) {
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
	 * 结果返回一个记录列表，列表中每一项包含union_id，open_conversation_id，stat_date三个属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingtaxGroupDauRecord extends TaobaoObject {
		private static final long serialVersionUID = 3462623523458369959L;
		/**
		 * 开放群ID
		 */
		@ApiField("open_conversation_id")
		private String openConversationId;
		/**
		 * 统计日期(格式为 yyyymmdd)
		 */
		@ApiField("stat_date")
		private String statDate;
		/**
		 * 用户的unionId
		 */
		@ApiField("union_id")
		private String unionId;
	
		public String getOpenConversationId() {
			return this.openConversationId;
		}
		public void setOpenConversationId(String openConversationId) {
			this.openConversationId = openConversationId;
		}
		public String getStatDate() {
			return this.statDate;
		}
		public void setStatDate(String statDate) {
			this.statDate = statDate;
		}
		public String getUnionId() {
			return this.unionId;
		}
		public void setUnionId(String unionId) {
			this.unionId = unionId;
		}
	}
	


}
