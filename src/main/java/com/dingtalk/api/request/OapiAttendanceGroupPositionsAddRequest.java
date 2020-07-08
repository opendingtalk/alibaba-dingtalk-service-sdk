package com.dingtalk.api.request;

import java.util.List;
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
import com.dingtalk.api.response.OapiAttendanceGroupPositionsAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.positions.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiAttendanceGroupPositionsAddRequest extends BaseTaobaoRequest<OapiAttendanceGroupPositionsAddResponse> {
	
	

	/** 
	* 考勤组id
	 */
	private String groupKey;

	/** 
	* 操作人userId
	 */
	private String opUserid;

	/** 
	* postion列表
	 */
	private String positionList;

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}

	public String getGroupKey() {
		return this.groupKey;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setPositionList(String positionList) {
		this.positionList = positionList;
	}

	public void setPositionList(List<Position> positionList) {
		this.positionList = new JSONWriter(false,false,true).write(positionList);
	}

	public String getPositionList() {
		return this.positionList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.positions.add";
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
		txtParams.put("group_key", this.groupKey);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("position_list", this.positionList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupPositionsAddResponse> getResponseClass() {
		return OapiAttendanceGroupPositionsAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupKey, "groupKey");
		RequestCheckUtils.checkObjectMaxListSize(positionList, 100, "positionList");
	}
	
	/**
	 * postion列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Position extends TaobaoObject {
		private static final long serialVersionUID = 2435599314796479574L;
		/**
		 * 地址描述
		 */
		@ApiField("address")
		private String address;
		/**
		 * 业务方positionId
		 */
		@ApiField("foreign_id")
		private String foreignId;
		/**
		 * 纬度(支持6位小数)
		 */
		@ApiField("latitude")
		private String latitude;
		/**
		 * 经度(支持6位小数)
		 */
		@ApiField("longitude")
		private String longitude;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getForeignId() {
			return this.foreignId;
		}
		public void setForeignId(String foreignId) {
			this.foreignId = foreignId;
		}
		public String getLatitude() {
			return this.latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return this.longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
	}
	

}