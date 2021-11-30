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
import com.dingtalk.api.response.OapiCallbackFailrecordListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.callback.failrecord.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiCallbackFailrecordListRequest extends BaseTaobaoRequest<OapiCallbackFailrecordListResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(Req req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.callback.failrecord.list";
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
		txtParams.put("req", this.req);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCallbackFailrecordListResponse> getResponseClass() {
		return OapiCallbackFailrecordListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Req extends TaobaoObject {
		private static final long serialVersionUID = 1214847437498381621L;
		/**
		 * 开始时间(单位：秒)。空表示不限，左闭右开。PS：当前只保留了7天的记录
		 */
		@ApiField("begin_time")
		private Long beginTime;
		/**
		 * 此次查询成功后，是否立即将状态改为“已确认”。传空取默认值false
		 */
		@ApiField("confirm")
		private Boolean confirm;
		/**
		 * 分页查询，上次查询结果中的最后一个id
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 结束时间(单位：秒)。空表示不限，左闭右开
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 分页大小，最大支持100
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 确认状态，0-已确认 1-未确认，不填表示不区分
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 回调事件类型
		 */
		@ApiListField("tags")
		@ApiField("string")
		private List<String> tags;
	
		public Long getBeginTime() {
			return this.beginTime;
		}
		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}
		public Boolean getConfirm() {
			return this.confirm;
		}
		public void setConfirm(Boolean confirm) {
			this.confirm = confirm;
		}
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public List<String> getTags() {
			return this.tags;
		}
		public void setTags(List<String> tags) {
			this.tags = tags;
		}
	}
	

}