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

import com.dingtalk.api.response.OapiSmartworkHrmEmployeeQueryonjobResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.queryonjob request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartworkHrmEmployeeQueryonjobRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeQueryonjobResponse> {
	
	

	/** 
	* 分页起始值，默认0开始
	 */
	private Long offset;

	/** 
	* 分页大小，最大50
	 */
	private Long size;

	/** 
	* 在职员工子状态筛选。2，试用期；3，正式；5，待离职；-1，无状态
	 */
	private String statusList;

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
	}

	public String getStatusList() {
		return this.statusList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.queryonjob";
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
		txtParams.put("offset", this.offset);
		txtParams.put("size", this.size);
		txtParams.put("status_list", this.statusList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeQueryonjobResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeQueryonjobResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkMinValue(offset, 0L, "offset");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 50L, "size");
		RequestCheckUtils.checkMinValue(size, 1L, "size");
		RequestCheckUtils.checkNotEmpty(statusList, "statusList");
		RequestCheckUtils.checkMaxListSize(statusList, 20, "statusList");
	}
	

}