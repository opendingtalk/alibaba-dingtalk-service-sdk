package com.qimencloud.api.request;

import java.util.List;
import java.util.Map;

import com.qimencloud.api.response.MyXiaoxuanttTestResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.Constants;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;

/**
 * TOP API(QimenCloud): a80z6n2lov. request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.06
 */
public class MyXiaoxuanttTestRequest extends BaseTaobaoRequest<MyXiaoxuanttTestResponse> {
     


	/** 
	 * 编号
	 */
	private Long id;

	/** 
	* 商品
	 */
	private String items;

	/** 
	* 用户名
	 */
	private String name;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public void setItems(List<Item> items) {
		this.items = new JSONWriter(false,true).write(items);
	}

	public String getItems() {
		return this.items;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

     public String getApiMethodName() {
          return "my.xiaoxuantt.test";
     }

     private String topContentType = Constants.CONTENT_TYPE_FORM;

     public String getTopContentType() { return topContentType; }

     public void setTopContentType(String topContentType) {
     	this.topContentType = topContentType;
	 }

	 private String topResponseType = Constants.RESPONSE_TYPE_QIMEN;

     public String getTopResponseType() { return topResponseType; }

     public void setTopResponseType(String topResponseType) {
     	this.topResponseType = topResponseType;
	 }

	 private String topApiVersion = "3.0";

     public String getTopApiVersion() { return topApiVersion; }

     public void setTopApiVersion(String topApiVersion) {
     	this.topApiVersion = topApiVersion;
	 }

	 private String topApiCallType;

	public String getTopApiCallType() {
		return topApiCallType;
	}

	public void setTopApiCallType(String topApiCallType) {
		this.topApiCallType = topApiCallType;
	}

	private String topApiFormat = Constants.FORMAT_JSON2;

	public String getTopApiFormat() {
		return topApiFormat;
	}

	public void setTopApiFormat(String topApiFormat) {
		this.topApiFormat = topApiFormat;
	}

	private String topHttpMethod;

	public String getTopHttpMethod() {
		return topHttpMethod;
	}

	public void setTopHttpMethod(String topHttpMethod) {
		this.topHttpMethod = topHttpMethod;
	}

	public Map<String, String> getTextParams() {
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("items", this.items);
		txtParams.put("name", this.name);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
     
     public Class<MyXiaoxuanttTestResponse> getResponseClass() {
		return MyXiaoxuanttTestResponse.class;
	}

     public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(id, "id");
		RequestCheckUtils.checkObjectMaxListSize(items, 20, "items");
     }

	/**
 * 商品
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Item {

	/**
		 * 编号
		 */
		@ApiField("id")
		private String id;
		/**
		 * 价格
		 */
		@ApiField("price")
		private String price;
	

	public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}

}



}
