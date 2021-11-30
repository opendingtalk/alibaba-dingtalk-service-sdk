package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.replay response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCourseReplayResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2515175673257593839L;

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
	private ReplayCourseResponse result;

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

	public void setResult(ReplayCourseResponse result) {
		this.result = result;
	}
	public ReplayCourseResponse getResult( ) {
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
	public static class ReplayCourseResponse extends TaobaoObject {
		private static final long serialVersionUID = 1334818846872679351L;
		/**
		 * 回放url列表
		 */
		@ApiListField("replay_urls")
		@ApiField("string")
		private List<String> replayUrls;
		/**
		 * 是否可回放
		 */
		@ApiField("replayable")
		private Boolean replayable;
	
		public List<String> getReplayUrls() {
			return this.replayUrls;
		}
		public void setReplayUrls(List<String> replayUrls) {
			this.replayUrls = replayUrls;
		}
		public Boolean getReplayable() {
			return this.replayable;
		}
		public void setReplayable(Boolean replayable) {
			this.replayable = replayable;
		}
	}
	


}
