package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.user.course.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduHomeworkUserCourseQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5543485265112679867L;

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
	 * 科目内容详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TemplateContentDto extends TaobaoObject {
		private static final long serialVersionUID = 8189589377514789613L;
		/**
		 * 图片
		 */
		@ApiField("photo")
		private String photo;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public String getPhoto() {
			return this.photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 4724148576386965532L;
		/**
		 * 科目内容详情
		 */
		@ApiListField("contents")
		@ApiField("template_content_dto")
		private List<TemplateContentDto> contents;
	
		public List<TemplateContentDto> getContents() {
			return this.contents;
		}
		public void setContents(List<TemplateContentDto> contents) {
			this.contents = contents;
		}
	}
	


}
