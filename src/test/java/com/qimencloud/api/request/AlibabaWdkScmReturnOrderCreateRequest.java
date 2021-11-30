package com.qimencloud.api.request;

import java.util.List;

import com.qimencloud.api.response.AlibabaWdkScmReturnOrderCreateResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.json.JSONWriter;

/**
 * TOP API(QimenCloud): alibaba.wdk.scm.return.order.create request
 *
 * @author top auto create
 * @since 1.0, 2018.09.04
 */
public class AlibabaWdkScmReturnOrderCreateRequest extends BaseTaobaoRequest<AlibabaWdkScmReturnOrderCreateResponse> {



    /**
     * ?????????????????????
     */
    private String param;

    public void setParam(String param) {
        this.param = param;
    }

    public void setParam(ScmRetrunOrderDo param) {
        this.param = new JSONWriter(false,false,true).write(param);
    }

    public String getParam() {
        return this.param;
    }

    public String getApiMethodName() {
        return "alibaba.wdk.scm.return.order.create";
    }

    private String topContentType ;

    public String getTopContentType() {
        return topContentType;
    }

    public void setTopContentType(String topContentType) {
        this.topContentType = topContentType;
    }

    private String topResponseType = Constants.RESPONSE_TYPE_QIMEN;

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
        txtParams.put("param", this.param);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<AlibabaWdkScmReturnOrderCreateResponse> getResponseClass() {
        return AlibabaWdkScmReturnOrderCreateResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    /**
     * ????????????
     *
     * @author top auto create
     * @since 1.0, null
     */

    public static class ContainerList {

        /**
         * ????????????
         */
        @ApiField("code")
        private String code;
        /**
         * ????????????
         */
        @ApiField("quantity")
        private String quantity;


        public String getCode() {
            return this.code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getQuantity() {
            return this.quantity;
        }
        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

    }

    /**
     * ??????sku??????
     *
     * @author top auto create
     * @since 1.0, null
     */

    public static class SkuList {

        /**
         * ????????????
         */
        @ApiListField("container_list")
        @ApiField("container_list")
        private List<ContainerList> containerList;
        /**
         * ??????
         */
        @ApiField("group")
        private String group;
        /**
         * ???????????????????????????????????????
         */
        @ApiField("ret_amount")
        private String retAmount;
        /**
         * ????????????
         */
        @ApiField("ret_note")
        private String retNote;
        /**
         * ???????????????????????????????????????
         */
        @ApiField("ret_price")
        private String retPrice;
        /**
         * ?????????????????????????????????
         */
        @ApiField("ret_quantity")
        private String retQuantity;
        /**
         * RT??????
         */
        @ApiField("sku_code")
        private String skuCode;


        public List<ContainerList> getContainerList() {
            return this.containerList;
        }
        public void setContainerList(List<ContainerList> containerList) {
            this.containerList = containerList;
        }
        public String getGroup() {
            return this.group;
        }
        public void setGroup(String group) {
            this.group = group;
        }
        public String getRetAmount() {
            return this.retAmount;
        }
        public void setRetAmount(String retAmount) {
            this.retAmount = retAmount;
        }
        public String getRetNote() {
            return this.retNote;
        }
        public void setRetNote(String retNote) {
            this.retNote = retNote;
        }
        public String getRetPrice() {
            return this.retPrice;
        }
        public void setRetPrice(String retPrice) {
            this.retPrice = retPrice;
        }
        public String getRetQuantity() {
            return this.retQuantity;
        }
        public void setRetQuantity(String retQuantity) {
            this.retQuantity = retQuantity;
        }
        public String getSkuCode() {
            return this.skuCode;
        }
        public void setSkuCode(String skuCode) {
            this.skuCode = skuCode;
        }

    }

    /**
     * ?????????????????????
     *
     * @author top auto create
     * @since 1.0, null
     */

    public static class ScmRetrunOrderDo {

        /**
         * ????????????
         */
        @ApiField("factory_no")
        private String factoryNo;
        /**
         * ????????????
         */
        @ApiField("ret_bill_no")
        private String retBillNo;
        /**
         * ???????????????????????????????????????????????????:yyyy-MM-dd HH:mm:ss????????????2018-03-26 12:00:00
         */
        @ApiField("ret_time")
        private String retTime;
        /**
         * ??????
         */
        @ApiField("shop_no")
        private String shopNo;
        /**
         * ??????sku??????
         */
        @ApiListField("sku_list")
        @ApiField("sku_list")
        private List<SkuList> skuList;
        /**
         * ????????????????????????DC?????????RT????????????
         */
        @ApiField("supply_no")
        private String supplyNo;


        public String getFactoryNo() {
            return this.factoryNo;
        }
        public void setFactoryNo(String factoryNo) {
            this.factoryNo = factoryNo;
        }
        public String getRetBillNo() {
            return this.retBillNo;
        }
        public void setRetBillNo(String retBillNo) {
            this.retBillNo = retBillNo;
        }
        public String getRetTime() {
            return this.retTime;
        }
        public void setRetTime(String retTime) {
            this.retTime = retTime;
        }
        public String getShopNo() {
            return this.shopNo;
        }
        public void setShopNo(String shopNo) {
            this.shopNo = shopNo;
        }
        public List<SkuList> getSkuList() {
            return this.skuList;
        }
        public void setSkuList(List<SkuList> skuList) {
            this.skuList = skuList;
        }
        public String getSupplyNo() {
            return this.supplyNo;
        }
        public void setSupplyNo(String supplyNo) {
            this.supplyNo = supplyNo;
        }

    }



}
