package com.qimencloud.api.request;

import com.qimencloud.api.response.FliggyBusProductQuerycityResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import java.util.Map;

public class FliggyBusProductQuerycityRequest extends BaseTaobaoRequest<FliggyBusProductQuerycityResponse>
{
  private String channelId;
  private String traceId;

  public void setChannelId(String channelId)
  {
    this.channelId = channelId;
  }

  public String getChannelId() {
    return this.channelId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public String getTraceId() {
    return this.traceId;
  }

  public String getApiMethodName() {
    return "fliggy.bus.product.querycity";
  }

  public Map<String, String> getTextParams() {
    TaobaoHashMap txtParams = new TaobaoHashMap();
    txtParams.put("channelId", this.channelId);
    txtParams.put("traceId", this.traceId);
    if (this.udfParams != null) {
      txtParams.putAll(this.udfParams);
    }
    return txtParams;
  }

  public Class<FliggyBusProductQuerycityResponse> getResponseClass() {
    return FliggyBusProductQuerycityResponse.class;
  }

  public void check()
    throws ApiRuleException
  {
  }
}
