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

import com.dingtalk.api.response.CorpRoleUpdatelabelnameResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.role.updatelabelname request
 * 
 * @author top auto create
 * @since 1.0, 2018.02.04
 */
public class CorpRoleUpdatelabelnameRequest extends BaseTaobaoRequest<CorpRoleUpdatelabelnameResponse> {
	
	

	/** 
	* 角色标签id
	 */
	private Long labelId;

	/** 
	* 角色名信息
	 */
	private String labelName;

	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	}

	public Long getLabelId() {
		return this.labelId;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelName() {
		return this.labelName;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.role.updatelabelname";
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
		txtParams.put("label_id", this.labelId);
		txtParams.put("label_name", this.labelName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpRoleUpdatelabelnameResponse> getResponseClass() {
		return CorpRoleUpdatelabelnameResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(labelId, "labelId");
		RequestCheckUtils.checkNotEmpty(labelName, "labelName");
	}
	

}