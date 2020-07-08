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
import com.dingtalk.api.response.OapiRhinoMosExecOperationConditionGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.operation.condition.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecOperationConditionGetRequest extends BaseTaobaoRequest<OapiRhinoMosExecOperationConditionGetResponse> {
	
	

	/** 
	* 请求
	 */
	private String getClothesConditionReq;

	public void setGetClothesConditionReq(String getClothesConditionReq) {
		this.getClothesConditionReq = getClothesConditionReq;
	}

	public void setGetClothesConditionReq(GetClothesConditionReq getClothesConditionReq) {
		this.getClothesConditionReq = new JSONWriter(false,false,true).write(getClothesConditionReq);
	}

	public String getGetClothesConditionReq() {
		return this.getClothesConditionReq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.operation.condition.get";
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
		txtParams.put("get_clothes_condition_req", this.getClothesConditionReq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecOperationConditionGetResponse> getResponseClass() {
		return OapiRhinoMosExecOperationConditionGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 实体源
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Source extends TaobaoObject {
		private static final long serialVersionUID = 1133868616759631594L;
		/**
		 * source_id
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * source_type
		 */
		@ApiField("source_type")
		private String sourceType;
	
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public String getSourceType() {
			return this.sourceType;
		}
		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
	}
	
	/**
	 * 实体条件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EntityCondition extends TaobaoObject {
		private static final long serialVersionUID = 1567136442776279837L;
		/**
		 * 实体id
		 */
		@ApiListField("entity_ids")
		@ApiField("number")
		private List<Long> entityIds;
		/**
		 * 实体源
		 */
		@ApiField("entity_source")
		private Source entitySource;
		/**
		 * 实体类型
		 */
		@ApiField("entity_type")
		private String entityType;
	
		public List<Long> getEntityIds() {
			return this.entityIds;
		}
		public void setEntityIds(List<Long> entityIds) {
			this.entityIds = entityIds;
		}
		public Source getEntitySource() {
			return this.entitySource;
		}
		public void setEntitySource(Source entitySource) {
			this.entitySource = entitySource;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
	}
	
	/**
	 * 页信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Page extends TaobaoObject {
		private static final long serialVersionUID = 7241762361721348812L;
		/**
		 * 页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 开始
		 */
		@ApiField("start")
		private Long start;
	
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Long getStart() {
			return this.start;
		}
		public void setStart(Long start) {
			this.start = start;
		}
	}
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetClothesConditionReq extends TaobaoObject {
		private static final long serialVersionUID = 2755556883376213676L;
		/**
		 * 实体条件
		 */
		@ApiField("condition")
		private EntityCondition condition;
		/**
		 * 租户
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 页信息
		 */
		@ApiField("page")
		private Page page;
		/**
		 * 尺码
		 */
		@ApiListField("size_codes")
		@ApiField("string")
		private List<String> sizeCodes;
		/**
		 * 状态
		 */
		@ApiListField("status")
		@ApiField("string")
		private List<String> status;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * user_id
		 */
		@ApiField("userid")
		private String userid;
	
		public EntityCondition getCondition() {
			return this.condition;
		}
		public void setCondition(EntityCondition condition) {
			this.condition = condition;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public Page getPage() {
			return this.page;
		}
		public void setPage(Page page) {
			this.page = page;
		}
		public List<String> getSizeCodes() {
			return this.sizeCodes;
		}
		public void setSizeCodes(List<String> sizeCodes) {
			this.sizeCodes = sizeCodes;
		}
		public List<String> getStatus() {
			return this.status;
		}
		public void setStatus(List<String> status) {
			this.status = status;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}