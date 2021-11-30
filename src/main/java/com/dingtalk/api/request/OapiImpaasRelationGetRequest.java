package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiImpaasRelationGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.relation.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasRelationGetRequest extends BaseTaobaoRequest<OapiImpaasRelationGetResponse> {
	
	

	/** 
	* 关系查询入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GetRelationReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.relation.get";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasRelationGetResponse> getResponseClass() {
		return OapiImpaasRelationGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 关系查询入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetRelationReq extends TaobaoObject {
		private static final long serialVersionUID = 4649266891758426389L;
		/**
		 * 接收者im的唯一id列表
		 */
		@ApiListField("dst_im_openids")
		@ApiField("string")
		private List<String> dstImOpenids;
		/**
		 * 发送者的im唯一id
		 */
		@ApiField("src_im_openid")
		private String srcImOpenid;
	
		public List<String> getDstImOpenids() {
			return this.dstImOpenids;
		}
		public void setDstImOpenids(List<String> dstImOpenids) {
			this.dstImOpenids = dstImOpenids;
		}
		public String getSrcImOpenid() {
			return this.srcImOpenid;
		}
		public void setSrcImOpenid(String srcImOpenid) {
			this.srcImOpenid = srcImOpenid;
		}
	}
	

}