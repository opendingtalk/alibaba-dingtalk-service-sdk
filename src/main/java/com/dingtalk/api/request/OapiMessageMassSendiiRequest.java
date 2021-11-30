package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMessageMassSendiiResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.mass.sendii request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.22
 */
public class OapiMessageMassSendiiRequest extends BaseTaobaoRequest<OapiMessageMassSendiiResponse> {
	
	

	/** 
	* 接收者的部门id列表，接收者是部门id下(包括子部门下)的所有用户
	 */
	private String depIdList;

	/** 
	* 是否预览推送
	 */
	private Boolean isPreview;

	/** 
	* 是否群发给所有订阅者，true-是，false-否
	 */
	private Boolean isToAll;

	/** 
	* 消息卡片素材id
	 */
	private String mediaId;

	/** 
	* msg_type, 消息类型：text，文本类型，此时文本内容填在text_content字段中；news_card，消息卡片，此时的media_id通过消息卡片上传接口得到； image，图片，此时的media_id通过图片上传接口得到
	 */
	private String msgType;

	/** 
	* .。。
	 */
	private String test;

	/** 
	* 文本内容，当msg_type为text时有效
	 */
	private String textContent;

	/** 
	* 服务号的unionid
	 */
	private String unionid;

	/** 
	* 接收者的用户userid列表
	 */
	private String useridList;

	/** 
	* 调用时填写随机生成的UUID, 防止消息重复发送
	 */
	private String uuid;

	public void setDepIdList(String depIdList) {
		this.depIdList = depIdList;
	}

	public String getDepIdList() {
		return this.depIdList;
	}

	public void setIsPreview(Boolean isPreview) {
		this.isPreview = isPreview;
	}

	public Boolean getIsPreview() {
		return this.isPreview;
	}

	public void setIsToAll(Boolean isToAll) {
		this.isToAll = isToAll;
	}

	public Boolean getIsToAll() {
		return this.isToAll;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getTest() {
		return this.test;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getTextContent() {
		return this.textContent;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUuid() {
		return this.uuid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.mass.sendii";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dep_id_list", this.depIdList);
		txtParams.put("is_preview", this.isPreview);
		txtParams.put("is_to_all", this.isToAll);
		txtParams.put("media_id", this.mediaId);
		txtParams.put("msg_type", this.msgType);
		txtParams.put("test", this.test);
		txtParams.put("text_content", this.textContent);
		txtParams.put("unionid", this.unionid);
		txtParams.put("userid_list", this.useridList);
		txtParams.put("uuid", this.uuid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageMassSendiiResponse> getResponseClass() {
		return OapiMessageMassSendiiResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(depIdList, 20, "depIdList");
		RequestCheckUtils.checkNotEmpty(isToAll, "isToAll");
		RequestCheckUtils.checkMaxLength(mediaId, 256, "mediaId");
		RequestCheckUtils.checkNotEmpty(msgType, "msgType");
		RequestCheckUtils.checkMaxLength(msgType, 32, "msgType");
		RequestCheckUtils.checkMaxLength(textContent, 65535, "textContent");
		RequestCheckUtils.checkNotEmpty(unionid, "unionid");
		RequestCheckUtils.checkMaxLength(unionid, 128, "unionid");
		RequestCheckUtils.checkMaxListSize(useridList, 10000, "useridList");
		RequestCheckUtils.checkNotEmpty(uuid, "uuid");
		RequestCheckUtils.checkMaxLength(uuid, 128, "uuid");
	}
	

}