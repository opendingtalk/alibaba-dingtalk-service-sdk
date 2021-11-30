package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.class.studentinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduClassStudentinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6246193353812635587L;

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
	private OpenStudentSelectDto result;

	/** 
	 * 成功标识
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

	public void setResult(OpenStudentSelectDto result) {
		this.result = result;
	}
	public OpenStudentSelectDto getResult( ) {
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
	 * 家长列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPatriarchSelectDto extends TaobaoObject {
		private static final long serialVersionUID = 8243232985522951948L;
		/**
		 * 头像
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * 是否激活钉钉
		 */
		@ApiField("is_active")
		private Boolean isActive;
		/**
		 * 家长姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 关系key
		 */
		@ApiField("relation")
		private String relation;
		/**
		 * 关系名称
		 */
		@ApiField("relation_name")
		private String relationName;
		/**
		 * 家长id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getAvatar() {
			return this.avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public Boolean getIsActive() {
			return this.isActive;
		}
		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRelation() {
			return this.relation;
		}
		public void setRelation(String relation) {
			this.relation = relation;
		}
		public String getRelationName() {
			return this.relationName;
		}
		public void setRelationName(String relationName) {
			this.relationName = relationName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenStudentSelectDto extends TaobaoObject {
		private static final long serialVersionUID = 1392494228312868776L;
		/**
		 * 头像
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * 班级id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 家长列表
		 */
		@ApiListField("guardians")
		@ApiField("open_patriarch_select_dto")
		private List<OpenPatriarchSelectDto> guardians;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 学号
		 */
		@ApiField("student_num")
		private String studentNum;
		/**
		 * 学生id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getAvatar() {
			return this.avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public List<OpenPatriarchSelectDto> getGuardians() {
			return this.guardians;
		}
		public void setGuardians(List<OpenPatriarchSelectDto> guardians) {
			this.guardians = guardians;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStudentNum() {
			return this.studentNum;
		}
		public void setStudentNum(String studentNum) {
			this.studentNum = studentNum;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
