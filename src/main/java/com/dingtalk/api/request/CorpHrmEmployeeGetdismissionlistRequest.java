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

import com.dingtalk.api.response.CorpHrmEmployeeGetdismissionlistResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.hrm.employee.getdismissionlist request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpHrmEmployeeGetdismissionlistRequest extends BaseTaobaoRequest<CorpHrmEmployeeGetdismissionlistResponse> {
	
	

	/** 
	* 第几页，从1开始
	 */
	private Long current;

	/** 
	* 操作人userid
	 */
	private String opUserid;

	/** 
	* 一页多少数据，在1-100之间
	 */
	private Long pageSize;

	public void setCurrent(Long current) {
		this.current = current;
	}

	public Long getCurrent() {
		return this.current;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.hrm.employee.getdismissionlist";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("current", this.current);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpHrmEmployeeGetdismissionlistResponse> getResponseClass() {
		return CorpHrmEmployeeGetdismissionlistResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(current, "current");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
	}
	

}