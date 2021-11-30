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
import com.dingtalk.api.response.OapiAlitripBtripApplySearchResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.apply.search request
 * 
 * @author top auto create
 * @since 1.0, 2021.09.26
 */
public class OapiAlitripBtripApplySearchRequest extends BaseTaobaoRequest<OapiAlitripBtripApplySearchResponse> {
	
	

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
		return "dingtalk.oapi.alitrip.btrip.apply.search";
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

	public Class<OapiAlitripBtripApplySearchResponse> getResponseClass() {
		return OapiAlitripBtripApplySearchResponse.class;
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
		private static final long serialVersionUID = 3314724588433526971L;
		/**
		 * false:未报销的申请单
		 */
		@ApiField("all_apply")
		private Boolean allApply;
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
		 * 更新时间大于等于此时间的审批单
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * true:商旅申请单
		 */
		@ApiField("only_shang_lv_apply")
		private Boolean onlyShangLvApply;
		/**
		 * 页数，从1开始
		 */
		@ApiField("page")
		private Long page;
		/**
		 * 每页返回数量，默认10，最多50
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
		/**
		 * 申请单提交类型 1：代提交 2：本人提交 注意：当申请单为代提交时，申请单提交人自己无法为自己下单
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 第三方关联单号
		 */
		@ApiField("unionNo")
		private String unionNo;
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
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Boolean getOnlyShangLvApply() {
			return this.onlyShangLvApply;
		}
		public void setOnlyShangLvApply(Boolean onlyShangLvApply) {
			this.onlyShangLvApply = onlyShangLvApply;
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
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getUnionNo() {
			return this.unionNo;
		}
		public void setUnionNo(String unionNo) {
			this.unionNo = unionNo;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}