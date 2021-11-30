package com.dingtalk.api.reqrsp;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.get response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiChatGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4213582375664298148L;

    /**
     * chat_info
     */
    @ApiField("chat_info")
    private ChatInfo chatInfo;

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


    public void setChatInfo(ChatInfo chatInfo) {
        this.chatInfo = chatInfo;
    }
    public ChatInfo getChatInfo( ) {
        return this.chatInfo;
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

    public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }

    /**
     * chat_info
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class ChatInfo extends TaobaoObject {
        private static final long serialVersionUID = 6347498562279274138L;
        /**
         * name
         */
        @ApiField("name")
        private String name;
        /**
         * owner
         */
        @ApiField("owner")
        private String owner;
        /**
         * useridlist
         */
        @ApiListField("useridlist")
        @ApiField("string")
        private List<String> useridlist;

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getOwner() {
            return this.owner;
        }
        public void setOwner(String owner) {
            this.owner = owner;
        }
        public List<String> getUseridlist() {
            return this.useridlist;
        }
        public void setUseridlist(List<String> useridlist) {
            this.useridlist = useridlist;
        }
    }



}
