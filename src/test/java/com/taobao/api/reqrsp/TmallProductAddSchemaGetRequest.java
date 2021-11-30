package com.taobao.api.reqrsp;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: tmall.product.add.schema.get request
 *
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class TmallProductAddSchemaGetRequest extends BaseTaobaoRequest<TmallProductAddSchemaGetResponse> {



    /**
     */
    private Long brandId;

    /**
     */
    private Long categoryId;

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getApiMethodName() {
        return "tmall.product.add.schema.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("brand_id", this.brandId);
        txtParams.put("category_id", this.categoryId);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallProductAddSchemaGetResponse> getResponseClass() {
        return TmallProductAddSchemaGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
    }


}