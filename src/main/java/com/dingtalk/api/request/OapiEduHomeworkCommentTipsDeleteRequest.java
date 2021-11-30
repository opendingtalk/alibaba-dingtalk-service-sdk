package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiEduHomeworkCommentTipsDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.comment.tips.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.03
 */
public class OapiEduHomeworkCommentTipsDeleteRequest extends BaseTaobaoRequest<OapiEduHomeworkCommentTipsDeleteResponse> {
	
	

	/** 
	* 业务编码
	 */
	private String bizCode;

	/** 
	* 评语ID列表
	 */
	private String tipIds;

	/** 
	* 老师userid
	 */
	private String userid;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setTipIds(String tipIds) {
		this.tipIds = tipIds;
	}

	public String getTipIds() {
		return this.tipIds;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.comment.tips.delete";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("tip_ids", this.tipIds);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkCommentTipsDeleteResponse> getResponseClass() {
		return OapiEduHomeworkCommentTipsDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(tipIds, 999, "tipIds");
	}
	

}