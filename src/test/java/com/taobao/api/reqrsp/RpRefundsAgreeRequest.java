package com.taobao.api.reqrsp;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

import java.util.Map;

public class RpRefundsAgreeRequest extends BaseTaobaoRequest<RpRefundsAgreeResponse> {



    /**
     * 短信验证码，如果退款金额达到一定的数量，后端会返回调用失败，并同时往卖家的手机发送一条短信验证码。接下来用收到的短信验证码再次发起API调用即可完成退款操作。
     */
    private String code;

    /**
     * 退款信息，格式：refund_id|amount|version|phase，其中refund_id为退款编号，amount为退款金额（以分为单位），version为退款最后更新时间（时间戳格式），phase为退款阶段（可选值为：onsale, aftersale，天猫退款必值，淘宝退款不需要传），多个退款以半角逗号分隔。
     */
    private String refundInfos;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setRefundInfos(String refundInfos) {
        this.refundInfos = refundInfos;
    }

    public String getRefundInfos() {
        return this.refundInfos;
    }

    public String getApiMethodName() {
        return "taobao.rp.refunds.agree";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("code", this.code);
        txtParams.put("refund_infos", this.refundInfos);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<RpRefundsAgreeResponse> getResponseClass() {
        return RpRefundsAgreeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(refundInfos, "refundInfos");
    }


}
