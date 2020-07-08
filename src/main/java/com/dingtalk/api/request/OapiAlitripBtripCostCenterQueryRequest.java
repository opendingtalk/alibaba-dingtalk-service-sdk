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
import com.dingtalk.api.response.OapiAlitripBtripCostCenterQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.cost.center.query request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.07
 */
public class OapiAlitripBtripCostCenterQueryRequest extends BaseTaobaoRequest<OapiAlitripBtripCostCenterQueryResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String rq;

	public void setRq(String rq) {
		this.rq = rq;
	}

	public void setRq(OpenCostCenterQueryRq rq) {
		this.rq = new JSONWriter(false,false,true).write(rq);
	}

	public String getRq() {
		return this.rq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.cost.center.query";
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
		txtParams.put("rq", this.rq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripCostCenterQueryResponse> getResponseClass() {
		return OapiAlitripBtripCostCenterQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCostCenterQueryRq extends TaobaoObject {
		private static final long serialVersionUID = 4296318196395888143L;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 是否需要展示成员信息，当成本中心为部分人员适用的时候有返回
		 */
		@ApiField("need_org_entity")
		private Boolean needOrgEntity;
		/**
		 * 第三方成本中心id，不填写的时候user_id必填
		 */
		@ApiField("thirdpart_id")
		private String thirdpartId;
		/**
		 * 成本中心名称
		 */
		@ApiField("title")
		private String title;
		/**
		 * 用户id，不填的时候thirdpart_id必填
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public Boolean getNeedOrgEntity() {
			return this.needOrgEntity;
		}
		public void setNeedOrgEntity(Boolean needOrgEntity) {
			this.needOrgEntity = needOrgEntity;
		}
		public String getThirdpartId() {
			return this.thirdpartId;
		}
		public void setThirdpartId(String thirdpartId) {
			this.thirdpartId = thirdpartId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}