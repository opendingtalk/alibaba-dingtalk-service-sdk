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
import com.dingtalk.api.response.OapiCircleEnworkUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.circle.enwork.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.18
 */
public class OapiCircleEnworkUpdateRequest extends BaseTaobaoRequest<OapiCircleEnworkUpdateResponse> {
	
	

	/** 
	* 请求封装类
	 */
	private String openUpdateDto;

	public void setOpenUpdateDto(String openUpdateDto) {
		this.openUpdateDto = openUpdateDto;
	}

	public void setOpenUpdateDto(OpenUpdateWorkPostDTO openUpdateDto) {
		this.openUpdateDto = new JSONWriter(false,false,true).write(openUpdateDto);
	}

	public String getOpenUpdateDto() {
		return this.openUpdateDto;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.circle.enwork.update";
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
		txtParams.put("open_update_dto", this.openUpdateDto);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCircleEnworkUpdateResponse> getResponseClass() {
		return OapiCircleEnworkUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求封装类
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenUpdateWorkPostDTO extends TaobaoObject {
		private static final long serialVersionUID = 8144199621678656496L;
		/**
		 * 用户id
		 */
		@ApiField("open_id")
		private String openId;
		/**
		 * 作文批改结果
		 */
		@ApiField("pigai_analysis")
		private String pigaiAnalysis;
		/**
		 * 作文id
		 */
		@ApiField("post_id")
		private String postId;
		/**
		 * 相似度结果
		 */
		@ApiField("similarity")
		private String similarity;
		/**
		 * 作文id
		 */
		@ApiField("version_id")
		private Long versionId;
		/**
		 * 作业id
		 */
		@ApiField("work_id")
		private String workId;
	
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
		public String getPostId() {
			return this.postId;
		}
		public void setPostId(String postId) {
			this.postId = postId;
		}
		public String getSimilarity() {
			return this.similarity;
		}
		public void setSimilarity(String similarity) {
			this.similarity = similarity;
		}
		public Long getVersionId() {
			return this.versionId;
		}
		public void setVersionId(Long versionId) {
			this.versionId = versionId;
		}
		public String getWorkId() {
			return this.workId;
		}
		public void setWorkId(String workId) {
			this.workId = workId;
		}
	}
	

}