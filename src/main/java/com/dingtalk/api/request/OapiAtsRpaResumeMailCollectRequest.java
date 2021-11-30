package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiAtsRpaResumeMailCollectResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.rpa.resume.mail.collect request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.29
 */
public class OapiAtsRpaResumeMailCollectRequest extends BaseTaobaoRequest<OapiAtsRpaResumeMailCollectResponse> {
	
	

	/** 
	* 业务唯一标识，接入前请提前沟通
	 */
	private String bizCode;

	/** 
	* 简历文件参数
	 */
	private String param;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(CollResumeMailParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.rpa.resume.mail.collect";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsRpaResumeMailCollectResponse> getResponseClass() {
		return OapiAtsRpaResumeMailCollectResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
	}
	
	/**
	 * 原始邮件信息，可选
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MailContent extends TaobaoObject {
		private static final long serialVersionUID = 3621399499643115146L;
		/**
		 * 邮件正文，可选
		 */
		@ApiField("body_html")
		private String bodyHtml;
		/**
		 * 发件人邮件地址，可选
		 */
		@ApiField("from_mail_address")
		private String fromMailAddress;
		/**
		 * 发件人姓名
		 */
		@ApiField("from_mail_alias")
		private String fromMailAlias;
		/**
		 * 邮件地址，可选
		 */
		@ApiField("mail_address")
		private String mailAddress;
		/**
		 * 邮件标题，可选
		 */
		@ApiField("title")
		private String title;
	
		public String getBodyHtml() {
			return this.bodyHtml;
		}
		public void setBodyHtml(String bodyHtml) {
			this.bodyHtml = bodyHtml;
		}
		public String getFromMailAddress() {
			return this.fromMailAddress;
		}
		public void setFromMailAddress(String fromMailAddress) {
			this.fromMailAddress = fromMailAddress;
		}
		public String getFromMailAlias() {
			return this.fromMailAlias;
		}
		public void setFromMailAlias(String fromMailAlias) {
			this.fromMailAlias = fromMailAlias;
		}
		public String getMailAddress() {
			return this.mailAddress;
		}
		public void setMailAddress(String mailAddress) {
			this.mailAddress = mailAddress;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 简历文件信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ResumeFileStoreVo extends TaobaoObject {
		private static final long serialVersionUID = 1445112248156495393L;
		/**
		 * 下载地址
		 */
		@ApiField("download_url")
		private String downloadUrl;
		/**
		 * 文件名，需要带后缀
		 */
		@ApiField("file_name")
		private String fileName;
		/**
		 * 文件类型
		 */
		@ApiField("file_type")
		private String fileType;
	
		public String getDownloadUrl() {
			return this.downloadUrl;
		}
		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}
		public String getFileName() {
			return this.fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getFileType() {
			return this.fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
	}
	
	/**
	 * 简历文件参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CollResumeMailParam extends TaobaoObject {
		private static final long serialVersionUID = 6785172126431344872L;
		/**
		 * 渠道来源，接入前请提前沟通
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 匹配到的职位列表
		 */
		@ApiListField("matched_jobs")
		@ApiField("string")
		private List<String> matchedJobs;
		/**
		 * 原始邮件信息，可选
		 */
		@ApiField("origin_mail")
		private MailContent originMail;
		/**
		 * 简历文件信息
		 */
		@ApiField("resume_file")
		private ResumeFileStoreVo resumeFile;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public List<String> getMatchedJobs() {
			return this.matchedJobs;
		}
		public void setMatchedJobs(List<String> matchedJobs) {
			this.matchedJobs = matchedJobs;
		}
		public MailContent getOriginMail() {
			return this.originMail;
		}
		public void setOriginMail(MailContent originMail) {
			this.originMail = originMail;
		}
		public ResumeFileStoreVo getResumeFile() {
			return this.resumeFile;
		}
		public void setResumeFile(ResumeFileStoreVo resumeFile) {
			this.resumeFile = resumeFile;
		}
	}
	

}