package com.dingtalk.api.reqrsp;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP DingTalk-API: dingtalk.oapi.xiaoxuan.pre.test1 response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiXiaoxuanPreTest1Response extends TaobaoResponse {

    private static final long serialVersionUID = 3264855768192954277L;

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
     * result
     */
    @ApiField("resultData")
    private String resultData;


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

    public void setResultData(String resultData) {
        this.resultData = resultData;
    }
    public String getResultData( ) {
        return this.resultData;
    }

    public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }



}
