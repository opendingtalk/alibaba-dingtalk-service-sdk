package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.workstation.operation.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecWorkstationOperationCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1232692682432634757L;

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
	 * 额外错误信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 工序数量
	 */
	@ApiListField("model")
	@ApiField("track_record_dto")
	private List<TrackRecordDto> model;

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

	public void setModel(List<TrackRecordDto> model) {
		this.model = model;
	}
	public List<TrackRecordDto> getModel( ) {
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
	 * 工序数量
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TrackRecordDto extends TaobaoObject {
		private static final long serialVersionUID = 4844456561772997743L;
		/**
		 * 数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 工序ID
		 */
		@ApiField("operation_uid")
		private Long operationUid;
		/**
		 * 订单ID
		 */
		@ApiField("orderId")
		private Long orderId;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Long getOperationUid() {
			return this.operationUid;
		}
		public void setOperationUid(Long operationUid) {
			this.operationUid = operationUid;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
	}
	


}
