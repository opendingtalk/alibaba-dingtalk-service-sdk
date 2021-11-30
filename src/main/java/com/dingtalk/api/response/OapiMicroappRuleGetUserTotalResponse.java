package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.rule.get_user_total response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMicroappRuleGetUserTotalResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3524881587822313616L;

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
	 * 返回入参中各个规则id对应的用户数
	 */
	@ApiListField("result")
	@ApiField("result")
	private List<Result> result;


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

	public void setResult(List<Result> result) {
		this.result = result;
	}
	public List<Result> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回入参中各个规则id对应的用户数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 1118378583694651971L;
		/**
		 * ruleId
		 */
		@ApiField("ruleId")
		private Long ruleId;
		/**
		 * userTotal
		 */
		@ApiField("userTotal")
		private Long userTotal;
	
		public Long getRuleId() {
			return this.ruleId;
		}
		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}
		public Long getUserTotal() {
			return this.userTotal;
		}
		public void setUserTotal(Long userTotal) {
			this.userTotal = userTotal;
		}
	}
	


}
