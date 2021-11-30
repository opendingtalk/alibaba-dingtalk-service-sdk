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

import com.dingtalk.api.response.OapiPbpInstancePositionListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.position.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.07
 */
public class OapiPbpInstancePositionListRequest extends BaseTaobaoRequest<OapiPbpInstancePositionListResponse> {
	
	

	/** 
	* 业务唯一标识，由系统分配
	 */
	private String bizId;

	/** 
	* 业务实例唯一标识，由创建示例接口返回
	 */
	private String bizInstId;

	/** 
	* 游标，用于分页查询
	 */
	private Long cursor;

	/** 
	* 查询数据量
	 */
	private Long size;

	/** 
	* 位置类型，如100代表硬件B1设备
	 */
	private Long type;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizInstId(String bizInstId) {
		this.bizInstId = bizInstId;
	}

	public String getBizInstId() {
		return this.bizInstId;
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

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.pbp.instance.position.list";
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
		txtParams.put("biz_inst_id", this.bizInstId);
		txtParams.put("cursor", this.cursor);
		txtParams.put("size", this.size);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPbpInstancePositionListResponse> getResponseClass() {
		return OapiPbpInstancePositionListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkNotEmpty(bizInstId, "bizInstId");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}