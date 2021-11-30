package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.participant.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCourseParticipantListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8639571425721555416L;

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
	private ListCourseParticipantResponse result;

	/** 
	 * 请求是否成功
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

	public void setResult(ListCourseParticipantResponse result) {
		this.result = result;
	}
	public ListCourseParticipantResponse getResult( ) {
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
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CourseParticipantVO extends TaobaoObject {
		private static final long serialVersionUID = 5842777954997917581L;
		/**
		 * 参与方的组织CorpId
		 */
		@ApiField("participant_corpid")
		private String participantCorpid;
		/**
		 * 参与方ID。participant_type=1时，participant_id表示用户ID；participant_type=2时，participant_id表示部门ID；participant_type=3时，participant_id表示组织ID；
		 */
		@ApiField("participant_id")
		private String participantId;
		/**
		 * 参与方名称
		 */
		@ApiField("participant_name")
		private String participantName;
		/**
		 * 参与方类型。1：用户、2：部门（对应家校通讯录中的班级、年级。详情请参考https:ding-doc.dingtalk.comdoc#serverapi3gga05az3y0h）、3：组织
		 */
		@ApiField("participant_type")
		private String participantType;
		/**
		 * 参与方角色。student：学生、teacher：老师、guardian: 监护人
		 */
		@ApiField("role")
		private String role;
	
		public String getParticipantCorpid() {
			return this.participantCorpid;
		}
		public void setParticipantCorpid(String participantCorpid) {
			this.participantCorpid = participantCorpid;
		}
		public String getParticipantId() {
			return this.participantId;
		}
		public void setParticipantId(String participantId) {
			this.participantId = participantId;
		}
		public String getParticipantName() {
			return this.participantName;
		}
		public void setParticipantName(String participantName) {
			this.participantName = participantName;
		}
		public String getParticipantType() {
			return this.participantType;
		}
		public void setParticipantType(String participantType) {
			this.participantType = participantType;
		}
		public String getRole() {
			return this.role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ListCourseParticipantResponse extends TaobaoObject {
		private static final long serialVersionUID = 5396518121677948211L;
		/**
		 * 表示是否还有更多的数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("course_participant_v_o")
		private List<CourseParticipantVO> list;
		/**
		 * 表示下一次分页的游标，如果next_corsor为null或者has_more为false，表示没有更多的分页数据
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<CourseParticipantVO> getList() {
			return this.list;
		}
		public void setList(List<CourseParticipantVO> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
