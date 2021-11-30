package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.activityinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessActivityinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6833114811874618966L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误消息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 流程节点信息
	 */
	@ApiField("result")
	private ProcessActivityTopVo result;

	/** 
	 * 接口状态
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

	public void setResult(ProcessActivityTopVo result) {
		this.result = result;
	}
	public ProcessActivityTopVo getResult( ) {
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
	 * 节点信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ActivityModel extends TaobaoObject {
		private static final long serialVersionUID = 7575614181753211881L;
		/**
		 * 节点id
		 */
		@ApiField("activity_id")
		private String activityId;
		/**
		 * 节点名字
		 */
		@ApiField("name")
		private String name;
	
		public String getActivityId() {
			return this.activityId;
		}
		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 流程节点信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessActivityTopVo extends TaobaoObject {
		private static final long serialVersionUID = 1396758187252343364L;
		/**
		 * 节点信息列表
		 */
		@ApiListField("models")
		@ApiField("activity_model")
		private List<ActivityModel> models;
		/**
		 * 模板code
		 */
		@ApiField("process_code")
		private String processCode;
	
		public List<ActivityModel> getModels() {
			return this.models;
		}
		public void setModels(List<ActivityModel> models) {
			this.models = models;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
	}
	


}
