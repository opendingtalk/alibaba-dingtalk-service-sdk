package com.taobao.api;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.DingTalkErrorField;
import com.taobao.api.internal.mapping.QimenErrorField;
import com.taobao.api.internal.mapping.TopErrorField;

/**
 * TOPAPI基础响应信息。
 * 
 * @author fengsheng
 */
public abstract class TaobaoResponse implements Serializable {

	private static final long serialVersionUID = 5014379068811962022L;

	@QimenErrorField("code")
	private String code;

	@QimenErrorField("message")
	private String message;

	@TopErrorField("code")
	@QimenErrorField("code")
	@DingTalkErrorField("errcode")
	private String errorCode;

	@TopErrorField("msg")
	@QimenErrorField("message")
	@DingTalkErrorField("errmsg")
	private String msg;

	@TopErrorField("sub_code")
	@QimenErrorField("sub_code")
	@DingTalkErrorField("sub_code")
	private String subCode;

	@TopErrorField("sub_msg")
	@QimenErrorField("sub_message")
	@DingTalkErrorField("sub_msg")
	private String subMsg;

	@QimenErrorField("sub_message")
	private String subMessage;

	@QimenErrorField("flag")
	private String flag;

	@TopErrorField("request_id")
	@QimenErrorField("request_id")
	private String requestId;

	@QimenErrorField("type")
	private String qimenType;

	private String body; // API响应JSON或XML串

	private Map<String, String> headerContent; // 响应头

	/**
	 * API请求URL(不包含body)
	 */
	private String requestUrl;

	private Map<String, String> params; // API请求参数列表

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMsg() {
		return this.subMsg;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public boolean isSuccess() {
		return (this.errorCode == null || this.errorCode.length() == 0 || this.errorCode.equals("0"))
				&& (this.subCode == null || this.subCode.length() == 0)
				&& (this.flag == null || this.flag.length() == 0);
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getQimenType() {
		return qimenType;
	}

	public void setQimenType(String qimenType) {
		this.qimenType = qimenType;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public Map<String, String> getHeaderContent() {
		return headerContent;
	}

	public void setHeaderContent(Map<String, String> headerContent) {
		this.headerContent = headerContent;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubMessage() {
		return subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}
}
