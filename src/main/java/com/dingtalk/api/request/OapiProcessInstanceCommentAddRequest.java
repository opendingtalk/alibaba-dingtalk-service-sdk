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
import com.dingtalk.api.response.OapiProcessInstanceCommentAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.instance.comment.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.18
 */
public class OapiProcessInstanceCommentAddRequest extends BaseTaobaoRequest<OapiProcessInstanceCommentAddResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(AddCommentRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.instance.comment.add";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessInstanceCommentAddResponse> getResponseClass() {
		return OapiProcessInstanceCommentAddResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 附件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Attachment extends TaobaoObject {
		private static final long serialVersionUID = 8356953279789861214L;
		/**
		 * 文件id
		 */
		@ApiField("file_id")
		private String fileId;
		/**
		 * 文件名
		 */
		@ApiField("file_name")
		private String fileName;
		/**
		 * 文件大小
		 */
		@ApiField("file_size")
		private String fileSize;
		/**
		 * 文件类型
		 */
		@ApiField("file_type")
		private String fileType;
		/**
		 * 钉盘spaceId
		 */
		@ApiField("space_id")
		private String spaceId;
	
		public String getFileId() {
			return this.fileId;
		}
		public void setFileId(String fileId) {
			this.fileId = fileId;
		}
		public String getFileName() {
			return this.fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getFileSize() {
			return this.fileSize;
		}
		public void setFileSize(String fileSize) {
			this.fileSize = fileSize;
		}
		public String getFileType() {
			return this.fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
		public String getSpaceId() {
			return this.spaceId;
		}
		public void setSpaceId(String spaceId) {
			this.spaceId = spaceId;
		}
	}
	
	/**
	 * 文件类
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class File extends TaobaoObject {
		private static final long serialVersionUID = 8655755673666989297L;
		/**
		 * 附件
		 */
		@ApiListField("attachments")
		@ApiField("attachment")
		private List<Attachment> attachments;
		/**
		 * 图片
		 */
		@ApiListField("photos")
		@ApiField("string")
		private List<String> photos;
	
		public List<Attachment> getAttachments() {
			return this.attachments;
		}
		public void setAttachments(List<Attachment> attachments) {
			this.attachments = attachments;
		}
		public List<String> getPhotos() {
			return this.photos;
		}
		public void setPhotos(List<String> photos) {
			this.photos = photos;
		}
	}
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AddCommentRequest extends TaobaoObject {
		private static final long serialVersionUID = 2154358131256674899L;
		/**
		 * 评论人工号
		 */
		@ApiField("comment_userid")
		private String commentUserid;
		/**
		 * 文件类
		 */
		@ApiField("file")
		private File file;
		/**
		 * 实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 评论内容
		 */
		@ApiField("text")
		private String text;
	
		public String getCommentUserid() {
			return this.commentUserid;
		}
		public void setCommentUserid(String commentUserid) {
			this.commentUserid = commentUserid;
		}
		public File getFile() {
			return this.file;
		}
		public void setFile(File file) {
			this.file = file;
		}
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
	}
	

}