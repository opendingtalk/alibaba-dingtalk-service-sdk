package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.guardian.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduGuardianGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1744829776486363129L;

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
	 * result
	 */
	@ApiField("result")
	private GuardianRespone result;

	/** 
	 * 成功状态
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

	public void setResult(GuardianRespone result) {
		this.result = result;
	}
	public GuardianRespone getResult( ) {
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
	 * fdaf
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Relations extends TaobaoObject {
		private static final long serialVersionUID = 6861875132371639137L;
		/**
		 * fafa\\
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * fafa\\
		 */
		@ApiField("relation")
		private String relation;
		/**
		 * fafa\\
		 */
		@ApiField("student_userid")
		private String studentUserid;
	
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getRelation() {
			return this.relation;
		}
		public void setRelation(String relation) {
			this.relation = relation;
		}
		public String getStudentUserid() {
			return this.studentUserid;
		}
		public void setStudentUserid(String studentUserid) {
			this.studentUserid = studentUserid;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GuardianRespone extends TaobaoObject {
		private static final long serialVersionUID = 3599646666222725219L;
		/**
		 * 家长ID
		 */
		@ApiField("guardian_userid")
		private String guardianUserid;
		/**
		 * 关系名称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 关系类型（M妈妈，D爸爸，O其他）
		 */
		@ApiField("relation")
		private String relation;
		/**
		 * fdaf
		 */
		@ApiListField("relations")
		@ApiField("relations")
		private List<Relations> relations;
		/**
		 * 学生ID
		 */
		@ApiField("student_userid")
		private String studentUserid;
	
		public String getGuardianUserid() {
			return this.guardianUserid;
		}
		public void setGuardianUserid(String guardianUserid) {
			this.guardianUserid = guardianUserid;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getRelation() {
			return this.relation;
		}
		public void setRelation(String relation) {
			this.relation = relation;
		}
		public List<Relations> getRelations() {
			return this.relations;
		}
		public void setRelations(List<Relations> relations) {
			this.relations = relations;
		}
		public String getStudentUserid() {
			return this.studentUserid;
		}
		public void setStudentUserid(String studentUserid) {
			this.studentUserid = studentUserid;
		}
	}
	


}
