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
import com.dingtalk.api.response.OapiAlitripBtripCostCenterEntityDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.cost.center.entity.delete request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.07
 */
public class OapiAlitripBtripCostCenterEntityDeleteRequest extends BaseTaobaoRequest<OapiAlitripBtripCostCenterEntityDeleteResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String rq;

	public void setRq(String rq) {
		this.rq = rq;
	}

	public void setRq(OpenCostCenterDeleteEntityRq rq) {
		this.rq = new JSONWriter(false,false,true).write(rq);
	}

	public String getRq() {
		return this.rq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.cost.center.entity.delete";
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

	public Class<OapiAlitripBtripCostCenterEntityDeleteResponse> getResponseClass() {
		return OapiAlitripBtripCostCenterEntityDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 删除的成员信息列表,del_all为true时可不填
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenOrgEntityDo extends TaobaoObject {
		private static final long serialVersionUID = 7623778237577523274L;
		/**
		 * 员工部门角色id
		 */
		@ApiField("entity_id")
		private String entityId;
		/**
		 * 人员类型:1员工，2部门，3角色
		 */
		@ApiField("entity_type")
		private String entityType;
	
		public String getEntityId() {
			return this.entityId;
		}
		public void setEntityId(String entityId) {
			this.entityId = entityId;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCostCenterDeleteEntityRq extends TaobaoObject {
		private static final long serialVersionUID = 4491597757957877338L;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 是否全部删除
		 */
		@ApiField("del_all")
		private Boolean delAll;
		/**
		 * 删除的成员信息列表,del_all为true时可不填
		 */
		@ApiListField("entity_list")
		@ApiField("open_org_entity_do")
		private List<OpenOrgEntityDo> entityList;
		/**
		 * 第三方成本中心id
		 */
		@ApiField("thirdpart_id")
		private String thirdpartId;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public Boolean getDelAll() {
			return this.delAll;
		}
		public void setDelAll(Boolean delAll) {
			this.delAll = delAll;
		}
		public List<OpenOrgEntityDo> getEntityList() {
			return this.entityList;
		}
		public void setEntityList(List<OpenOrgEntityDo> entityList) {
			this.entityList = entityList;
		}
		public String getThirdpartId() {
			return this.thirdpartId;
		}
		public void setThirdpartId(String thirdpartId) {
			this.thirdpartId = thirdpartId;
		}
	}
	

}