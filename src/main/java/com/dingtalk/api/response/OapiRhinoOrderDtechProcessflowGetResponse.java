package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtech.processflow.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderDtechProcessflowGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3862442863193346452L;

	/** 
	 * 钉钉响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 响应信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 额外的错误信息
	 */
	@ApiField("externalMsgInfo")
	private String externalMsgInfo;

	/** 
	 * 调用结果
	 */
	@ApiListField("model")
	@ApiField("dtech_process_flow_dto")
	private List<DtechProcessFlowDto> model;

	/** 
	 * 是否调用成功
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

	public void setModel(List<DtechProcessFlowDto> model) {
		this.model = model;
	}
	public List<DtechProcessFlowDto> getModel( ) {
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
	 * 调用结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechProcessFlowDto extends TaobaoObject {
		private static final long serialVersionUID = 1392482891771181129L;
		/**
		 * 工序编号
		 */
		@ApiField("biz_id_process")
		private String bizIdProcess;
		/**
		 * 工艺流编号
		 */
		@ApiField("biz_id_process_flow")
		private String bizIdProcessFlow;
		/**
		 * 首节点的排序顺序
		 */
		@ApiField("index")
		private Long index;
		/**
		 * 层级
		 */
		@ApiField("level")
		private Long level;
		/**
		 * 下一个工序编号
		 */
		@ApiField("next_biz_id_process")
		private String nextBizIdProcess;
	
		public String getBizIdProcess() {
			return this.bizIdProcess;
		}
		public void setBizIdProcess(String bizIdProcess) {
			this.bizIdProcess = bizIdProcess;
		}
		public String getBizIdProcessFlow() {
			return this.bizIdProcessFlow;
		}
		public void setBizIdProcessFlow(String bizIdProcessFlow) {
			this.bizIdProcessFlow = bizIdProcessFlow;
		}
		public Long getIndex() {
			return this.index;
		}
		public void setIndex(Long index) {
			this.index = index;
		}
		public Long getLevel() {
			return this.level;
		}
		public void setLevel(Long level) {
			this.level = level;
		}
		public String getNextBizIdProcess() {
			return this.nextBizIdProcess;
		}
		public void setNextBizIdProcess(String nextBizIdProcess) {
			this.nextBizIdProcess = nextBizIdProcess;
		}
	}
	


}
