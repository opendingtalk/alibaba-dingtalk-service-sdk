package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.procvisible.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessProcvisibleGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2469188483973477628L;

	/** 
	 * 失败ErrorCode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 可见列表
	 */
	@ApiListField("result")
	@ApiField("result")
	private List<Result> result;

	/** 
	 * 成功失败
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

	public void setResult(List<Result> result) {
		this.result = result;
	}
	public List<Result> getResult( ) {
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
	 * 可见列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 4396465647523111235L;
		/**
		 * 部门名称或人员名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否启用，0启用，1不启用
		 */
		@ApiField("unactive_flag")
		private Long unactiveFlag;
		/**
		 * 可见类型：0：部门可见，1 ：人员可见
		 */
		@ApiField("visible_type")
		private Long visibleType;
		/**
		 * 可见性值，部门id或员工id
		 */
		@ApiField("visible_value")
		private String visibleValue;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getUnactiveFlag() {
			return this.unactiveFlag;
		}
		public void setUnactiveFlag(Long unactiveFlag) {
			this.unactiveFlag = unactiveFlag;
		}
		public Long getVisibleType() {
			return this.visibleType;
		}
		public void setVisibleType(Long visibleType) {
			this.visibleType = visibleType;
		}
		public String getVisibleValue() {
			return this.visibleValue;
		}
		public void setVisibleValue(String visibleValue) {
			this.visibleValue = visibleValue;
		}
	}
	


}
