package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiEduCardCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.card.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.31
 */
public class OapiEduCardCreateRequest extends BaseTaobaoRequest<OapiEduCardCreateResponse> {
	
	

	/** 
	* 参数
	 */
	private String opencardcreateparam;

	public void setOpencardcreateparam(String opencardcreateparam) {
		this.opencardcreateparam = opencardcreateparam;
	}

	public void setOpencardcreateparam(OpenCardCreateParam opencardcreateparam) {
		this.opencardcreateparam = new JSONWriter(false,false,true).write(opencardcreateparam);
	}

	public String getOpencardcreateparam() {
		return this.opencardcreateparam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.card.create";
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
		txtParams.put("opencardcreateparam", this.opencardcreateparam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCardCreateResponse> getResponseClass() {
		return OapiEduCardCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 卡片的具体信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCreateDetailItem extends TaobaoObject {
		private static final long serialVersionUID = 7568475628533514178L;
		/**
		 * 是否可以补卡
		 */
		@ApiField("can_reissue_card")
		private Boolean canReissueCard;
		/**
		 * 打卡周期
		 */
		@ApiField("card_cycle")
		private Long cardCycle;
		/**
		 * 打卡频次的设置?"cardFrequency":[  ?????????? 1,周天  ?????????? 2,周一  ?????????? 3,周二  ?????????? 4,周三  ?????????? 5,周四  ?????????? 6,周五  ?????????? 7周六  ???????]
		 */
		@ApiListField("card_frequency")
		@ApiField("number")
		private List<Long> cardFrequency;
		/**
		 * 用于记录每天打卡规则
		 */
		@ApiListField("card_rule_Item_paramlist")
		@ApiField("json")
		private List<String> cardRuleItemParamlist;
		/**
		 * 班级Id列表
		 */
		@ApiListField("class_ids")
		@ApiField("string")
		private List<String> classIds;
		/**
		 * 班级名称列表（与ID 列表一一对应）
		 */
		@ApiListField("class_names")
		@ApiField("string")
		private List<String> classNames;
		/**
		 * 指定人发布打卡 人员列表{ ????????????"378537900":[ 班级 ????????????????{ ????????????????????"stuId":"15953231155863104", ????????????????????"stuName":"aa" ????????????????}... ???????????????? ????????????] ????????}
		 */
		@ApiField("class_selected_students")
		private String classSelectedStudents;
		/**
		 * 打卡内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 打卡开始时间
		 */
		@ApiField("effect_date")
		private Date effectDate;
		/**
		 * 上传相册，图片，录音，盯盘的信息
		 */
		@ApiField("medias")
		private String medias;
		/**
		 * 是否需要计量
		 */
		@ApiField("need_metering")
		private String needMetering;
		/**
		 * 提醒的小时
		 */
		@ApiField("remind_hour")
		private Long remindHour;
		/**
		 * 提醒分钟设置
		 */
		@ApiField("remind_minute")
		private Long remindMinute;
		/**
		 * 选择的角色
		 */
		@ApiField("target_role")
		private String targetRole;
		/**
		 * 模板ID
		 */
		@ApiField("template_id")
		private Long templateId;
		/**
		 * 打卡名称
		 */
		@ApiField("title")
		private String title;
		/**
		 * 计量单位
		 */
		@ApiField("unit_of_measurement")
		private String unitOfMeasurement;
	
		public Boolean getCanReissueCard() {
			return this.canReissueCard;
		}
		public void setCanReissueCard(Boolean canReissueCard) {
			this.canReissueCard = canReissueCard;
		}
		public Long getCardCycle() {
			return this.cardCycle;
		}
		public void setCardCycle(Long cardCycle) {
			this.cardCycle = cardCycle;
		}
		public List<Long> getCardFrequency() {
			return this.cardFrequency;
		}
		public void setCardFrequency(List<Long> cardFrequency) {
			this.cardFrequency = cardFrequency;
		}
		public List<String> getCardRuleItemParamlist() {
			return this.cardRuleItemParamlist;
		}
		public void setCardRuleItemParamlist(List<String> cardRuleItemParamlist) {
			this.cardRuleItemParamlist = cardRuleItemParamlist;
		}
		public List<String> getClassIds() {
			return this.classIds;
		}
		public void setClassIds(List<String> classIds) {
			this.classIds = classIds;
		}
		public List<String> getClassNames() {
			return this.classNames;
		}
		public void setClassNames(List<String> classNames) {
			this.classNames = classNames;
		}
		public String getClassSelectedStudents() {
			return this.classSelectedStudents;
		}
		public void setClassSelectedStudents(String classSelectedStudents) {
			this.classSelectedStudents = classSelectedStudents;
		}
		public void setClassSelectedStudentsString(String classSelectedStudents) {
			this.classSelectedStudents = classSelectedStudents;
		}
		
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Date getEffectDate() {
			return this.effectDate;
		}
		public void setEffectDate(Date effectDate) {
			this.effectDate = effectDate;
		}
		public String getMedias() {
			return this.medias;
		}
		public void setMedias(String medias) {
			this.medias = medias;
		}
		public String getNeedMetering() {
			return this.needMetering;
		}
		public void setNeedMetering(String needMetering) {
			this.needMetering = needMetering;
		}
		public Long getRemindHour() {
			return this.remindHour;
		}
		public void setRemindHour(Long remindHour) {
			this.remindHour = remindHour;
		}
		public Long getRemindMinute() {
			return this.remindMinute;
		}
		public void setRemindMinute(Long remindMinute) {
			this.remindMinute = remindMinute;
		}
		public String getTargetRole() {
			return this.targetRole;
		}
		public void setTargetRole(String targetRole) {
			this.targetRole = targetRole;
		}
		public Long getTemplateId() {
			return this.templateId;
		}
		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUnitOfMeasurement() {
			return this.unitOfMeasurement;
		}
		public void setUnitOfMeasurement(String unitOfMeasurement) {
			this.unitOfMeasurement = unitOfMeasurement;
		}
	}
	
	/**
	 * 参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCardCreateParam extends TaobaoObject {
		private static final long serialVersionUID = 7512963622717829849L;
		/**
		 * 业务code
		 */
		@ApiField("card_bizcode")
		private String cardBizcode;
		/**
		 * 卡片的具体信息
		 */
		@ApiField("data")
		private OpenCreateDetailItem data;
		/**
		 * 创建打卡的请求ID
		 */
		@ApiField("identifier")
		private String identifier;
		/**
		 * 前端版本
		 */
		@ApiField("jsversion")
		private Long jsversion;
		/**
		 * 内容来源,需要注册
		 */
		@ApiField("sourcetype")
		private String sourcetype;
		/**
		 * 当前登录的 staffId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCardBizcode() {
			return this.cardBizcode;
		}
		public void setCardBizcode(String cardBizcode) {
			this.cardBizcode = cardBizcode;
		}
		public OpenCreateDetailItem getData() {
			return this.data;
		}
		public void setData(OpenCreateDetailItem data) {
			this.data = data;
		}
		public String getIdentifier() {
			return this.identifier;
		}
		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}
		public Long getJsversion() {
			return this.jsversion;
		}
		public void setJsversion(Long jsversion) {
			this.jsversion = jsversion;
		}
		public String getSourcetype() {
			return this.sourcetype;
		}
		public void setSourcetype(String sourcetype) {
			this.sourcetype = sourcetype;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}