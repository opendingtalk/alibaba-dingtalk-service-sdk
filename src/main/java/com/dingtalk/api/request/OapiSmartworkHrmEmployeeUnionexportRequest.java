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
import com.dingtalk.api.response.OapiSmartworkHrmEmployeeUnionexportResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.unionexport request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.04
 */
public class OapiSmartworkHrmEmployeeUnionexportRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeUnionexportResponse> {
	
	

	/** 
	* 导出请求对象
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(UnionExportParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.unionexport";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeUnionexportResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeUnionexportResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 导出请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UnionExportParam extends TaobaoObject {
		private static final long serialVersionUID = 8894569389664619977L;
		/**
		 * 业务唯一id，用于唯一标记一次导出，该参数多次请求幂等处理
		 */
		@ApiField("biz_unique_id")
		private String bizUniqueId;
		/**
		 * 失效策略(0上传后10分钟失效，1下载一次后失效)
		 */
		@ApiField("expire_strategy")
		private Long expireStrategy;
		/**
		 * 文件名
		 */
		@ApiField("file_name")
		private String fileName;
		/**
		 * top上传文件后的mediaId
		 */
		@ApiField("media_id")
		private String mediaId;
		/**
		 * 权限策略(0谁发起谁下载)
		 */
		@ApiField("permission_strategy")
		private Long permissionStrategy;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getBizUniqueId() {
			return this.bizUniqueId;
		}
		public void setBizUniqueId(String bizUniqueId) {
			this.bizUniqueId = bizUniqueId;
		}
		public Long getExpireStrategy() {
			return this.expireStrategy;
		}
		public void setExpireStrategy(Long expireStrategy) {
			this.expireStrategy = expireStrategy;
		}
		public String getFileName() {
			return this.fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
		public Long getPermissionStrategy() {
			return this.permissionStrategy;
		}
		public void setPermissionStrategy(Long permissionStrategy) {
			this.permissionStrategy = permissionStrategy;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}