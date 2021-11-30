package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiEduHomeworkCommentTipsCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.comment.tips.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.03
 */
public class OapiEduHomeworkCommentTipsCreateRequest extends BaseTaobaoRequest<OapiEduHomeworkCommentTipsCreateResponse> {
	
	

	/** 
	* 属性字段
	 */
	private String attributes;

	/** 
	* 音频
	 */
	private String audio;

	/** 
	* sfadf
	 */
	private String bizCode;

	/** 
	* 内容
	 */
	private String content;

	/** 
	* 视频
	 */
	private String media;

	/** 
	* 图片
	 */
	private String photo;

	/** 
	* 排序
	 */
	private Long sortOrder;

	/** 
	* 用户userid
	 */
	private String userid;

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getAttributes() {
		return this.attributes;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public String getAudio() {
		return this.audio;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getMedia() {
		return this.media;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.comment.tips.create";
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
		txtParams.put("attributes", this.attributes);
		txtParams.put("audio", this.audio);
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("content", this.content);
		txtParams.put("media", this.media);
		txtParams.put("photo", this.photo);
		txtParams.put("sort_order", this.sortOrder);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkCommentTipsCreateResponse> getResponseClass() {
		return OapiEduHomeworkCommentTipsCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}