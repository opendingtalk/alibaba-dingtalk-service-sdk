package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.DingtalkWorkspaceWorkpostSynResponse;

/**
 * TOP API: dingtalk.workspace.workpost.syn request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.24
 */
public class DingtalkWorkspaceWorkpostSynRequest extends BaseTaobaoRequest<DingtalkWorkspaceWorkpostSynResponse> {
	
	

	/** 
	* 批改作业回调数据
	 */
	private String workPostCallbackVO;

	public void setWorkPostCallbackVO(String workPostCallbackVO) {
		this.workPostCallbackVO = workPostCallbackVO;
	}

	public void setWorkPostCallbackVO(WorkPostCallbackVo workPostCallbackVO) {
		this.workPostCallbackVO = new JSONWriter(false,true).write(workPostCallbackVO);
	}

	public String getWorkPostCallbackVO() {
		return this.workPostCallbackVO;
	}

	public String getApiMethodName() {
		return "dingtalk.workspace.workpost.syn";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("work_post_callback_v_o", this.workPostCallbackVO);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DingtalkWorkspaceWorkpostSynResponse> getResponseClass() {
		return DingtalkWorkspaceWorkpostSynResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 批改作业回调数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WorkPostCallbackVo extends TaobaoObject {

	private static final long serialVersionUID = 4421113613831839519L;

	/**
		 * 钉钉作文id
		 */
		@ApiField("ding_essay_id")
		private String dingEssayId;
		/**
		 * 钉钉作业编号
		 */
		@ApiField("ding_work_id")
		private String dingWorkId;
		/**
		 * 作文版本号
		 */
		@ApiField("essay_version")
		private Long essayVersion;
		/**
		 * 用户编号
		 */
		@ApiField("open_id")
		private String openId;
		/**
		 * 批改网分析
		 */
		@ApiField("pigai_analysis")
		private String pigaiAnalysis;
		/**
		 * 批改网作业id
		 */
		@ApiField("pigai_essay_id")
		private String pigaiEssayId;
		/**
		 * 请求标示
		 */
		@ApiField("uuid")
		private String uuid;
	

	public String getDingEssayId() {
			return this.dingEssayId;
		}
		public void setDingEssayId(String dingEssayId) {
			this.dingEssayId = dingEssayId;
		}
		public String getDingWorkId() {
			return this.dingWorkId;
		}
		public void setDingWorkId(String dingWorkId) {
			this.dingWorkId = dingWorkId;
		}
		public Long getEssayVersion() {
			return this.essayVersion;
		}
		public void setEssayVersion(Long essayVersion) {
			this.essayVersion = essayVersion;
		}
		public String getOpenId() {
			return this.openId;
		}
		public void setOpenId(String openId) {
			this.openId = openId;
		}
		public String getPigaiAnalysis() {
			return this.pigaiAnalysis;
		}
		public void setPigaiAnalysis(String pigaiAnalysis) {
			this.pigaiAnalysis = pigaiAnalysis;
		}
		public String getPigaiEssayId() {
			return this.pigaiEssayId;
		}
		public void setPigaiEssayId(String pigaiEssayId) {
			this.pigaiEssayId = pigaiEssayId;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

}


}