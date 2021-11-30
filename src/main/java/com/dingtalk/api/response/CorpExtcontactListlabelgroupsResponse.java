package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.extcontact.listlabelgroups response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpExtcontactListlabelgroupsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1338137697521714994L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * labels
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenLabel extends TaobaoObject {
		private static final long serialVersionUID = 8216945282137242752L;
		/**
		 * 标签id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 标签名字
		 */
		@ApiField("name")
		private String name;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * results
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenLabelGroup extends TaobaoObject {
		private static final long serialVersionUID = 4784818515987576286L;
		/**
		 * 标签组颜色
		 */
		@ApiField("color")
		private Long color;
		/**
		 * labels
		 */
		@ApiListField("labels")
		@ApiField("open_label")
		private List<OpenLabel> labels;
		/**
		 * 标签组名字
		 */
		@ApiField("name")
		private String name;
	
		public Long getColor() {
			return this.color;
		}
		public void setColor(Long color) {
			this.color = color;
		}
		public List<OpenLabel> getLabels() {
			return this.labels;
		}
		public void setLabels(List<OpenLabel> labels) {
			this.labels = labels;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2194439764966963281L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * results
		 */
		@ApiListField("results")
		@ApiField("open_label_group")
		private List<OpenLabelGroup> results;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public List<OpenLabelGroup> getResults() {
			return this.results;
		}
		public void setResults(List<OpenLabelGroup> results) {
			this.results = results;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
