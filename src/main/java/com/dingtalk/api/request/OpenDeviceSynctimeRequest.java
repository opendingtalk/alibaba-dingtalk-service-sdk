package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OpenDeviceSynctimeResponse;

/**
 * TOP DingTalk-API: dingtalk.open.device.synctime request
 * 
 * @author top auto create
 * @since 1.0, 2016.12.15
 */
public class OpenDeviceSynctimeRequest extends BaseTaobaoRequest<OpenDeviceSynctimeResponse> {
	
	

	/** 
	* 入参
	 */
	private String para;

	public void setPara(String para) {
		this.para = para;
	}

	public void setPara(OpenDeviceParams para) {
		this.para = new JSONWriter(false,true).write(para);
	}

	public String getPara() {
		return this.para;
	}

	public String getApiMethodName() {
		return "dingtalk.open.device.synctime";
	}

	private String topResponseType ;

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
		txtParams.put("para", this.para);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OpenDeviceSynctimeResponse> getResponseClass() {
		return OpenDeviceSynctimeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenDeviceParams extends TaobaoObject {
		private static final long serialVersionUID = 5147959634681953945L;
		/**
		 * 调用类型
		 */
		@ApiField("call_type")
		private String callType;
		/**
		 * 业务数据
		 */
		@ApiField("data")
		private String data;
		/**
		 * dev_id
		 */
		@ApiField("dev_id")
		private Long devId;
		/**
		 * 服务id
		 */
		@ApiField("dev_serv_id")
		private Long devServId;
		/**
		 * 设备类型
		 */
		@ApiField("dev_type_code")
		private Long devTypeCode;
		/**
		 * 传输id
		 */
		@ApiField("mid")
		private String mid;
	
		public String getCallType() {
			return this.callType;
		}
		public void setCallType(String callType) {
			this.callType = callType;
		}
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public Long getDevId() {
			return this.devId;
		}
		public void setDevId(Long devId) {
			this.devId = devId;
		}
		public Long getDevServId() {
			return this.devServId;
		}
		public void setDevServId(Long devServId) {
			this.devServId = devServId;
		}
		public Long getDevTypeCode() {
			return this.devTypeCode;
		}
		public void setDevTypeCode(Long devTypeCode) {
			this.devTypeCode = devTypeCode;
		}
		public String getMid() {
			return this.mid;
		}
		public void setMid(String mid) {
			this.mid = mid;
		}
	}
	

}