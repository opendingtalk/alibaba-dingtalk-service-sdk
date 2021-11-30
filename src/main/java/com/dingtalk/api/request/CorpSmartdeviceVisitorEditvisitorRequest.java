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
import com.dingtalk.api.response.CorpSmartdeviceVisitorEditvisitorResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.smartdevice.visitor.editvisitor request
 * 
 * @author top auto create
 * @since 1.0, 2018.05.09
 */
public class CorpSmartdeviceVisitorEditvisitorRequest extends BaseTaobaoRequest<CorpSmartdeviceVisitorEditvisitorResponse> {
	
	

	/** 
	* 预约编号
	 */
	private String reservationId;

	/** 
	* 预约数据
	 */
	private String visitorVo;

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getReservationId() {
		return this.reservationId;
	}

	public void setVisitorVo(String visitorVo) {
		this.visitorVo = visitorVo;
	}

	public void setVisitorVo(DidoVisitorVo visitorVo) {
		this.visitorVo = new JSONWriter(false,true).write(visitorVo);
	}

	public String getVisitorVo() {
		return this.visitorVo;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.smartdevice.visitor.editvisitor";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

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
		txtParams.put("reservation_id", this.reservationId);
		txtParams.put("visitor_vo", this.visitorVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpSmartdeviceVisitorEditvisitorResponse> getResponseClass() {
		return CorpSmartdeviceVisitorEditvisitorResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(reservationId, "reservationId");
	}
	
	/**
	 * 预约数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DidoVisitorVo extends TaobaoObject {
		private static final long serialVersionUID = 8867694755679441227L;
		/**
		 * 预约开始时间
		 */
		@ApiField("appointed_endtime")
		private Long appointedEndtime;
		/**
		 * 预约结束时间
		 */
		@ApiField("appointed_starttime")
		private Long appointedStarttime;
		/**
		 * 扩展信息
		 */
		@ApiField("extra_info")
		private String extraInfo;
		/**
		 * 可识别照片
		 */
		@ApiField("media_id")
		private String mediaId;
		/**
		 * 访客手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 通知用户ID
		 */
		@ApiListField("notify_user_list")
		@ApiField("string")
		private List<String> notifyUserList;
		/**
		 * 识别开始时间
		 */
		@ApiField("recognize_endtime")
		private Long recognizeEndtime;
		/**
		 * 识别结束时间
		 */
		@ApiField("recognize_starttime")
		private Long recognizeStarttime;
		/**
		 * 访客姓名
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 访客外部联系人ID
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getAppointedEndtime() {
			return this.appointedEndtime;
		}
		public void setAppointedEndtime(Long appointedEndtime) {
			this.appointedEndtime = appointedEndtime;
		}
		public Long getAppointedStarttime() {
			return this.appointedStarttime;
		}
		public void setAppointedStarttime(Long appointedStarttime) {
			this.appointedStarttime = appointedStarttime;
		}
		public String getExtraInfo() {
			return this.extraInfo;
		}
		public void setExtraInfo(String extraInfo) {
			this.extraInfo = extraInfo;
		}
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public List<String> getNotifyUserList() {
			return this.notifyUserList;
		}
		public void setNotifyUserList(List<String> notifyUserList) {
			this.notifyUserList = notifyUserList;
		}
		public Long getRecognizeEndtime() {
			return this.recognizeEndtime;
		}
		public void setRecognizeEndtime(Long recognizeEndtime) {
			this.recognizeEndtime = recognizeEndtime;
		}
		public Long getRecognizeStarttime() {
			return this.recognizeStarttime;
		}
		public void setRecognizeStarttime(Long recognizeStarttime) {
			this.recognizeStarttime = recognizeStarttime;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}