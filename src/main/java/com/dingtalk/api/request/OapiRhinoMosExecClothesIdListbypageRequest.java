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
import com.dingtalk.api.response.OapiRhinoMosExecClothesIdListbypageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.id.listbypage request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.22
 */
public class OapiRhinoMosExecClothesIdListbypageRequest extends BaseTaobaoRequest<OapiRhinoMosExecClothesIdListbypageResponse> {
	
	

	/** 
	* 入参
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(PageQueryClothesReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.clothes.id.listbypage";
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

	public Class<OapiRhinoMosExecClothesIdListbypageResponse> getResponseClass() {
		return OapiRhinoMosExecClothesIdListbypageResponse.class;
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
		private static final long serialVersionUID = 2675986739647163115L;
		/**
		 * 每页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 起始位置，从0开始
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
	 * 来源
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Source extends TaobaoObject {
		private static final long serialVersionUID = 2839669741539849585L;
		/**
		 * 来源ID，创建该实体的来源业务ID，会用来源ID和来源类型一起做幂等
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 来源类型，创建该实体的来源的类型
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
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageQueryClothesReq extends TaobaoObject {
		private static final long serialVersionUID = 8248829997243639622L;
		/**
		 * 业务类型
		 */
		@ApiListField("biz_types")
		@ApiField("string")
		private List<String> bizTypes;
		/**
		 * 订单ID
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 分页
		 */
		@ApiField("page")
		private Page page;
		/**
		 * 尺码CODE
		 */
		@ApiField("size_code")
		private String sizeCode;
		/**
		 * 来源
		 */
		@ApiField("source")
		private Source source;
		/**
		 * 状态列表
		 */
		@ApiListField("status_list")
		@ApiField("string")
		private List<String> statusList;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 预留参数
		 */
		@ApiField("userid")
		private String userid;
	
		public List<String> getBizTypes() {
			return this.bizTypes;
		}
		public void setBizTypes(List<String> bizTypes) {
			this.bizTypes = bizTypes;
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
		public Source getSource() {
			return this.source;
		}
		public void setSource(Source source) {
			this.source = source;
		}
		public List<String> getStatusList() {
			return this.statusList;
		}
		public void setStatusList(List<String> statusList) {
			this.statusList = statusList;
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