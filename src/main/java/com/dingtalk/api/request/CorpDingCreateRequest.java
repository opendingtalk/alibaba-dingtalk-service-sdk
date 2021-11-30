package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.CorpDingCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ding.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpDingCreateRequest extends BaseTaobaoRequest<CorpDingCreateResponse> {
	
	

	/** 
	* 附件内容
	 */
	private String attachment;

	/** 
	* 发送者工号
	 */
	private String creatorUserid;

	/** 
	* 接收者工号列表
	 */
	private String receiverUserids;

	/** 
	* 发送时间(单位:毫秒)
	 */
	private Long remindTime;

	/** 
	* 提醒类型:1-应用内;2-短信
	 */
	private Long remindType;

	/** 
	* 通知内容
	 */
	private String textContent;

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public void setAttachment(AttachmentVO attachment) {
		this.attachment = new JSONWriter(false,true).write(attachment);
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setCreatorUserid(String creatorUserid) {
		this.creatorUserid = creatorUserid;
	}

	public String getCreatorUserid() {
		return this.creatorUserid;
	}

	public void setReceiverUserids(String receiverUserids) {
		this.receiverUserids = receiverUserids;
	}

	public String getReceiverUserids() {
		return this.receiverUserids;
	}

	public void setRemindTime(Long remindTime) {
		this.remindTime = remindTime;
	}

	public Long getRemindTime() {
		return this.remindTime;
	}

	public void setRemindType(Long remindType) {
		this.remindType = remindType;
	}

	public Long getRemindType() {
		return this.remindType;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getTextContent() {
		return this.textContent;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.ding.create";
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
		txtParams.put("attachment", this.attachment);
		txtParams.put("creator_userid", this.creatorUserid);
		txtParams.put("receiver_userids", this.receiverUserids);
		txtParams.put("remind_time", this.remindTime);
		txtParams.put("remind_type", this.remindType);
		txtParams.put("text_content", this.textContent);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpDingCreateResponse> getResponseClass() {
		return CorpDingCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(creatorUserid, "creatorUserid");
		RequestCheckUtils.checkNotEmpty(receiverUserids, "receiverUserids");
		RequestCheckUtils.checkMaxListSize(receiverUserids, 20, "receiverUserids");
		RequestCheckUtils.checkNotEmpty(remindTime, "remindTime");
		RequestCheckUtils.checkNotEmpty(remindType, "remindType");
		RequestCheckUtils.checkNotEmpty(textContent, "textContent");
		RequestCheckUtils.checkMaxLength(textContent, 5000, "textContent");
	}
	
	/**
	 * 附件内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AttachmentVO extends TaobaoObject {
		private static final long serialVersionUID = 5598511368424952132L;
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
	

}