package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.callback.failrecord.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCallbackFailrecordConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3124678319289735446L;

	/** 
	 * 确认成功的id列表
	 */
	@ApiListField("confirm_list")
	@ApiField("number")
	private List<Long> confirmList;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setConfirmList(List<Long> confirmList) {
		this.confirmList = confirmList;
	}
	public List<Long> getConfirmList( ) {
		return this.confirmList;
	}

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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
