package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiLiveCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiLiveCreateRequest extends BaseTaobaoRequest<OapiLiveCreateResponse> {
	
	

	/** 
	* 直播创建请求model
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(CreateLiveReqModel request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.live.create";
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

	public Class<OapiLiveCreateResponse> getResponseClass() {
		return OapiLiveCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 直播创建请求model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateLiveReqModel extends TaobaoObject {
		private static final long serialVersionUID = 7716214755682775864L;
		/**
		 * 直播计划开始时间,选填: 如果不填写, 则取当前时间
		 */
		@ApiField("appt_begin_time")
		private Date apptBeginTime;
		/**
		 * 直播计划结束时间,选填
		 */
		@ApiField("appt_end_time")
		private Date apptEndTime;
		/**
		 * 封面图,选填: 如果不填写, 则采用默认
		 */
		@ApiField("cover_url")
		private String coverUrl;
		/**
		 * 简介,选填
		 */
		@ApiField("intro")
		private String intro;
		/**
		 * 横竖屏,选填: false 竖屏, true 横屏(默认)
		 */
		@ApiField("land_scape")
		private Boolean landScape;
		/**
		 * 预告视频Url,选填
		 */
		@ApiField("pre_video_play_url")
		private String preVideoPlayUrl;
		/**
		 * 直播可观看类型类型,必填: false 受限制的直播, true 公开的直播(默认)
		 */
		@ApiField("shared")
		private Boolean shared;
		/**
		 * 标题,必填
		 */
		@ApiField("title")
		private String title;
		/**
		 * 别名,选填
		 */
		@ApiField("user_nick")
		private String userNick;
		/**
		 * 主播ID,必填
		 */
		@ApiField("userid")
		private String userid;
	
		public Date getApptBeginTime() {
			return this.apptBeginTime;
		}
		public void setApptBeginTime(Date apptBeginTime) {
			this.apptBeginTime = apptBeginTime;
		}
		public Date getApptEndTime() {
			return this.apptEndTime;
		}
		public void setApptEndTime(Date apptEndTime) {
			this.apptEndTime = apptEndTime;
		}
		public String getCoverUrl() {
			return this.coverUrl;
		}
		public void setCoverUrl(String coverUrl) {
			this.coverUrl = coverUrl;
		}
		public String getIntro() {
			return this.intro;
		}
		public void setIntro(String intro) {
			this.intro = intro;
		}
		public Boolean getLandScape() {
			return this.landScape;
		}
		public void setLandScape(Boolean landScape) {
			this.landScape = landScape;
		}
		public String getPreVideoPlayUrl() {
			return this.preVideoPlayUrl;
		}
		public void setPreVideoPlayUrl(String preVideoPlayUrl) {
			this.preVideoPlayUrl = preVideoPlayUrl;
		}
		public Boolean getShared() {
			return this.shared;
		}
		public void setShared(Boolean shared) {
			this.shared = shared;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUserNick() {
			return this.userNick;
		}
		public void setUserNick(String userNick) {
			this.userNick = userNick;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}