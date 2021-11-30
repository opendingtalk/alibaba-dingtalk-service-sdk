package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiDingTaskCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ding.task.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.18
 */
public class OapiDingTaskCreateRequest extends BaseTaobaoRequest<OapiDingTaskCreateResponse> {
	
	

	/** 
	* 任务对外接口
	 */
	private String taskSendVO;

	public void setTaskSendVO(String taskSendVO) {
		this.taskSendVO = taskSendVO;
	}

	public void setTaskSendVO(TaskSendVo taskSendVO) {
		this.taskSendVO = new JSONWriter(false,false,true).write(taskSendVO);
	}

	public String getTaskSendVO() {
		return this.taskSendVO;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ding.task.create";
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
		txtParams.put("task_send_v_o", this.taskSendVO);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingTaskCreateResponse> getResponseClass() {
		return OapiDingTaskCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 附件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AttachmentVo extends TaobaoObject {
		private static final long serialVersionUID = 7551122919413562368L;
		/**
		 * 文件后缀, 用于展示文件对应图标
		 */
		@ApiField("detail_type")
		private String detailType;
		/**
		 * 上传DING盘后的文件ID
		 */
		@ApiField("file_id")
		private String fileId;
		/**
		 * 文件名
		 */
		@ApiField("file_name")
		private String fileName;
		/**
		 * 文件大小(单位:Byte, 最大2G)
		 */
		@ApiField("file_size")
		private Long fileSize;
		/**
		 * 上传DING盘后的SpaceId
		 */
		@ApiField("file_space_id")
		private String fileSpaceId;
		/**
		 * 链接缩略图
		 */
		@ApiField("link_pic_url")
		private String linkPicUrl;
		/**
		 * 链接摘要
		 */
		@ApiField("link_text")
		private String linkText;
		/**
		 * 链接标题
		 */
		@ApiField("link_title")
		private String linkTitle;
		/**
		 * 链接URL
		 */
		@ApiField("link_url")
		private String linkUrl;
		/**
		 * 附件类型:img-图片,link-链接,file-文件
		 */
		@ApiField("type")
		private String type;
	
		public String getDetailType() {
			return this.detailType;
		}
		public void setDetailType(String detailType) {
			this.detailType = detailType;
		}
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
		public Long getFileSize() {
			return this.fileSize;
		}
		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}
		public String getFileSpaceId() {
			return this.fileSpaceId;
		}
		public void setFileSpaceId(String fileSpaceId) {
			this.fileSpaceId = fileSpaceId;
		}
		public String getLinkPicUrl() {
			return this.linkPicUrl;
		}
		public void setLinkPicUrl(String linkPicUrl) {
			this.linkPicUrl = linkPicUrl;
		}
		public String getLinkText() {
			return this.linkText;
		}
		public void setLinkText(String linkText) {
			this.linkText = linkText;
		}
		public String getLinkTitle() {
			return this.linkTitle;
		}
		public void setLinkTitle(String linkTitle) {
			this.linkTitle = linkTitle;
		}
		public String getLinkUrl() {
			return this.linkUrl;
		}
		public void setLinkUrl(String linkUrl) {
			this.linkUrl = linkUrl;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 任务对外接口
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskSendVo extends TaobaoObject {
		private static final long serialVersionUID = 7893874696826618458L;
		/**
		 * 附件
		 */
		@ApiField("attachment")
		private AttachmentVo attachment;
		/**
		 * 任务内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 任务内容类型；1-文本；目前只支持文本；
		 */
		@ApiField("content_type")
		private Long contentType;
		/**
		 * 任务截止时间（单位：毫秒），datetime转成long
		 */
		@ApiField("dead_line")
		private Long deadLine;
		/**
		 * 任务执行人
		 */
		@ApiField("receiver_userid")
		private String receiverUserid;
		/**
		 * 提醒时间（单位：毫秒），datetime转成long
		 */
		@ApiField("remind_time")
		private Long remindTime;
		/**
		 * 提醒方式；1-应用内；目前只支持应用内；
		 */
		@ApiField("remind_type")
		private Long remindType;
		/**
		 * 发送者ID
		 */
		@ApiField("send_userid")
		private String sendUserid;
		/**
		 * 任务截止前提醒时间
		 */
		@ApiField("task_ahead_remind_time")
		private Long taskAheadRemindTime;
		/**
		 * 提醒类型:1-应用内
		 */
		@ApiField("task_ahead_remind_type")
		private Long taskAheadRemindType;
	
		public AttachmentVo getAttachment() {
			return this.attachment;
		}
		public void setAttachment(AttachmentVo attachment) {
			this.attachment = attachment;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Long getContentType() {
			return this.contentType;
		}
		public void setContentType(Long contentType) {
			this.contentType = contentType;
		}
		public Long getDeadLine() {
			return this.deadLine;
		}
		public void setDeadLine(Long deadLine) {
			this.deadLine = deadLine;
		}
		public String getReceiverUserid() {
			return this.receiverUserid;
		}
		public void setReceiverUserid(String receiverUserid) {
			this.receiverUserid = receiverUserid;
		}
		public Long getRemindTime() {
			return this.remindTime;
		}
		public void setRemindTime(Long remindTime) {
			this.remindTime = remindTime;
		}
		public Long getRemindType() {
			return this.remindType;
		}
		public void setRemindType(Long remindType) {
			this.remindType = remindType;
		}
		public String getSendUserid() {
			return this.sendUserid;
		}
		public void setSendUserid(String sendUserid) {
			this.sendUserid = sendUserid;
		}
		public Long getTaskAheadRemindTime() {
			return this.taskAheadRemindTime;
		}
		public void setTaskAheadRemindTime(Long taskAheadRemindTime) {
			this.taskAheadRemindTime = taskAheadRemindTime;
		}
		public Long getTaskAheadRemindType() {
			return this.taskAheadRemindType;
		}
		public void setTaskAheadRemindType(Long taskAheadRemindType) {
			this.taskAheadRemindType = taskAheadRemindType;
		}
	}
	

}