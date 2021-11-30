package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workbench.shortcut.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkbenchShortcutDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7282597236712376916L;

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
	 * result
	 */
	@ApiField("result")
	private IsvOrgShortcutStatusDTO result;


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

	public void setResult(IsvOrgShortcutStatusDTO result) {
		this.result = result;
	}
	public IsvOrgShortcutStatusDTO getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsvOrgShortcutStatusDTO extends TaobaoObject {
		private static final long serialVersionUID = 4216127513814628196L;
		/**
		 * 系统交互唯一流水号(ISV维度下不可重复)
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
