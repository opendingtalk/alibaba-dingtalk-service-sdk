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

import com.dingtalk.api.response.OapiConnectorOpenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.connector.open request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.05
 */
public class OapiConnectorOpenRequest extends BaseTaobaoRequest<OapiConnectorOpenResponse> {
	
	

	/** 
	* 连接器id
	 */
	private String connectorId;

	/** 
	* 待开通连接器的企业id
	 */
	private String corpId;

	/** 
	* 开通连接器的企业员工id
	 */
	private String creatorUserid;

	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getConnectorId() {
		return this.connectorId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCreatorUserid(String creatorUserid) {
		this.creatorUserid = creatorUserid;
	}

	public String getCreatorUserid() {
		return this.creatorUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.connector.open";
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
		txtParams.put("connector_id", this.connectorId);
		txtParams.put("corp_id", this.corpId);
		txtParams.put("creator_userid", this.creatorUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiConnectorOpenResponse> getResponseClass() {
		return OapiConnectorOpenResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(connectorId, "connectorId");
		RequestCheckUtils.checkNotEmpty(corpId, "corpId");
		RequestCheckUtils.checkNotEmpty(creatorUserid, "creatorUserid");
	}
	

}