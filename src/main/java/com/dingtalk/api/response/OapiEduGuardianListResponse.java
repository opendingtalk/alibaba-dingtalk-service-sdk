package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.guardian.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduGuardianListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2566348946253697239L;

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
	private PageResult result;

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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
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
	public static class GuardianRespone extends TaobaoObject {
		private static final long serialVersionUID = 8197498576218759778L;
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
		 * 关系（F爸爸、M妈妈、O其他）
		 */
		@ApiField("relation")
		private String relation;
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
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 8231797722622367241L;
		/**
		 * 是否存在下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("guardian_respone")
		private List<GuardianRespone> list;
		/**
		 * 分页游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<GuardianRespone> getList() {
			return this.list;
		}
		public void setList(List<GuardianRespone> list) {
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
