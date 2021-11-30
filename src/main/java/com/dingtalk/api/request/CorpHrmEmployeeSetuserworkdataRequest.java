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
import com.dingtalk.api.response.CorpHrmEmployeeSetuserworkdataResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.hrm.employee.setuserworkdata request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpHrmEmployeeSetuserworkdataRequest extends BaseTaobaoRequest<CorpHrmEmployeeSetuserworkdataResponse> {
	
	

	/** 
	* 员工信息对象，被操作人userid是必填
	 */
	private String hrmApiUserDataModel;

	/** 
	* 操作人userid，必须是拥有被操作人操作权限的管理员userid
	 */
	private String opUserid;

	public void setHrmApiUserDataModel(String hrmApiUserDataModel) {
		this.hrmApiUserDataModel = hrmApiUserDataModel;
	}

	public void setHrmApiUserDataModel(HrmApiUserDataModel hrmApiUserDataModel) {
		this.hrmApiUserDataModel = new JSONWriter(false,true).write(hrmApiUserDataModel);
	}

	public String getHrmApiUserDataModel() {
		return this.hrmApiUserDataModel;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.hrm.employee.setuserworkdata";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("hrm_api_user_data_model", this.hrmApiUserDataModel);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpHrmEmployeeSetuserworkdataResponse> getResponseClass() {
		return CorpHrmEmployeeSetuserworkdataResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	
	/**
	 * 员工信息对象，被操作人userid是必填
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HrmApiUserDataModel extends TaobaoObject {
		private static final long serialVersionUID = 2557447982931842836L;
		/**
		 * 数据项描述信息
		 */
		@ApiField("data_desc")
		private String dataDesc;
		/**
		 * 数据值,可以为数值或者字符串
		 */
		@ApiField("data_value")
		private String dataValue;
		/**
		 * 被操作人userid
		 */
		@ApiField("userid")
		private String userid;
	
		public String getDataDesc() {
			return this.dataDesc;
		}
		public void setDataDesc(String dataDesc) {
			this.dataDesc = dataDesc;
		}
		public String getDataValue() {
			return this.dataValue;
		}
		public void setDataValue(String dataValue) {
			this.dataValue = dataValue;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}