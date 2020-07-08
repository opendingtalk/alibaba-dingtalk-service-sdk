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
import com.dingtalk.api.response.OapiAttendanceGroupUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiAttendanceGroupUpdateRequest extends BaseTaobaoRequest<OapiAttendanceGroupUpdateResponse> {
	
	

	/** 
	* 考勤组
	 */
	private String group;

	/** 
	* 操作人userId
	 */
	private String opUserid;

	public void setGroup(String group) {
		this.group = group;
	}

	public void setGroup(Group group) {
		this.group = new JSONWriter(false,false,true).write(group);
	}

	public String getGroup() {
		return this.group;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.update";
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
		txtParams.put("group", this.group);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupUpdateResponse> getResponseClass() {
		return OapiAttendanceGroupUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 考勤组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Group extends TaobaoObject {
		private static final long serialVersionUID = 8656499112962434671L;
		/**
		 * 是否开启拍照打卡，默认false
		 */
		@ApiField("enable_camera_check")
		private Boolean enableCameraCheck;
		/**
		 * 是否开启美颜，默认false
		 */
		@ApiField("enable_face_beauty")
		private Boolean enableFaceBeauty;
		/**
		 * 是否开启笑脸打卡(若开启笑脸则默认开启拍照打卡)，默认false
		 */
		@ApiField("enable_face_check")
		private Boolean enableFaceCheck;
		/**
		 * 扩展字段，JSON格式
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 考勤组id
		 */
		@ApiField("group_key")
		private String groupKey;
		/**
		 * 打卡范围，单位：米
		 */
		@ApiField("location_offset")
		private Long locationOffset;
		/**
		 * 考勤组名称
		 */
		@ApiField("name")
		private String name;
	
		public Boolean getEnableCameraCheck() {
			return this.enableCameraCheck;
		}
		public void setEnableCameraCheck(Boolean enableCameraCheck) {
			this.enableCameraCheck = enableCameraCheck;
		}
		public Boolean getEnableFaceBeauty() {
			return this.enableFaceBeauty;
		}
		public void setEnableFaceBeauty(Boolean enableFaceBeauty) {
			this.enableFaceBeauty = enableFaceBeauty;
		}
		public Boolean getEnableFaceCheck() {
			return this.enableFaceCheck;
		}
		public void setEnableFaceCheck(Boolean enableFaceCheck) {
			this.enableFaceCheck = enableFaceCheck;
		}
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public String getGroupKey() {
			return this.groupKey;
		}
		public void setGroupKey(String groupKey) {
			this.groupKey = groupKey;
		}
		public Long getLocationOffset() {
			return this.locationOffset;
		}
		public void setLocationOffset(Long locationOffset) {
			this.locationOffset = locationOffset;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	

}