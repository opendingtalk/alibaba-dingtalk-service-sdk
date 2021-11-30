package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.cert.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCertGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4412415989772796263L;

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
	 * 返回结果值
	 */
	@ApiField("result")
	private OpenQueryCertResponse result;

	/** 
	 * 请求是否成功
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

	public void setResult(OpenQueryCertResponse result) {
		this.result = result;
	}
	public OpenQueryCertResponse getResult( ) {
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
	 * 认证明细
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Certdata extends TaobaoObject {
		private static final long serialVersionUID = 3815839341237931334L;
		/**
		 * 当前认证考试是否可以参加。true：可以；false：敬请期待；
		 */
		@ApiField("can_cert")
		private Boolean canCert;
		/**
		 * 认证等级。0:没有认证；1:初级；2:中级；3:高级；
		 */
		@ApiField("cert_level")
		private Long certLevel;
		/**
		 * 当前等级认证状态。0:未获取；1:认证中；2:证书制作中；3:已获取
		 */
		@ApiField("cert_status")
		private Long certStatus;
	
		public Boolean getCanCert() {
			return this.canCert;
		}
		public void setCanCert(Boolean canCert) {
			this.canCert = canCert;
		}
		public Long getCertLevel() {
			return this.certLevel;
		}
		public void setCertLevel(Long certLevel) {
			this.certLevel = certLevel;
		}
		public Long getCertStatus() {
			return this.certStatus;
		}
		public void setCertStatus(Long certStatus) {
			this.certStatus = certStatus;
		}
	}
	
	/**
	 * 返回结果值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenQueryCertResponse extends TaobaoObject {
		private static final long serialVersionUID = 4825294542544436229L;
		/**
		 * 认证明细
		 */
		@ApiListField("cert_datas")
		@ApiField("certdata")
		private List<Certdata> certDatas;
		/**
		 * 当前用户最高认证等级。0:没有认证；1:初级；2:中级；3:高级；
		 */
		@ApiField("current_cert_level")
		private Long currentCertLevel;
	
		public List<Certdata> getCertDatas() {
			return this.certDatas;
		}
		public void setCertDatas(List<Certdata> certDatas) {
			this.certDatas = certDatas;
		}
		public Long getCurrentCertLevel() {
			return this.currentCertLevel;
		}
		public void setCurrentCertLevel(Long currentCertLevel) {
			this.currentCertLevel = currentCertLevel;
		}
	}
	


}
