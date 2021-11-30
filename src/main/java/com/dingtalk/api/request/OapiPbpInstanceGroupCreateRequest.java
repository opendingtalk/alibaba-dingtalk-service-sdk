package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiPbpInstanceGroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.group.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.21
 */
public class OapiPbpInstanceGroupCreateRequest extends BaseTaobaoRequest<OapiPbpInstanceGroupCreateResponse> {
	
	

	/** 
	* 打卡组创建参数
	 */
	private String groupParam;

	public void setGroupParam(String groupParam) {
		this.groupParam = groupParam;
	}

	public void setGroupParam(PunchGroupCreateParam groupParam) {
		this.groupParam = new JSONWriter(false,false,true).write(groupParam);
	}

	public String getGroupParam() {
		return this.groupParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.pbp.instance.group.create";
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
		txtParams.put("group_param", this.groupParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPbpInstanceGroupCreateResponse> getResponseClass() {
		return OapiPbpInstanceGroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 打卡组创建参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PunchGroupCreateParam extends TaobaoObject {
		private static final long serialVersionUID = 6572182841628694647L;
		/**
		 * 业务唯一标识
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 业务实例id
		 */
		@ApiField("biz_inst_id")
		private String bizInstId;
	
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public String getBizInstId() {
			return this.bizInstId;
		}
		public void setBizInstId(String bizInstId) {
			this.bizInstId = bizInstId;
		}
	}
	

}