package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiAlitripBtripTrainOrderSearchResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.train.order.search request
 * 
 * @author top auto create
 * @since 1.0, 2021.08.30
 */
public class OapiAlitripBtripTrainOrderSearchRequest extends BaseTaobaoRequest<OapiAlitripBtripTrainOrderSearchResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String rq;

	public void setRq(String rq) {
		this.rq = rq;
	}

	public void setRq(OpenSearchRq rq) {
		this.rq = new JSONWriter(false,false,true).write(rq);
	}

	public String getRq() {
		return this.rq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.train.order.search";
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
		txtParams.put("rq", this.rq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripTrainOrderSearchResponse> getResponseClass() {
		return OapiAlitripBtripTrainOrderSearchResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenSearchRq extends TaobaoObject {
		private static final long serialVersionUID = 3546644496562265927L;
		/**
		 * false:仅搜索未报销的订单
		 */
		@ApiField("all_apply")
		private Boolean allApply;
		/**
		 * 商旅审批单id
		 */
		@ApiField("apply_id")
		private Long applyId;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 部门id
		 */
		@ApiField("deptid")
		private String deptid;
		/**
		 * 结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 页数，从1开始
		 */
		@ApiField("page")
		private Long page;
		/**
		 * 每页返回数量，默认10，最大50
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
		/**
		 * 第三方申请单ID
		 */
		@ApiField("thirdpart_apply_id")
		private String thirdpartApplyId;
		/**
		 * 更新结束时间
		 */
		@ApiField("update_end_time")
		private Date updateEndTime;
		/**
		 * 更新开始时间
		 */
		@ApiField("update_start_time")
		private Date updateStartTime;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Boolean getAllApply() {
			return this.allApply;
		}
		public void setAllApply(Boolean allApply) {
			this.allApply = allApply;
		}
		public Long getApplyId() {
			return this.applyId;
		}
		public void setApplyId(Long applyId) {
			this.applyId = applyId;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getDeptid() {
			return this.deptid;
		}
		public void setDeptid(String deptid) {
			this.deptid = deptid;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public Long getPage() {
			return this.page;
		}
		public void setPage(Long page) {
			this.page = page;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
		public String getThirdpartApplyId() {
			return this.thirdpartApplyId;
		}
		public void setThirdpartApplyId(String thirdpartApplyId) {
			this.thirdpartApplyId = thirdpartApplyId;
		}
		public Date getUpdateEndTime() {
			return this.updateEndTime;
		}
		public void setUpdateEndTime(Date updateEndTime) {
			this.updateEndTime = updateEndTime;
		}
		public Date getUpdateStartTime() {
			return this.updateStartTime;
		}
		public void setUpdateStartTime(Date updateStartTime) {
			this.updateStartTime = updateStartTime;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}