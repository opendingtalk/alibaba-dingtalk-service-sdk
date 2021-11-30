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
import com.dingtalk.api.response.OapiInspectTaskListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.inspect.task.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.11
 */
public class OapiInspectTaskListRequest extends BaseTaobaoRequest<OapiInspectTaskListResponse> {
	
	

	/** 
	* 请求入参
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(TopInspectTaskDeptQueryPram param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.inspect.task.list";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiInspectTaskListResponse> getResponseClass() {
		return OapiInspectTaskListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopInspectTaskDeptQueryPram extends TaobaoObject {
		private static final long serialVersionUID = 5751874187658538218L;
		/**
		 * 游标，从返回结果中获取，第一次请求可为空
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 部门id，从通讯录接口获取
		 */
		@ApiField("dept_id")
		private String deptId;
		/**
		 * 请求开始时间，时间戳，单位毫秒
		 */
		@ApiField("end_date")
		private Long endDate;
		/**
		 * 分页请求数量，最大值50
		 */
		@ApiField("size")
		private Long size;
		/**
		 * 请求结束时间，时间戳，单位毫秒
		 */
		@ApiField("start_date")
		private Long startDate;
		/**
		 * 请求的状态列表，1已签到，2已正常签退，3已异常签退
		 */
		@ApiListField("status")
		@ApiField("number")
		private List<Long> status;
	
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public String getDeptId() {
			return this.deptId;
		}
		public void setDeptId(String deptId) {
			this.deptId = deptId;
		}
		public Long getEndDate() {
			return this.endDate;
		}
		public void setEndDate(Long endDate) {
			this.endDate = endDate;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public Long getStartDate() {
			return this.startDate;
		}
		public void setStartDate(Long startDate) {
			this.startDate = startDate;
		}
		public List<Long> getStatus() {
			return this.status;
		}
		public void setStatus(List<Long> status) {
			this.status = status;
		}
	}
	

}