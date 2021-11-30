package com.dingtalk.api.request;

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
import com.dingtalk.api.response.OapiTdpProjectMemberGetbyprojectResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.project.member.getbyproject request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.31
 */
public class OapiTdpProjectMemberGetbyprojectRequest extends BaseTaobaoRequest<OapiTdpProjectMemberGetbyprojectResponse> {
	
	

	/** 
	* 微应用agentId
	 */
	private Long microappAgentId;

	/** 
	* 系统自动生成
	 */
	private String pageRequest;

	/** 
	* 项目ID
	 */
	private String projectId;

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setPageRequest(String pageRequest) {
		this.pageRequest = pageRequest;
	}

	public void setPageRequest(PageRequest pageRequest) {
		this.pageRequest = new JSONWriter(false,false,true).write(pageRequest);
	}

	public String getPageRequest() {
		return this.pageRequest;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.tdp.project.member.getbyproject";
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
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("page_request", this.pageRequest);
		txtParams.put("project_id", this.projectId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiTdpProjectMemberGetbyprojectResponse> getResponseClass() {
		return OapiTdpProjectMemberGetbyprojectResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(projectId, "projectId");
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageRequest extends TaobaoObject {
		private static final long serialVersionUID = 5717921395388145773L;
		/**
		 * 排序字段
		 */
		@ApiField("order_by")
		private String orderBy;
		/**
		 * 排序方向
		 */
		@ApiField("order_direction")
		private String orderDirection;
		/**
		 * 起始页码
		 */
		@ApiField("page")
		private Long page;
		/**
		 * 每页数量
		 */
		@ApiField("page_size")
		private Long pageSize;
	
		public String getOrderBy() {
			return this.orderBy;
		}
		public void setOrderBy(String orderBy) {
			this.orderBy = orderBy;
		}
		public String getOrderDirection() {
			return this.orderDirection;
		}
		public void setOrderDirection(String orderDirection) {
			this.orderDirection = orderDirection;
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
	}
	

}