package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.form.condition.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessFormConditionListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7182475786172656193L;

	/** 
	 * 0
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 成功
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 表单列表
	 */
	@ApiListField("list")
	@ApiField("simple_form_component_vo")
	private List<SimpleFormComponentVo> list;


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

	public void setList(List<SimpleFormComponentVo> list) {
		this.list = list;
	}
	public List<SimpleFormComponentVo> getList( ) {
		return this.list;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 表单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SimpleFormComponentVo extends TaobaoObject {
		private static final long serialVersionUID = 3165834614786233383L;
		/**
		 * 表单id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 表单名称
		 */
		@ApiField("label")
		private String label;
	
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
	}
	


}
