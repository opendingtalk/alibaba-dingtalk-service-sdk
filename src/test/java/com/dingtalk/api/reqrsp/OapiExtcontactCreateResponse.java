package com.dingtalk.api.reqrsp;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP DingTalk-API: dingtalk.oapi.extcontact.create response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiExtcontactCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1689216739345282538L;

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
     * ?????????????????????userId
     */
    @ApiField("userid")
    private String userid;


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

    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getUserid( ) {
        return this.userid;
    }

    public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }



}