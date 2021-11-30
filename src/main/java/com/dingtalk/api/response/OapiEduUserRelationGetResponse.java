package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.user.relation.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduUserRelationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2877531998747242966L;

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
	 * 关系详情
	 */
	@ApiField("result")
	private Result result;

	/** 
	 * 是否成功
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

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
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
	 * 关系详情列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduUserRelationDetail extends TaobaoObject {
		private static final long serialVersionUID = 6623499269179943298L;
		/**
		 * 班级id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 监护人id
		 */
		@ApiField("from_userid")
		private String fromUserid;
		/**
		 * 关系code
		 */
		@ApiField("relation_code")
		private String relationCode;
		/**
		 * 关系名
		 */
		@ApiField("relation_name")
		private String relationName;
		/**
		 * 学生id
		 */
		@ApiField("to_userid")
		private String toUserid;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getFromUserid() {
			return this.fromUserid;
		}
		public void setFromUserid(String fromUserid) {
			this.fromUserid = fromUserid;
		}
		public String getRelationCode() {
			return this.relationCode;
		}
		public void setRelationCode(String relationCode) {
			this.relationCode = relationCode;
		}
		public String getRelationName() {
			return this.relationName;
		}
		public void setRelationName(String relationName) {
			this.relationName = relationName;
		}
		public String getToUserid() {
			return this.toUserid;
		}
		public void setToUserid(String toUserid) {
			this.toUserid = toUserid;
		}
	}
	
	/**
	 * 关系详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 7332464565142691927L;
		/**
		 * 关系详情列表
		 */
		@ApiListField("relations")
		@ApiField("open_edu_user_relation_detail")
		private List<OpenEduUserRelationDetail> relations;
	
		public List<OpenEduUserRelationDetail> getRelations() {
			return this.relations;
		}
		public void setRelations(List<OpenEduUserRelationDetail> relations) {
			this.relations = relations;
		}
	}
	


}
