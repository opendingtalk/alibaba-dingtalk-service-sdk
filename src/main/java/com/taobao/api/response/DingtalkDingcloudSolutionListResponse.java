package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: dingtalk.dingcloud.solution.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DingtalkDingcloudSolutionListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3131831442849539371L;

	/** 
	 * 啊
	 */
	@ApiListField("arguments")
	@ApiField("string")
	private List<String> arguments;

	/** 
	 * 啊
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 啊
	 */
	@ApiField("errorcode")
	private String errorcode;

	/** 
	 * 啊
	 */
	@ApiField("result")
	private String result;

	/** 
	 * success
	 */
	@ApiField("succ")
	private Boolean succ;


	public void setArguments(List<String> arguments) {
		this.arguments = arguments;
	}
	public List<String> getArguments( ) {
		return this.arguments;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrorcode( ) {
		return this.errorcode;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}
	public Boolean getSucc( ) {
		return this.succ;
	}
	


}
