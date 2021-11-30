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
import com.dingtalk.api.response.OapiRhinoMosExecClothesUnperformedGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.unperformed.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.24
 */
public class OapiRhinoMosExecClothesUnperformedGetRequest extends BaseTaobaoRequest<OapiRhinoMosExecClothesUnperformedGetResponse> {
	
	

	/** 
	* 入参
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(GetUnPerformedClothesByOperationReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.clothes.unperformed.get";
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
		txtParams.put("req", this.req);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecClothesUnperformedGetResponse> getResponseClass() {
		return OapiRhinoMosExecClothesUnperformedGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 分页
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Page extends TaobaoObject {
		private static final long serialVersionUID = 6844219632339682765L;
		/**
		 * 页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 其实位置
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
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetUnPerformedClothesByOperationReq extends TaobaoObject {
		private static final long serialVersionUID = 2689873586921694836L;
		/**
		 * 业务类型
		 */
		@ApiListField("biz_types")
		@ApiField("string")
		private List<String> bizTypes;
		/**
		 * 工序id
		 */
		@ApiListField("operation_uids")
		@ApiField("number")
		private List<Long> operationUids;
		/**
		 * 订单id
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 分页
		 */
		@ApiField("page")
		private Page page;
		/**
		 * 尺码信息
		 */
		@ApiField("size_code")
		private String sizeCode;
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
		 * userId
		 */
		@ApiField("userid")
		private String userid;
	
		public List<String> getBizTypes() {
			return this.bizTypes;
		}
		public void setBizTypes(List<String> bizTypes) {
			this.bizTypes = bizTypes;
		}
		public List<Long> getOperationUids() {
			return this.operationUids;
		}
		public void setOperationUids(List<Long> operationUids) {
			this.operationUids = operationUids;
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
		public String getSizeCode() {
			return this.sizeCode;
		}
		public void setSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
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