package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.industry.incubator.test.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiIndustryIncubatorTestAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3833131227997963448L;

	/** 
	 * 接口返回model
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Children extends TaobaoObject {
		private static final long serialVersionUID = 1138549611318364375L;
		/**
		 * 1
		 */
		@ApiField("code")
		private String code;
		/**
		 * 1
		 */
		@ApiField("html")
		private String html;
		/**
		 * 1
		 */
		@ApiField("name")
		private String name;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getHtml() {
			return this.html;
		}
		public void setHtml(String html) {
			this.html = html;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Detail extends TaobaoObject {
		private static final long serialVersionUID = 8155765574428916683L;
		/**
		 * 1
		 */
		@ApiListField("children")
		@ApiField("children")
		private List<Children> children;
		/**
		 * 1
		 */
		@ApiField("code")
		private String code;
		/**
		 * 1
		 */
		@ApiField("html")
		private String html;
		/**
		 * 1
		 */
		@ApiField("name")
		private String name;
		/**
		 * 1
		 */
		@ApiField("type")
		private String type;
	
		public List<Children> getChildren() {
			return this.children;
		}
		public void setChildren(List<Children> children) {
			this.children = children;
		}
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getHtml() {
			return this.html;
		}
		public void setHtml(String html) {
			this.html = html;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3167957131981499563L;
		/**
		 * 1
		 */
		@ApiListField("detail")
		@ApiField("detail")
		private List<Detail> detail;
		/**
		 * 1
		 */
		@ApiField("title")
		private String title;
	
		public List<Detail> getDetail() {
			return this.detail;
		}
		public void setDetail(List<Detail> detail) {
			this.detail = detail;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
