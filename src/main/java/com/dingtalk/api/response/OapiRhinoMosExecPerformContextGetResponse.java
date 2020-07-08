package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.context.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecPerformContextGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1217262677898687278L;

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
	 * 执行上下文
	 */
	@ApiListField("model")
	@ApiField("operation_perform_dto")
	private List<OperationPerformDto> model;

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

	public void setModel(List<OperationPerformDto> model) {
		this.model = model;
	}
	public List<OperationPerformDto> getModel( ) {
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
	 * 执行上下文
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationPerformDto extends TaobaoObject {
		private static final long serialVersionUID = 6285438166527819984L;
		/**
		 * 上下文
		 */
		@ApiField("context")
		private String context;
		/**
		 * 工序执行ID
		 */
		@ApiField("operation_record_id")
		private Long operationRecordId;
	
		public String getContext() {
			return this.context;
		}
		public void setContext(String context) {
			this.context = context;
		}
		public void setContextString(String context) {
			this.context = context;
		}
		
		public Long getOperationRecordId() {
			return this.operationRecordId;
		}
		public void setOperationRecordId(Long operationRecordId) {
			this.operationRecordId = operationRecordId;
		}
	}
	


}
