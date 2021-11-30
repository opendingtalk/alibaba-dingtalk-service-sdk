package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.group.position.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiPbpInstanceGroupPositionUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3154665492539724458L;

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
	 * 打卡组唯一标识
	 */
	@ApiField("punch_group_id")
	private String punchGroupId;


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

	public void setPunchGroupId(String punchGroupId) {
		this.punchGroupId = punchGroupId;
	}
	public String getPunchGroupId( ) {
		return this.punchGroupId;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
