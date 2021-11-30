package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.extcontact.listlabelgroups response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiExtcontactListlabelgroupsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4472557743442288465L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * results
	 */
	@ApiListField("results")
	@ApiField("open_label_group")
	private List<OpenLabelGroup> results;


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

	public void setResults(List<OpenLabelGroup> results) {
		this.results = results;
	}
	public List<OpenLabelGroup> getResults( ) {
		return this.results;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * labels
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenLabel extends TaobaoObject {
		private static final long serialVersionUID = 7854353275628868978L;
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
		private static final long serialVersionUID = 8413753694488827471L;
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
	


}
