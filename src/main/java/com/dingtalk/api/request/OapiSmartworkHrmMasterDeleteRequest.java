package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiSmartworkHrmMasterDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.master.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.06
 */
public class OapiSmartworkHrmMasterDeleteRequest extends BaseTaobaoRequest<OapiSmartworkHrmMasterDeleteResponse> {
	
	

	/** 
	* 业务数据
	 */
	private String bizData;

	/** 
	* 业务方id(由系统统一分配)
	 */
	private Long tenantid;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public void setBizData(List<BizDataVo> bizData) {
		this.bizData = new JSONWriter(false,false,true).write(bizData);
	}

	public String getBizData() {
		return this.bizData;
	}

	public void setTenantid(Long tenantid) {
		this.tenantid = tenantid;
	}

	public Long getTenantid() {
		return this.tenantid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.master.delete";
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
		txtParams.put("biz_data", this.bizData);
		txtParams.put("tenantid", this.tenantid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmMasterDeleteResponse> getResponseClass() {
		return OapiSmartworkHrmMasterDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(bizData, 20, "bizData");
		RequestCheckUtils.checkNotEmpty(tenantid, "tenantid");
	}
	
	/**
	 * 字段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Fieldlist extends TaobaoObject {
		private static final long serialVersionUID = 6386586186285277321L;
		/**
		 * 字段名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 字段值原始字符串
		 */
		@ApiField("value")
		private String value;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 数据所属业务域
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ScopeVo extends TaobaoObject {
		private static final long serialVersionUID = 3595578522429899691L;
		/**
		 * 业务域code
		 */
		@ApiField("scope_code")
		private String scopeCode;
		/**
		 * 业务域版本号
		 */
		@ApiField("version")
		private Long version;
	
		public String getScopeCode() {
			return this.scopeCode;
		}
		public void setScopeCode(String scopeCode) {
			this.scopeCode = scopeCode;
		}
		public Long getVersion() {
			return this.version;
		}
		public void setVersion(Long version) {
			this.version = version;
		}
	}
	
	/**
	 * 业务数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BizDataVo extends TaobaoObject {
		private static final long serialVersionUID = 8353546532923153684L;
		/**
		 * 数据业务时间戳
		 */
		@ApiField("biz_time")
		private Long bizTime;
		/**
		 * 业务uk，唯一标识一条流水
		 */
		@ApiField("biz_uk")
		private String bizUk;
		/**
		 * 字段列表
		 */
		@ApiListField("fields")
		@ApiField("fieldlist")
		private List<Fieldlist> fields;
		/**
		 * 数据所属业务域
		 */
		@ApiField("scope")
		private ScopeVo scope;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getBizTime() {
			return this.bizTime;
		}
		public void setBizTime(Long bizTime) {
			this.bizTime = bizTime;
		}
		public String getBizUk() {
			return this.bizUk;
		}
		public void setBizUk(String bizUk) {
			this.bizUk = bizUk;
		}
		public List<Fieldlist> getFields() {
			return this.fields;
		}
		public void setFields(List<Fieldlist> fields) {
			this.fields = fields;
		}
		public ScopeVo getScope() {
			return this.scope;
		}
		public void setScope(ScopeVo scope) {
			this.scope = scope;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}