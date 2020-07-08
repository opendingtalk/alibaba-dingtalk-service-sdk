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
import com.dingtalk.api.response.OapiTdpProjectBasicUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.project.basic.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.31
 */
public class OapiTdpProjectBasicUpdateRequest extends BaseTaobaoRequest<OapiTdpProjectBasicUpdateResponse> {
	
	

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

	/** 
	* 项目ID
	 */
	private String projectId;

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

	public void setProject(ProjectUpdate project) {
		this.project = new JSONWriter(false,false,true).write(project);
	}

	public String getProject() {
		return this.project;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.tdp.project.basic.update";
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
		txtParams.put("project_id", this.projectId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiTdpProjectBasicUpdateResponse> getResponseClass() {
		return OapiTdpProjectBasicUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(projectId, "projectId");
	}
	
	/**
	 * 项目信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProjectUpdate extends TaobaoObject {
		private static final long serialVersionUID = 2827349127721365355L;
		/**
		 * 项目描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 更新时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 项目图标
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 项目类型
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
		 * 项目可见范围
		 */
		@ApiField("visibility")
		private String visibility;
	
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
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
		public String getVisibility() {
			return this.visibility;
		}
		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}
	}
	

}