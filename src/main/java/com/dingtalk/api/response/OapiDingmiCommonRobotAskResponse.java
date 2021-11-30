package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.common.robot.ask response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingmiCommonRobotAskResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4557299276565315136L;

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
	 * 需将示例值转成json,示例中包含两个json字符串，分别在"}或{"前后，请分别解析，这两种数据格式表示调用方需要解析的两种数据结构 请注意，answerContent表示从机器人获取到了问题答案，recommendAnswerContent表示只获取到了推荐问题，请在解析的时候做判断，若有疑问请与api开发者联系
	 */
	@ApiField("result")
	private String result;


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

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
