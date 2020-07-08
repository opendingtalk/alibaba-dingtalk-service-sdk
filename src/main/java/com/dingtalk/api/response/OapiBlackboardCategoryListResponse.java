package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.category.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiBlackboardCategoryListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4883413969468227121L;

	/** 
	 * 请求失败返回错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 请求失败返回错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 出参
	 */
	@ApiListField("result")
	@ApiField("blackboard_category_vo")
	private List<BlackboardCategoryVo> result;

	/** 
	 * 请求成功
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

	public void setResult(List<BlackboardCategoryVo> result) {
		this.result = result;
	}
	public List<BlackboardCategoryVo> getResult( ) {
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
	 * 出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BlackboardCategoryVo extends TaobaoObject {
		private static final long serialVersionUID = 7317735449879114183L;
		/**
		 * 分类id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 分类名
		 */
		@ApiField("name")
		private String name;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	


}
