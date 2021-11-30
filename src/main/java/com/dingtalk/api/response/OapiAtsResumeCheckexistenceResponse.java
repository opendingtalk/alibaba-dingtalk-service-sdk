package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.resume.checkexistence response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAtsResumeCheckexistenceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3196693937959253413L;

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
	 * 返回结果
	 */
	@ApiField("result")
	private ResumeCheckResultVo result;


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

	public void setResult(ResumeCheckResultVo result) {
		this.result = result;
	}
	public ResumeCheckResultVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ResumeCheckResultVo extends TaobaoObject {
		private static final long serialVersionUID = 3249122765482575232L;
		/**
		 * 是否存在
		 */
		@ApiField("existed")
		private Boolean existed;
		/**
		 * 简历标识列表
		 */
		@ApiListField("resume_id_list")
		@ApiField("string")
		private List<String> resumeIdList;
	
		public Boolean getExisted() {
			return this.existed;
		}
		public void setExisted(Boolean existed) {
			this.existed = existed;
		}
		public List<String> getResumeIdList() {
			return this.resumeIdList;
		}
		public void setResumeIdList(List<String> resumeIdList) {
			this.resumeIdList = resumeIdList;
		}
	}
	


}
