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

import com.dingtalk.api.response.OapiProcessinstanceListidsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.listids request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiProcessinstanceListidsRequest extends BaseTaobaoRequest<OapiProcessinstanceListidsResponse> {
	
	

	/** 
	* 分页查询的游标，最开始传0，后续传返回参数中的next_cursor值
	 */
	private Long cursor;

	/** 
	* 审批实例结束时间，毫秒级，默认取当前值
	 */
	private Long endTime;

	/** 
	* 流程模板唯一标识，可在oa后台编辑审批表单部分查询
	 */
	private String processCode;

	/** 
	* 分页参数，每页大小，最多传10
	 */
	private Long size;

	/** 
	* 审批实例开始时间，毫秒级
	 */
	private Long startTime;

	/** 
	* 发起人用户id列表
	 */
	private String useridList;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.processinstance.listids";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("end_time", this.endTime);
		txtParams.put("process_code", this.processCode);
		txtParams.put("size", this.size);
		txtParams.put("start_time", this.startTime);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessinstanceListidsResponse> getResponseClass() {
		return OapiProcessinstanceListidsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(processCode, "processCode");
		RequestCheckUtils.checkNotEmpty(startTime, "startTime");
		RequestCheckUtils.checkMaxListSize(useridList, 20, "useridList");
	}
	

}