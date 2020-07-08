package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.face.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduFaceSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3822242425634934293L;

	/** 
	 * 系统错误
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * response
	 */
	@ApiField("result")
	private TopSubmitFaceSearchResponse result;

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

	public void setResult(TopSubmitFaceSearchResponse result) {
		this.result = result;
	}
	public TopSubmitFaceSearchResponse getResult( ) {
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
	 * 人脸列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Faces extends TaobaoObject {
		private static final long serialVersionUID = 4458438595375263989L;
		/**
		 * 来自录入还是标记
		 */
		@ApiField("face_type")
		private String faceType;
		/**
		 * 人脸相似度
		 */
		@ApiField("score")
		private String score;
		/**
		 * 标签id
		 */
		@ApiField("tag_id")
		private String tagId;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getFaceType() {
			return this.faceType;
		}
		public void setFaceType(String faceType) {
			this.faceType = faceType;
		}
		public String getScore() {
			return this.score;
		}
		public void setScore(String score) {
			this.score = score;
		}
		public String getTagId() {
			return this.tagId;
		}
		public void setTagId(String tagId) {
			this.tagId = tagId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * response
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopSubmitFaceSearchResponse extends TaobaoObject {
		private static final long serialVersionUID = 6321643737755226145L;
		/**
		 * 人脸列表
		 */
		@ApiListField("faces")
		@ApiField("faces")
		private List<Faces> faces;
		/**
		 * 任务id
		 */
		@ApiField("task_id")
		private String taskId;
	
		public List<Faces> getFaces() {
			return this.faces;
		}
		public void setFaces(List<Faces> faces) {
			this.faces = faces;
		}
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}
	


}
