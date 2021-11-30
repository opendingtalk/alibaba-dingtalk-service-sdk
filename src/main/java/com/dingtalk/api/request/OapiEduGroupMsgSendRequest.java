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

import com.dingtalk.api.response.OapiEduGroupMsgSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.group.msg.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.22
 */
public class OapiEduGroupMsgSendRequest extends BaseTaobaoRequest<OapiEduGroupMsgSendResponse> {
	
	

	/** 
	* 订购此应用的企业标识
	 */
	private Long agentId;

	/** 
	* 发送此消息的唯一ID
	 */
	private String bizId;

	/** 
	* 班级id
	 */
	private Long classId;

	/** 
	* 消息卡片图片地址。由业务对接人员提供
	 */
	private String imageUrl;

	/** 
	* 群中哪些人接受此消息，不填默认全部
	 */
	private String receiveUseridList;

	/** 
	* 根据消息模板传递待填充的内容，消息模板具体见场景说明。keyvalue值不能出现“:”和“,”字符，防止出现解析错误
	 */
	private String replace;

	/** 
	* 群发消息模板id
	 */
	private String templateCode;

	/** 
	* 发送消息人的员工id
	 */
	private String userid;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setReceiveUseridList(String receiveUseridList) {
		this.receiveUseridList = receiveUseridList;
	}

	public String getReceiveUseridList() {
		return this.receiveUseridList;
	}

	public void setReplace(String replace) {
		this.replace = replace;
	}

	public String getReplace() {
		return this.replace;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.group.msg.send";
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("biz_id", this.bizId);
		txtParams.put("class_id", this.classId);
		txtParams.put("image_url", this.imageUrl);
		txtParams.put("receive_userid_list", this.receiveUseridList);
		txtParams.put("replace", this.replace);
		txtParams.put("template_code", this.templateCode);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduGroupMsgSendResponse> getResponseClass() {
		return OapiEduGroupMsgSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkMaxListSize(receiveUseridList, 20, "receiveUseridList");
		RequestCheckUtils.checkNotEmpty(templateCode, "templateCode");
	}
	

}