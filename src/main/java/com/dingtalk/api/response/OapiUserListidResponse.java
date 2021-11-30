package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.listid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserListidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3712839814383717427L;

	/** 
	 * 错误码。0代表成功。
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息。
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private ListUserByDeptResponse result;


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

	public void setResult(ListUserByDeptResponse result) {
		this.result = result;
	}
	public ListUserByDeptResponse getResult( ) {
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
	public static class ListUserByDeptResponse extends TaobaoObject {
		private static final long serialVersionUID = 2225199848822974194L;
		/**
		 * 用户id列表
		 */
		@ApiListField("userid_list")
		@ApiField("string")
		private List<String> useridList;
	
		public List<String> getUseridList() {
			return this.useridList;
		}
		public void setUseridList(List<String> useridList) {
			this.useridList = useridList;
		}
	}
	


}
