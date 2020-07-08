package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiCustomerserviceGroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.group.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.05
 */
public class OapiCustomerserviceGroupCreateRequest extends BaseTaobaoRequest<OapiCustomerserviceGroupCreateResponse> {
	
	

	/** 
	* 建群参数
	 */
	private String bizPara;

	public void setBizPara(String bizPara) {
		this.bizPara = bizPara;
	}

	public void setBizPara(ServiceGroupCreateRequest bizPara) {
		this.bizPara = new JSONWriter(false,false,true).write(bizPara);
	}

	public String getBizPara() {
		return this.bizPara;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.group.create";
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
		txtParams.put("biz_para", this.bizPara);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceGroupCreateResponse> getResponseClass() {
		return OapiCustomerserviceGroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 建群参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ServiceGroupCreateRequest extends TaobaoObject {
		private static final long serialVersionUID = 5315247911493963527L;
		/**
		 * 是否内部群
		 */
		@ApiField("inner_group")
		private Boolean innerGroup;
		/**
		 * 群名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 群主staffid
		 */
		@ApiField("owner_id")
		private String ownerId;
	
		public Boolean getInnerGroup() {
			return this.innerGroup;
		}
		public void setInnerGroup(Boolean innerGroup) {
			this.innerGroup = innerGroup;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOwnerId() {
			return this.ownerId;
		}
		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}
	}
	

}