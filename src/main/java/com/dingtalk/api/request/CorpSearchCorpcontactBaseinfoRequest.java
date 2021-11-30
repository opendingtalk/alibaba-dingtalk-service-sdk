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

import com.dingtalk.api.response.CorpSearchCorpcontactBaseinfoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.search.corpcontact.baseinfo request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpSearchCorpcontactBaseinfoRequest extends BaseTaobaoRequest<CorpSearchCorpcontactBaseinfoResponse> {
	
	

	/** 
	* 开始位置,从0开始
	 */
	private Long offset;

	/** 
	* 搜索词,长度大于2开始搜
	 */
	private String query;

	/** 
	* 拉取个数上限100
	 */
	private Long size;

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getQuery() {
		return this.query;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.search.corpcontact.baseinfo";
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
		txtParams.put("query", this.query);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpSearchCorpcontactBaseinfoResponse> getResponseClass() {
		return CorpSearchCorpcontactBaseinfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkNotEmpty(query, "query");
		RequestCheckUtils.checkNotEmpty(size, "size");
	}
	

}