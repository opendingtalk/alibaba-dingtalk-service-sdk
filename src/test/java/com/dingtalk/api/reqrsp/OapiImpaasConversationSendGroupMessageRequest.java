package com.dingtalk.api.reqrsp;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.conversation.sendGroupMessage request
 *
 * @author top auto create
 * @since 1.0, 2018.05.23
 */
public class OapiImpaasConversationSendGroupMessageRequest extends BaseTaobaoRequest<OapiImpaasConversationSendGroupMessageResponse> {



    /**
     * ???ID
     */
    private String chatId;

    /**
     * ????????????
     */
    private String content;

    /**
     * 1. ????????? 2.????????????
     */
    private Long msgType;

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setMsgType(Long msgType) {
        this.msgType = msgType;
    }

    public Long getMsgType() {
        return this.msgType;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.impaas.conversation.sendGroupMessage";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("chatId", this.chatId);
        txtParams.put("content", this.content);
        txtParams.put("msgType", this.msgType);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiImpaasConversationSendGroupMessageResponse> getResponseClass() {
        return OapiImpaasConversationSendGroupMessageResponse.class;
    }

    public void check() throws ApiRuleException {
    }


}
