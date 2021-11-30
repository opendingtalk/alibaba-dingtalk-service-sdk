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

import com.dingtalk.api.response.OapiCustomizeConfigSetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customize.config.set request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiCustomizeConfigSetRequest extends BaseTaobaoRequest<OapiCustomizeConfigSetResponse> {
	
	

	/** 
	* e应用id
	 */
	private String activeId;

	/** 
	* e应用
	 */
	private String activeType;

	/** 
	* 入口会话id，自定义的业务
	 */
	private String biz;

	/** 
	* 二级会话
	 */
	private String ruleName;

	/** 
	* 会话类型
	 */
	private String type;

	public void setActiveId(String activeId) {
		this.activeId = activeId;
	}

	public String getActiveId() {
		return this.activeId;
	}

	public void setActiveType(String activeType) {
		this.activeType = activeType;
	}

	public String getActiveType() {
		return this.activeType;
	}

	public void setBiz(String biz) {
		this.biz = biz;
	}

	public String getBiz() {
		return this.biz;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customize.config.set";
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
		txtParams.put("active_id", this.activeId);
		txtParams.put("active_type", this.activeType);
		txtParams.put("biz", this.biz);
		txtParams.put("rule_name", this.ruleName);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomizeConfigSetResponse> getResponseClass() {
		return OapiCustomizeConfigSetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(activeId, "activeId");
		RequestCheckUtils.checkNotEmpty(activeType, "activeType");
		RequestCheckUtils.checkNotEmpty(biz, "biz");
		RequestCheckUtils.checkNotEmpty(ruleName, "ruleName");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}