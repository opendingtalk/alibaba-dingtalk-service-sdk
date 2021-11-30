package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMicroappCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMicroappCreateRequest extends BaseTaobaoRequest<OapiMicroappCreateResponse> {
	
	

	/** 
	* 钉钉测试微应用
	 */
	private String appDesc;

	/** 
	* 微应用的图标。需要调用上传接口将图标上传到钉钉服务器后获取到的mediaId
	 */
	private String appIcon;

	/** 
	* 微应用的名称。长度限制为1~10个字符
	 */
	private String appName;

	/** 
	* 微应用的移动端主页，必须以http开头或https开头
	 */
	private String homepageUrl;

	/** 
	* 微应用的OA后台管理主页，必须以http开头或https开头。微应用后台管理员免登 开发
	 */
	private String ompLink;

	/** 
	* 微应用的PC端主页，必须以http开头或https开头，如果不为空则必须与homepageUrl的域名一致
	 */
	private String pcHomepageUrl;

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public String getAppDesc() {
		return this.appDesc;
	}

	public void setAppIcon(String appIcon) {
		this.appIcon = appIcon;
	}

	public String getAppIcon() {
		return this.appIcon;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setHomepageUrl(String homepageUrl) {
		this.homepageUrl = homepageUrl;
	}

	public String getHomepageUrl() {
		return this.homepageUrl;
	}

	public void setOmpLink(String ompLink) {
		this.ompLink = ompLink;
	}

	public String getOmpLink() {
		return this.ompLink;
	}

	public void setPcHomepageUrl(String pcHomepageUrl) {
		this.pcHomepageUrl = pcHomepageUrl;
	}

	public String getPcHomepageUrl() {
		return this.pcHomepageUrl;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.create";
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
		txtParams.put("appDesc", this.appDesc);
		txtParams.put("appIcon", this.appIcon);
		txtParams.put("appName", this.appName);
		txtParams.put("homepageUrl", this.homepageUrl);
		txtParams.put("ompLink", this.ompLink);
		txtParams.put("pcHomepageUrl", this.pcHomepageUrl);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappCreateResponse> getResponseClass() {
		return OapiMicroappCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}