package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiAtsJobQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.job.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.26
 */
public class OapiAtsJobQueryRequest extends BaseTaobaoRequest<OapiAtsJobQueryResponse> {
	
	

	/** 
	* 招聘业务标识
	 */
	private String bizCode;

	/** 
	* 分页游标，传空时默认为第一页
	 */
	private String cursor;

	/** 
	* 查询参数
	 */
	private String queryParam;

	/** 
	* 分页大小，最大200
	 */
	private Long size;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}

	public void setQueryParam(TopQueryJobsParam queryParam) {
		this.queryParam = new JSONWriter(false,false,true).write(queryParam);
	}

	public String getQueryParam() {
		return this.queryParam;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.job.query";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("cursor", this.cursor);
		txtParams.put("query_param", this.queryParam);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsJobQueryResponse> getResponseClass() {
		return OapiAtsJobQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 200L, "size");
	}
	
	/**
	 * 查询参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopQueryJobsParam extends TaobaoObject {
		private static final long serialVersionUID = 8538373834395652161L;
		/**
		 * 是否校招
		 */
		@ApiField("campus")
		private Boolean campus;
		/**
		 * 创建人员工标识列表
		 */
		@ApiListField("creator_user_ids")
		@ApiField("string")
		private List<String> creatorUserIds;
		/**
		 * 更新时间的查询结束时间
		 */
		@ApiField("end_modified_time")
		private Long endModifiedTime;
		/**
		 * 职位标识列表
		 */
		@ApiListField("job_ids")
		@ApiField("string")
		private List<String> jobIds;
		/**
		 * 职位性质
		 */
		@ApiField("job_nature")
		private String jobNature;
		/**
		 * 关联会话标识
		 */
		@ApiField("open_conversation_id")
		private String openConversationId;
		/**
		 * 更新时间的查询起始时间
		 */
		@ApiField("start_modified_time")
		private Long startModifiedTime;
		/**
		 * 职位状态列表，1表示启用中，2表示关闭
		 */
		@ApiListField("status_list")
		@ApiField("number")
		private List<Long> statusList;
	
		public Boolean getCampus() {
			return this.campus;
		}
		public void setCampus(Boolean campus) {
			this.campus = campus;
		}
		public List<String> getCreatorUserIds() {
			return this.creatorUserIds;
		}
		public void setCreatorUserIds(List<String> creatorUserIds) {
			this.creatorUserIds = creatorUserIds;
		}
		public Long getEndModifiedTime() {
			return this.endModifiedTime;
		}
		public void setEndModifiedTime(Long endModifiedTime) {
			this.endModifiedTime = endModifiedTime;
		}
		public List<String> getJobIds() {
			return this.jobIds;
		}
		public void setJobIds(List<String> jobIds) {
			this.jobIds = jobIds;
		}
		public String getJobNature() {
			return this.jobNature;
		}
		public void setJobNature(String jobNature) {
			this.jobNature = jobNature;
		}
		public String getOpenConversationId() {
			return this.openConversationId;
		}
		public void setOpenConversationId(String openConversationId) {
			this.openConversationId = openConversationId;
		}
		public Long getStartModifiedTime() {
			return this.startModifiedTime;
		}
		public void setStartModifiedTime(Long startModifiedTime) {
			this.startModifiedTime = startModifiedTime;
		}
		public List<Long> getStatusList() {
			return this.statusList;
		}
		public void setStatusList(List<Long> statusList) {
			this.statusList = statusList;
		}
	}
	

}