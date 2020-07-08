package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.inspect.feedback.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiInspectFeedbackGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8183991199446932746L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 反馈表单
	 */
	@ApiField("feedback_form")
	private TopInspectFeedbackVo feedbackForm;


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

	public void setFeedbackForm(TopInspectFeedbackVo feedbackForm) {
		this.feedbackForm = feedbackForm;
	}
	public TopInspectFeedbackVo getFeedbackForm( ) {
		return this.feedbackForm;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 表单内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopInspectFeedbackFormItemVO extends TaobaoObject {
		private static final long serialVersionUID = 1376973769391533475L;
		/**
		 * 表单项的业务别名
		 */
		@ApiField("biz_alias")
		private String bizAlias;
		/**
		 * 表单项的唯一标识
		 */
		@ApiField("id")
		private String id;
		/**
		 * 表单项标题
		 */
		@ApiField("label")
		private String label;
		/**
		 * 表单项的类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 表单项的值
		 */
		@ApiField("value")
		private String value;
	
		public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 反馈表单
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopInspectFeedbackVo extends TaobaoObject {
		private static final long serialVersionUID = 3856691786934453887L;
		/**
		 * 表单内容
		 */
		@ApiListField("content")
		@ApiField("top_inspect_feedback_form_item_v_o")
		private List<TopInspectFeedbackFormItemVO> content;
		/**
		 * 表单唯一标识
		 */
		@ApiField("form_inst_id")
		private String formInstId;
		/**
		 * 表单标题
		 */
		@ApiField("title")
		private String title;
	
		public List<TopInspectFeedbackFormItemVO> getContent() {
			return this.content;
		}
		public void setContent(List<TopInspectFeedbackFormItemVO> content) {
			this.content = content;
		}
		public String getFormInstId() {
			return this.formInstId;
		}
		public void setFormInstId(String formInstId) {
			this.formInstId = formInstId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
