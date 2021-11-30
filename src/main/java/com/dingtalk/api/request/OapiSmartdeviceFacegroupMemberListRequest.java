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

import com.dingtalk.api.response.OapiSmartdeviceFacegroupMemberListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facegroup.member.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartdeviceFacegroupMemberListRequest extends BaseTaobaoRequest<OapiSmartdeviceFacegroupMemberListResponse> {
	
	

	/** 
	* 业务id
	 */
	private String bizId;

	/** 
	* 游标，第一次传 <=0的值，后续传本调用的返回值
	 */
	private Long cursor;

	/** 
	* 分页大小
	 */
	private Long size;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.facegroup.member.list";
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
		txtParams.put("biz_id", this.bizId);
		txtParams.put("cursor", this.cursor);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceFacegroupMemberListResponse> getResponseClass() {
		return OapiSmartdeviceFacegroupMemberListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkMaxLength(bizId, 23, "bizId");
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 500L, "size");
		RequestCheckUtils.checkMinValue(size, 1L, "size");
	}
	

}