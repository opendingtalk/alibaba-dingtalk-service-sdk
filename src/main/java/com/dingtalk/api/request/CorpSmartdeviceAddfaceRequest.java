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
import com.dingtalk.api.response.CorpSmartdeviceAddfaceResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.smartdevice.addface request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpSmartdeviceAddfaceRequest extends BaseTaobaoRequest<CorpSmartdeviceAddfaceResponse> {
	
	

	/** 
	* 识别用户数据
	 */
	private String faceVo;

	public void setFaceVo(String faceVo) {
		this.faceVo = faceVo;
	}

	public void setFaceVo(DidoFaceVO faceVo) {
		this.faceVo = new JSONWriter(false,true).write(faceVo);
	}

	public String getFaceVo() {
		return this.faceVo;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.smartdevice.addface";
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
		txtParams.put("face_vo", this.faceVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpSmartdeviceAddfaceResponse> getResponseClass() {
		return CorpSmartdeviceAddfaceResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 识别用户数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DidoFaceVO extends TaobaoObject {
		private static final long serialVersionUID = 3379693918613123612L;
		/**
		 * 终端识别有效期截止时间 timestamp(毫秒)
		 */
		@ApiField("end_date")
		private Long endDate;
		/**
		 * 识别用照片id，安全考虑，获取成功后立即删除
		 */
		@ApiField("media_id")
		private String mediaId;
		/**
		 * 终端识别有效期开始时间 timestamp(毫秒)
		 */
		@ApiField("start_date")
		private Long startDate;
		/**
		 * 用户类型，用于区别不同的识别问候语 如interview,friends,business,communication,training,inspection,other
		 */
		@ApiField("user_type")
		private String userType;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getEndDate() {
			return this.endDate;
		}
		public void setEndDate(Long endDate) {
			this.endDate = endDate;
		}
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
		public Long getStartDate() {
			return this.startDate;
		}
		public void setStartDate(Long startDate) {
			this.startDate = startDate;
		}
		public String getUserType() {
			return this.userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}