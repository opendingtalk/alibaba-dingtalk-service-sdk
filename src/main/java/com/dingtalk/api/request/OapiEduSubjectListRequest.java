package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiEduSubjectListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.subject.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.14
 */
public class OapiEduSubjectListRequest extends BaseTaobaoRequest<OapiEduSubjectListResponse> {
	
	

	/** 
	* 游标
	 */
	private Long cursor;

	/** 
	* 排序依赖字段类型
	 */
	private Long dataOrderType;

	/** 
	* 用户id
	 */
	private String operatorUserid;

	/** 
	* 学段编码
	 */
	private String periodCode;

	/** 
	* 每页数据条数
	 */
	private Long size;

	/** 
	* 排序规则（0:升序，1:降序）
	 */
	private Long sortType;

	/** 
	* 学科编码列表
	 */
	private String subjectCodeList;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setDataOrderType(Long dataOrderType) {
		this.dataOrderType = dataOrderType;
	}

	public Long getDataOrderType() {
		return this.dataOrderType;
	}

	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}

	public String getOperatorUserid() {
		return this.operatorUserid;
	}

	public void setPeriodCode(String periodCode) {
		this.periodCode = periodCode;
	}

	public String getPeriodCode() {
		return this.periodCode;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setSortType(Long sortType) {
		this.sortType = sortType;
	}

	public Long getSortType() {
		return this.sortType;
	}

	public void setSubjectCodeList(String subjectCodeList) {
		this.subjectCodeList = subjectCodeList;
	}

	public String getSubjectCodeList() {
		return this.subjectCodeList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.subject.list";
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
		txtParams.put("data_order_type", this.dataOrderType);
		txtParams.put("operator_userid", this.operatorUserid);
		txtParams.put("period_code", this.periodCode);
		txtParams.put("size", this.size);
		txtParams.put("sort_type", this.sortType);
		txtParams.put("subject_code_list", this.subjectCodeList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduSubjectListResponse> getResponseClass() {
		return OapiEduSubjectListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(operatorUserid, "operatorUserid");
		RequestCheckUtils.checkNotEmpty(periodCode, "periodCode");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxListSize(subjectCodeList, 999, "subjectCodeList");
	}
	

}