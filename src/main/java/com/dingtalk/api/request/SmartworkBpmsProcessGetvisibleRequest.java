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

import com.dingtalk.api.response.SmartworkBpmsProcessGetvisibleResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.process.getvisible request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class SmartworkBpmsProcessGetvisibleRequest extends BaseTaobaoRequest<SmartworkBpmsProcessGetvisibleResponse> {
	
	

	/** 
	* 流程模板唯一标识，可在oa后台编辑审批表单部分查询
	 */
	private String processCodeList;

	/** 
	* 员工ID
	 */
	private String userid;

	public void setProcessCodeList(String processCodeList) {
		this.processCodeList = processCodeList;
	}

	public String getProcessCodeList() {
		return this.processCodeList;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.bpms.process.getvisible";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("process_code_list", this.processCodeList);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkBpmsProcessGetvisibleResponse> getResponseClass() {
		return SmartworkBpmsProcessGetvisibleResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(processCodeList, "processCodeList");
		RequestCheckUtils.checkMaxListSize(processCodeList, 20, "processCodeList");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}