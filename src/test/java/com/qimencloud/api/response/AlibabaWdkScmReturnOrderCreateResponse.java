package com.qimencloud.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API(QimenCloud): alibaba.wdk.scm.return.order.create response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaWdkScmReturnOrderCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1166824881466946418L;

    /**
     * ??????code
     */
    @ApiField("errCode")
    private String errCode;

    /**
     * ????????????
     */
    @ApiField("errMsg")
    private String errMsg;

    /**
     * ????????????
     */
    @ApiField("model")
    private Model model;

    /**
     * ????????????
     */
    @ApiField("success")
    private Boolean success;


    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }
    public String getErrCode( ) {
        return this.errCode;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
    public String getErrMsg( ) {
        return this.errMsg;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    public Model getModel( ) {
        return this.model;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
    public Boolean getSuccess( ) {
        return this.success;
    }

    /**
     * ????????????
     *
     * @author top auto create
     * @since 1.0, null
     */

    public static class Model {

        /**
         * ??????????????????
         */
        @ApiField("status")
        private Boolean status;


        public Boolean getStatus() {
            return this.status;
        }
        public void setStatus(Boolean status) {
            this.status = status;
        }

    }



}
