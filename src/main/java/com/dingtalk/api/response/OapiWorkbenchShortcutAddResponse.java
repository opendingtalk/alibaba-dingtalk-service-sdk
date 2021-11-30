package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workbench.shortcut.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkbenchShortcutAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8744642915384587892L;

	/** 
	 * 服务返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务返回信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 系统自动生成
	 */
	@ApiField("result")
	private IsvOrgShortcutStatusDto result;


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

	public void setResult(IsvOrgShortcutStatusDto result) {
		this.result = result;
	}
	public IsvOrgShortcutStatusDto getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsvOrgShortcutStatusDto extends TaobaoObject {
		private static final long serialVersionUID = 2366884879798951845L;
		/**
		 * 唯一流水号-系统交互唯一识别码
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
