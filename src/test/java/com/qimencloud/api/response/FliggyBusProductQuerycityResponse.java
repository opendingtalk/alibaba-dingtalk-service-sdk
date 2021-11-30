package com.qimencloud.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.List;

public class FliggyBusProductQuerycityResponse extends TaobaoResponse
{
  private static final long serialVersionUID = 6564941398934814542L;

  @ApiField("agentCode")
  private String agentCode;

  @ApiListField("data")
  @ApiField("busaCityVO")
  private List<BusaCityVO> data;

  @ApiField("errorInfo")
  private ErrorInfo errorInfo;

  @ApiField("success")
  private Boolean success;

  public void setAgentCode(String agentCode)
  {
    this.agentCode = agentCode;
  }
  public String getAgentCode() {
    return this.agentCode;
  }

  public void setData(List<BusaCityVO> data) {
    this.data = data;
  }
  public List<BusaCityVO> getData() {
    return this.data;
  }

  public void setErrorInfo(ErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }
  public ErrorInfo getErrorInfo() {
    return this.errorInfo;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }
  public Boolean getSuccess() {
    return this.success;
  }

  public static class ErrorInfo
  {

    @ApiField("code")
    private String code;

    @ApiField("message")
    private String message;

    public String getCode()
    {
      return this.code;
    }
    public void setCode(String code) {
      this.code = code;
    }
    public String getMessage() {
      return this.message;
    }
    public void setMessage(String message) {
      this.message = message;
    }
  }

  public static class BusaCityVO
  {

    @ApiField("attribute")
    private String attribute;

    @ApiField("cityName")
    private String cityName;

    @ApiField("disableBuyTicketTime")
    private Long disableBuyTicketTime;

    @ApiField("isSellToday")
    private Boolean isSellToday;

    @ApiField("presellDay")
    private Long presellDay;

    @ApiField("provinceName")
    private String provinceName;

    @ApiField("status")
    private Long status;

    @ApiField("typeNo")
    private Long typeNo;

    public String getAttribute()
    {
      return this.attribute;
    }
    public void setAttribute(String attribute) {
      this.attribute = attribute;
    }
    public String getCityName() {
      return this.cityName;
    }
    public void setCityName(String cityName) {
      this.cityName = cityName;
    }
    public Long getDisableBuyTicketTime() {
      return this.disableBuyTicketTime;
    }
    public void setDisableBuyTicketTime(Long disableBuyTicketTime) {
      this.disableBuyTicketTime = disableBuyTicketTime;
    }
    public Boolean getIsSellToday() {
      return this.isSellToday;
    }
    public void setIsSellToday(Boolean isSellToday) {
      this.isSellToday = isSellToday;
    }
    public Long getPresellDay() {
      return this.presellDay;
    }
    public void setPresellDay(Long presellDay) {
      this.presellDay = presellDay;
    }
    public String getProvinceName() {
      return this.provinceName;
    }
    public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
    }
    public Long getStatus() {
      return this.status;
    }
    public void setStatus(Long status) {
      this.status = status;
    }
    public Long getTypeNo() {
      return this.typeNo;
    }
    public void setTypeNo(Long typeNo) {
      this.typeNo = typeNo;
    }
  }
}
