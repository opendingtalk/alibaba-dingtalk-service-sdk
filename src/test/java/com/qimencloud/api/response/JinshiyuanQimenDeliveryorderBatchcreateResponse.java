package com.qimencloud.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.List;

public class JinshiyuanQimenDeliveryorderBatchcreateResponse extends TaobaoResponse
{
  private static final long serialVersionUID = 3234171642494674655L;

  @ApiListField("erpReturn")
  @ApiField("erpResponse")
  private List<ErpResponse> erpReturn;

  @ApiField("errorCode")
  private String errorCode;

  @ApiField("errorMessage")
  private String errorMessage;

  @ApiField("returnType")
  private Boolean returnType;

  @ApiField("success")
  private Boolean success;

  public void setErpReturn(List<ErpResponse> erpReturn)
  {
    this.erpReturn = erpReturn;
  }
  public List<ErpResponse> getErpReturn() {
    return this.erpReturn;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }
  public String getErrorCode() {
    return this.errorCode;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  public String getErrorMessage() {
    return this.errorMessage;
  }

  public void setReturnType(Boolean returnType) {
    this.returnType = returnType;
  }
  public Boolean getReturnType() {
    return this.returnType;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }
  public Boolean getSuccess() {
    return this.success;
  }

  public static class ErpResponse
  {

    @ApiField("erpConsignmentCode")
    private String erpConsignmentCode;

    @ApiField("erpOrderCode")
    private String erpOrderCode;

    @ApiField("returnType")
    private Boolean returnType;

    public String getErpConsignmentCode()
    {
      return this.erpConsignmentCode;
    }
    public void setErpConsignmentCode(String erpConsignmentCode) {
      this.erpConsignmentCode = erpConsignmentCode;
    }
    public String getErpOrderCode() {
      return this.erpOrderCode;
    }
    public void setErpOrderCode(String erpOrderCode) {
      this.erpOrderCode = erpOrderCode;
    }
    public Boolean getReturnType() {
      return this.returnType;
    }
    public void setReturnType(Boolean returnType) {
      this.returnType = returnType;
    }
  }
}
