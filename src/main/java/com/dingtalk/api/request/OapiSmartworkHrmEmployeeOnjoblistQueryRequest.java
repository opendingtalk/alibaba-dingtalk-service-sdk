package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiSmartworkHrmEmployeeOnjoblistQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.onjoblist.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.08
 */
public class OapiSmartworkHrmEmployeeOnjoblistQueryRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeOnjoblistQueryResponse> {
	
	

	/** 
	* 分页起始值，默认0开始
	 */
	private Long cursor;

	/** 
	* 查询参数
	 */
	private String searchParam;

	/** 
	* 分页大小，最大50
	 */
	private Long size;

	/** 
	* 在职员工子状态筛选。2，试用期；3，正式；5，待离职；-1，无状态
	 */
	private String statusList;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setSearchParam(String searchParam) {
		this.searchParam = searchParam;
	}

	public void setSearchParam(EmpSearchParamVo searchParam) {
		this.searchParam = new JSONWriter(false,false,true).write(searchParam);
	}

	public String getSearchParam() {
		return this.searchParam;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
	}

	public String getStatusList() {
		return this.statusList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.onjoblist.query";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("search_param", this.searchParam);
		txtParams.put("size", this.size);
		txtParams.put("status_list", this.statusList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeOnjoblistQueryResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeOnjoblistQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkNotEmpty(statusList, "statusList");
		RequestCheckUtils.checkMaxListSize(statusList, 999, "statusList");
	}
	
	/**
	 * 查询参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpSearchParamVo extends TaobaoObject {
		private static final long serialVersionUID = 6124734613582544558L;
		/**
		 * 结束入职日期
		 */
		@ApiField("entry_end_date")
		private Date entryEndDate;
		/**
		 * 开始入职日期
		 */
		@ApiField("entry_start_date")
		private Date entryStartDate;
	
		public Date getEntryEndDate() {
			return this.entryEndDate;
		}
		public void setEntryEndDate(Date entryEndDate) {
			this.entryEndDate = entryEndDate;
		}
		public Date getEntryStartDate() {
			return this.entryStartDate;
		}
		public void setEntryStartDate(Date entryStartDate) {
			this.entryStartDate = entryStartDate;
		}
	}
	

}