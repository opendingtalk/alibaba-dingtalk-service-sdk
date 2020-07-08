package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.attribute.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoDeviceAttributeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2858753528815678194L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 扩展信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 返回数据
	 */
	@ApiListField("model")
	@ApiField("mos_device_attribute_dto")
	private List<MosDeviceAttributeDto> model;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(List<MosDeviceAttributeDto> model) {
		this.model = model;
	}
	public List<MosDeviceAttributeDto> getModel( ) {
		return this.model;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MosDeviceAttributeDto extends TaobaoObject {
		private static final long serialVersionUID = 6255121867448929257L;
		/**
		 * 属性名称
		 */
		@ApiField("attribute_name")
		private String attributeName;
		/**
		 * 属性类型
		 */
		@ApiField("attribute_type")
		private String attributeType;
		/**
		 * 属性值
		 */
		@ApiField("attribute_value")
		private String attributeValue;
		/**
		 * 设备id
		 */
		@ApiField("device_id")
		private Long deviceId;
	
		public String getAttributeName() {
			return this.attributeName;
		}
		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}
		public String getAttributeType() {
			return this.attributeType;
		}
		public void setAttributeType(String attributeType) {
			this.attributeType = attributeType;
		}
		public String getAttributeValue() {
			return this.attributeValue;
		}
		public void setAttributeValue(String attributeValue) {
			this.attributeValue = attributeValue;
		}
		public Long getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(Long deviceId) {
			this.deviceId = deviceId;
		}
	}
	


}
