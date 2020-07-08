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

import com.dingtalk.api.response.OapiFugongHealthDataListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.fugong.health_data.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.02
 */
public class OapiFugongHealthDataListRequest extends BaseTaobaoRequest<OapiFugongHealthDataListResponse> {
	
	

	/** 
	* 时间，必须是YYYY-MM-DD的格式
	 */
	private String actionDate;

	/** 
	* 分页起始
	 */
	private Long offset;

	/** 
	* 复工审批实例id
	 */
	private String processInstanceId;

	/** 
	* 分页大小，最大100
	 */
	private Long size;

	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

	public String getActionDate() {
		return this.actionDate;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.fugong.health_data.list";
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
		txtParams.put("action_date", this.actionDate);
		txtParams.put("offset", this.offset);
		txtParams.put("process_instance_id", this.processInstanceId);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFugongHealthDataListResponse> getResponseClass() {
		return OapiFugongHealthDataListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actionDate, "actionDate");
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkNotEmpty(processInstanceId, "processInstanceId");
		RequestCheckUtils.checkNotEmpty(size, "size");
	}
	

}