package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.globaldevicemode.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoDeviceGlobaldevicemodeQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2524461883482939593L;

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
	 * 扩展信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 返回数据
	 */
	@ApiListField("model")
	@ApiField("model_detail_resp")
	private List<ModelDetailResp> model;

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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(List<ModelDetailResp> model) {
		this.model = model;
	}
	public List<ModelDetailResp> getModel( ) {
		return this.model;
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
	 * 枚举List
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EnumTypeReq extends TaobaoObject {
		private static final long serialVersionUID = 5175345745794224158L;
		/**
		 * 枚举值描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 枚举值
		 */
		@ApiField("value")
		private String value;
	
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * bool类型List
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BoolTypeReq extends TaobaoObject {
		private static final long serialVersionUID = 6383311575193813238L;
		/**
		 * 描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * bool值
		 */
		@ApiField("value")
		private Long value;
	
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public Long getValue() {
			return this.value;
		}
		public void setValue(Long value) {
			this.value = value;
		}
	}
	
	/**
	 * json参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceParamResp extends TaobaoObject {
		private static final long serialVersionUID = 4264263533846872298L;
		/**
		 * bool类型List
		 */
		@ApiListField("bools")
		@ApiField("bool_type_req")
		private List<BoolTypeReq> bools;
		
		/**
		 * 描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 枚举List
		 */
		@ApiListField("enums")
		@ApiField("enum_type_req")
		private List<EnumTypeReq> enums;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 参数identifier
		 */
		@ApiField("identifier")
		private String identifier;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		
		/**
		 * 数值取值范围
		 */
		@ApiField("range")
		private String range;
		/**
		 * 字符长度
		 */
		@ApiField("string_len")
		private Long stringLen;
		/**
		 * 单位
		 */
		@ApiField("unit")
		private String unit;
		/**
		 * 单位名称
		 */
		@ApiField("unit_name")
		private String unitName;
	
		public List<BoolTypeReq> getBools() {
			return this.bools;
		}
		public void setBools(List<BoolTypeReq> bools) {
			this.bools = bools;
		}
		
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public List<EnumTypeReq> getEnums() {
			return this.enums;
		}
		public void setEnums(List<EnumTypeReq> enums) {
			this.enums = enums;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getIdentifier() {
			return this.identifier;
		}
		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getRange() {
			return this.range;
		}
		public void setRange(String range) {
			this.range = range;
		}
		public Long getStringLen() {
			return this.stringLen;
		}
		public void setStringLen(Long stringLen) {
			this.stringLen = stringLen;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public String getUnitName() {
			return this.unitName;
		}
		public void setUnitName(String unitName) {
			this.unitName = unitName;
		}
	}
	
	/**
	 * iot属性List
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IotPropertyList extends TaobaoObject {
		private static final long serialVersionUID = 2778135527835766729L;
		/**
		 * bool值List
		 */
		@ApiListField("bools")
		@ApiField("bool_type_req")
		private List<BoolTypeReq> bools;
		/**
		 * 常用值
		 */
		@ApiField("common_values")
		private String commonValues;
		
		/**
		 * 描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 枚举List
		 */
		@ApiListField("enums")
		@ApiField("enum_type_req")
		private List<EnumTypeReq> enums;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 属性identifier
		 */
		@ApiField("identifier")
		private String identifier;
		/**
		 * 是否数组
		 */
		@ApiField("if_array")
		private Boolean ifArray;
		/**
		 * 是否必填
		 */
		@ApiField("if_provital")
		private Boolean ifProvital;
		/**
		 * json参数
		 */
		@ApiListField("json_params")
		@ApiField("device_param_resp")
		private List<DeviceParamResp> jsonParams;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否需要check
		 */
		@ApiField("need_check")
		private Boolean needCheck;
		/**
		 * 精确度
		 */
		@ApiField("precise")
		private Long precise;
		/**
		 * 数值取值范围
		 */
		@ApiField("range")
		private String range;
		
		/**
		 * 字符串长度
		 */
		@ApiField("string_len")
		private Long stringLen;
		/**
		 * 单位
		 */
		@ApiField("unit")
		private String unit;
	
		public List<BoolTypeReq> getBools() {
			return this.bools;
		}
		public void setBools(List<BoolTypeReq> bools) {
			this.bools = bools;
		}
		public String getCommonValues() {
			return this.commonValues;
		}
		public void setCommonValues(String commonValues) {
			this.commonValues = commonValues;
		}
		
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public List<EnumTypeReq> getEnums() {
			return this.enums;
		}
		public void setEnums(List<EnumTypeReq> enums) {
			this.enums = enums;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getIdentifier() {
			return this.identifier;
		}
		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}
		public Boolean getIfArray() {
			return this.ifArray;
		}
		public void setIfArray(Boolean ifArray) {
			this.ifArray = ifArray;
		}
		public Boolean getIfProvital() {
			return this.ifProvital;
		}
		public void setIfProvital(Boolean ifProvital) {
			this.ifProvital = ifProvital;
		}
		public List<DeviceParamResp> getJsonParams() {
			return this.jsonParams;
		}
		public void setJsonParams(List<DeviceParamResp> jsonParams) {
			this.jsonParams = jsonParams;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getNeedCheck() {
			return this.needCheck;
		}
		public void setNeedCheck(Boolean needCheck) {
			this.needCheck = needCheck;
		}
		public Long getPrecise() {
			return this.precise;
		}
		public void setPrecise(Long precise) {
			this.precise = precise;
		}
		public String getRange() {
			return this.range;
		}
		public void setRange(String range) {
			this.range = range;
		}
		
		public Long getStringLen() {
			return this.stringLen;
		}
		public void setStringLen(Long stringLen) {
			this.stringLen = stringLen;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 工艺参数List
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PropertyDetailResp extends TaobaoObject {
		private static final long serialVersionUID = 6614512679248186255L;
		/**
		 * 布尔类型
		 */
		@ApiListField("bools")
		@ApiField("bool_type_req")
		private List<BoolTypeReq> bools;
		/**
		 * 常用值
		 */
		@ApiField("common_values")
		private String commonValues;
		
		/**
		 * 描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 枚举List
		 */
		@ApiListField("enums")
		@ApiField("enum_type_req")
		private List<EnumTypeReq> enums;
		/**
		 * 工艺参数id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 工艺参数identifier
		 */
		@ApiField("identifier")
		private String identifier;
		/**
		 * 是否数组
		 */
		@ApiField("if_array")
		private Boolean ifArray;
		/**
		 * 是否必填
		 */
		@ApiField("if_provital")
		private Boolean ifProvital;
		/**
		 * json类型
		 */
		@ApiListField("json_params")
		@ApiField("device_param_resp")
		private List<DeviceParamResp> jsonParams;
		/**
		 * 工艺参数名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否需要check
		 */
		@ApiField("need_check")
		private Boolean needCheck;
		/**
		 * 精确度
		 */
		@ApiField("precise")
		private Long precise;
		/**
		 * 数值取值范围
		 */
		@ApiField("range")
		private String range;
		
		/**
		 * 字符串长度
		 */
		@ApiField("string_len")
		private Long stringLen;
		/**
		 * 单位code
		 */
		@ApiField("unit")
		private String unit;
	
		public List<BoolTypeReq> getBools() {
			return this.bools;
		}
		public void setBools(List<BoolTypeReq> bools) {
			this.bools = bools;
		}
		public String getCommonValues() {
			return this.commonValues;
		}
		public void setCommonValues(String commonValues) {
			this.commonValues = commonValues;
		}
		
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public List<EnumTypeReq> getEnums() {
			return this.enums;
		}
		public void setEnums(List<EnumTypeReq> enums) {
			this.enums = enums;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getIdentifier() {
			return this.identifier;
		}
		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}
		public Boolean getIfArray() {
			return this.ifArray;
		}
		public void setIfArray(Boolean ifArray) {
			this.ifArray = ifArray;
		}
		public Boolean getIfProvital() {
			return this.ifProvital;
		}
		public void setIfProvital(Boolean ifProvital) {
			this.ifProvital = ifProvital;
		}
		public List<DeviceParamResp> getJsonParams() {
			return this.jsonParams;
		}
		public void setJsonParams(List<DeviceParamResp> jsonParams) {
			this.jsonParams = jsonParams;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getNeedCheck() {
			return this.needCheck;
		}
		public void setNeedCheck(Boolean needCheck) {
			this.needCheck = needCheck;
		}
		public Long getPrecise() {
			return this.precise;
		}
		public void setPrecise(Long precise) {
			this.precise = precise;
		}
		public String getRange() {
			return this.range;
		}
		public void setRange(String range) {
			this.range = range;
		}
		
		public Long getStringLen() {
			return this.stringLen;
		}
		public void setStringLen(Long stringLen) {
			this.stringLen = stringLen;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 返回数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ModelDetailResp extends TaobaoObject {
		private static final long serialVersionUID = 1841886699431477249L;
		/**
		 * 平均占地面积
		 */
		@ApiField("average_area")
		private Long averageArea;
		/**
		 * 设备类型名称
		 */
		@ApiField("device_type_name")
		private String deviceTypeName;
		/**
		 * 行业设备型号
		 */
		@ApiField("global_model_id")
		private String globalModelId;
		/**
		 * 行业设备型号id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * iot属性List
		 */
		@ApiListField("iot_property_list")
		@ApiField("iot_property_list")
		private List<IotPropertyList> iotPropertyList;
		/**
		 * modelCode
		 */
		@ApiField("model_code")
		private String modelCode;
		/**
		 * 行业设备型号名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 工序能力List
		 */
		@ApiListField("process_ability_list")
		@ApiField("string")
		private List<String> processAbilityList;
		/**
		 * 设备种类id
		 */
		@ApiField("process_category_id")
		private Long processCategoryId;
		/**
		 * 设备种类名称
		 */
		@ApiField("process_category_name")
		private String processCategoryName;
		/**
		 * 工艺参数List
		 */
		@ApiListField("process_param_list")
		@ApiField("property_detail_resp")
		private List<PropertyDetailResp> processParamList;
		/**
		 * 是否生产设备
		 */
		@ApiField("production")
		private Boolean production;
		/**
		 * 子设备类型code
		 */
		@ApiField("sub_type_code")
		private String subTypeCode;
		/**
		 * 设备类型
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 设备类型code
		 */
		@ApiField("type_code")
		private String typeCode;
		/**
		 * 版本
		 */
		@ApiField("version")
		private String version;
	
		public Long getAverageArea() {
			return this.averageArea;
		}
		public void setAverageArea(Long averageArea) {
			this.averageArea = averageArea;
		}
		public String getDeviceTypeName() {
			return this.deviceTypeName;
		}
		public void setDeviceTypeName(String deviceTypeName) {
			this.deviceTypeName = deviceTypeName;
		}
		public String getGlobalModelId() {
			return this.globalModelId;
		}
		public void setGlobalModelId(String globalModelId) {
			this.globalModelId = globalModelId;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public List<IotPropertyList> getIotPropertyList() {
			return this.iotPropertyList;
		}
		public void setIotPropertyList(List<IotPropertyList> iotPropertyList) {
			this.iotPropertyList = iotPropertyList;
		}
		public String getModelCode() {
			return this.modelCode;
		}
		public void setModelCode(String modelCode) {
			this.modelCode = modelCode;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getProcessAbilityList() {
			return this.processAbilityList;
		}
		public void setProcessAbilityList(List<String> processAbilityList) {
			this.processAbilityList = processAbilityList;
		}
		public Long getProcessCategoryId() {
			return this.processCategoryId;
		}
		public void setProcessCategoryId(Long processCategoryId) {
			this.processCategoryId = processCategoryId;
		}
		public String getProcessCategoryName() {
			return this.processCategoryName;
		}
		public void setProcessCategoryName(String processCategoryName) {
			this.processCategoryName = processCategoryName;
		}
		public List<PropertyDetailResp> getProcessParamList() {
			return this.processParamList;
		}
		public void setProcessParamList(List<PropertyDetailResp> processParamList) {
			this.processParamList = processParamList;
		}
		public Boolean getProduction() {
			return this.production;
		}
		public void setProduction(Boolean production) {
			this.production = production;
		}
		public String getSubTypeCode() {
			return this.subTypeCode;
		}
		public void setSubTypeCode(String subTypeCode) {
			this.subTypeCode = subTypeCode;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getTypeCode() {
			return this.typeCode;
		}
		public void setTypeCode(String typeCode) {
			this.typeCode = typeCode;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	}
	


}
