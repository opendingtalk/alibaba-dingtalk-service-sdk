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
import com.dingtalk.api.response.CorpDingTaskCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ding.task.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpDingTaskCreateRequest extends BaseTaobaoRequest<CorpDingTaskCreateResponse> {
	
	

	/** 
	* 任务对外接口
	 */
	private String taskSendVO;

	public void setTaskSendVO(String taskSendVO) {
		this.taskSendVO = taskSendVO;
	}

	public void setTaskSendVO(TaskSendVo taskSendVO) {
		this.taskSendVO = new JSONWriter(false,true).write(taskSendVO);
	}

	public String getTaskSendVO() {
		return this.taskSendVO;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.ding.task.create";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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

	public Class<CorpDingTaskCreateResponse> getResponseClass() {
		return CorpDingTaskCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 任务对外接口
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskSendVo extends TaobaoObject {
		private static final long serialVersionUID = 6289268885314767567L;
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
	}
	

}