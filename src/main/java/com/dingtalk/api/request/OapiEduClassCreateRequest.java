package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiEduClassCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.class.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.05.31
 */
public class OapiEduClassCreateRequest extends BaseTaobaoRequest<OapiEduClassCreateResponse> {
	
	

	/** 
	* 班级
	 */
	private String openClass;

	/** 
	* 钉钉企业管理员
	 */
	private String operator;

	/** 
	* 年级id
	 */
	private Long superId;

	public void setOpenClass(String openClass) {
		this.openClass = openClass;
	}

	public void setOpenClass(OpenClass openClass) {
		this.openClass = new JSONWriter(false,false,true).write(openClass);
	}

	public String getOpenClass() {
		return this.openClass;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setSuperId(Long superId) {
		this.superId = superId;
	}

	public Long getSuperId() {
		return this.superId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.class.create";
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
		txtParams.put("open_class", this.openClass);
		txtParams.put("operator", this.operator);
		txtParams.put("super_id", this.superId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduClassCreateResponse> getResponseClass() {
		return OapiEduClassCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operator, "operator");
		RequestCheckUtils.checkNotEmpty(superId, "superId");
	}
	
	/**
	 * 班级
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenClass extends TaobaoObject {
		private static final long serialVersionUID = 8613487333245894997L;
		/**
		 * 班级level
		 */
		@ApiField("class_level")
		private Long classLevel;
		/**
		 * 班级名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 班级nick
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 是否只展现nick
		 */
		@ApiField("only_use_nick")
		private String onlyUseNick;
	
		public Long getClassLevel() {
			return this.classLevel;
		}
		public void setClassLevel(Long classLevel) {
			this.classLevel = classLevel;
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
		public String getOnlyUseNick() {
			return this.onlyUseNick;
		}
		public void setOnlyUseNick(String onlyUseNick) {
			this.onlyUseNick = onlyUseNick;
		}
	}
	

}