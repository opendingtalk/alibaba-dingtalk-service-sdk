package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.wiki.resource.auth response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWikiResourceAuthResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4522589611123775332L;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 对返回码的文本描述内容
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 资源授权结果列表
	 */
	@ApiListField("result")
	@ApiField("open_resource_vo")
	private List<OpenResourceVo> result;

	/** 
	 * 是否操作成功
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

	public void setResult(List<OpenResourceVo> result) {
		this.result = result;
	}
	public List<OpenResourceVo> getResult( ) {
		return this.result;
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
	 * 资源授权结果列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenResourceVo extends TaobaoObject {
		private static final long serialVersionUID = 3578961368465176679L;
		/**
		 * 资源id（加密后的值）
		 */
		@ApiField("resource_id")
		private String resourceId;
		/**
		 * 资源类型
		 */
		@ApiField("resource_type")
		private Long resourceType;
		/**
		 * 是否授权成功（0:成功，1:失败）
		 */
		@ApiField("status")
		private Long status;
	
		public String getResourceId() {
			return this.resourceId;
		}
		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}
		public Long getResourceType() {
			return this.resourceType;
		}
		public void setResourceType(Long resourceType) {
			this.resourceType = resourceType;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	


}
