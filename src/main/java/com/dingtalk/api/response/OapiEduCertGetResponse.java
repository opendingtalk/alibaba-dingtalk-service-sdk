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

	private static final long serialVersionUID = 8183717997835543517L;

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
		private static final long serialVersionUID = 8391578938913126624L;
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
	 * 实操任务完成信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPracticalTaskData extends TaobaoObject {
		private static final long serialVersionUID = 8322354627776426944L;
		/**
		 * true表示完成，false表示未完成
		 */
		@ApiField("finish")
		private Boolean finish;
		/**
		 * 实操任务code，sendCard表示发布打卡，sendImMsg表示发布消息
		 */
		@ApiField("task_code")
		private String taskCode;
	
		public Boolean getFinish() {
			return this.finish;
		}
		public void setFinish(Boolean finish) {
			this.finish = finish;
		}
		public String getTaskCode() {
			return this.taskCode;
		}
		public void setTaskCode(String taskCode) {
			this.taskCode = taskCode;
		}
	}
	
	/**
	 * 返回结果值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenQueryCertResponse extends TaobaoObject {
		private static final long serialVersionUID = 2626358356492276876L;
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
		/**
		 * 实操任务完成信息
		 */
		@ApiListField("practical_task_data")
		@ApiField("open_practical_task_data")
		private List<OpenPracticalTaskData> practicalTaskData;
	
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
		public List<OpenPracticalTaskData> getPracticalTaskData() {
			return this.practicalTaskData;
		}
		public void setPracticalTaskData(List<OpenPracticalTaskData> practicalTaskData) {
			this.practicalTaskData = practicalTaskData;
		}
	}
	


}
