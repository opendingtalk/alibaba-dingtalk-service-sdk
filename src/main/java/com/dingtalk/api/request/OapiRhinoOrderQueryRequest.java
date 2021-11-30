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
import com.dingtalk.api.response.OapiRhinoOrderQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.20
 */
public class OapiRhinoOrderQueryRequest extends BaseTaobaoRequest<OapiRhinoOrderQueryResponse> {
	
	

	/** 
	* 请求体
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(OpenApiQueryProductOrderReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.order.query";
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

	public Class<OapiRhinoOrderQueryResponse> getResponseClass() {
		return OapiRhinoOrderQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiQueryProductOrderReq extends TaobaoObject {
		private static final long serialVersionUID = 2163473731898546366L;
		/**
		 * 搜索字段
		 */
		@ApiField("key_word")
		private String keyWord;
		/**
		 * 分页字段，页数
		 */
		@ApiField("page")
		private Long page;
		/**
		 * 分页字段，默认分页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 计划开始时间-查询结束时间
		 */
		@ApiField("plan_time_begin")
		private Date planTimeBegin;
		/**
		 * 计划开始时间-查询结束时间
		 */
		@ApiField("plan_time_end")
		private Date planTimeEnd;
		/**
		 * 排序字段
		 */
		@ApiField("sort")
		private String sort;
		/**
		 * 是否顺序排序
		 */
		@ApiField("sort_asc")
		private Boolean sortAsc;
		/**
		 * 状态列表
		 */
		@ApiListField("status_list")
		@ApiField("string")
		private List<String> statusList;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getKeyWord() {
			return this.keyWord;
		}
		public void setKeyWord(String keyWord) {
			this.keyWord = keyWord;
		}
		public Long getPage() {
			return this.page;
		}
		public void setPage(Long page) {
			this.page = page;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Date getPlanTimeBegin() {
			return this.planTimeBegin;
		}
		public void setPlanTimeBegin(Date planTimeBegin) {
			this.planTimeBegin = planTimeBegin;
		}
		public Date getPlanTimeEnd() {
			return this.planTimeEnd;
		}
		public void setPlanTimeEnd(Date planTimeEnd) {
			this.planTimeEnd = planTimeEnd;
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