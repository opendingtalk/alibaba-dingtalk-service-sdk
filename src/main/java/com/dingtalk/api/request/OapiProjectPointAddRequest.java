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

import com.dingtalk.api.response.OapiProjectPointAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.project.point.add request
 * 
 * @author top auto create
 * @since 1.0, 2021.08.09
 */
public class OapiProjectPointAddRequest extends BaseTaobaoRequest<OapiProjectPointAddResponse> {
	
	

	/** 
	* 增加积分的时间戳毫秒数，如果为空使用系统当前毫秒数
	 */
	private Long actionTime;

	/** 
	* 规则代码（可空）,如果不为空的话，score值使用ruleCode对应的score增加分数
	 */
	private String ruleCode;

	/** 
	* 规则名称
	 */
	private String ruleName;

	/** 
	* 本次增加积分：正数表示增加负数表示扣减
	 */
	private Long score;

	/** 
	* 业务ID（固定值，农村积分传7001）
	 */
	private Long tenantId;

	/** 
	* 用户id
	 */
	private String userid;

	/** 
	* 加积分的唯一幂等标志,建议使用UUID
	 */
	private String uuid;

	public void setActionTime(Long actionTime) {
		this.actionTime = actionTime;
	}

	public Long getActionTime() {
		return this.actionTime;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getScore() {
		return this.score;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUuid() {
		return this.uuid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.project.point.add";
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
		txtParams.put("action_time", this.actionTime);
		txtParams.put("rule_code", this.ruleCode);
		txtParams.put("rule_name", this.ruleName);
		txtParams.put("score", this.score);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		txtParams.put("uuid", this.uuid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProjectPointAddResponse> getResponseClass() {
		return OapiProjectPointAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actionTime, "actionTime");
		RequestCheckUtils.checkNotEmpty(ruleName, "ruleName");
		RequestCheckUtils.checkNotEmpty(score, "score");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
		RequestCheckUtils.checkNotEmpty(uuid, "uuid");
	}
	

}