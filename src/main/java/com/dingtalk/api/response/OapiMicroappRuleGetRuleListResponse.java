package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.rule.get_rule_list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMicroappRuleGetRuleListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7732622483123567561L;

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
	 * 用户绑定的规则id列表
	 */
	@ApiListField("ruleIdList")
	@ApiField("number")
	private List<Long> ruleIdList;


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

	public void setRuleIdList(List<Long> ruleIdList) {
		this.ruleIdList = ruleIdList;
	}
	public List<Long> getRuleIdList( ) {
		return this.ruleIdList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
