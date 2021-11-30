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
import com.dingtalk.api.response.OapiEnterpriseSuborgTotaldataStatResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.enterprise.suborg.totaldata.stat request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.27
 */
public class OapiEnterpriseSuborgTotaldataStatRequest extends BaseTaobaoRequest<OapiEnterpriseSuborgTotaldataStatResponse> {
	
	

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
	* act_ratio_1d_001	最近1天活跃率； act_ratio_1w_001	最近7天活跃率； act_usr_cnt_1d_001	活跃用户数最近1天； act_usr_cnt_1w_001	最近7天活跃用户数； active_mbr_cnt_std_001	历史截至当日激活会员数； active_ratio	激活率； ding_index_1d	最近1天钉钉指数； ding_index_1w	最近7天钉钉指数； mbr_cnt_std_063	历史截至当日企业会员数	； micro_app_use_ratio_1d	最近1天使用钉钉微应用用户比率；micro_app_use_ratio_1w	最近7天使用钉钉微应用用户比率；micro_app_user_cnt_1d	最近1天使用钉钉微应用用户数；micro_app_user_cnt_1w	最近7天使用钉钉微应用用户数；pm_form_cnt_001	审批模板数； pm_form_cnt_002	自定义模板数； pm_form_self_def_ratio	自定义模板比率； process_user_cnt_1d	最近1天使用审批用户数； process_user_cnt_1w	最近7天使用审批用户数；process_user_ratio_1d	最近1天使用审批的用户比率；process_user_ratio_1w	最近7天使用审批的用户比率；send_message_user_cnt_1d	最近1天沟通用户数；send_message_user_cnt_1w	最近7天沟通用户数；send_message_user_ratio_1d	最近1天沟通率； send_message_user_ratio_1w	最近7天沟通率； sub_org_area_lat	所辖组织的地理纬度	； sub_org_area_lng	所辖组织的地理经度	； sub_org_name	所辖组织名称；
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
		return "dingtalk.oapi.enterprise.suborg.totaldata.stat";
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

	public Class<OapiEnterpriseSuborgTotaldataStatResponse> getResponseClass() {
		return OapiEnterpriseSuborgTotaldataStatResponse.class;
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
		private static final long serialVersionUID = 5732262969893283199L;
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