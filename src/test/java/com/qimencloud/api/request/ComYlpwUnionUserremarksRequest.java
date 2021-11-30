package com.qimencloud.api.request;

import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.mapping.ApiField;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;

/**
 * TOP API(QimenCloud): com.ylpw.union.userremarks request
 *
 * @author top auto create
 * @since 1.0, 2017.07.26
 */
public class ComYlpwUnionUserremarksRequest extends BaseTaobaoRequest<ComYlpwUnionUserremarksResponse> {



    /**
     * userRemarksReq
     */
    private String userRemarksReq;

    public void setUserRemarksReq(String userRemarksReq) {
        this.userRemarksReq = userRemarksReq;
    }

    public void setUserRemarksReq(RemarkBody userRemarksReq) {
        this.userRemarksReq = new JSONWriter(false,false,true).write(userRemarksReq);
    }

    public String getUserRemarksReq() {
        return this.userRemarksReq;
    }

    public String getApiMethodName() {
        return "com.ylpw.union.userremarks";
    }

    private String topContentType ;

    public String getTopContentType() {
        return topContentType;
    }

    public void setTopContentType(String topContentType) {
        this.topContentType = topContentType;
    }

    private String topResponseType ;

    public String getTopResponseType() {
        return topResponseType;
    }

    public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
    }

    private String topApiVersion = "2.0";

    public String getTopApiVersion() {
        return this.topApiVersion;
    }

    public void setTopApiVersion(String topApiVersion) {
        this.topApiVersion = topApiVersion;
    }

    private String topApiFormat ;

    public String getTopApiFormat() {
        return this.topApiFormat;
    }

    public void setTopApiFormat(String topApiFormat) {
        this.topApiFormat = topApiFormat;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("userRemarksReq", this.userRemarksReq);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ComYlpwUnionUserremarksResponse> getResponseClass() {
        return ComYlpwUnionUserremarksResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    /**
     * userRemarksReq
     *
     * @author top auto create
     * @since 1.0, null
     */

    public static class RemarkBody {

        /**
         * identifyingCode
         */
        @ApiField("identifyingCode")
        private String identifyingCode;
        /**
         * unionId
         */
        @ApiField("unionId")
        private Long unionId;
        /**
         * unionOrderId
         */
        @ApiField("unionOrderId")
        private String unionOrderId;
        /**
         * userRemarks
         */
        @ApiField("userRemarks")
        private String userRemarks;


        public String getIdentifyingCode() {
            return this.identifyingCode;
        }
        public void setIdentifyingCode(String identifyingCode) {
            this.identifyingCode = identifyingCode;
        }
        public Long getUnionId() {
            return this.unionId;
        }
        public void setUnionId(Long unionId) {
            this.unionId = unionId;
        }
        public String getUnionOrderId() {
            return this.unionOrderId;
        }
        public void setUnionOrderId(String unionOrderId) {
            this.unionOrderId = unionOrderId;
        }
        public String getUserRemarks() {
            return this.userRemarks;
        }
        public void setUserRemarks(String userRemarks) {
            this.userRemarks = userRemarks;
        }

    }



}
