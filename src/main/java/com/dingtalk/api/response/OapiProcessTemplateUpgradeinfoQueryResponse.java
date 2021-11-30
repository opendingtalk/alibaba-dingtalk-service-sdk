package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.template.upgradeinfo.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessTemplateUpgradeinfoQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5483911338619518774L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * List<Object>类型，Object含processCode和canBeUpgraded两个属性
	 */
	@ApiListField("result")
	@ApiField("result")
	private List<Result> result;


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

	public void setResult(List<Result> result) {
		this.result = result;
	}
	public List<Result> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * List<Object>类型，Object含processCode和canBeUpgraded两个属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3279183695413293397L;
		/**
		 * 是否可升级
		 */
		@ApiField("can_be_upgraded")
		private Boolean canBeUpgraded;
		/**
		 * 模板code
		 */
		@ApiField("process_code")
		private String processCode;
	
		public Boolean getCanBeUpgraded() {
			return this.canBeUpgraded;
		}
		public void setCanBeUpgraded(Boolean canBeUpgraded) {
			this.canBeUpgraded = canBeUpgraded;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
	}
	


}
