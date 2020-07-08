package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiEduTypeDataGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.type.data.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.11
 */
public class OapiEduTypeDataGetRequest extends BaseTaobaoRequest<OapiEduTypeDataGetResponse> {
	
	

	/** 
	* 排序因子
	 */
	private String orders;

	/** 
	* 页码；必须大于0
	 */
	private String pageNum;

	/** 
	* 每页大小；必须大于0
	 */
	private String pageSize;

	/** 
	* 统计日期
	 */
	private String statDate;

	public void setOrders(String orders) {
		this.orders = orders;
	}

	public void setOrders(List<OpenOrderDataRequest> orders) {
		this.orders = new JSONWriter(false,false,true).write(orders);
	}

	public String getOrders() {
		return this.orders;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageNum() {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}

	public String getStatDate() {
		return this.statDate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.type.data.get";
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
		txtParams.put("orders", this.orders);
		txtParams.put("page_num", this.pageNum);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("stat_date", this.statDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduTypeDataGetResponse> getResponseClass() {
		return OapiEduTypeDataGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(orders, 20, "orders");
		RequestCheckUtils.checkNotEmpty(pageNum, "pageNum");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(statDate, "statDate");
	}
	
	/**
	 * 排序因子
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenOrderDataRequest extends TaobaoObject {
		private static final long serialVersionUID = 3689378675761165643L;
		/**
		 * 排序字段名；字段名与返回值名保持一致
		 */
		@ApiField("field_name")
		private String fieldName;
		/**
		 * 升序: asc; 降序：desc;
		 */
		@ApiField("order")
		private String order;
	
		public String getFieldName() {
			return this.fieldName;
		}
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
		public String getOrder() {
			return this.order;
		}
		public void setOrder(String order) {
			this.order = order;
		}
	}
	

}