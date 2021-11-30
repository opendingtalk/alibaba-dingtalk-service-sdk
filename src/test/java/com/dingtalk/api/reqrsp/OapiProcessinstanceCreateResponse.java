package com.dingtalk.api.reqrsp;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.create response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessinstanceCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8645383484119994243L;

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
     * ????????????id
     */
    @ApiField("process_instance_id")
    private String processInstanceId;


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

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }
    public String getProcessInstanceId( ) {
        return this.processInstanceId;
    }

    public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }



}