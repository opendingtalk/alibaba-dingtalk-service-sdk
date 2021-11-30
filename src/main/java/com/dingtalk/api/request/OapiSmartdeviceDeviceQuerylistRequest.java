package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiSmartdeviceDeviceQuerylistResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.device.querylist request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.28
 */
public class OapiSmartdeviceDeviceQuerylistRequest extends BaseTaobaoRequest<OapiSmartdeviceDeviceQuerylistResponse> {
	
	

	/** 
	* 列表查询对象
	 */
	private String pageQueryVo;

	public void setPageQueryVo(String pageQueryVo) {
		this.pageQueryVo = pageQueryVo;
	}

	public void setPageQueryVo(PageQueryVo pageQueryVo) {
		this.pageQueryVo = new JSONWriter(false,false,true).write(pageQueryVo);
	}

	public String getPageQueryVo() {
		return this.pageQueryVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.device.querylist";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("page_query_vo", this.pageQueryVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceDeviceQuerylistResponse> getResponseClass() {
		return OapiSmartdeviceDeviceQuerylistResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 列表查询对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageQueryVo extends TaobaoObject {
		private static final long serialVersionUID = 4812697231158373868L;
		/**
		 * 游标地址,第一页填0
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 产品唯一编码
		 */
		@ApiField("pk")
		private String pk;
		/**
		 * 分页大小，最大20
		 */
		@ApiField("size")
		private Long size;
	
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public String getPk() {
			return this.pk;
		}
		public void setPk(String pk) {
			this.pk = pk;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
	}
	

}