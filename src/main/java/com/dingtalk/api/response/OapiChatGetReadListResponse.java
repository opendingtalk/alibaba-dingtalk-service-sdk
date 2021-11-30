package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.getReadList response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiChatGetReadListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2859163912673644768L;

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
	 * next_cursor
	 */
	@ApiField("next_cursor")
	private Long nextCursor;

	/** 
	 * readUserIdList
	 */
	@ApiListField("readUserIdList")
	@ApiField("string")
	private List<String> readUserIdList;


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

	public void setNextCursor(Long nextCursor) {
		this.nextCursor = nextCursor;
	}
	public Long getNextCursor( ) {
		return this.nextCursor;
	}

	public void setReadUserIdList(List<String> readUserIdList) {
		this.readUserIdList = readUserIdList;
	}
	public List<String> getReadUserIdList( ) {
		return this.readUserIdList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
