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

import com.dingtalk.api.response.OapiSmartdeviceFacegroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facegroup.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartdeviceFacegroupCreateRequest extends BaseTaobaoRequest<OapiSmartdeviceFacegroupCreateResponse> {
	
	

	/** 
	* M2上的定制UI
	 */
	private String bgImgUrl;

	/** 
	* 业务id【不区分大小写】：调用方内保证唯一即可，可容纳23个字符，推荐前三个字符表示业务编号，留19个字符存储业务的记录id
	 */
	private String bizId;

	/** 
	* 结束时间
	 */
	private Long endTime;

	/** 
	* 识别成功后的问候语
	 */
	private String greetingMsg;

	/** 
	* 开始时间
	 */
	private Long startTime;

	/** 
	* 识别组启用状态：1-已启用；2未启用；
	 */
	private Long status;

	/** 
	* 识别组的标题
	 */
	private String title;

	public void setBgImgUrl(String bgImgUrl) {
		this.bgImgUrl = bgImgUrl;
	}

	public String getBgImgUrl() {
		return this.bgImgUrl;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setGreetingMsg(String greetingMsg) {
		this.greetingMsg = greetingMsg;
	}

	public String getGreetingMsg() {
		return this.greetingMsg;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.facegroup.create";
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
		txtParams.put("bg_img_url", this.bgImgUrl);
		txtParams.put("biz_id", this.bizId);
		txtParams.put("end_time", this.endTime);
		txtParams.put("greeting_msg", this.greetingMsg);
		txtParams.put("start_time", this.startTime);
		txtParams.put("status", this.status);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceFacegroupCreateResponse> getResponseClass() {
		return OapiSmartdeviceFacegroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(bgImgUrl, 512, "bgImgUrl");
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkMaxLength(bizId, 23, "bizId");
		RequestCheckUtils.checkNotEmpty(endTime, "endTime");
		RequestCheckUtils.checkMaxLength(greetingMsg, 16, "greetingMsg");
		RequestCheckUtils.checkNotEmpty(startTime, "startTime");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkMaxValue(status, 2L, "status");
		RequestCheckUtils.checkMinValue(status, 1L, "status");
		RequestCheckUtils.checkNotEmpty(title, "title");
		RequestCheckUtils.checkMaxLength(title, 32, "title");
	}
	

}