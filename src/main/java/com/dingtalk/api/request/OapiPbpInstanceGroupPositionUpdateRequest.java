package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiPbpInstanceGroupPositionUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.group.position.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.09
 */
public class OapiPbpInstanceGroupPositionUpdateRequest extends BaseTaobaoRequest<OapiPbpInstanceGroupPositionUpdateResponse> {
	
	

	/** 
	* 同步参数
	 */
	private String syncParam;

	public void setSyncParam(String syncParam) {
		this.syncParam = syncParam;
	}

	public void setSyncParam(PunchGroupSyncPositionParam syncParam) {
		this.syncParam = new JSONWriter(false,false,true).write(syncParam);
	}

	public String getSyncParam() {
		return this.syncParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.pbp.instance.group.position.update";
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
		txtParams.put("sync_param", this.syncParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPbpInstanceGroupPositionUpdateResponse> getResponseClass() {
		return OapiPbpInstanceGroupPositionUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 新增位置列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PunchGroupPositionParam extends TaobaoObject {
		private static final long serialVersionUID = 5568771172976239988L;
		/**
		 * 位置唯一标识
		 */
		@ApiField("position_id")
		private String positionId;
		/**
		 * 位置名称
		 */
		@ApiField("position_name")
		private String positionName;
		/**
		 * 位置类型，如101表示B1
		 */
		@ApiField("position_type")
		private Long positionType;
	
		public String getPositionId() {
			return this.positionId;
		}
		public void setPositionId(String positionId) {
			this.positionId = positionId;
		}
		public String getPositionName() {
			return this.positionName;
		}
		public void setPositionName(String positionName) {
			this.positionName = positionName;
		}
		public Long getPositionType() {
			return this.positionType;
		}
		public void setPositionType(Long positionType) {
			this.positionType = positionType;
		}
	}
	
	/**
	 * 同步参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PunchGroupSyncPositionParam extends TaobaoObject {
		private static final long serialVersionUID = 5181882128247613799L;
		/**
		 * 新增位置列表
		 */
		@ApiListField("add_position_list")
		@ApiField("punch_group_position_param")
		private List<PunchGroupPositionParam> addPositionList;
		/**
		 * 业务唯一标识
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 业务实例唯一标识
		 */
		@ApiField("biz_inst_id")
		private String bizInstId;
		/**
		 * 删除位置列表
		 */
		@ApiListField("delete_position_list")
		@ApiField("punch_group_position_param")
		private List<PunchGroupPositionParam> deletePositionList;
		/**
		 * 打卡组唯一标识
		 */
		@ApiField("punch_group_id")
		private String punchGroupId;
	
		public List<PunchGroupPositionParam> getAddPositionList() {
			return this.addPositionList;
		}
		public void setAddPositionList(List<PunchGroupPositionParam> addPositionList) {
			this.addPositionList = addPositionList;
		}
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public String getBizInstId() {
			return this.bizInstId;
		}
		public void setBizInstId(String bizInstId) {
			this.bizInstId = bizInstId;
		}
		public List<PunchGroupPositionParam> getDeletePositionList() {
			return this.deletePositionList;
		}
		public void setDeletePositionList(List<PunchGroupPositionParam> deletePositionList) {
			this.deletePositionList = deletePositionList;
		}
		public String getPunchGroupId() {
			return this.punchGroupId;
		}
		public void setPunchGroupId(String punchGroupId) {
			this.punchGroupId = punchGroupId;
		}
	}
	

}