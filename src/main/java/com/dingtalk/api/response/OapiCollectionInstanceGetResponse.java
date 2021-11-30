package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.collection.instance.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCollectionInstanceGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4554545216661547798L;

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
	 * 结果
	 */
	@ApiField("result")
	private FormInstanceVo result;


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

	public void setResult(FormInstanceVo result) {
		this.result = result;
	}
	public FormInstanceVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 表单具体数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormData extends TaobaoObject {
		private static final long serialVersionUID = 7271552889385921745L;
		/**
		 * 控件名
		 */
		@ApiField("key")
		private String key;
		/**
		 * 表单标签名
		 */
		@ApiField("label")
		private String label;
		/**
		 * 表单值
		 */
		@ApiField("value")
		private String value;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormInstanceVo extends TaobaoObject {
		private static final long serialVersionUID = 8771179959189867794L;
		/**
		 * 创建时间
		 */
		@ApiField("create_time")
		private Date createTime;
		/**
		 * 创建者userid
		 */
		@ApiField("creator")
		private String creator;
		/**
		 * 表单code
		 */
		@ApiField("form_code")
		private String formCode;
		/**
		 * 表单具体数据
		 */
		@ApiListField("form_list")
		@ApiField("form_data")
		private List<FormData> formList;
		/**
		 * 修改时间
		 */
		@ApiField("modify_time")
		private Date modifyTime;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public Date getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public String getCreator() {
			return this.creator;
		}
		public void setCreator(String creator) {
			this.creator = creator;
		}
		public String getFormCode() {
			return this.formCode;
		}
		public void setFormCode(String formCode) {
			this.formCode = formCode;
		}
		public List<FormData> getFormList() {
			return this.formList;
		}
		public void setFormList(List<FormData> formList) {
			this.formList = formList;
		}
		public Date getModifyTime() {
			return this.modifyTime;
		}
		public void setModifyTime(Date modifyTime) {
			this.modifyTime = modifyTime;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
