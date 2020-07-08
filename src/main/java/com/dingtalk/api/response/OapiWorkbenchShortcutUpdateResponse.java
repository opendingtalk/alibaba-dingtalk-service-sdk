package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workbench.shortcut.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkbenchShortcutUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2347588117893437957L;

	/** 
	 * 服务结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务结果信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private IsvOrgShortcutDto result;


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

	public void setResult(IsvOrgShortcutDto result) {
		this.result = result;
	}
	public IsvOrgShortcutDto getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsvOrgShortcutDto extends TaobaoObject {
		private static final long serialVersionUID = 3832992627498779469L;
		/**
		 * 系统交互唯一流水号
		 */
		@ApiField("biz_no")
		private String bizNo;
	
		public String getBizNo() {
			return this.bizNo;
		}
		public void setBizNo(String bizNo) {
			this.bizNo = bizNo;
		}
	}
	


}
