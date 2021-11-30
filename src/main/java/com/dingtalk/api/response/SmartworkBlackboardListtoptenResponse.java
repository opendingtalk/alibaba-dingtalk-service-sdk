package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.blackboard.listtopten response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartworkBlackboardListtoptenResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6849218929158168354L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiBlackboardVo extends TaobaoObject {
		private static final long serialVersionUID = 3417327592878377783L;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 跳转URL
		 */
		@ApiField("url")
		private String url;
	
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 3467166316926762439L;
		/**
		 * result
		 */
		@ApiListField("blackboard_list")
		@ApiField("oapi_blackboard_vo")
		private List<OapiBlackboardVo> blackboardList;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public List<OapiBlackboardVo> getBlackboardList() {
			return this.blackboardList;
		}
		public void setBlackboardList(List<OapiBlackboardVo> blackboardList) {
			this.blackboardList = blackboardList;
		}
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
