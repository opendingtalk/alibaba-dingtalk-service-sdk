package com.dingtalk.api.reqrsp;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.conversation.sendGroupMessage response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasConversationSendGroupMessageResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1167277877773543546L;

    /**
     * dingOpenErrcode
     */
    @ApiField("errcode")
    private Long errcode;

    /**
     * errorMsg
     */
    @ApiField("errmsg")
    private String errmsg;

    /**
     * success
     */
    @ApiField("succ")
    private Boolean succ;


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

    public void setSucc(Boolean succ) {
        this.succ = succ;
    }
    public Boolean getSucc( ) {
        return this.succ;
    }

    public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }



}
