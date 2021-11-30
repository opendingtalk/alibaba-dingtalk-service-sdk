package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.main.data.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduMainDataGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8222572235846848881L;

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
	 * 结果
	 */
	@ApiField("result")
	private OpenEduBureauStatisticalDataResponse result;

	/** 
	 * 成功or失败
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

	public void setResult(OpenEduBureauStatisticalDataResponse result) {
		this.result = result;
	}
	public OpenEduBureauStatisticalDataResponse getResult( ) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduBureauStatisticalDataResponse extends TaobaoObject {
		private static final long serialVersionUID = 2416148413312226454L;
		/**
		 * 最近1天活跃班级圈数
		 */
		@ApiField("act_class_circle_cnt_1d")
		private String actClassCircleCnt1d;
		/**
		 * 最近7天活跃班级圈数
		 */
		@ApiField("act_class_circle_cnt_7d")
		private String actClassCircleCnt7d;
		/**
		 * 最近1天活跃班级群数
		 */
		@ApiField("act_class_group_cnt_1d")
		private String actClassGroupCnt1d;
		/**
		 * 最近7天活跃班级群数
		 */
		@ApiField("act_class_group_cnt_7d")
		private String actClassGroupCnt7d;
		/**
		 * 最近1天活跃家长数量
		 */
		@ApiField("act_patriarch_cnt_1d")
		private String actPatriarchCnt1d;
		/**
		 * 最近7天活跃家长数量
		 */
		@ApiField("act_patriarch_cnt_7d")
		private String actPatriarchCnt7d;
		/**
		 * 最近1天活跃教师数量
		 */
		@ApiField("act_teacher_cnt_1d")
		private String actTeacherCnt1d;
		/**
		 * 最近7天活跃教师数量
		 */
		@ApiField("act_teacher_cnt_7d")
		private String actTeacherCnt7d;
		/**
		 * 数字化教师数量
		 */
		@ApiField("auth_teacher_cnt_std")
		private String authTeacherCntStd;
		/**
		 * 最近1天班级打卡使用人数
		 */
		@ApiField("class_card_user_cnt_1d")
		private String classCardUserCnt1d;
		/**
		 * 最近7天班级打卡使用人数
		 */
		@ApiField("class_card_user_cnt_7d")
		private String classCardUserCnt7d;
		/**
		 * 最近1天班级圈使用人数
		 */
		@ApiField("class_circle_user_cnt_1d")
		private String classCircleUserCnt1d;
		/**
		 * 最近7天班级圈使用人数
		 */
		@ApiField("class_circle_user_cnt_7d")
		private String classCircleUserCnt7d;
		/**
		 * 注册班级数
		 */
		@ApiField("class_cnt_std")
		private String classCntStd;
		/**
		 * 最近1天班级群使用人数
		 */
		@ApiField("class_group_user_cnt_1d")
		private String classGroupUserCnt1d;
		/**
		 * 最近7天班级群使用人数
		 */
		@ApiField("class_group_user_cnt_7d")
		private String classGroupUserCnt7d;
		/**
		 * 局id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 注册家长数
		 */
		@ApiField("patriarch_cnt_std")
		private String patriarchCntStd;
		/**
		 * 最近1天接收DING的家长数
		 */
		@ApiField("rcv_ding_patriarch_cnt_1d")
		private String rcvDingPatriarchCnt1d;
		/**
		 * 最近7天接收DING的家长数
		 */
		@ApiField("rcv_ding_patriarch_cnt_7d")
		private String rcvDingPatriarchCnt7d;
		/**
		 * 注册学校数
		 */
		@ApiField("school_cnt_std")
		private String schoolCntStd;
		/**
		 * 最近1天班级圈发送数
		 */
		@ApiField("send_circle_post_cnt_1d")
		private String sendCirclePostCnt1d;
		/**
		 * 最近7天班级圈发送数
		 */
		@ApiField("send_circle_post_cnt_7d")
		private String sendCirclePostCnt7d;
		/**
		 * 统计日期
		 */
		@ApiField("stat_date")
		private String statDate;
		/**
		 * 注册学生数
		 */
		@ApiField("student_cnt_std")
		private String studentCntStd;
		/**
		 * 注册教师数
		 */
		@ApiField("teacher_cnt_std")
		private String teacherCntStd;
		/**
		 * 最近1天教师钉消息发送数
		 */
		@ApiField("teacher_send_ding_cnt_1d")
		private String teacherSendDingCnt1d;
		/**
		 * 最近7天教师钉消息发送数
		 */
		@ApiField("teacher_send_ding_cnt_7d")
		private String teacherSendDingCnt7d;
	
		public String getActClassCircleCnt1d() {
			return this.actClassCircleCnt1d;
		}
		public void setActClassCircleCnt1d(String actClassCircleCnt1d) {
			this.actClassCircleCnt1d = actClassCircleCnt1d;
		}
		public String getActClassCircleCnt7d() {
			return this.actClassCircleCnt7d;
		}
		public void setActClassCircleCnt7d(String actClassCircleCnt7d) {
			this.actClassCircleCnt7d = actClassCircleCnt7d;
		}
		public String getActClassGroupCnt1d() {
			return this.actClassGroupCnt1d;
		}
		public void setActClassGroupCnt1d(String actClassGroupCnt1d) {
			this.actClassGroupCnt1d = actClassGroupCnt1d;
		}
		public String getActClassGroupCnt7d() {
			return this.actClassGroupCnt7d;
		}
		public void setActClassGroupCnt7d(String actClassGroupCnt7d) {
			this.actClassGroupCnt7d = actClassGroupCnt7d;
		}
		public String getActPatriarchCnt1d() {
			return this.actPatriarchCnt1d;
		}
		public void setActPatriarchCnt1d(String actPatriarchCnt1d) {
			this.actPatriarchCnt1d = actPatriarchCnt1d;
		}
		public String getActPatriarchCnt7d() {
			return this.actPatriarchCnt7d;
		}
		public void setActPatriarchCnt7d(String actPatriarchCnt7d) {
			this.actPatriarchCnt7d = actPatriarchCnt7d;
		}
		public String getActTeacherCnt1d() {
			return this.actTeacherCnt1d;
		}
		public void setActTeacherCnt1d(String actTeacherCnt1d) {
			this.actTeacherCnt1d = actTeacherCnt1d;
		}
		public String getActTeacherCnt7d() {
			return this.actTeacherCnt7d;
		}
		public void setActTeacherCnt7d(String actTeacherCnt7d) {
			this.actTeacherCnt7d = actTeacherCnt7d;
		}
		public String getAuthTeacherCntStd() {
			return this.authTeacherCntStd;
		}
		public void setAuthTeacherCntStd(String authTeacherCntStd) {
			this.authTeacherCntStd = authTeacherCntStd;
		}
		public String getClassCardUserCnt1d() {
			return this.classCardUserCnt1d;
		}
		public void setClassCardUserCnt1d(String classCardUserCnt1d) {
			this.classCardUserCnt1d = classCardUserCnt1d;
		}
		public String getClassCardUserCnt7d() {
			return this.classCardUserCnt7d;
		}
		public void setClassCardUserCnt7d(String classCardUserCnt7d) {
			this.classCardUserCnt7d = classCardUserCnt7d;
		}
		public String getClassCircleUserCnt1d() {
			return this.classCircleUserCnt1d;
		}
		public void setClassCircleUserCnt1d(String classCircleUserCnt1d) {
			this.classCircleUserCnt1d = classCircleUserCnt1d;
		}
		public String getClassCircleUserCnt7d() {
			return this.classCircleUserCnt7d;
		}
		public void setClassCircleUserCnt7d(String classCircleUserCnt7d) {
			this.classCircleUserCnt7d = classCircleUserCnt7d;
		}
		public String getClassCntStd() {
			return this.classCntStd;
		}
		public void setClassCntStd(String classCntStd) {
			this.classCntStd = classCntStd;
		}
		public String getClassGroupUserCnt1d() {
			return this.classGroupUserCnt1d;
		}
		public void setClassGroupUserCnt1d(String classGroupUserCnt1d) {
			this.classGroupUserCnt1d = classGroupUserCnt1d;
		}
		public String getClassGroupUserCnt7d() {
			return this.classGroupUserCnt7d;
		}
		public void setClassGroupUserCnt7d(String classGroupUserCnt7d) {
			this.classGroupUserCnt7d = classGroupUserCnt7d;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getPatriarchCntStd() {
			return this.patriarchCntStd;
		}
		public void setPatriarchCntStd(String patriarchCntStd) {
			this.patriarchCntStd = patriarchCntStd;
		}
		public String getRcvDingPatriarchCnt1d() {
			return this.rcvDingPatriarchCnt1d;
		}
		public void setRcvDingPatriarchCnt1d(String rcvDingPatriarchCnt1d) {
			this.rcvDingPatriarchCnt1d = rcvDingPatriarchCnt1d;
		}
		public String getRcvDingPatriarchCnt7d() {
			return this.rcvDingPatriarchCnt7d;
		}
		public void setRcvDingPatriarchCnt7d(String rcvDingPatriarchCnt7d) {
			this.rcvDingPatriarchCnt7d = rcvDingPatriarchCnt7d;
		}
		public String getSchoolCntStd() {
			return this.schoolCntStd;
		}
		public void setSchoolCntStd(String schoolCntStd) {
			this.schoolCntStd = schoolCntStd;
		}
		public String getSendCirclePostCnt1d() {
			return this.sendCirclePostCnt1d;
		}
		public void setSendCirclePostCnt1d(String sendCirclePostCnt1d) {
			this.sendCirclePostCnt1d = sendCirclePostCnt1d;
		}
		public String getSendCirclePostCnt7d() {
			return this.sendCirclePostCnt7d;
		}
		public void setSendCirclePostCnt7d(String sendCirclePostCnt7d) {
			this.sendCirclePostCnt7d = sendCirclePostCnt7d;
		}
		public String getStatDate() {
			return this.statDate;
		}
		public void setStatDate(String statDate) {
			this.statDate = statDate;
		}
		public String getStudentCntStd() {
			return this.studentCntStd;
		}
		public void setStudentCntStd(String studentCntStd) {
			this.studentCntStd = studentCntStd;
		}
		public String getTeacherCntStd() {
			return this.teacherCntStd;
		}
		public void setTeacherCntStd(String teacherCntStd) {
			this.teacherCntStd = teacherCntStd;
		}
		public String getTeacherSendDingCnt1d() {
			return this.teacherSendDingCnt1d;
		}
		public void setTeacherSendDingCnt1d(String teacherSendDingCnt1d) {
			this.teacherSendDingCnt1d = teacherSendDingCnt1d;
		}
		public String getTeacherSendDingCnt7d() {
			return this.teacherSendDingCnt7d;
		}
		public void setTeacherSendDingCnt7d(String teacherSendDingCnt7d) {
			this.teacherSendDingCnt7d = teacherSendDingCnt7d;
		}
	}
	


}
