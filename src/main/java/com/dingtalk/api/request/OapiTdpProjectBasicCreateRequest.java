package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiTdpProjectBasicCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.project.basic.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.31
 */
public class OapiTdpProjectBasicCreateRequest extends BaseTaobaoRequest<OapiTdpProjectBasicCreateResponse> {
	
	

	/** 
	* 微应用agentId
	 */
	private Long microappAgentId;

	/** 
	* 操作者id
	 */
	private String operatorUserid;

	/** 
	* 项目信息
	 */
	private String project;

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}

	public String getOperatorUserid() {
		return this.operatorUserid;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public void setProject(ProjectCreate project) {
		this.project = new JSONWriter(false,false,true).write(project);
	}

	public String getProject() {
		return this.project;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.tdp.project.basic.create";
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
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("operator_userid", this.operatorUserid);
		txtParams.put("project", this.project);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiTdpProjectBasicCreateResponse> getResponseClass() {
		return OapiTdpProjectBasicCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operatorUserid, "operatorUserid");
	}
	
	/**
	 * 项目信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProjectCreate extends TaobaoObject {
		private static final long serialVersionUID = 5889867569117996192L;
		/**
		 * 创建者id, 传staffId（工号）
		 */
		@ApiField("creator_userid")
		private String creatorUserid;
		/**
		 * 项目描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 修改时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 项目图标
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 项目类型identifier
		 */
		@ApiField("identifier")
		private String identifier;
		/**
		 * 是否归档
		 */
		@ApiField("is_archived")
		private Boolean isArchived;
		/**
		 * 是否放入回收站
		 */
		@ApiField("is_recycled")
		private Boolean isRecycled;
		/**
		 * 更新者id, 传staffId（工号）
		 */
		@ApiField("modifier_userid")
		private String modifierUserid;
		/**
		 * 项目名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 父项目ID
		 */
		@ApiField("parent_id")
		private String parentId;
		/**
		 * 来源
		 */
		@ApiField("source")
		private String source;
		/**
		 * 此字段用于数据迁移的场景，表示项目在源系统中的唯一ID，ISV接入时必填，用于跳转至各自的项目详情页
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 项目可见范围
		 */
		@ApiField("visibility")
		private String visibility;
	
		public String getCreatorUserid() {
			return this.creatorUserid;
		}
		public void setCreatorUserid(String creatorUserid) {
			this.creatorUserid = creatorUserid;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public String getIdentifier() {
			return this.identifier;
		}
		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}
		public Boolean getIsArchived() {
			return this.isArchived;
		}
		public void setIsArchived(Boolean isArchived) {
			this.isArchived = isArchived;
		}
		public Boolean getIsRecycled() {
			return this.isRecycled;
		}
		public void setIsRecycled(Boolean isRecycled) {
			this.isRecycled = isRecycled;
		}
		public String getModifierUserid() {
			return this.modifierUserid;
		}
		public void setModifierUserid(String modifierUserid) {
			this.modifierUserid = modifierUserid;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getParentId() {
			return this.parentId;
		}
		public void setParentId(String parentId) {
			this.parentId = parentId;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public String getVisibility() {
			return this.visibility;
		}
		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}
	}
	

}