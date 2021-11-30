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

import com.dingtalk.api.response.OapiRobotMessageStatisticsListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.statistics.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiRobotMessageStatisticsListRequest extends BaseTaobaoRequest<OapiRobotMessageStatisticsListResponse> {
	
	

	/** 
	* 当前页码
	 */
	private Long page;

	/** 
	* 分页大小
	 */
	private Long pageSize;

	/** 
	* 机器人消息推送Id列表
	 */
	private String pushIds;

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPage() {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPushIds(String pushIds) {
		this.pushIds = pushIds;
	}

	public String getPushIds() {
		return this.pushIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.robot.message.statistics.list";
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
		txtParams.put("page", this.page);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("push_ids", this.pushIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRobotMessageStatisticsListResponse> getResponseClass() {
		return OapiRobotMessageStatisticsListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(page, "page");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(pushIds, "pushIds");
		RequestCheckUtils.checkMaxListSize(pushIds, 20, "pushIds");
	}
	

}