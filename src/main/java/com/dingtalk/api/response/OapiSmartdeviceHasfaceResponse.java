package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.hasface response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceHasfaceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1299266967973666976L;

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
	 * 已录入用户列表
	 */
	@ApiListField("userid_list")
	@ApiField("string")
	private List<String> useridList;


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

	public void setUseridList(List<String> useridList) {
		this.useridList = useridList;
	}
	public List<String> getUseridList( ) {
		return this.useridList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
