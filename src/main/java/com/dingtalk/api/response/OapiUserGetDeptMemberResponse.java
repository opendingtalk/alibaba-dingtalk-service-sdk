package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.getDeptMember response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetDeptMemberResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5781278456447378414L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * userIds
	 */
	@ApiListField("userIds")
	@ApiField("string")
	private List<String> userIds;


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

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}
	public List<String> getUserIds( ) {
		return this.userIds;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
