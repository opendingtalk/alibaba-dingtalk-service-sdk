package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.approvers.forecast response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessApproversForecastResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8711546772857372741L;

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
	 * 结果
	 */
	@ApiListField("result")
	@ApiField("process_forecast_response")
	private List<ProcessForecastResponse> result;


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

	public void setResult(List<ProcessForecastResponse> result) {
		this.result = result;
	}
	public List<ProcessForecastResponse> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 审批人列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserProfileVo extends TaobaoObject {
		private static final long serialVersionUID = 5116936657449374479L;
		/**
		 * 审批人姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 审批人id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessForecastResponse extends TaobaoObject {
		private static final long serialVersionUID = 7558365788636947663L;
		/**
		 * 审批人列表
		 */
		@ApiListField("approvers")
		@ApiField("user_profile_vo")
		private List<UserProfileVo> approvers;
		/**
		 * 节点名称
		 */
		@ApiField("node_name")
		private String nodeName;
		/**
		 * 节点展示名称
		 */
		@ApiField("node_show_name")
		private String nodeShowName;
	
		public List<UserProfileVo> getApprovers() {
			return this.approvers;
		}
		public void setApprovers(List<UserProfileVo> approvers) {
			this.approvers = approvers;
		}
		public String getNodeName() {
			return this.nodeName;
		}
		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}
		public String getNodeShowName() {
			return this.nodeShowName;
		}
		public void setNodeShowName(String nodeShowName) {
			this.nodeShowName = nodeShowName;
		}
	}
	


}
