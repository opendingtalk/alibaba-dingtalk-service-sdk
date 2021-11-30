package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiCollectionFormCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.collection.form.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.06
 */
public class OapiCollectionFormCreateRequest extends BaseTaobaoRequest<OapiCollectionFormCreateResponse> {
	
	

	/** 
	* 根请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(SaveFormSchemaRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.collection.form.create";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCollectionFormCreateResponse> getResponseClass() {
		return OapiCollectionFormCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 可见范围
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessVisibleValueVo extends TaobaoObject {
		private static final long serialVersionUID = 5761292279467156618L;
		/**
		 * 类型
		 */
		@ApiField("visible_type")
		private Long visibleType;
		/**
		 * 值
		 */
		@ApiField("visible_value")
		private String visibleValue;
	
		public Long getVisibleType() {
			return this.visibleType;
		}
		public void setVisibleType(Long visibleType) {
			this.visibleType = visibleType;
		}
		public String getVisibleValue() {
			return this.visibleValue;
		}
		public void setVisibleValue(String visibleValue) {
			this.visibleValue = visibleValue;
		}
	}
	
	/**
	 * 表单设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormSchemaSettingVo extends TaobaoObject {
		private static final long serialVersionUID = 7214152365496281784L;
		/**
		 * 业务类型
		 */
		@ApiField("biz_type")
		private Long bizType;
		/**
		 * 填写结束时间循环表单的循环结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 表单类型
		 */
		@ApiField("form_type")
		private Long formType;
		/**
		 * 循环周期
		 */
		@ApiListField("loop_day_of_weeks")
		@ApiField("number")
		private List<Long> loopDayOfWeeks;
		/**
		 * 提醒时间
		 */
		@ApiField("loop_time")
		private String loopTime;
		/**
		 * 回复时间开关循环周期启用
		 */
		@ApiField("reply_time")
		private Boolean replyTime;
		/**
		 * 子来源
		 */
		@ApiField("subSource")
		private Long subSource;
	
		public Long getBizType() {
			return this.bizType;
		}
		public void setBizType(Long bizType) {
			this.bizType = bizType;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public Long getFormType() {
			return this.formType;
		}
		public void setFormType(Long formType) {
			this.formType = formType;
		}
		public List<Long> getLoopDayOfWeeks() {
			return this.loopDayOfWeeks;
		}
		public void setLoopDayOfWeeks(List<Long> loopDayOfWeeks) {
			this.loopDayOfWeeks = loopDayOfWeeks;
		}
		public String getLoopTime() {
			return this.loopTime;
		}
		public void setLoopTime(String loopTime) {
			this.loopTime = loopTime;
		}
		public Boolean getReplyTime() {
			return this.replyTime;
		}
		public void setReplyTime(Boolean replyTime) {
			this.replyTime = replyTime;
		}
		public Long getSubSource() {
			return this.subSource;
		}
		public void setSubSource(Long subSource) {
			this.subSource = subSource;
		}
	}
	
	/**
	 * 选项级联目标
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BehaviorTarget extends TaobaoObject {
		private static final long serialVersionUID = 8674539315685824393L;
		/**
		 * 行为
		 */
		@ApiField("behavior")
		private String behavior;
		/**
		 * 控件ID
		 */
		@ApiField("field_id")
		private String fieldId;
	
		public String getBehavior() {
			return this.behavior;
		}
		public void setBehavior(String behavior) {
			this.behavior = behavior;
		}
		public String getFieldId() {
			return this.fieldId;
		}
		public void setFieldId(String fieldId) {
			this.fieldId = fieldId;
		}
	}
	
	/**
	 * 选项级联属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BehaviorLinkageVo extends TaobaoObject {
		private static final long serialVersionUID = 5578183741156281616L;
		/**
		 * 选项级联目标
		 */
		@ApiListField("targets")
		@ApiField("behavior_target")
		private List<BehaviorTarget> targets;
		/**
		 * 值
		 */
		@ApiField("value")
		private String value;
	
		public List<BehaviorTarget> getTargets() {
			return this.targets;
		}
		public void setTargets(List<BehaviorTarget> targets) {
			this.targets = targets;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 带选项的组件的option
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ComponentPropOptionVo extends TaobaoObject {
		private static final long serialVersionUID = 3375355453549331115L;
		/**
		 * 名称
		 */
		@ApiField("key")
		private String key;
		/**
		 * 选项值
		 */
		@ApiField("value")
		private String value;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 矩阵表单组件列定义
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ComponentMatrixDefVo extends TaobaoObject {
		private static final long serialVersionUID = 6841336459911581385L;
		/**
		 * 别名
		 */
		@ApiField("alias")
		private String alias;
		/**
		 * 主键
		 */
		@ApiField("key")
		private String key;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
	
		public String getAlias() {
			return this.alias;
		}
		public void setAlias(String alias) {
			this.alias = alias;
		}
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 控件属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ComponentPropVo extends TaobaoObject {
		private static final long serialVersionUID = 1729825562753668297L;
		/**
		 * 选项级联属性
		 */
		@ApiListField("behavior_linkage")
		@ApiField("behavior_linkage_vo")
		private List<BehaviorLinkageVo> behaviorLinkage;
		/**
		 * 系统别名
		 */
		@ApiField("biz_alias")
		private String bizAlias;
		/**
		 * 矩阵表单组件列定义
		 */
		@ApiListField("cols")
		@ApiField("component_matrix_def_vo")
		private List<ComponentMatrixDefVo> cols;
		/**
		 * 控件id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 标签
		 */
		@ApiField("label")
		private String label;
		/**
		 * 带选项的组件的option
		 */
		@ApiListField("options")
		@ApiField("component_prop_option_vo")
		private List<ComponentPropOptionVo> options;
		/**
		 * 占位符
		 */
		@ApiField("placeholder")
		private String placeholder;
		/**
		 * 是否必填
		 */
		@ApiField("required")
		private Boolean required;
		/**
		 * 矩阵表单组件行定义
		 */
		@ApiListField("rows")
		@ApiField("component_matrix_def_vo")
		private List<ComponentMatrixDefVo> rows;
	
		public List<BehaviorLinkageVo> getBehaviorLinkage() {
			return this.behaviorLinkage;
		}
		public void setBehaviorLinkage(List<BehaviorLinkageVo> behaviorLinkage) {
			this.behaviorLinkage = behaviorLinkage;
		}
		public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public List<ComponentMatrixDefVo> getCols() {
			return this.cols;
		}
		public void setCols(List<ComponentMatrixDefVo> cols) {
			this.cols = cols;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public List<ComponentPropOptionVo> getOptions() {
			return this.options;
		}
		public void setOptions(List<ComponentPropOptionVo> options) {
			this.options = options;
		}
		public String getPlaceholder() {
			return this.placeholder;
		}
		public void setPlaceholder(String placeholder) {
			this.placeholder = placeholder;
		}
		public Boolean getRequired() {
			return this.required;
		}
		public void setRequired(Boolean required) {
			this.required = required;
		}
		public List<ComponentMatrixDefVo> getRows() {
			return this.rows;
		}
		public void setRows(List<ComponentMatrixDefVo> rows) {
			this.rows = rows;
		}
	}
	
	/**
	 * 控件数组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentVo extends TaobaoObject {
		private static final long serialVersionUID = 1331616733137134336L;
		/**
		 * 控件名称
		 */
		@ApiField("component_name")
		private String componentName;
		/**
		 * 控件属性
		 */
		@ApiField("props")
		private ComponentPropVo props;
	
		public String getComponentName() {
			return this.componentName;
		}
		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}
		public ComponentPropVo getProps() {
			return this.props;
		}
		public void setProps(ComponentPropVo props) {
			this.props = props;
		}
	}
	
	/**
	 * 控件对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormContentVo extends TaobaoObject {
		private static final long serialVersionUID = 6686144459834847842L;
		/**
		 * 控件数组
		 */
		@ApiListField("items")
		@ApiField("form_component_vo")
		private List<FormComponentVo> items;
	
		public List<FormComponentVo> getItems() {
			return this.items;
		}
		public void setItems(List<FormComponentVo> items) {
			this.items = items;
		}
	}
	
	/**
	 * 可识别是否加密的可见范围
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SwFormVisibleValueVo extends TaobaoObject {
		private static final long serialVersionUID = 1247949623638391181L;
		/**
		 * cid是否加密
		 */
		@ApiField("cid_encrypted")
		private Long cidEncrypted;
		/**
		 * 0部门 1人员 3 群
		 */
		@ApiField("visible_type")
		private Long visibleType;
		/**
		 * 可见范围的值
		 */
		@ApiField("visible_value")
		private String visibleValue;
	
		public Long getCidEncrypted() {
			return this.cidEncrypted;
		}
		public void setCidEncrypted(Long cidEncrypted) {
			this.cidEncrypted = cidEncrypted;
		}
		public Long getVisibleType() {
			return this.visibleType;
		}
		public void setVisibleType(Long visibleType) {
			this.visibleType = visibleType;
		}
		public String getVisibleValue() {
			return this.visibleValue;
		}
		public void setVisibleValue(String visibleValue) {
			this.visibleValue = visibleValue;
		}
	}
	
	/**
	 * 根请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SaveFormSchemaRequest extends TaobaoObject {
		private static final long serialVersionUID = 1585852547669762171L;
		/**
		 * 控件字符串
		 */
		@ApiField("content")
		private String content;
		/**
		 * 表单设置
		 */
		@ApiField("custom_setting")
		private FormSchemaSettingVo customSetting;
		/**
		 * 控件对象
		 */
		@ApiField("form_content")
		private FormContentVo formContent;
		/**
		 * 图标
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 提示
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 表单名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 可见范围
		 */
		@ApiListField("process_visible_list")
		@ApiField("process_visible_value_vo")
		private List<ProcessVisibleValueVo> processVisibleList;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 可识别是否加密的可见范围
		 */
		@ApiListField("visible_value_list")
		@ApiField("sw_form_visible_value_vo")
		private List<SwFormVisibleValueVo> visibleValueList;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public FormSchemaSettingVo getCustomSetting() {
			return this.customSetting;
		}
		public void setCustomSetting(FormSchemaSettingVo customSetting) {
			this.customSetting = customSetting;
		}
		public FormContentVo getFormContent() {
			return this.formContent;
		}
		public void setFormContent(FormContentVo formContent) {
			this.formContent = formContent;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<ProcessVisibleValueVo> getProcessVisibleList() {
			return this.processVisibleList;
		}
		public void setProcessVisibleList(List<ProcessVisibleValueVo> processVisibleList) {
			this.processVisibleList = processVisibleList;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public List<SwFormVisibleValueVo> getVisibleValueList() {
			return this.visibleValueList;
		}
		public void setVisibleValueList(List<SwFormVisibleValueVo> visibleValueList) {
			this.visibleValueList = visibleValueList;
		}
	}
	

}