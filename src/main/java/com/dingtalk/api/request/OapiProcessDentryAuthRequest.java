package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiProcessDentryAuthResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.dentry.auth request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.23
 */
public class OapiProcessDentryAuthRequest extends BaseTaobaoRequest<OapiProcessDentryAuthResponse> {
	
	

	/** 
	* 入参VO
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GrantCspaceRequestV2 request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.dentry.auth";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessDentryAuthResponse> getResponseClass() {
		return OapiProcessDentryAuthResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 授权的钉盘文件信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FileInfo extends TaobaoObject {
		private static final long serialVersionUID = 4836114894699422236L;
		/**
		 * 文件fileId
		 */
		@ApiField("file_id")
		private String fileId;
		/**
		 * 文件spaceId
		 */
		@ApiField("space_id")
		private Long spaceId;
	
		public String getFileId() {
			return this.fileId;
		}
		public void setFileId(String fileId) {
			this.fileId = fileId;
		}
		public Long getSpaceId() {
			return this.spaceId;
		}
		public void setSpaceId(Long spaceId) {
			this.spaceId = spaceId;
		}
	}
	
	/**
	 * 入参VO
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GrantCspaceRequestV2 extends TaobaoObject {
		private static final long serialVersionUID = 2585181731935938915L;
		/**
		 * 授权的钉盘文件信息
		 */
		@ApiListField("file_infos")
		@ApiField("file_info")
		private List<FileInfo> fileInfos;
		/**
		 * 授权的userid
		 */
		@ApiField("userid")
		private String userid;
	
		public List<FileInfo> getFileInfos() {
			return this.fileInfos;
		}
		public void setFileInfos(List<FileInfo> fileInfos) {
			this.fileInfos = fileInfos;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}