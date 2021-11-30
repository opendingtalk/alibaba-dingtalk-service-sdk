package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoUploadRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.FileItem;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMediaUploadResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.media.upload request
 *
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMediaUploadRequest extends BaseTaobaoRequest<OapiMediaUploadResponse> implements TaobaoUploadRequest<OapiMediaUploadResponse> {
	
	

	/** 
	* form-data中媒体文件标识，有filename、filelength、content-type等信息
	 */
	private FileItem media;

	/** 
	* 媒体文件类型，分别有图片（image）、语音（voice）、普通文件(file)
	 */
	private String type;

	public void setMedia(FileItem media) {
		this.media = media;
	}

	public FileItem getMedia() {
		return this.media;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.media.upload";
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

    public String getTopHttpMethod() {
        return DingTalkConstants.HTTP_METHOD_POST;
     }

	public Map<String, String> getTextParams() {
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMediaUploadResponse> getResponseClass() {
		return OapiMediaUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(media, "media");
	}

	public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("media", this.media);
        return params;
    }


}