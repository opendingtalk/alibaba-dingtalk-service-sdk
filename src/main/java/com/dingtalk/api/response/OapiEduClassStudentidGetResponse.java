package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.class.studentid.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduClassStudentidGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5236174682382723217L;

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
	 * 数据
	 */
	@ApiField("result")
	private OpenEduSelectStudentIdResponse result;

	/** 
	 * 是否调用成功
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

	public void setResult(OpenEduSelectStudentIdResponse result) {
		this.result = result;
	}
	public OpenEduSelectStudentIdResponse getResult( ) {
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
	 * 数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduSelectStudentIdResponse extends TaobaoObject {
		private static final long serialVersionUID = 6536674273169468896L;
		/**
		 * 班级id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 学生id列表
		 */
		@ApiListField("student_ids")
		@ApiField("string")
		private List<String> studentIds;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public List<String> getStudentIds() {
			return this.studentIds;
		}
		public void setStudentIds(List<String> studentIds) {
			this.studentIds = studentIds;
		}
	}
	


}
