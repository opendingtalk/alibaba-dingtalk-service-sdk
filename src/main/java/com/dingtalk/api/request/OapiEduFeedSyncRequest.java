package com.dingtalk.api.request;

import java.util.List;
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
import com.dingtalk.api.response.OapiEduFeedSyncResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.feed.sync request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.23
 */
public class OapiEduFeedSyncRequest extends BaseTaobaoRequest<OapiEduFeedSyncResponse> {
	
	

	/** 
	* 媒体相册id
	 */
	private String albumId;

	/** 
	* 部门或班级id
	 */
	private Long deptId;

	/** 
	* 同步类型(1.全量同步，2.单个同步)
	 */
	private Long feeType;

	/** 
	* 媒体list
	 */
	private String feedMedias;

	/** 
	* 拓展字段
	 */
	private String future;

	/** 
	* 媒体用户id
	 */
	private String mediaUid;

	/** 
	* 接口同步id(选填)
	 */
	private String opUserId;

	/** 
	* 发送时间戳(毫秒)
	 */
	private Long sendTime;

	/** 
	* 媒体发送用户id
	 */
	private String sendUid;

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getAlbumId() {
		return this.albumId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public void setFeeType(Long feeType) {
		this.feeType = feeType;
	}

	public Long getFeeType() {
		return this.feeType;
	}

	public void setFeedMedias(String feedMedias) {
		this.feedMedias = feedMedias;
	}

	public void setFeedMedias(List<IndustrySyncFeedMediaReq> feedMedias) {
		this.feedMedias = new JSONWriter(false,false,true).write(feedMedias);
	}

	public String getFeedMedias() {
		return this.feedMedias;
	}

	public void setFuture(String future) {
		this.future = future;
	}

	public String getFuture() {
		return this.future;
	}

	public void setMediaUid(String mediaUid) {
		this.mediaUid = mediaUid;
	}

	public String getMediaUid() {
		return this.mediaUid;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setSendTime(Long sendTime) {
		this.sendTime = sendTime;
	}

	public Long getSendTime() {
		return this.sendTime;
	}

	public void setSendUid(String sendUid) {
		this.sendUid = sendUid;
	}

	public String getSendUid() {
		return this.sendUid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.feed.sync";
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
		txtParams.put("album_id", this.albumId);
		txtParams.put("dept_id", this.deptId);
		txtParams.put("fee_type", this.feeType);
		txtParams.put("feed_medias", this.feedMedias);
		txtParams.put("future", this.future);
		txtParams.put("media_uid", this.mediaUid);
		txtParams.put("op_userId", this.opUserId);
		txtParams.put("send_time", this.sendTime);
		txtParams.put("send_uid", this.sendUid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduFeedSyncResponse> getResponseClass() {
		return OapiEduFeedSyncResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(feeType, "feeType");
		RequestCheckUtils.checkObjectMaxListSize(feedMedias, 999, "feedMedias");
	}
	
	/**
	 * 媒体list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IndustrySyncFeedMediaReq extends TaobaoObject {
		private static final long serialVersionUID = 1817824366178396587L;
		/**
		 * 媒体类型
		 */
		@ApiField("media_type")
		private Long mediaType;
		/**
		 * 媒体链接
		 */
		@ApiField("media_url")
		private String mediaUrl;
		/**
		 * 媒体缩略图链接
		 */
		@ApiField("thumbnail_url")
		private String thumbnailUrl;
	
		public Long getMediaType() {
			return this.mediaType;
		}
		public void setMediaType(Long mediaType) {
			this.mediaType = mediaType;
		}
		public String getMediaUrl() {
			return this.mediaUrl;
		}
		public void setMediaUrl(String mediaUrl) {
			this.mediaUrl = mediaUrl;
		}
		public String getThumbnailUrl() {
			return this.thumbnailUrl;
		}
		public void setThumbnailUrl(String thumbnailUrl) {
			this.thumbnailUrl = thumbnailUrl;
		}
	}
	

}