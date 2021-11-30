package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.IsvCallGetuserlistResponse;

/**
 * TOP DingTalk-API: dingtalk.isv.call.getuserlist request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class IsvCallGetuserlistRequest extends BaseTaobaoRequest<IsvCallGetuserlistResponse> {
	
	

	/** 
	* 批量值
	 */
	private Long offset;

	/** 
	* 游标开始值
	 */
	private Long start;

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setStart(Long start) {
		this.start = start;
	}

	public Long getStart() {
		return this.start;
	}

	public String getApiMethodName() {
		return "dingtalk.isv.call.getuserlist";
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
		txtParams.put("offset", this.offset);
		txtParams.put("start", this.start);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<IsvCallGetuserlistResponse> getResponseClass() {
		return IsvCallGetuserlistResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}