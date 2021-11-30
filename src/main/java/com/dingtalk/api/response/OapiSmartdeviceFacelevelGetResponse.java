package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facelevel.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceFacelevelGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5129139283582957487L;

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
	 * 父对象
	 */
	@ApiListField("result")
	@ApiField("face_result_vo")
	private List<FaceResultVo> result;


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

	public void setResult(List<FaceResultVo> result) {
		this.result = result;
	}
	public List<FaceResultVo> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 父对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FaceResultVo extends TaobaoObject {
		private static final long serialVersionUID = 6558169628946532781L;
		/**
		 * 员工认证姓名
		 */
		@ApiField("certify_name")
		private String certifyName;
		/**
		 * 实人认证结果 1:已实名 3:已实人 4:管理员通过
		 */
		@ApiField("certify_type")
		private Long certifyType;
		/**
		 * 有人脸
		 */
		@ApiField("has_face")
		private Boolean hasFace;
		/**
		 * 人脸最后更新时间
		 */
		@ApiField("last_modified")
		private Date lastModified;
		/**
		 * 当前操作人的userid
		 */
		@ApiField("operator_userid")
		private String operatorUserid;
		/**
		 * 当前操作人的姓名
		 */
		@ApiField("operator_username")
		private String operatorUsername;
		/**
		 * 用户staffid
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCertifyName() {
			return this.certifyName;
		}
		public void setCertifyName(String certifyName) {
			this.certifyName = certifyName;
		}
		public Long getCertifyType() {
			return this.certifyType;
		}
		public void setCertifyType(Long certifyType) {
			this.certifyType = certifyType;
		}
		public Boolean getHasFace() {
			return this.hasFace;
		}
		public void setHasFace(Boolean hasFace) {
			this.hasFace = hasFace;
		}
		public Date getLastModified() {
			return this.lastModified;
		}
		public void setLastModified(Date lastModified) {
			this.lastModified = lastModified;
		}
		public String getOperatorUserid() {
			return this.operatorUserid;
		}
		public void setOperatorUserid(String operatorUserid) {
			this.operatorUserid = operatorUserid;
		}
		public String getOperatorUsername() {
			return this.operatorUsername;
		}
		public void setOperatorUsername(String operatorUsername) {
			this.operatorUsername = operatorUsername;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
