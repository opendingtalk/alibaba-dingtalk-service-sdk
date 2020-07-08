package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.microapp.detail.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavMicroappDetailListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2346442145329481594L;

	/** 
	 * 结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 提示信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private MicroAppSummaryResponse result;


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

	public void setResult(MicroAppSummaryResponse result) {
		this.result = result;
	}
	public MicroAppSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 数据列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MicroAppSummaryVo extends TaobaoObject {
		private static final long serialVersionUID = 8787837555976747583L;
		/**
		 * 微应用名
		 */
		@ApiField("micro_app_name")
		private String microAppName;
		/**
		 * 微应用类型
		 */
		@ApiField("micro_app_type")
		private Long microAppType;
		/**
		 * 访问用户数
		 */
		@ApiField("micro_app_user_count")
		private Long microAppUserCount;
	
		public String getMicroAppName() {
			return this.microAppName;
		}
		public void setMicroAppName(String microAppName) {
			this.microAppName = microAppName;
		}
		public Long getMicroAppType() {
			return this.microAppType;
		}
		public void setMicroAppType(Long microAppType) {
			this.microAppType = microAppType;
		}
		public Long getMicroAppUserCount() {
			return this.microAppUserCount;
		}
		public void setMicroAppUserCount(Long microAppUserCount) {
			this.microAppUserCount = microAppUserCount;
		}
	}
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MicroAppSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 8732123982716261435L;
		/**
		 * 数据列表
		 */
		@ApiListField("data")
		@ApiField("micro_app_summary_vo")
		private List<MicroAppSummaryVo> data;
		/**
		 * 是否有下一页；true则存在更多分页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一次请求的分页游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<MicroAppSummaryVo> getData() {
			return this.data;
		}
		public void setData(List<MicroAppSummaryVo> data) {
			this.data = data;
		}
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
	}
	


}
