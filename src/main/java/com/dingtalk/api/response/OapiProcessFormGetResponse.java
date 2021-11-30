package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.form.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessFormGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8736647526917292661L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private ProcessTopVo result;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(ProcessTopVo result) {
		this.result = result;
	}
	public ProcessTopVo getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 明细里需要统计的字段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentStatVo extends TaobaoObject {
		private static final long serialVersionUID = 3394848282341251628L;
		/**
		 * 组件id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 标题
		 */
		@ApiField("label")
		private String label;
		/**
		 * 单位
		 */
		@ApiField("unit")
		private String unit;
		/**
		 * 是否大写
		 */
		@ApiField("upper")
		private Boolean upper;
	
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
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public Boolean getUpper() {
			return this.upper;
		}
		public void setUpper(Boolean upper) {
			this.upper = upper;
		}
	}
	
	/**
	 * 联动对应的目标
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LinkageTargetVo extends TaobaoObject {
		private static final long serialVersionUID = 6387828499248177414L;
		/**
		 * 对应目标的行为
		 */
		@ApiField("behavior")
		private String behavior;
		/**
		 * 对应目标的id
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
	 * 明细里的表单联动属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BehaviorLinkageVo extends TaobaoObject {
		private static final long serialVersionUID = 2194531353778329883L;
		/**
		 * 联动对应的目标
		 */
		@ApiListField("targets")
		@ApiField("linkage_target_vo")
		private List<LinkageTargetVo> targets;
		/**
		 * 联动对应的单选组件选项
		 */
		@ApiField("value")
		private String value;
	
		public List<LinkageTargetVo> getTargets() {
			return this.targets;
		}
		public void setTargets(List<LinkageTargetVo> targets) {
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
	 * 组件属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentPropVo extends TaobaoObject {
		private static final long serialVersionUID = 8775453851111298439L;
		/**
		 * 考勤类型文案
		 */
		@ApiField("attend_type_label")
		private String attendTypeLabel;
		/**
		 * 明细里的表单联动属性
		 */
		@ApiListField("behavior_linkage")
		@ApiField("behavior_linkage_vo")
		private List<BehaviorLinkageVo> behaviorLinkage;
		/**
		 * 业务别名, 当组件属于业务套件的一部分时方便业务识别(DDBizSuite)
		 */
		@ApiField("biz_alias")
		private String bizAlias;
		/**
		 * 业务套件类型(DDBizSuite)
		 */
		@ApiField("biz_type")
		private String bizType;
		/**
		 * 套件内子组件可见性，key为label，value=false不可见
		 */
		@ApiField("child_field_visible")
		private String childFieldVisible;
		/**
		 * 是否可编辑
		 */
		@ApiField("disable")
		private Boolean disable;
		/**
		 * 是否开启时长
		 */
		@ApiField("duration")
		private Boolean duration;
		/**
		 * 时长文案
		 */
		@ApiField("duration_label")
		private String durationLabel;
		/**
		 * 关联表单属性
		 */
		@ApiField("fields_info")
		private String fieldsInfo;
		/**
		 * 时间格式
		 */
		@ApiField("format")
		private String format;
		/**
		 * id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 隐藏字段
		 */
		@ApiField("invisible")
		private Boolean invisible;
		/**
		 * 标题
		 */
		@ApiField("label")
		private String label;
		/**
		 * 是否参与打印(1表示不打印, 0表示打印)
		 */
		@ApiField("not_print")
		private String notPrint;
		/**
		 * 是否需要大写 默认是需要; 1:不需要大写, 空或者0:需要大写
		 */
		@ApiField("not_upper")
		private String notUpper;
		/**
		 * 选项列表
		 */
		@ApiListField("options")
		@ApiField("string")
		private List<String> options;
		/**
		 * 必填
		 */
		@ApiField("required")
		private Boolean required;
		/**
		 * 明细里需要统计的字段
		 */
		@ApiListField("stat_field")
		@ApiField("form_component_stat_vo")
		private List<FormComponentStatVo> statField;
	
		public String getAttendTypeLabel() {
			return this.attendTypeLabel;
		}
		public void setAttendTypeLabel(String attendTypeLabel) {
			this.attendTypeLabel = attendTypeLabel;
		}
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
		public String getBizType() {
			return this.bizType;
		}
		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
		public String getChildFieldVisible() {
			return this.childFieldVisible;
		}
		public void setChildFieldVisible(String childFieldVisible) {
			this.childFieldVisible = childFieldVisible;
		}
		public void setChildFieldVisibleString(String childFieldVisible) {
			this.childFieldVisible = childFieldVisible;
		}
		
		public Boolean getDisable() {
			return this.disable;
		}
		public void setDisable(Boolean disable) {
			this.disable = disable;
		}
		public Boolean getDuration() {
			return this.duration;
		}
		public void setDuration(Boolean duration) {
			this.duration = duration;
		}
		public String getDurationLabel() {
			return this.durationLabel;
		}
		public void setDurationLabel(String durationLabel) {
			this.durationLabel = durationLabel;
		}
		public String getFieldsInfo() {
			return this.fieldsInfo;
		}
		public void setFieldsInfo(String fieldsInfo) {
			this.fieldsInfo = fieldsInfo;
		}
		public String getFormat() {
			return this.format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Boolean getInvisible() {
			return this.invisible;
		}
		public void setInvisible(Boolean invisible) {
			this.invisible = invisible;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getNotPrint() {
			return this.notPrint;
		}
		public void setNotPrint(String notPrint) {
			this.notPrint = notPrint;
		}
		public String getNotUpper() {
			return this.notUpper;
		}
		public void setNotUpper(String notUpper) {
			this.notUpper = notUpper;
		}
		public List<String> getOptions() {
			return this.options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		public Boolean getRequired() {
			return this.required;
		}
		public void setRequired(Boolean required) {
			this.required = required;
		}
		public List<FormComponentStatVo> getStatField() {
			return this.statField;
		}
		public void setStatField(List<FormComponentStatVo> statField) {
			this.statField = statField;
		}
	}
	
	/**
	 * 子组件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponent2Vo extends TaobaoObject {
		private static final long serialVersionUID = 3711827232639927212L;
		/**
		 * 控件类型
		 */
		@ApiField("component_name")
		private String componentName;
		/**
		 * 组件属性
		 */
		@ApiField("props")
		private FormComponentPropVo props;
	
		public String getComponentName() {
			return this.componentName;
		}
		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}
		public FormComponentPropVo getProps() {
			return this.props;
		}
		public void setProps(FormComponentPropVo props) {
			this.props = props;
		}
	}
	
	/**
	 * 子组件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponent1Vo extends TaobaoObject {
		private static final long serialVersionUID = 8512535591711382945L;
		/**
		 * 子组件
		 */
		@ApiListField("children")
		@ApiField("form_component2_vo")
		private List<FormComponent2Vo> children;
		/**
		 * 控件类型
		 */
		@ApiField("component_name")
		private String componentName;
		/**
		 * 组件属性
		 */
		@ApiField("props")
		private FormComponentPropVo props;
	
		public List<FormComponent2Vo> getChildren() {
			return this.children;
		}
		public void setChildren(List<FormComponent2Vo> children) {
			this.children = children;
		}
		public String getComponentName() {
			return this.componentName;
		}
		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}
		public FormComponentPropVo getProps() {
			return this.props;
		}
		public void setProps(FormComponentPropVo props) {
			this.props = props;
		}
	}
	
	/**
	 * 表单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentVo extends TaobaoObject {
		private static final long serialVersionUID = 5644563498625999743L;
		/**
		 * 子组件
		 */
		@ApiListField("children")
		@ApiField("form_component1_vo")
		private List<FormComponent1Vo> children;
		/**
		 * 控件类型
		 */
		@ApiField("component_name")
		private String componentName;
		/**
		 * 是否为旧套件
		 */
		@ApiField("is_old_suite")
		private Boolean isOldSuite;
		/**
		 * 组件属性
		 */
		@ApiField("props")
		private FormComponentPropVo props;
	
		public List<FormComponent1Vo> getChildren() {
			return this.children;
		}
		public void setChildren(List<FormComponent1Vo> children) {
			this.children = children;
		}
		public String getComponentName() {
			return this.componentName;
		}
		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}
		public Boolean getIsOldSuite() {
			return this.isOldSuite;
		}
		public void setIsOldSuite(Boolean isOldSuite) {
			this.isOldSuite = isOldSuite;
		}
		public FormComponentPropVo getProps() {
			return this.props;
		}
		public void setProps(FormComponentPropVo props) {
			this.props = props;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessTopVo extends TaobaoObject {
		private static final long serialVersionUID = 8835366637678195342L;
		/**
		 * 表单列表
		 */
		@ApiListField("form_component_vos")
		@ApiField("form_component_vo")
		private List<FormComponentVo> formComponentVos;
		/**
		 * 是否开启手写签名
		 */
		@ApiField("hand_sign_enable")
		private Boolean handSignEnable;
		/**
		 * 图片地址
		 */
		@ApiField("icon_url")
		private String iconUrl;
		/**
		 * 模板名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 流程相关信息
		 */
		@ApiField("processConfig")
		private String processConfig;
	
		public List<FormComponentVo> getFormComponentVos() {
			return this.formComponentVos;
		}
		public void setFormComponentVos(List<FormComponentVo> formComponentVos) {
			this.formComponentVos = formComponentVos;
		}
		public Boolean getHandSignEnable() {
			return this.handSignEnable;
		}
		public void setHandSignEnable(Boolean handSignEnable) {
			this.handSignEnable = handSignEnable;
		}
		public String getIconUrl() {
			return this.iconUrl;
		}
		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getProcessConfig() {
			return this.processConfig;
		}
		public void setProcessConfig(String processConfig) {
			this.processConfig = processConfig;
		}
	}
	


}
