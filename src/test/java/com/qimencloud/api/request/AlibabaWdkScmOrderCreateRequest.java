package com.qimencloud.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import java.util.List;
import java.util.Map;

public class AlibabaWdkScmOrderCreateRequest
        extends BaseTaobaoRequest<AlibabaWdkScmOrderCreateResponse>
{
    private String param;
    private String topContentType;
    private String topResponseType;
    private String topApiVersion;
    private String topApiFormat;

    public void setParam(String param)
    {
        this.param = param;
    }

    public void setParam(ScmOrderCreateDO param)
    {
        this.param = new JSONWriter(false, false, true).write(param);
    }

    public String getParam()
    {
        return this.param;
    }

    public String getApiMethodName()
    {
        return "alibaba.wdk.scm.order.create";
    }

    public String getTopContentType()
    {
        return this.topContentType;
    }

    public void setTopContentType(String topContentType)
    {
        this.topContentType = topContentType;
    }

    public String getTopResponseType()
    {
        return this.topResponseType;
    }

    public void setTopResponseType(String topResponseType)
    {
        this.topResponseType = topResponseType;
    }

    public AlibabaWdkScmOrderCreateRequest()
    {
        this.topResponseType = "qimen1";

        this.topApiVersion = "2.0";
    }

    public String getTopApiVersion()
    {
        return this.topApiVersion;
    }

    public void setTopApiVersion(String topApiVersion)
    {
        this.topApiVersion = topApiVersion;
    }

    public String getTopApiFormat()
    {
        return this.topApiFormat;
    }

    public void setTopApiFormat(String topApiFormat)
    {
        this.topApiFormat = topApiFormat;
    }

    public Map<String, String> getTextParams()
    {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("param", this.param);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<AlibabaWdkScmOrderCreateResponse> getResponseClass()
    {
        return AlibabaWdkScmOrderCreateResponse.class;
    }

    public void check()
            throws ApiRuleException
    {}

    public static class SkuList
    {
        @ApiField("amount")
        private String amount;
        @ApiField("price")
        private String price;
        @ApiField("quantity")
        private String quantity;
        @ApiField("sku_code")
        private String skuCode;

        public String getAmount()
        {
            return this.amount;
        }

        public void setAmount(String amount)
        {
            this.amount = amount;
        }

        public String getPrice()
        {
            return this.price;
        }

        public void setPrice(String price)
        {
            this.price = price;
        }

        public String getQuantity()
        {
            return this.quantity;
        }

        public void setQuantity(String quantity)
        {
            this.quantity = quantity;
        }

        public String getSkuCode()
        {
            return this.skuCode;
        }

        public void setSkuCode(String skuCode)
        {
            this.skuCode = skuCode;
        }
    }

    public static class ScmOrderCreateDO
    {
        @ApiField("delivery_date")
        private String deliveryDate;
        @ApiField("effective_date")
        private String effectiveDate;
        @ApiField("factory_no")
        private String factoryNo;
        @ApiField("order_bill_no")
        private String orderBillNo;
        @ApiField("order_time")
        private String orderTime;
        @ApiField("shop_no")
        private String shopNo;
        @ApiListField("sku_list")
        @ApiField("sku_list")
        private List<AlibabaWdkScmOrderCreateRequest.SkuList> skuList;
        @ApiField("supply_no")
        private String supplyNo;

        public String getDeliveryDate()
        {
            return this.deliveryDate;
        }

        public void setDeliveryDate(String deliveryDate)
        {
            this.deliveryDate = deliveryDate;
        }

        public String getEffectiveDate()
        {
            return this.effectiveDate;
        }

        public void setEffectiveDate(String effectiveDate)
        {
            this.effectiveDate = effectiveDate;
        }

        public String getFactoryNo()
        {
            return this.factoryNo;
        }

        public void setFactoryNo(String factoryNo)
        {
            this.factoryNo = factoryNo;
        }

        public String getOrderBillNo()
        {
            return this.orderBillNo;
        }

        public void setOrderBillNo(String orderBillNo)
        {
            this.orderBillNo = orderBillNo;
        }

        public String getOrderTime()
        {
            return this.orderTime;
        }

        public void setOrderTime(String orderTime)
        {
            this.orderTime = orderTime;
        }

        public String getShopNo()
        {
            return this.shopNo;
        }

        public void setShopNo(String shopNo)
        {
            this.shopNo = shopNo;
        }

        public List<AlibabaWdkScmOrderCreateRequest.SkuList> getSkuList()
        {
            return this.skuList;
        }

        public void setSkuList(List<AlibabaWdkScmOrderCreateRequest.SkuList> skuList)
        {
            this.skuList = skuList;
        }

        public String getSupplyNo()
        {
            return this.supplyNo;
        }

        public void setSupplyNo(String supplyNo)
        {
            this.supplyNo = supplyNo;
        }
    }
}