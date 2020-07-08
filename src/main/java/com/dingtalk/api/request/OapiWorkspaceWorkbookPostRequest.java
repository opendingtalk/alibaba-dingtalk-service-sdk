package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiWorkspaceWorkbookPostResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.workbook.post request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.25
 */
public class OapiWorkspaceWorkbookPostRequest extends BaseTaobaoRequest<OapiWorkspaceWorkbookPostResponse> {
	
	

	/** 
	* 批改作业回调值
	 */
	private String workPostCallbackVo;

	public void setWorkPostCallbackVo(String workPostCallbackVo) {
		this.workPostCallbackVo = workPostCallbackVo;
	}

	public void setWorkPostCallbackVo(WorkPostCallbackVo workPostCallbackVo) {
		this.workPostCallbackVo = new JSONWriter(false,false,true).write(workPostCallbackVo);
	}

	public String getWorkPostCallbackVo() {
		return this.workPostCallbackVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.workbook.post";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("work_post_callback_vo", this.workPostCallbackVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceWorkbookPostResponse> getResponseClass() {
		return OapiWorkspaceWorkbookPostResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 批改作业回调值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WorkPostCallbackVo extends TaobaoObject {
		private static final long serialVersionUID = 2711267483565588745L;
		/**
		 * 圈子作文id
		 */
		@ApiField("ding_essay_id")
		private String dingEssayId;
		/**
		 * 作业id
		 */
		@ApiField("ding_work_id")
		private String dingWorkId;
		/**
		 * 作文的版本号
		 */
		@ApiField("essay_version")
		private Long essayVersion;
		/**
		 * 用户id
		 */
		@ApiField("open_id")
		private String openId;
		/**
		 * 作文分析结果
		 */
		@ApiField("pigai_analysis")
		private String pigaiAnalysis;
		/**
		 * 批改网作文id
		 */
		@ApiField("pigai_essay_id")
		private String pigaiEssayId;
		/**
		 * 请求去重表示
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