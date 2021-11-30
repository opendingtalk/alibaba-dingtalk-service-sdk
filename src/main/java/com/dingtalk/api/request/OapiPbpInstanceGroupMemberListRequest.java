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

import com.dingtalk.api.response.OapiPbpInstanceGroupMemberListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.group.member.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.20
 */
public class OapiPbpInstanceGroupMemberListRequest extends BaseTaobaoRequest<OapiPbpInstanceGroupMemberListResponse> {
	
	

	/** 
	* 业务唯一标识
	 */
	private String bizId;

	/** 
	* 游标，用于分页查询
	 */
	private Long cursor;

	/** 
	* 打卡组id，由创建打卡组接口返回
	 */
	private String punchGroupId;

	/** 
	* 分页请求数量
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

	public void setPunchGroupId(String punchGroupId) {
		this.punchGroupId = punchGroupId;
	}

	public String getPunchGroupId() {
		return this.punchGroupId;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.pbp.instance.group.member.list";
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
		txtParams.put("punch_group_id", this.punchGroupId);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPbpInstanceGroupMemberListResponse> getResponseClass() {
		return OapiPbpInstanceGroupMemberListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(punchGroupId, "punchGroupId");
		RequestCheckUtils.checkNotEmpty(size, "size");
	}
	

}