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
import com.dingtalk.api.response.OapiSmartworkHrmMasterSaveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.master.save request
 * 
 * @author top auto create
 * @since 1.0, 2021.08.19
 */
public class OapiSmartworkHrmMasterSaveRequest extends BaseTaobaoRequest<OapiSmartworkHrmMasterSaveResponse> {
	
	

	/** 
	* 业务数据列表
	 */
	private String bizData;

	/** 
	* 业务方id，接入前系统分配
	 */
	private Long tenantId;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public void setBizData(List<Bizdatavo> bizData) {
		this.bizData = new JSONWriter(false,false,true).write(bizData);
	}

	public String getBizData() {
		return this.bizData;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.master.save";
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
		txtParams.put("tenant_id", this.tenantId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmMasterSaveResponse> getResponseClass() {
		return OapiSmartworkHrmMasterSaveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(bizData, 50, "bizData");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	
	/**
	 * 业务域描述，系统分配，枚举见文档
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ScopeVo extends TaobaoObject {
		private static final long serialVersionUID = 1791685361966357726L;
		/**
		 * 业务域code，如PERFORMANCE，系统分配，枚举见文档
		 */
		@ApiField("scope_code")
		private String scopeCode;
		/**
		 * 业务域版本，接入时系统分配，默认传0
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
	 * 数据字段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Fieldlist extends TaobaoObject {
		private static final long serialVersionUID = 8382414349275422113L;
		/**
		 * 字段名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 字段string值，映射规则见文档
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
	 * 业务数据列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Bizdatavo extends TaobaoObject {
		private static final long serialVersionUID = 5562825586747966714L;
		/**
		 * 数据变更时间戳，用以保证更新操作的顺序性
		 */
		@ApiField("biz_time")
		private Long bizTime;
		/**
		 * 数据流水唯一标识，如流水号，用以唯一确认一条写入数据
		 */
		@ApiField("biz_uk")
		private String bizUk;
		/**
		 * 数据字段列表
		 */
		@ApiListField("fields")
		@ApiField("fieldlist")
		private List<Fieldlist> fields;
		/**
		 * 业务域描述，系统分配，枚举见文档
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