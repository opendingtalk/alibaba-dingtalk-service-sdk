package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_unactive_corp response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServiceGetUnactiveCorpResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8196589425826362524L;

	/** 
	 * app_id
	 */
	@ApiField("app_id")
	private Long appId;

	/** 
	 * corp_list
	 */
	@ApiListField("corp_list")
	@ApiField("string")
	private List<String> corpList;

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
	 * has_more
	 */
	@ApiField("has_more")
	private Boolean hasMore;


	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public Long getAppId( ) {
		return this.appId;
	}

	public void setCorpList(List<String> corpList) {
		this.corpList = corpList;
	}
	public List<String> getCorpList( ) {
		return this.corpList;
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

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
