package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.process.structural.cluster.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoHumanresProcessStructuralClusterQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3712766472797934519L;

	/** 
	 * 1
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * message
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 1
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * code
	 */
	@ApiField("hsfcode")
	private Long hsfcode;

	/** 
	 * 结构化工序关联dto
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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setHsfcode(Long hsfcode) {
		this.hsfcode = hsfcode;
	}
	public Long getHsfcode( ) {
		return this.hsfcode;
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
	 * 结构化工序详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessStructuralClusterDto extends TaobaoObject {
		private static final long serialVersionUID = 4582627755222379181L;
		/**
		 * 辅料
		 */
		@ApiField("accessory")
		private String accessory;
		/**
		 * 动作
		 */
		@ApiField("action")
		private String action;
		/**
		 * 主键
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 部件
		 */
		@ApiField("part")
		private String part;
		/**
		 * 部位
		 */
		@ApiField("position")
		private String position;
		/**
		 * 线迹
		 */
		@ApiField("stitch")
		private String stitch;
	
		public String getAccessory() {
			return this.accessory;
		}
		public void setAccessory(String accessory) {
			this.accessory = accessory;
		}
		public String getAction() {
			return this.action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPart() {
			return this.part;
		}
		public void setPart(String part) {
			this.part = part;
		}
		public String getPosition() {
			return this.position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getStitch() {
			return this.stitch;
		}
		public void setStitch(String stitch) {
			this.stitch = stitch;
		}
	}
	
	/**
	 * 结构化工序关联dto
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 8184558327763884847L;
		/**
		 * 工序id
		 */
		@ApiField("biz_id_process")
		private String bizIdProcess;
		/**
		 * 结构化工序详情
		 */
		@ApiField("process_structural_cluster")
		private ProcessStructuralClusterDto processStructuralCluster;
	
		public String getBizIdProcess() {
			return this.bizIdProcess;
		}
		public void setBizIdProcess(String bizIdProcess) {
			this.bizIdProcess = bizIdProcess;
		}
		public ProcessStructuralClusterDto getProcessStructuralCluster() {
			return this.processStructuralCluster;
		}
		public void setProcessStructuralCluster(ProcessStructuralClusterDto processStructuralCluster) {
			this.processStructuralCluster = processStructuralCluster;
		}
	}
	


}
