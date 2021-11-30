package com.qimencloud.api.request;

import com.taobao.api.TaobaoResponse;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.List;

public class AlibabaWdkScmOrderCreateResponse
        extends TaobaoResponse
{
    private static final long serialVersionUID = 7365164742661298864L;
    @ApiField("errCode")
    private String errCode;
    @ApiField("errMsg")
    private String errMsg;
    @ApiField("model")
    private Model model;
    @ApiField("success")
    private Boolean success;

    public void setErrCode(String errCode)
    {
        this.errCode = errCode;
    }

    public String getErrCode()
    {
        return this.errCode;
    }

    public void setErrMsg(String errMsg)
    {
        this.errMsg = errMsg;
    }

    public String getErrMsg()
    {
        return this.errMsg;
    }

    public void setModel(Model model)
    {
        this.model = model;
    }

    public Model getModel()
    {
        return this.model;
    }

    public void setSuccess(Boolean success)
    {
        this.success = success;
    }

    public Boolean getSuccess()
    {
        return this.success;
    }

    public static class ScmSkuResultDo
    {
        @ApiField("checkFailMessage")
        private String checkFailMessage;
        @ApiField("skuCode")
        private String skuCode;

        public String getCheckFailMessage()
        {
            return this.checkFailMessage;
        }

        public void setCheckFailMessage(String checkFailMessage)
        {
            this.checkFailMessage = checkFailMessage;
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

    public static class ScmSkuResultDoList
    {
        @ApiListField("scm_sku_result_do")
        @ApiField("scm_sku_result_do")
        private List<AlibabaWdkScmOrderCreateResponse.ScmSkuResultDo> scmSkuResultDo;

        public List<AlibabaWdkScmOrderCreateResponse.ScmSkuResultDo> getScmSkuResultDo()
        {
            return this.scmSkuResultDo;
        }

        public void setScmSkuResultDo(List<AlibabaWdkScmOrderCreateResponse.ScmSkuResultDo> scmSkuResultDo)
        {
            this.scmSkuResultDo = scmSkuResultDo;
        }
    }

    public static class Model
    {
        @ApiField("scmSkuResultDoList")
        private AlibabaWdkScmOrderCreateResponse.ScmSkuResultDoList scmSkuResultDoList;
        @ApiField("status")
        private Boolean status;
        @ApiField("wholesaleBillNo")
        private String wholesaleBillNo;

        public AlibabaWdkScmOrderCreateResponse.ScmSkuResultDoList getScmSkuResultDoList()
        {
            return this.scmSkuResultDoList;
        }

        public void setScmSkuResultDoList(AlibabaWdkScmOrderCreateResponse.ScmSkuResultDoList scmSkuResultDoList)
        {
            this.scmSkuResultDoList = scmSkuResultDoList;
        }

        public Boolean getStatus()
        {
            return this.status;
        }

        public void setStatus(Boolean status)
        {
            this.status = status;
        }

        public String getWholesaleBillNo()
        {
            return this.wholesaleBillNo;
        }

        public void setWholesaleBillNo(String wholesaleBillNo)
        {
            this.wholesaleBillNo = wholesaleBillNo;
        }
    }
}
