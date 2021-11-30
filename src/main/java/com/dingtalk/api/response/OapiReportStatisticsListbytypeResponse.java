package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.report.statistics.listbytype response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiReportStatisticsListbytypeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5665317642116714752L;

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
	 * 统计结果
	 */
	@ApiField("result")
	private ReportPageVo result;

	/** 
	 * 成功
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

	public void setResult(ReportPageVo result) {
		this.result = result;
	}
	public ReportPageVo getResult( ) {
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
	 * 统计结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ReportPageVo extends TaobaoObject {
		private static final long serialVersionUID = 5533165193748954135L;
		/**
		 * 是否还有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一次分页调用的offset值，当返回结果里没有next_cursor时，表示分页结束
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * userid列表
		 */
		@ApiListField("userid_list")
		@ApiField("string")
		private List<String> useridList;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public List<String> getUseridList() {
			return this.useridList;
		}
		public void setUseridList(List<String> useridList) {
			this.useridList = useridList;
		}
	}
	


}
