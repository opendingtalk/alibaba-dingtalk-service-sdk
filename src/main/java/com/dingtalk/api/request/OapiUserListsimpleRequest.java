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

import com.dingtalk.api.response.OapiUserListsimpleResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.listsimple request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.13
 */
public class OapiUserListsimpleRequest extends BaseTaobaoRequest<OapiUserListsimpleResponse> {
	
	

	/** 
	* 是否返回访问受限的员工
	 */
	private Boolean containAccessLimit;

	/** 
	* 游标
	 */
	private Long cursor;

	/** 
	* 部门id
	 */
	private Long deptId;

	/** 
	* 语言
	 */
	private String language;

	/** 
	* 排序字段，默认custom。或者以下取值entry_asc、entry_desc、modify_asc、modify_desc、custom
	 */
	private String orderField;

	/** 
	* 分页长度
	 */
	private Long size;

	public void setContainAccessLimit(Boolean containAccessLimit) {
		this.containAccessLimit = containAccessLimit;
	}

	public Boolean getContainAccessLimit() {
		return this.containAccessLimit;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String getOrderField() {
		return this.orderField;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.listsimple";
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
		txtParams.put("contain_access_limit", this.containAccessLimit);
		txtParams.put("cursor", this.cursor);
		txtParams.put("dept_id", this.deptId);
		txtParams.put("language", this.language);
		txtParams.put("order_field", this.orderField);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserListsimpleResponse> getResponseClass() {
		return OapiUserListsimpleResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkMaxValue(cursor, 100000L, "cursor");
		RequestCheckUtils.checkMinValue(cursor, 0L, "cursor");
		RequestCheckUtils.checkNotEmpty(deptId, "deptId");
		RequestCheckUtils.checkMinValue(deptId, 1L, "deptId");
		RequestCheckUtils.checkMaxLength(language, 6, "language");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 100L, "size");
		RequestCheckUtils.checkMinValue(size, 1L, "size");
	}
	

}