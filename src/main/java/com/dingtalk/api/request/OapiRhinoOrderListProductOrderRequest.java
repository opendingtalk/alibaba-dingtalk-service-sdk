package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiRhinoOrderListProductOrderResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.listProductOrder request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.13
 */
public class OapiRhinoOrderListProductOrderRequest extends BaseTaobaoRequest<OapiRhinoOrderListProductOrderResponse> {
	
	

	/** 
	* 请求体
	 */
	private String paramQueryProductOrderDTO;

	public void setParamQueryProductOrderDTO(String paramQueryProductOrderDTO) {
		this.paramQueryProductOrderDTO = paramQueryProductOrderDTO;
	}

	public void setParamQueryProductOrderDTO(QueryProductOrderDto paramQueryProductOrderDTO) {
		this.paramQueryProductOrderDTO = new JSONWriter(false,false,true).write(paramQueryProductOrderDTO);
	}

	public String getParamQueryProductOrderDTO() {
		return this.paramQueryProductOrderDTO;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.order.listProductOrder";
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
		txtParams.put("paramQueryProductOrderDTO", this.paramQueryProductOrderDTO);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoOrderListProductOrderResponse> getResponseClass() {
		return OapiRhinoOrderListProductOrderResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryProductOrderDto extends TaobaoObject {
		private static final long serialVersionUID = 7213412355135121889L;
		/**
		 * 准确的订单编号
		 */
		@ApiListField("accurateNumberList")
		@ApiField("string")
		private List<String> accurateNumberList;
		/**
		 * 订单创建开始时间
		 */
		@ApiField("gmtCreateBegin")
		private Date gmtCreateBegin;
		/**
		 * 订单创建结束时间
		 */
		@ApiField("gmtCreateEnd")
		private Date gmtCreateEnd;
		/**
		 * 主键id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 是否包含销售订单信息
		 */
		@ApiField("inludeSalesOrderInfo")
		private Boolean inludeSalesOrderInfo;
		/**
		 * 订单编号
		 */
		@ApiField("number")
		private String number;
		/**
		 * 分页开始
		 */
		@ApiField("pageBegin")
		private Long pageBegin;
		/**
		 * 分页大小
		 */
		@ApiField("rows")
		private Long rows;
		/**
		 * 排序字段
		 */
		@ApiField("sort")
		private String sort;
		/**
		 * 是否顺序排序
		 */
		@ApiField("sortAsc")
		private Boolean sortAsc;
		
		
		/**
		 * 租户id
		 */
		@ApiField("tenantId")
		private String tenantId;
	
		public List<String> getAccurateNumberList() {
			return this.accurateNumberList;
		}
		public void setAccurateNumberList(List<String> accurateNumberList) {
			this.accurateNumberList = accurateNumberList;
		}
		public Date getGmtCreateBegin() {
			return this.gmtCreateBegin;
		}
		public void setGmtCreateBegin(Date gmtCreateBegin) {
			this.gmtCreateBegin = gmtCreateBegin;
		}
		public Date getGmtCreateEnd() {
			return this.gmtCreateEnd;
		}
		public void setGmtCreateEnd(Date gmtCreateEnd) {
			this.gmtCreateEnd = gmtCreateEnd;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Boolean getInludeSalesOrderInfo() {
			return this.inludeSalesOrderInfo;
		}
		public void setInludeSalesOrderInfo(Boolean inludeSalesOrderInfo) {
			this.inludeSalesOrderInfo = inludeSalesOrderInfo;
		}
		public String getNumber() {
			return this.number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public Long getPageBegin() {
			return this.pageBegin;
		}
		public void setPageBegin(Long pageBegin) {
			this.pageBegin = pageBegin;
		}
		public Long getRows() {
			return this.rows;
		}
		public void setRows(Long rows) {
			this.rows = rows;
		}
		public String getSort() {
			return this.sort;
		}
		public void setSort(String sort) {
			this.sort = sort;
		}
		public Boolean getSortAsc() {
			return this.sortAsc;
		}
		public void setSortAsc(Boolean sortAsc) {
			this.sortAsc = sortAsc;
		}
		
		
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	

}