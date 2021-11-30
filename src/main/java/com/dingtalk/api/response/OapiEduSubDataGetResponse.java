package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.sub.data.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduSubDataGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6148166336875533175L;

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
	 * 结果集
	 */
	@ApiListField("result")
	@ApiField("open_edu_school_statistical_data_response")
	private List<OpenEduSchoolStatisticalDataResponse> result;

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

	public void setResult(List<OpenEduSchoolStatisticalDataResponse> result) {
		this.result = result;
	}
	public List<OpenEduSchoolStatisticalDataResponse> getResult( ) {
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
	 * 结果集
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduSchoolStatisticalDataResponse extends TaobaoObject {
		private static final long serialVersionUID = 7368364977675798324L;
		/**
		 * 最近1天活跃的班级圈数
		 */
		@ApiField("act_class_circle_cnt_1d")
		private String actClassCircleCnt1d;
		/**
		 * 最近7天活跃的班级圈数
		 */
		@ApiField("act_class_circle_cnt_7d")
		private String actClassCircleCnt7d;
		/**
		 * 最近1天活跃的班级群数
		 */
		@ApiField("act_class_group_cnt_1d")
		private String actClassGroupCnt1d;
		/**
		 * 最近7天活跃的班级群数
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
		 * 最近1天活跃用户数
		 */
		@ApiField("act_usr_cnt_1d")
		private String actUsrCnt1d;
		/**
		 * 最近7天总活跃用户数
		 */
		@ApiField("act_usr_cnt_7d")
		private String actUsrCnt7d;
		/**
		 * 最近1天活跃率
		 */
		@ApiField("act_usr_ratio_1d")
		private String actUsrRatio1d;
		/**
		 * 最近7天活跃率
		 */
		@ApiField("act_usr_ratio_7d")
		private String actUsrRatio7d;
		/**
		 * 激活用户数
		 */
		@ApiField("active_mbr_cnt_std")
		private String activeMbrCntStd;
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
		 * 班级数量
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
		 * 教育局ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 最近1天钉钉指数
		 */
		@ApiField("ding_index_1d")
		private String dingIndex1d;
		/**
		 * 最近7天钉钉指数
		 */
		@ApiField("ding_index_7d")
		private String dingIndex7d;
		/**
		 * 最近1天成功发起直播次数
		 */
		@ApiField("live_launch_succ_cnt_1d")
		private String liveLaunchSuccCnt1d;
		/**
		 * 最近7天成功发起直播次数
		 */
		@ApiField("live_launch_succ_cnt_7d")
		private String liveLaunchSuccCnt7d;
		/**
		 * 最近1天观看和回看直播人数
		 */
		@ApiField("live_play_user_cnt_1d")
		private String livePlayUserCnt1d;
		/**
		 * 最近7天观看和回看直播人数
		 */
		@ApiField("live_play_user_cnt_7d")
		private String livePlayUserCnt7d;
		/**
		 * 最近1天成功发起直播时长
		 */
		@ApiField("live_succ_time_len_1d")
		private String liveSuccTimeLen1d;
		/**
		 * 最近7天成功发起直播时长
		 */
		@ApiField("live_succ_time_len_7d")
		private String liveSuccTimeLen7d;
		/**
		 * 激活率
		 */
		@ApiField("mbr_active_ratio")
		private String mbrActiveRatio;
		/**
		 * 通讯录人数
		 */
		@ApiField("mbr_cnt_std")
		private String mbrCntStd;
		/**
		 * 多家长监管学生数
		 */
		@ApiField("multi_patriarch_student_cnt")
		private String multiPatriarchStudentCnt;
		/**
		 * 多家长监管学生比率
		 */
		@ApiField("multi_patriarch_student_ratio")
		private String multiPatriarchStudentRatio;
		/**
		 * 无家长监管学生数
		 */
		@ApiField("none_patriarch_student_cnt")
		private String nonePatriarchStudentCnt;
		/**
		 * 无家长监管学生比率
		 */
		@ApiField("none_patriarch_student_ratio")
		private String nonePatriarchStudentRatio;
		/**
		 * 家长数量
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
		 * 最近1天沟通用户数
		 */
		@ApiField("send_msg_user_cnt_1d")
		private String sendMsgUserCnt1d;
		/**
		 * 最近7天沟通用户数
		 */
		@ApiField("send_msg_user_cnt_7d")
		private String sendMsgUserCnt7d;
		/**
		 * 最近1天沟通率
		 */
		@ApiField("send_msg_user_ratio_1d")
		private String sendMsgUserRatio1d;
		/**
		 * 最近7天沟通率
		 */
		@ApiField("send_msg_user_ratio_7d")
		private String sendMsgUserRatio7d;
		/**
		 * 单家长监管学生数
		 */
		@ApiField("single_patriarch_student_cnt")
		private String singlePatriarchStudentCnt;
		/**
		 * 单家长监管学生比率
		 */
		@ApiField("single_patriarch_student_ratio")
		private String singlePatriarchStudentRatio;
		/**
		 * 统计日期
		 */
		@ApiField("stat_date")
		private String statDate;
		/**
		 * 学生数量
		 */
		@ApiField("student_cnt_std")
		private String studentCntStd;
		/**
		 * 所辖组织的地理纬度
		 */
		@ApiField("sub_corp_area_lat")
		private String subCorpAreaLat;
		/**
		 * 所辖组织的地理经度
		 */
		@ApiField("sub_corp_area_lng")
		private String subCorpAreaLng;
		/**
		 * 学校id
		 */
		@ApiField("sub_corp_id")
		private String subCorpId;
		/**
		 * 学校名称
		 */
		@ApiField("sub_corp_name")
		private String subCorpName;
		/**
		 * 教师数量
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
		/**
		 * 双家长监管学生数
		 */
		@ApiField("two_patriarch_student_cnt")
		private String twoPatriarchStudentCnt;
		/**
		 * 双家长监管学生比率
		 */
		@ApiField("two_patriarch_student_ratio")
		private String twoPatriarchStudentRatio;
	
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
		public String getActUsrCnt1d() {
			return this.actUsrCnt1d;
		}
		public void setActUsrCnt1d(String actUsrCnt1d) {
			this.actUsrCnt1d = actUsrCnt1d;
		}
		public String getActUsrCnt7d() {
			return this.actUsrCnt7d;
		}
		public void setActUsrCnt7d(String actUsrCnt7d) {
			this.actUsrCnt7d = actUsrCnt7d;
		}
		public String getActUsrRatio1d() {
			return this.actUsrRatio1d;
		}
		public void setActUsrRatio1d(String actUsrRatio1d) {
			this.actUsrRatio1d = actUsrRatio1d;
		}
		public String getActUsrRatio7d() {
			return this.actUsrRatio7d;
		}
		public void setActUsrRatio7d(String actUsrRatio7d) {
			this.actUsrRatio7d = actUsrRatio7d;
		}
		public String getActiveMbrCntStd() {
			return this.activeMbrCntStd;
		}
		public void setActiveMbrCntStd(String activeMbrCntStd) {
			this.activeMbrCntStd = activeMbrCntStd;
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
		public String getDingIndex1d() {
			return this.dingIndex1d;
		}
		public void setDingIndex1d(String dingIndex1d) {
			this.dingIndex1d = dingIndex1d;
		}
		public String getDingIndex7d() {
			return this.dingIndex7d;
		}
		public void setDingIndex7d(String dingIndex7d) {
			this.dingIndex7d = dingIndex7d;
		}
		public String getLiveLaunchSuccCnt1d() {
			return this.liveLaunchSuccCnt1d;
		}
		public void setLiveLaunchSuccCnt1d(String liveLaunchSuccCnt1d) {
			this.liveLaunchSuccCnt1d = liveLaunchSuccCnt1d;
		}
		public String getLiveLaunchSuccCnt7d() {
			return this.liveLaunchSuccCnt7d;
		}
		public void setLiveLaunchSuccCnt7d(String liveLaunchSuccCnt7d) {
			this.liveLaunchSuccCnt7d = liveLaunchSuccCnt7d;
		}
		public String getLivePlayUserCnt1d() {
			return this.livePlayUserCnt1d;
		}
		public void setLivePlayUserCnt1d(String livePlayUserCnt1d) {
			this.livePlayUserCnt1d = livePlayUserCnt1d;
		}
		public String getLivePlayUserCnt7d() {
			return this.livePlayUserCnt7d;
		}
		public void setLivePlayUserCnt7d(String livePlayUserCnt7d) {
			this.livePlayUserCnt7d = livePlayUserCnt7d;
		}
		public String getLiveSuccTimeLen1d() {
			return this.liveSuccTimeLen1d;
		}
		public void setLiveSuccTimeLen1d(String liveSuccTimeLen1d) {
			this.liveSuccTimeLen1d = liveSuccTimeLen1d;
		}
		public String getLiveSuccTimeLen7d() {
			return this.liveSuccTimeLen7d;
		}
		public void setLiveSuccTimeLen7d(String liveSuccTimeLen7d) {
			this.liveSuccTimeLen7d = liveSuccTimeLen7d;
		}
		public String getMbrActiveRatio() {
			return this.mbrActiveRatio;
		}
		public void setMbrActiveRatio(String mbrActiveRatio) {
			this.mbrActiveRatio = mbrActiveRatio;
		}
		public String getMbrCntStd() {
			return this.mbrCntStd;
		}
		public void setMbrCntStd(String mbrCntStd) {
			this.mbrCntStd = mbrCntStd;
		}
		public String getMultiPatriarchStudentCnt() {
			return this.multiPatriarchStudentCnt;
		}
		public void setMultiPatriarchStudentCnt(String multiPatriarchStudentCnt) {
			this.multiPatriarchStudentCnt = multiPatriarchStudentCnt;
		}
		public String getMultiPatriarchStudentRatio() {
			return this.multiPatriarchStudentRatio;
		}
		public void setMultiPatriarchStudentRatio(String multiPatriarchStudentRatio) {
			this.multiPatriarchStudentRatio = multiPatriarchStudentRatio;
		}
		public String getNonePatriarchStudentCnt() {
			return this.nonePatriarchStudentCnt;
		}
		public void setNonePatriarchStudentCnt(String nonePatriarchStudentCnt) {
			this.nonePatriarchStudentCnt = nonePatriarchStudentCnt;
		}
		public String getNonePatriarchStudentRatio() {
			return this.nonePatriarchStudentRatio;
		}
		public void setNonePatriarchStudentRatio(String nonePatriarchStudentRatio) {
			this.nonePatriarchStudentRatio = nonePatriarchStudentRatio;
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
		public String getSendMsgUserCnt1d() {
			return this.sendMsgUserCnt1d;
		}
		public void setSendMsgUserCnt1d(String sendMsgUserCnt1d) {
			this.sendMsgUserCnt1d = sendMsgUserCnt1d;
		}
		public String getSendMsgUserCnt7d() {
			return this.sendMsgUserCnt7d;
		}
		public void setSendMsgUserCnt7d(String sendMsgUserCnt7d) {
			this.sendMsgUserCnt7d = sendMsgUserCnt7d;
		}
		public String getSendMsgUserRatio1d() {
			return this.sendMsgUserRatio1d;
		}
		public void setSendMsgUserRatio1d(String sendMsgUserRatio1d) {
			this.sendMsgUserRatio1d = sendMsgUserRatio1d;
		}
		public String getSendMsgUserRatio7d() {
			return this.sendMsgUserRatio7d;
		}
		public void setSendMsgUserRatio7d(String sendMsgUserRatio7d) {
			this.sendMsgUserRatio7d = sendMsgUserRatio7d;
		}
		public String getSinglePatriarchStudentCnt() {
			return this.singlePatriarchStudentCnt;
		}
		public void setSinglePatriarchStudentCnt(String singlePatriarchStudentCnt) {
			this.singlePatriarchStudentCnt = singlePatriarchStudentCnt;
		}
		public String getSinglePatriarchStudentRatio() {
			return this.singlePatriarchStudentRatio;
		}
		public void setSinglePatriarchStudentRatio(String singlePatriarchStudentRatio) {
			this.singlePatriarchStudentRatio = singlePatriarchStudentRatio;
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
		public String getSubCorpAreaLat() {
			return this.subCorpAreaLat;
		}
		public void setSubCorpAreaLat(String subCorpAreaLat) {
			this.subCorpAreaLat = subCorpAreaLat;
		}
		public String getSubCorpAreaLng() {
			return this.subCorpAreaLng;
		}
		public void setSubCorpAreaLng(String subCorpAreaLng) {
			this.subCorpAreaLng = subCorpAreaLng;
		}
		public String getSubCorpId() {
			return this.subCorpId;
		}
		public void setSubCorpId(String subCorpId) {
			this.subCorpId = subCorpId;
		}
		public String getSubCorpName() {
			return this.subCorpName;
		}
		public void setSubCorpName(String subCorpName) {
			this.subCorpName = subCorpName;
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
		public String getTwoPatriarchStudentCnt() {
			return this.twoPatriarchStudentCnt;
		}
		public void setTwoPatriarchStudentCnt(String twoPatriarchStudentCnt) {
			this.twoPatriarchStudentCnt = twoPatriarchStudentCnt;
		}
		public String getTwoPatriarchStudentRatio() {
			return this.twoPatriarchStudentRatio;
		}
		public void setTwoPatriarchStudentRatio(String twoPatriarchStudentRatio) {
			this.twoPatriarchStudentRatio = twoPatriarchStudentRatio;
		}
	}
	


}
