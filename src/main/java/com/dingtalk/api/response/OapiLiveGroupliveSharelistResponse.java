package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.sharelist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiLiveGroupliveSharelistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1557815811973457975L;

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
	 * 返回的分享群列表
	 */
	@ApiListField("share_cid_list")
	@ApiField("string")
	private List<String> shareCidList;


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

	public void setShareCidList(List<String> shareCidList) {
		this.shareCidList = shareCidList;
	}
	public List<String> getShareCidList( ) {
		return this.shareCidList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
