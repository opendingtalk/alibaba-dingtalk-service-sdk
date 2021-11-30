package com.qimencloud.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;

import java.util.List;
import java.util.Map;

import com.qimencloud.api.response.JinshiyuanQimenDeliveryorderBatchcreateResponse;

public class JinshiyuanQimenDeliveryorderBatchcreateRequest extends BaseTaobaoRequest<JinshiyuanQimenDeliveryorderBatchcreateResponse>
{
  private String id;
  private String zifCreateSalesorder;

  public void setId(String id)
  {
    this.id = id;
  }

  public String getId() {
    return this.id;
  }

  public void setZifCreateSalesorder(String zifCreateSalesorder) {
    this.zifCreateSalesorder = zifCreateSalesorder;
  }

  public void setZifCreateSalesorder(SalesOrder zifCreateSalesorder) {
    this.zifCreateSalesorder = new JSONWriter(false, false, true).write(zifCreateSalesorder);
  }

  public String getZifCreateSalesorder() {
    return this.zifCreateSalesorder;
  }

  public String getApiMethodName() {
    return "jinshiyuan.qimen.deliveryorder.batchcreate";
  }

  public Map<String, String> getTextParams() {
    TaobaoHashMap txtParams = new TaobaoHashMap();
    txtParams.put("id", this.id);
    txtParams.put("zif_create_salesorder", this.zifCreateSalesorder);
    if (this.udfParams != null) {
      txtParams.putAll(this.udfParams);
    }
    return txtParams;
  }

  public Class<JinshiyuanQimenDeliveryorderBatchcreateResponse> getResponseClass() {
    return JinshiyuanQimenDeliveryorderBatchcreateResponse.class;
  }

  public void check()
    throws ApiRuleException
  {
  }

  public static class SalesOrder
  {

    @ApiField("orderHead")
    private JinshiyuanQimenDeliveryorderBatchcreateRequest.OrderHead orderHead;

    @ApiListField("t_orderItem")
    @ApiField("orderItem")
    private List<JinshiyuanQimenDeliveryorderBatchcreateRequest.OrderItem> tOrderItem;

    public JinshiyuanQimenDeliveryorderBatchcreateRequest.OrderHead getOrderHead()
    {
      return this.orderHead;
    }
    public void setOrderHead(JinshiyuanQimenDeliveryorderBatchcreateRequest.OrderHead orderHead) {
      this.orderHead = orderHead;
    }
    public List<JinshiyuanQimenDeliveryorderBatchcreateRequest.OrderItem> gettOrderItem() {
      return this.tOrderItem;
    }
    public void settOrderItem(List<JinshiyuanQimenDeliveryorderBatchcreateRequest.OrderItem> tOrderItem) {
      this.tOrderItem = tOrderItem;
    }
  }

  public static class OrderItem
  {

    @ApiField("item")
    private JinshiyuanQimenDeliveryorderBatchcreateRequest.Item item;

    public JinshiyuanQimenDeliveryorderBatchcreateRequest.Item getItem()
    {
      return this.item;
    }
    public void setItem(JinshiyuanQimenDeliveryorderBatchcreateRequest.Item item) {
      this.item = item;
    }
  }

  public static class Item
  {

    @ApiField("auart")
    private String auart;

    @ApiField("bstkd")
    private String bstkd;

    @ApiField("kbetr")
    private String kbetr;

    @ApiField("lgort")
    private String lgort;

    @ApiField("matnr")
    private String matnr;

    @ApiField("posnr")
    private String posnr;

    @ApiField("werks")
    private String werks;

    @ApiField("wmeng")
    private String wmeng;

    public String getAuart()
    {
      return this.auart;
    }
    public void setAuart(String auart) {
      this.auart = auart;
    }
    public String getBstkd() {
      return this.bstkd;
    }
    public void setBstkd(String bstkd) {
      this.bstkd = bstkd;
    }
    public String getKbetr() {
      return this.kbetr;
    }
    public void setKbetr(String kbetr) {
      this.kbetr = kbetr;
    }
    public String getLgort() {
      return this.lgort;
    }
    public void setLgort(String lgort) {
      this.lgort = lgort;
    }
    public String getMatnr() {
      return this.matnr;
    }
    public void setMatnr(String matnr) {
      this.matnr = matnr;
    }
    public String getPosnr() {
      return this.posnr;
    }
    public void setPosnr(String posnr) {
      this.posnr = posnr;
    }
    public String getWerks() {
      return this.werks;
    }
    public void setWerks(String werks) {
      this.werks = werks;
    }
    public String getWmeng() {
      return this.wmeng;
    }
    public void setWmeng(String wmeng) {
      this.wmeng = wmeng;
    }
  }

  public static class OrderHead
  {

    @ApiField("itemHead")
    private JinshiyuanQimenDeliveryorderBatchcreateRequest.ItemHead itemHead;

    public JinshiyuanQimenDeliveryorderBatchcreateRequest.ItemHead getItemHead()
    {
      return this.itemHead;
    }
    public void setItemHead(JinshiyuanQimenDeliveryorderBatchcreateRequest.ItemHead itemHead) {
      this.itemHead = itemHead;
    }
  }

  public static class ItemHead
  {

    @ApiField("auart")
    private String auart;

    @ApiField("bstkd")
    private String bstkd;

    @ApiField("kunnr")
    private String kunnr;

    @ApiField("kunnr_to")
    private String kunnrTo;

    @ApiField("name")
    private String name;

    public String getAuart()
    {
      return this.auart;
    }
    public void setAuart(String auart) {
      this.auart = auart;
    }
    public String getBstkd() {
      return this.bstkd;
    }
    public void setBstkd(String bstkd) {
      this.bstkd = bstkd;
    }
    public String getKunnr() {
      return this.kunnr;
    }
    public void setKunnr(String kunnr) {
      this.kunnr = kunnr;
    }
    public String getKunnrTo() {
      return this.kunnrTo;
    }
    public void setKunnrTo(String kunnrTo) {
      this.kunnrTo = kunnrTo;
    }
    public String getName() {
      return this.name;
    }
    public void setName(String name) {
      this.name = name;
    }
  }
}
