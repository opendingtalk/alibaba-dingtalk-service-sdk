package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.processability.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoDeviceProcessabilityGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6717612539661519482L;

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
	 * 扩展信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 返回数据
	 */
	@ApiListField("model")
	@ApiField("device_instance_with_process_resp")
	private List<DeviceInstanceWithProcessResp> model;

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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(List<DeviceInstanceWithProcessResp> model) {
		this.model = model;
	}
	public List<DeviceInstanceWithProcessResp> getModel( ) {
		return this.model;
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
	 * 工序能力List
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessAbilities extends TaobaoObject {
		private static final long serialVersionUID = 7361294598691465649L;
		/**
		 * 工序能力id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 工序能力code
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 工序能力identifier
		 */
		@ApiField("process_id")
		private String processId;
		/**
		 * 工序能力名称
		 */
		@ApiField("process_name")
		private String processName;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public String getProcessId() {
			return this.processId;
		}
		public void setProcessId(String processId) {
			this.processId = processId;
		}
		public String getProcessName() {
			return this.processName;
		}
		public void setProcessName(String processName) {
			this.processName = processName;
		}
	}
	
	/**
	 * 返回数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceInstanceWithProcessResp extends TaobaoObject {
		private static final long serialVersionUID = 5467878412224337732L;
		/**
		 * 设备id
		 */
		@ApiField("instance_id")
		private Long instanceId;
		/**
		 * 工序能力List
		 */
		@ApiListField("process_abilities")
		@ApiField("process_abilities")
		private List<ProcessAbilities> processAbilities;
	
		public Long getInstanceId() {
			return this.instanceId;
		}
		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}
		public List<ProcessAbilities> getProcessAbilities() {
			return this.processAbilities;
		}
		public void setProcessAbilities(List<ProcessAbilities> processAbilities) {
			this.processAbilities = processAbilities;
		}
	}
	


}
