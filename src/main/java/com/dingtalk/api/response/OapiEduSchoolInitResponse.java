package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.school.init response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduSchoolInitResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5581863449677624874L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误消息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private OpenEduSchoolInitResponse result;

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

	public void setResult(OpenEduSchoolInitResponse result) {
		this.result = result;
	}
	public OpenEduSchoolInitResponse getResult( ) {
		return this.result;
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduSchoolInitResponse extends TaobaoObject {
		private static final long serialVersionUID = 6612341738666572222L;
		/**
		 * 校区列表
		 */
		@ApiListField("campus_list")
		@ApiField("number")
		private List<Long> campusList;
		/**
		 * 生效
		 */
		@ApiField("effected")
		private String effected;
	
		public List<Long> getCampusList() {
			return this.campusList;
		}
		public void setCampusList(List<Long> campusList) {
			this.campusList = campusList;
		}
		public String getEffected() {
			return this.effected;
		}
		public void setEffected(String effected) {
			this.effected = effected;
		}
	}
	


}
