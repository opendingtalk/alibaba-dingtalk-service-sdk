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

import com.dingtalk.api.response.OapiSmartdeviceFacegroupMemberUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facegroup.member.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartdeviceFacegroupMemberUpdateRequest extends BaseTaobaoRequest<OapiSmartdeviceFacegroupMemberUpdateResponse> {
	
	

	/** 
	* 需新增的用户id列表
	 */
	private String addUserIds;

	/** 
	* 业务id
	 */
	private String bizId;

	/** 
	* 需移除的用户id列表
	 */
	private String delUserIds;

	public void setAddUserIds(String addUserIds) {
		this.addUserIds = addUserIds;
	}

	public String getAddUserIds() {
		return this.addUserIds;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setDelUserIds(String delUserIds) {
		this.delUserIds = delUserIds;
	}

	public String getDelUserIds() {
		return this.delUserIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.facegroup.member.update";
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
		txtParams.put("add_user_ids", this.addUserIds);
		txtParams.put("biz_id", this.bizId);
		txtParams.put("del_user_ids", this.delUserIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceFacegroupMemberUpdateResponse> getResponseClass() {
		return OapiSmartdeviceFacegroupMemberUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(addUserIds, 100, "addUserIds");
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkMaxLength(bizId, 23, "bizId");
		RequestCheckUtils.checkMaxListSize(delUserIds, 100, "delUserIds");
	}
	

}