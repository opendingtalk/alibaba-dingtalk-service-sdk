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
import com.dingtalk.api.response.OapiProcessinstanceExecuteV2Response;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.instance.execute request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.18
 */
public class OapiProcessinstanceExecuteV2Request extends BaseTaobaoRequest<OapiProcessinstanceExecuteV2Response> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(ExecuteTaskRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.instance.execute";
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

	public Class<OapiProcessinstanceExecuteV2Response> getResponseClass() {
		return OapiProcessinstanceExecuteV2Response.class;
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
		private static final long serialVersionUID = 6749258797358223683L;
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
	 * 文件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class File extends TaobaoObject {
		private static final long serialVersionUID = 7736438822426939853L;
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
	public static class ExecuteTaskRequest extends TaobaoObject {
		private static final long serialVersionUID = 6799519834511219243L;
		/**
		 * 操作人id，通过dingtalk.smartwork.bpms.processinstance.get这个接口可以获取
		 */
		@ApiField("actioner_userid")
		private String actionerUserid;
		/**
		 * 文件
		 */
		@ApiField("file")
		private File file;
		/**
		 * 审批实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 操作评论，可为空
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 审批操作，同意-agree，拒绝-refuse
		 */
		@ApiField("result")
		private String result;
		/**
		 * 任务节点id，dingtalk.smartwork.bpms.processinstance.get接口可获取
		 */
		@ApiField("task_id")
		private Long taskId;
	
		public String getActionerUserid() {
			return this.actionerUserid;
		}
		public void setActionerUserid(String actionerUserid) {
			this.actionerUserid = actionerUserid;
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
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getResult() {
			return this.result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public Long getTaskId() {
			return this.taskId;
		}
		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}
	}
	

}