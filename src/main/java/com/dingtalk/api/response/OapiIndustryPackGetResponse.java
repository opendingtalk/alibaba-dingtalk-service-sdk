package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.industry.pack.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiIndustryPackGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1625461864425314552L;

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
	 * 查询结果列表
	 */
	@ApiListField("result")
	@ApiField("package_dto")
	private List<PackageDto> result;

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

	public void setResult(List<PackageDto> result) {
		this.result = result;
	}
	public List<PackageDto> getResult( ) {
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
	 * 查询结果列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PackageDto extends TaobaoObject {
		private static final long serialVersionUID = 3794922721987981249L;
		/**
		 * 课包ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 课包名称
		 */
		@ApiField("package_name")
		private String packageName;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPackageName() {
			return this.packageName;
		}
		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}
	}
	


}
