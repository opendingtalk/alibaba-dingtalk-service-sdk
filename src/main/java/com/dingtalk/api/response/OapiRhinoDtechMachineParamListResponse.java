package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.dtech.machine.param.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoDtechMachineParamListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7377428627352389138L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * message
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * model
	 */
	@ApiListField("model")
	@ApiField("model")
	private List<Model> model;

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

	public void setModel(List<Model> model) {
		this.model = model;
	}
	public List<Model> getModel( ) {
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
	 * model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 3157916722735298379L;
		/**
		 * 设备参数bizid
		 */
		@ApiField("biz_id_machine_param")
		private String bizIdMachineParam;
		/**
		 * 工序bizid
		 */
		@ApiField("biz_id_process")
		private String bizIdProcess;
		/**
		 * 描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 设备编码
		 */
		@ApiField("machine_code")
		private String machineCode;
		/**
		 * 设备名称
		 */
		@ApiField("machine_name")
		private String machineName;
		/**
		 * 版本
		 */
		@ApiField("machine_version")
		private String machineVersion;
		/**
		 * 设备名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 类型
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 参数值
		 */
		@ApiField("value")
		private String value;
	
		public String getBizIdMachineParam() {
			return this.bizIdMachineParam;
		}
		public void setBizIdMachineParam(String bizIdMachineParam) {
			this.bizIdMachineParam = bizIdMachineParam;
		}
		public String getBizIdProcess() {
			return this.bizIdProcess;
		}
		public void setBizIdProcess(String bizIdProcess) {
			this.bizIdProcess = bizIdProcess;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getMachineCode() {
			return this.machineCode;
		}
		public void setMachineCode(String machineCode) {
			this.machineCode = machineCode;
		}
		public String getMachineName() {
			return this.machineName;
		}
		public void setMachineName(String machineName) {
			this.machineName = machineName;
		}
		public String getMachineVersion() {
			return this.machineVersion;
		}
		public void setMachineVersion(String machineVersion) {
			this.machineVersion = machineVersion;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	


}
