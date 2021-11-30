package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiBlackboardListidsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.listids request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.04
 */
public class OapiBlackboardListidsRequest extends BaseTaobaoRequest<OapiBlackboardListidsResponse> {
	
	

	/** 
	* 请求入参
	 */
	private String queryRequest;

	public void setQueryRequest(String queryRequest) {
		this.queryRequest = queryRequest;
	}

	public void setQueryRequest(OapiBlackboardQueryVo queryRequest) {
		this.queryRequest = new JSONWriter(false,false,true).write(queryRequest);
	}

	public String getQueryRequest() {
		return this.queryRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.blackboard.listids";
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
		txtParams.put("query_request", this.queryRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiBlackboardListidsResponse> getResponseClass() {
		return OapiBlackboardListidsResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiBlackboardQueryVo extends TaobaoObject {
		private static final long serialVersionUID = 5768319652714691824L;
		/**
		 * 分类id，可以通过https:oapi.dingtalk.comblackboardcategoryget获取有效值
		 */
		@ApiField("category_id")
		private String categoryId;
		/**
		 * 结束时间(开区间）
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 操作人userId(必须是公告管理员)
		 */
		@ApiField("operation_userid")
		private String operationUserid;
		/**
		 * 页码，从1开始且必须为正整数
		 */
		@ApiField("page")
		private Long page;
		/**
		 * 分页大小，必须为正整数，且不超过30
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 开始时间(闭区间）
		 */
		@ApiField("start_time")
		private Date startTime;
	
		public String getCategoryId() {
			return this.categoryId;
		}
		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public String getOperationUserid() {
			return this.operationUserid;
		}
		public void setOperationUserid(String operationUserid) {
			this.operationUserid = operationUserid;
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
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
	}
	

}