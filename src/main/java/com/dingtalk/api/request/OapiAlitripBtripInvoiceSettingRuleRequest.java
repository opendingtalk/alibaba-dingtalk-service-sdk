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
import com.dingtalk.api.response.OapiAlitripBtripInvoiceSettingRuleResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.invoice.setting.rule request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.30
 */
public class OapiAlitripBtripInvoiceSettingRuleRequest extends BaseTaobaoRequest<OapiAlitripBtripInvoiceSettingRuleResponse> {
	
	

	/** 
	* 入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(OpenInvoiceRuleRq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.invoice.setting.rule";
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

	public Class<OapiAlitripBtripInvoiceSettingRuleResponse> getResponseClass() {
		return OapiAlitripBtripInvoiceSettingRuleResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 人员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Entity extends TaobaoObject {
		private static final long serialVersionUID = 2622968539198849822L;
		/**
		 * 实体id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 实体名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 1：员工
		 */
		@ApiField("type")
		private Long type;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenInvoiceRuleRq extends TaobaoObject {
		private static final long serialVersionUID = 3137414126618339955L;
		/**
		 * 是否适用所有员工
		 */
		@ApiField("all_employe")
		private Boolean allEmploye;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 人员列表
		 */
		@ApiListField("entities")
		@ApiField("entity")
		private List<Entity> entities;
		/**
		 * 第三方发票id
		 */
		@ApiField("third_part_id")
		private String thirdPartId;
	
		public Boolean getAllEmploye() {
			return this.allEmploye;
		}
		public void setAllEmploye(Boolean allEmploye) {
			this.allEmploye = allEmploye;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public List<Entity> getEntities() {
			return this.entities;
		}
		public void setEntities(List<Entity> entities) {
			this.entities = entities;
		}
		public String getThirdPartId() {
			return this.thirdPartId;
		}
		public void setThirdPartId(String thirdPartId) {
			this.thirdPartId = thirdPartId;
		}
	}
	

}