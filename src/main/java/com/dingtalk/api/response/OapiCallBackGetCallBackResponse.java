package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.call_back.get_call_back response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCallBackGetCallBackResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4425198545788984914L;

	/** 
	 * 数据加密密钥。用于回调数据的加密，长度固定为43个字符，从a-z, A-Z, 0-9共62个字符中选取,您可以随机生成，ISV(服务提供商)推荐使用注册套件时填写的EncodingAESKey
	 */
	@ApiField("aes_key")
	private String aesKey;

	/** 
	 * 需要监听的事件类型，有20种，“user_add_org”, “user_modify_org”, “user_leave_org”,“org_admin_add”, “org_admin_remove”, “org_dept_create”, “org_dept_modify”, “org_dept_remove”, “org_remove”, “chat_add_member”, “chat_remove_member”, “chat_quit”, “chat_update_owner”, “chat_update_title”, “chat_disband”, “chat_disband_microapp”, “check_in”,“bpms_task_change”,“bpms_instance_change”,,“label_user_change”,“label_conf_add”, “label_conf_modify”,“label_conf_del”,
	 */
	@ApiListField("call_back_tag")
	@ApiField("string")
	private List<String> callBackTag;

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
	 * 加解密需要用到的token，ISV(服务提供商)推荐使用注册套件时填写的token，普通企业可以随机填写
	 */
	@ApiField("token")
	private String token;

	/** 
	 * 接收事件回调的url
	 */
	@ApiField("url")
	private String url;


	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}
	public String getAesKey( ) {
		return this.aesKey;
	}

	public void setCallBackTag(List<String> callBackTag) {
		this.callBackTag = callBackTag;
	}
	public List<String> getCallBackTag( ) {
		return this.callBackTag;
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

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
