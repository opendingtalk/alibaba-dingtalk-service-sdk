package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.videoconf.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavVideoconfGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4834854812992831383L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errormsg")
	private String errormsg;

	/** 
	 * 返回结果对象
	 */
	@ApiField("result")
	private McsSummaryResponse result;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	public String getErrormsg( ) {
		return this.errormsg;
	}

	public void setResult(McsSummaryResponse result) {
		this.result = result;
	}
	public McsSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class McsSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 6533198388159275487L;
		/**
		 * 视频会议企业的累积消耗时长（即参会者入会总时长，且算到发起企业上）(毫秒)
		 */
		@ApiField("join_video_conf_len")
		private Long joinVideoConfLen;
		/**
		 * 视频会议成功参与人次
		 */
		@ApiField("join_video_conf_secc_usr_cnt")
		private Long joinVideoConfSeccUsrCnt;
		/**
		 * 视频会议成功参与用户数
		 */
		@ApiField("join_video_conf_secc_usr_num")
		private Long joinVideoConfSeccUsrNum;
		/**
		 * 参与视频会议用户数
		 */
		@ApiField("join_video_conf_usr_cnt")
		private Long joinVideoConfUsrCnt;
		/**
		 * 视频会议发起次数
		 */
		@ApiField("start_video_conf_cnt")
		private Long startVideoConfCnt;
		/**
		 * 成功发起视频会议数
		 */
		@ApiField("start_video_conf_secc_cnt")
		private Long startVideoConfSeccCnt;
		/**
		 * 视频会议发起用户数
		 */
		@ApiField("start_video_conf_usr_num")
		private Long startVideoConfUsrNum;
		/**
		 * 视频会议平均每通参与人次
		 */
		@ApiField("video_conf_ave_usr_num")
		private Long videoConfAveUsrNum;
	
		public Long getJoinVideoConfLen() {
			return this.joinVideoConfLen;
		}
		public void setJoinVideoConfLen(Long joinVideoConfLen) {
			this.joinVideoConfLen = joinVideoConfLen;
		}
		public Long getJoinVideoConfSeccUsrCnt() {
			return this.joinVideoConfSeccUsrCnt;
		}
		public void setJoinVideoConfSeccUsrCnt(Long joinVideoConfSeccUsrCnt) {
			this.joinVideoConfSeccUsrCnt = joinVideoConfSeccUsrCnt;
		}
		public Long getJoinVideoConfSeccUsrNum() {
			return this.joinVideoConfSeccUsrNum;
		}
		public void setJoinVideoConfSeccUsrNum(Long joinVideoConfSeccUsrNum) {
			this.joinVideoConfSeccUsrNum = joinVideoConfSeccUsrNum;
		}
		public Long getJoinVideoConfUsrCnt() {
			return this.joinVideoConfUsrCnt;
		}
		public void setJoinVideoConfUsrCnt(Long joinVideoConfUsrCnt) {
			this.joinVideoConfUsrCnt = joinVideoConfUsrCnt;
		}
		public Long getStartVideoConfCnt() {
			return this.startVideoConfCnt;
		}
		public void setStartVideoConfCnt(Long startVideoConfCnt) {
			this.startVideoConfCnt = startVideoConfCnt;
		}
		public Long getStartVideoConfSeccCnt() {
			return this.startVideoConfSeccCnt;
		}
		public void setStartVideoConfSeccCnt(Long startVideoConfSeccCnt) {
			this.startVideoConfSeccCnt = startVideoConfSeccCnt;
		}
		public Long getStartVideoConfUsrNum() {
			return this.startVideoConfUsrNum;
		}
		public void setStartVideoConfUsrNum(Long startVideoConfUsrNum) {
			this.startVideoConfUsrNum = startVideoConfUsrNum;
		}
		public Long getVideoConfAveUsrNum() {
			return this.videoConfAveUsrNum;
		}
		public void setVideoConfAveUsrNum(Long videoConfAveUsrNum) {
			this.videoConfAveUsrNum = videoConfAveUsrNum;
		}
	}
	


}
