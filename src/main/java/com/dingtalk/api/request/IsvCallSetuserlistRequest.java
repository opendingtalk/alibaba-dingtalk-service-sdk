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

import com.dingtalk.api.response.IsvCallSetuserlistResponse;

/**
 * TOP DingTalk-API: dingtalk.isv.call.setuserlist request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class IsvCallSetuserlistRequest extends BaseTaobaoRequest<IsvCallSetuserlistResponse> {
	
	

	/** 
	* 套件所所属企业免费电话主叫人员工号列表
	 */
	private String staffIdList;

	public void setStaffIdList(String staffIdList) {
		this.staffIdList = staffIdList;
	}

	public String getStaffIdList() {
		return this.staffIdList;
	}

	public String getApiMethodName() {
		return "dingtalk.isv.call.setuserlist";
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
		txtParams.put("staff_id_list", this.staffIdList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<IsvCallSetuserlistResponse> getResponseClass() {
		return IsvCallSetuserlistResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(staffIdList, "staffIdList");
		RequestCheckUtils.checkMaxListSize(staffIdList, 20, "staffIdList");
	}
	

}