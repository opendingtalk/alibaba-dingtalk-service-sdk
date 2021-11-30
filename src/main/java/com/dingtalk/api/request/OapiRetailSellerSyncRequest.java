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
import com.dingtalk.api.response.OapiRetailSellerSyncResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.seller.sync request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.03
 */
public class OapiRetailSellerSyncRequest extends BaseTaobaoRequest<OapiRetailSellerSyncResponse> {
	
	

	/** 
	* 卖家信息
	 */
	private String sellerParam;

	/** 
	* staffId
	 */
	private String userid;

	public void setSellerParam(String sellerParam) {
		this.sellerParam = sellerParam;
	}

	public void setSellerParam(SellerParam sellerParam) {
		this.sellerParam = new JSONWriter(false,false,true).write(sellerParam);
	}

	public String getSellerParam() {
		return this.sellerParam;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.retail.seller.sync";
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
		txtParams.put("seller_param", this.sellerParam);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRetailSellerSyncResponse> getResponseClass() {
		return OapiRetailSellerSyncResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 卖家信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SellerParam extends TaobaoObject {
		private static final long serialVersionUID = 6395219386681682135L;
		/**
		 * 操作类型
		 */
		@ApiField("action_type")
		private String actionType;
		/**
		 * 手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 商家名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 卖家ID
		 */
		@ApiField("seller_id")
		private Long sellerId;
		/**
		 * 开店来源
		 */
		@ApiField("source")
		private String source;
		/**
		 * 原始手机号
		 */
		@ApiField("src_mobile")
		private String srcMobile;
	
		public String getActionType() {
			return this.actionType;
		}
		public void setActionType(String actionType) {
			this.actionType = actionType;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public Long getSellerId() {
			return this.sellerId;
		}
		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getSrcMobile() {
			return this.srcMobile;
		}
		public void setSrcMobile(String srcMobile) {
			this.srcMobile = srcMobile;
		}
	}
	

}