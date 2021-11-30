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
import com.dingtalk.api.response.OapiAttendanceGroupScheduleClearResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.schedule.clear request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.04
 */
public class OapiAttendanceGroupScheduleClearRequest extends BaseTaobaoRequest<OapiAttendanceGroupScheduleClearResponse> {
	
	

	/** 
	* 操作者userid
	 */
	private String opUserid;

	/** 
	* 系统自动生成
	 */
	private String param;

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(TopClearScheduleParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.schedule.clear";
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
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupScheduleClearResponse> getResponseClass() {
		return OapiAttendanceGroupScheduleClearResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopClearScheduleParam extends TaobaoObject {
		private static final long serialVersionUID = 3372679357373249685L;
		/**
		 * 开始时间
		 */
		@ApiField("from_date")
		private Long fromDate;
		/**
		 * 考勤组id
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 结束时间
		 */
		@ApiField("to_date")
		private Long toDate;
		/**
		 * 用户userId列表
		 */
		@ApiListField("user_ids")
		@ApiField("string")
		private List<String> userIds;
	
		public Long getFromDate() {
			return this.fromDate;
		}
		public void setFromDate(Long fromDate) {
			this.fromDate = fromDate;
		}
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public Long getToDate() {
			return this.toDate;
		}
		public void setToDate(Long toDate) {
			this.toDate = toDate;
		}
		public List<String> getUserIds() {
			return this.userIds;
		}
		public void setUserIds(List<String> userIds) {
			this.userIds = userIds;
		}
	}
	

}