package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiSmartworkHrmMasterdataSaveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.masterdata.save request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.15
 */
public class OapiSmartworkHrmMasterdataSaveRequest extends BaseTaobaoRequest<OapiSmartworkHrmMasterdataSaveResponse> {
	
	

	/** 
	* 第三方业务数据结构
	 */
	private String bizDataFields;

	/** 
	* 唯一标识此记录的外键id
	 */
	private String outerId;

	/** 
	* 代表业务领域枚举值
	 */
	private String scopeCode;

	/** 
	* 数据代表用户唯一标识
	 */
	private String userid;

	public void setBizDataFields(String bizDataFields) {
		this.bizDataFields = bizDataFields;
	}

	public void setBizDataFields(List<BizDataFieldVo> bizDataFields) {
		this.bizDataFields = new JSONWriter(false,false,true).write(bizDataFields);
	}

	public String getBizDataFields() {
		return this.bizDataFields;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setScopeCode(String scopeCode) {
		this.scopeCode = scopeCode;
	}

	public String getScopeCode() {
		return this.scopeCode;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.masterdata.save";
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
		txtParams.put("biz_data_fields", this.bizDataFields);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("scope_code", this.scopeCode);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmMasterdataSaveResponse> getResponseClass() {
		return OapiSmartworkHrmMasterdataSaveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(bizDataFields, 999, "bizDataFields");
		RequestCheckUtils.checkNotEmpty(outerId, "outerId");
		RequestCheckUtils.checkNotEmpty(scopeCode, "scopeCode");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	
	/**
	 * 第三方业务数据结构
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BizDataFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 2246766192758841294L;
		/**
		 * 业务字段
		 */
		@ApiField("name")
		private String name;
		/**
		 * 对应的值
		 */
		@ApiField("value_str")
		private String valueStr;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValueStr() {
			return this.valueStr;
		}
		public void setValueStr(String valueStr) {
			this.valueStr = valueStr;
		}
	}
	

}