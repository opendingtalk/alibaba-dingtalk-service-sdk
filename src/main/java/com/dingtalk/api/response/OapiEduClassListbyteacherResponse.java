package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.class.listbyteacher response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduClassListbyteacherResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3347514252462697459L;

	/** 
	 * 错误编码
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
	@ApiListField("result")
	@ApiField("result")
	private List<Result> result;

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

	public void setResult(List<Result> result) {
		this.result = result;
	}
	public List<Result> getResult( ) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 4346881629812352756L;
		/**
		 * 部门ID
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 班级学生人数
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 是否毕业班
		 */
		@ApiField("graduate")
		private Boolean graduate;
		/**
		 * 班级名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 父部门ID
		 */
		@ApiField("super_id")
		private Long superId;
		/**
		 * 不再过滤群类型
		 */
		@ApiField("warning")
		private String warning;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Boolean getGraduate() {
			return this.graduate;
		}
		public void setGraduate(Boolean graduate) {
			this.graduate = graduate;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public Long getSuperId() {
			return this.superId;
		}
		public void setSuperId(Long superId) {
			this.superId = superId;
		}
		public String getWarning() {
			return this.warning;
		}
		public void setWarning(String warning) {
			this.warning = warning;
		}
	}
	


}
