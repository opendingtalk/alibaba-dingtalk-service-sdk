package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.visible_scopes response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMicroappVisibleScopesResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6618319166836671182L;

	/** 
	 * 微应用的可见部门id列表，格式为JSON数组
	 */
	@ApiListField("deptVisibleScopes")
	@ApiField("number")
	private List<Long> deptVisibleScopes;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 对返回码的文本描述内容
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 是否仅限管理员可见
	 */
	@ApiField("isHidden")
	private Boolean isHidden;

	/** 
	 * 微应用的可见用户id列表，格式为JSON数组
	 */
	@ApiListField("userVisibleScopes")
	@ApiField("string")
	private List<String> userVisibleScopes;


	public void setDeptVisibleScopes(List<Long> deptVisibleScopes) {
		this.deptVisibleScopes = deptVisibleScopes;
	}
	public List<Long> getDeptVisibleScopes( ) {
		return this.deptVisibleScopes;
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

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}
	public Boolean getIsHidden( ) {
		return this.isHidden;
	}

	public void setUserVisibleScopes(List<String> userVisibleScopes) {
		this.userVisibleScopes = userVisibleScopes;
	}
	public List<String> getUserVisibleScopes( ) {
		return this.userVisibleScopes;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
