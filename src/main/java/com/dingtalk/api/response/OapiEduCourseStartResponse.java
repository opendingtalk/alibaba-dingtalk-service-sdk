package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.start response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCourseStartResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2468494853359768961L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private StartCourseResponse result;

	/** 
	 * success
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

	public void setResult(StartCourseResponse result) {
		this.result = result;
	}
	public StartCourseResponse getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class StartCourseResponse extends TaobaoObject {
		private static final long serialVersionUID = 7577656993839754779L;
		/**
		 * 交互是否重用
		 */
		@ApiField("is_reuse")
		private Boolean isReuse;
		/**
		 * 交互内容id
		 */
		@ApiField("target_id")
		private String targetId;
		/**
		 * 交互目标类型
		 */
		@ApiField("target_type")
		private Long targetType;
	
		public Boolean getIsReuse() {
			return this.isReuse;
		}
		public void setIsReuse(Boolean isReuse) {
			this.isReuse = isReuse;
		}
		public String getTargetId() {
			return this.targetId;
		}
		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}
		public Long getTargetType() {
			return this.targetType;
		}
		public void setTargetType(Long targetType) {
			this.targetType = targetType;
		}
	}
	


}
