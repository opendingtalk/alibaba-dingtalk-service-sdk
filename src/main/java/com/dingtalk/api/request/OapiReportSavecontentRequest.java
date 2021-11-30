package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiReportSavecontentResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.report.savecontent request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.17
 */
public class OapiReportSavecontentRequest extends BaseTaobaoRequest<OapiReportSavecontentResponse> {
	
	

	/** 
	* 保存日志的参数对象
	 */
	private String createReportParam;

	public void setCreateReportParam(String createReportParam) {
		this.createReportParam = createReportParam;
	}

	public void setCreateReportParam(OapiCreateReportParam createReportParam) {
		this.createReportParam = new JSONWriter(false,false,true).write(createReportParam);
	}

	public String getCreateReportParam() {
		return this.createReportParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.report.savecontent";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("create_report_param", this.createReportParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiReportSavecontentResponse> getResponseClass() {
		return OapiReportSavecontentResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 日志内容数组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiReportContentVo extends TaobaoObject {
		private static final long serialVersionUID = 4668833958633726124L;
		/**
		 * 日志内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 日志内容的类型
		 */
		@ApiField("content_type")
		private String contentType;
		/**
		 * 日志对应的模板某个字段的标题
		 */
		@ApiField("key")
		private String key;
		/**
		 * 保存日志内容对应的模板某个字段的唯一序列id
		 */
		@ApiField("sort")
		private Long sort;
		/**
		 * 保存日志内容对应的模板某个字段的类型
		 */
		@ApiField("type")
		private Long type;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getContentType() {
			return this.contentType;
		}
		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public Long getSort() {
			return this.sort;
		}
		public void setSort(Long sort) {
			this.sort = sort;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	
	/**
	 * 保存日志的参数对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiCreateReportParam extends TaobaoObject {
		private static final long serialVersionUID = 1165394259866968421L;
		/**
		 * 日志内容数组
		 */
		@ApiListField("contents")
		@ApiField("oapi_report_content_vo")
		private List<OapiReportContentVo> contents;
		/**
		 * 日志来源，每个组织可以自己起一个唯一的来源标识
		 */
		@ApiField("dd_from")
		private String ddFrom;
		/**
		 * 模板id
		 */
		@ApiField("template_id")
		private String templateId;
		/**
		 * 创建日志的员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public List<OapiReportContentVo> getContents() {
			return this.contents;
		}
		public void setContents(List<OapiReportContentVo> contents) {
			this.contents = contents;
		}
		public String getDdFrom() {
			return this.ddFrom;
		}
		public void setDdFrom(String ddFrom) {
			this.ddFrom = ddFrom;
		}
		public String getTemplateId() {
			return this.templateId;
		}
		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}