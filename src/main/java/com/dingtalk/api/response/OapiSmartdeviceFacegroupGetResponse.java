package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facegroup.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceFacegroupGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1621976419452117473L;

	/** 
	 * 错误代号
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误提示
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 查询结果
	 */
	@ApiField("result")
	private FaceGroupDto result;

	/** 
	 * API调用结果
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

	public void setResult(FaceGroupDto result) {
		this.result = result;
	}
	public FaceGroupDto getResult( ) {
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
	 * 查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FaceGroupDto extends TaobaoObject {
		private static final long serialVersionUID = 5823473411183324746L;
		/**
		 * M2上的定制UI
		 */
		@ApiField("bg_img_url")
		private String bgImgUrl;
		/**
		 * 业务id
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 结束时间
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 识别成功后的问候语
		 */
		@ApiField("greeting_msg")
		private String greetingMsg;
		/**
		 * 开始时间
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 识别组启用状态：1-已启用；2未启用；
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 识别组的标题
		 */
		@ApiField("title")
		private String title;
	
		public String getBgImgUrl() {
			return this.bgImgUrl;
		}
		public void setBgImgUrl(String bgImgUrl) {
			this.bgImgUrl = bgImgUrl;
		}
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public String getGreetingMsg() {
			return this.greetingMsg;
		}
		public void setGreetingMsg(String greetingMsg) {
			this.greetingMsg = greetingMsg;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
