package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiWorkbenchShortcutListbypagingResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workbench.shortcut.listbypaging request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.08
 */
public class OapiWorkbenchShortcutListbypagingRequest extends BaseTaobaoRequest<OapiWorkbenchShortcutListbypagingResponse> {
	
	

	/** 
	* 当前页码
	 */
	private Long pageIndex;

	/** 
	* 每页记录数
	 */
	private Long pageSize;

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workbench.shortcut.listbypaging";
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
		txtParams.put("page_index", this.pageIndex);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkbenchShortcutListbypagingResponse> getResponseClass() {
		return OapiWorkbenchShortcutListbypagingResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}