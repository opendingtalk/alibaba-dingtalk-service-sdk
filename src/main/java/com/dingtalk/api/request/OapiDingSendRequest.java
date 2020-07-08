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
import com.dingtalk.api.response.OapiDingSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ding.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.14
 */
public class OapiDingSendRequest extends BaseTaobaoRequest<OapiDingSendResponse> {
	
	

	/** 
	* 发DING的请求体
	 */
	private String openDingSendVo;

	public void setOpenDingSendVo(String openDingSendVo) {
		this.openDingSendVo = openDingSendVo;
	}

	public void setOpenDingSendVo(OpenDingSendVo openDingSendVo) {
		this.openDingSendVo = new JSONWriter(false,false,true).write(openDingSendVo);
	}

	public String getOpenDingSendVo() {
		return this.openDingSendVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ding.send";
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
		txtParams.put("open_ding_send_vo", this.openDingSendVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingSendResponse> getResponseClass() {
		return OapiDingSendResponse.class;
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
		private static final long serialVersionUID = 5121448712772749843L;
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
	 * 发DING的请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenDingSendVo extends TaobaoObject {
		private static final long serialVersionUID = 8124972337682311991L;
		/**
		 * 附件
		 */
		@ApiField("attachment")
		private AttachmentVo attachment;
		/**
		 * 接收者工号列表
		 */
		@ApiListField("receiver_uids")
		@ApiField("string")
		private List<String> receiverUids;
		/**
		 * 提醒类型:1-应用内;2-短信
		 */
		@ApiField("remind_type")
		private Long remindType;
		/**
		 * 通知内容
		 */
		@ApiField("text_content")
		private String textContent;
	
		public AttachmentVo getAttachment() {
			return this.attachment;
		}
		public void setAttachment(AttachmentVo attachment) {
			this.attachment = attachment;
		}
		public List<String> getReceiverUids() {
			return this.receiverUids;
		}
		public void setReceiverUids(List<String> receiverUids) {
			this.receiverUids = receiverUids;
		}
		public Long getRemindType() {
			return this.remindType;
		}
		public void setRemindType(Long remindType) {
			this.remindType = remindType;
		}
		public String getTextContent() {
			return this.textContent;
		}
		public void setTextContent(String textContent) {
			this.textContent = textContent;
		}
	}
	

}