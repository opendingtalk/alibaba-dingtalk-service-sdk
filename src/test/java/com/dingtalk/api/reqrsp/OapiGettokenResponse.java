package com.dingtalk.api.reqrsp;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP DingTalk-API: dingtalk.oapi.gettoken response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiGettokenResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8224625272364766937L;

    /**
     * access_token
     */
    @ApiField("access_token")
    private String accessToken;

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
     * expires_in
     */
    @ApiField("expires_in")
    private Long expiresIn;


    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public String getAccessToken( ) {
        return this.accessToken;
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

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }
    public Long getExpiresIn( ) {
        return this.expiresIn;
    }

    public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }



}
