package com.qimencloud.api.request;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API(QimenCloud): com.ylpw.union.userremarks response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ComYlpwUnionUserremarksResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8135864419897136323L;

    /**
     * message
     */
    @ApiField("message")
    private String message;

    /**
     * retCode
     */
    @ApiField("retCode")
    private String retCode;


    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage( ) {
        return this.message;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }
    public String getRetCode( ) {
        return this.retCode;
    }



}
