package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiEnterpriseMainorgTotaldataStatResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.enterprise.mainorg.totaldata.stat request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.02
 */
public class OapiEnterpriseMainorgTotaldataStatRequest extends BaseTaobaoRequest<OapiEnterpriseMainorgTotaldataStatResponse> {
	
	

	/** 
	* 企业ID
	 */
	private String corpId;

	/** 
	* 排序
	 */
	private String orderBy;

	/** 
	* 分页查询条数，最多30条
	 */
	private Long pageSize;

	/** 
	* 分页起始点
	 */
	private Long pageStart;

	/** 
	* active_mbr_cnt_std	在线组织激活用户数	； all_group_cnt	全员群数量； carbon_amount_1d	最近1天降低碳排量G； carbon_amount_1w	最近7天降低碳排量G； corp_id	企业ID； dept_group_cnt	部门群数量； ding_save_hour_1d	最近1天钉办节约小时； ding_save_hour_1w	最近7天钉办节约小时； inner_group_cnt	内部群数量； live_launch_succ_cnt_1d	最近1天成功发起直播次数；live_launch_succ_cnt_1w	最近7天成功发起直播次数； mbr_cnt_std	在线组织通讯录人数（注册人数）；online_conference_cnt_1d	最近1天在线会议次数；online_conference_cnt_7d	最近7天在线会议次数； online_org_cnt	在线组织数； org_online_ratio	组织覆盖率； real_org_cnt	实际组织数； receive_ding_user_cnt_1d	最近1天接收DING的用户数；receive_ding_user_cnt_1w	最近7天接收DING的用户数； rel_org_cnt	关联组织数 send_message_user_cnt_1d	最近1天发送消息人数；send_message_user_cnt_1w	最近7天发送消息人数； stat_date	统计日期
	 */
	private String returnFields;

	/** 
	* 查询时间
	 */
	private String statDate;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public void setOrderBy(OrderBy orderBy) {
		this.orderBy = new JSONWriter(false,false,true).write(orderBy);
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageStart(Long pageStart) {
		this.pageStart = pageStart;
	}

	public Long getPageStart() {
		return this.pageStart;
	}

	public void setReturnFields(String returnFields) {
		this.returnFields = returnFields;
	}

	public String getReturnFields() {
		return this.returnFields;
	}

	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}

	public String getStatDate() {
		return this.statDate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.enterprise.mainorg.totaldata.stat";
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
		txtParams.put("corp_id", this.corpId);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("page_start", this.pageStart);
		txtParams.put("return_fields", this.returnFields);
		txtParams.put("stat_date", this.statDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEnterpriseMainorgTotaldataStatResponse> getResponseClass() {
		return OapiEnterpriseMainorgTotaldataStatResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpId, "corpId");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(pageStart, "pageStart");
		RequestCheckUtils.checkNotEmpty(returnFields, "returnFields");
		RequestCheckUtils.checkMaxListSize(returnFields, 50, "returnFields");
		RequestCheckUtils.checkNotEmpty(statDate, "statDate");
	}
	
	/**
	 * 排序
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderBy extends TaobaoObject {
		private static final long serialVersionUID = 8818652177835741263L;
		/**
		 * 排查的key
		 */
		@ApiField("field")
		private String field;
		/**
		 * 升序或者降序
		 */
		@ApiField("order")
		private String order;
	
		public String getField() {
			return this.field;
		}
		public void setField(String field) {
			this.field = field;
		}
		public String getOrder() {
			return this.order;
		}
		public void setOrder(String order) {
			this.order = order;
		}
	}
	

}