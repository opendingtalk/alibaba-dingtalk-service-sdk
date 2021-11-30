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
import com.dingtalk.api.response.OapiWorkspaceCirclePostCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.circle.post.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.06
 */
public class OapiWorkspaceCirclePostCreateRequest extends BaseTaobaoRequest<OapiWorkspaceCirclePostCreateResponse> {
	
	

	/** 
	* 创建动态的入参
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(FvPostCreateOpenDto req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.circle.post.create";
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
		txtParams.put("req", this.req);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceCirclePostCreateResponse> getResponseClass() {
		return OapiWorkspaceCirclePostCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 钉盘文件列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvDingPanFileContentOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 2264555842191588712L;
		/**
		 * 文件通过钉盘接口上传后获得的mediaId
		 */
		@ApiField("media_id")
		private String mediaId;
		/**
		 * 文件名
		 */
		@ApiField("name")
		private String name;
	
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 附件内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvAttachmentsOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 5536638195138195473L;
		/**
		 * 钉盘文件列表
		 */
		@ApiListField("ding_files")
		@ApiField("fv_ding_pan_file_content_open_dto")
		private List<FvDingPanFileContentOpenDto> dingFiles;
	
		public List<FvDingPanFileContentOpenDto> getDingFiles() {
			return this.dingFiles;
		}
		public void setDingFiles(List<FvDingPanFileContentOpenDto> dingFiles) {
			this.dingFiles = dingFiles;
		}
	}
	
	/**
	 * 图片内容列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvPhotoOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 2355264355923622362L;
		/**
		 * 图片url或通过钉盘接口上传获得的mediaId
		 */
		@ApiField("media_id")
		private String mediaId;
	
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
	}
	
	/**
	 * 图片内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvPhotoContentOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 4471634745134284728L;
		/**
		 * 图片内容列表
		 */
		@ApiListField("photos")
		@ApiField("fv_photo_open_dto")
		private List<FvPhotoOpenDto> photos;
	
		public List<FvPhotoOpenDto> getPhotos() {
			return this.photos;
		}
		public void setPhotos(List<FvPhotoOpenDto> photos) {
			this.photos = photos;
		}
	}
	
	/**
	 * 视频内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvVideoContentOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 5235352116371929321L;
		/**
		 * 视频比特率
		 */
		@ApiField("bitrate")
		private Long bitrate;
		/**
		 * 视频播放时长，单位秒
		 */
		@ApiField("duration")
		private Long duration;
		/**
		 * 视频名字
		 */
		@ApiField("file_name")
		private String fileName;
		/**
		 * 视频文件大小
		 */
		@ApiField("file_size")
		private Long fileSize;
		/**
		 * 视频类型
		 */
		@ApiField("file_type")
		private String fileType;
		/**
		 * 视频高度
		 */
		@ApiField("height")
		private Long height;
		/**
		 * 视频封面图url或通过钉盘接口上传获得的mediaId
		 */
		@ApiField("pic_media_id")
		private String picMediaId;
		/**
		 * 视频url或通过钉盘接口上传获得的mediaId
		 */
		@ApiField("video_media_id")
		private String videoMediaId;
		/**
		 * 视频宽度
		 */
		@ApiField("width")
		private Long width;
	
		public Long getBitrate() {
			return this.bitrate;
		}
		public void setBitrate(Long bitrate) {
			this.bitrate = bitrate;
		}
		public Long getDuration() {
			return this.duration;
		}
		public void setDuration(Long duration) {
			this.duration = duration;
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
		public String getFileType() {
			return this.fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
		public Long getHeight() {
			return this.height;
		}
		public void setHeight(Long height) {
			this.height = height;
		}
		public String getPicMediaId() {
			return this.picMediaId;
		}
		public void setPicMediaId(String picMediaId) {
			this.picMediaId = picMediaId;
		}
		public String getVideoMediaId() {
			return this.videoMediaId;
		}
		public void setVideoMediaId(String videoMediaId) {
			this.videoMediaId = videoMediaId;
		}
		public Long getWidth() {
			return this.width;
		}
		public void setWidth(Long width) {
			this.width = width;
		}
	}
	
	/**
	 * 动态的内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvPostContentOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 8532675957445671235L;
		/**
		 * 附件内容
		 */
		@ApiField("attachments")
		private FvAttachmentsOpenDto attachments;
		/**
		 * 动态类型，1：文本动态；2：图片动态；3：视频动态
		 */
		@ApiField("content_type")
		private Long contentType;
		/**
		 * 图片内容
		 */
		@ApiField("photo_content")
		private FvPhotoContentOpenDto photoContent;
		/**
		 * 文本内容
		 */
		@ApiField("text")
		private String text;
		/**
		 * 视频内容
		 */
		@ApiField("video_content")
		private FvVideoContentOpenDto videoContent;
	
		public FvAttachmentsOpenDto getAttachments() {
			return this.attachments;
		}
		public void setAttachments(FvAttachmentsOpenDto attachments) {
			this.attachments = attachments;
		}
		public Long getContentType() {
			return this.contentType;
		}
		public void setContentType(Long contentType) {
			this.contentType = contentType;
		}
		public FvPhotoContentOpenDto getPhotoContent() {
			return this.photoContent;
		}
		public void setPhotoContent(FvPhotoContentOpenDto photoContent) {
			this.photoContent = photoContent;
		}
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public FvVideoContentOpenDto getVideoContent() {
			return this.videoContent;
		}
		public void setVideoContent(FvVideoContentOpenDto videoContent) {
			this.videoContent = videoContent;
		}
	}
	
	/**
	 * 动态所属标签或话题
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvPostTagOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 6219269571586587872L;
		/**
		 * 标签名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 标签id
		 */
		@ApiField("tag_id")
		private Long tagId;
		/**
		 * 标签类型，2：话题；9：标签
		 */
		@ApiField("tag_type")
		private Long tagType;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getTagId() {
			return this.tagId;
		}
		public void setTagId(Long tagId) {
			this.tagId = tagId;
		}
		public Long getTagType() {
			return this.tagType;
		}
		public void setTagType(Long tagType) {
			this.tagType = tagType;
		}
	}
	
	/**
	 * 创建动态的入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvPostCreateOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 7554287111366471648L;
		/**
		 * 动态的内容
		 */
		@ApiField("content")
		private FvPostContentOpenDto content;
		/**
		 * 动态所属标签或话题
		 */
		@ApiListField("tags")
		@ApiField("fv_post_tag_open_dto")
		private List<FvPostTagOpenDto> tags;
		/**
		 * 用户在圈子或项目内的userId
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 请求的唯一标识，防止同一请求多次访问。若重复会返回错误:需要uuid
		 */
		@ApiField("uuid")
		private String uuid;
	
		public FvPostContentOpenDto getContent() {
			return this.content;
		}
		public void setContent(FvPostContentOpenDto content) {
			this.content = content;
		}
		public List<FvPostTagOpenDto> getTags() {
			return this.tags;
		}
		public void setTags(List<FvPostTagOpenDto> tags) {
			this.tags = tags;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	

}