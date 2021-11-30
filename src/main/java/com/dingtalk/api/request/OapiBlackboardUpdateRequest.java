package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiBlackboardUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.29
 */
public class OapiBlackboardUpdateRequest extends BaseTaobaoRequest<OapiBlackboardUpdateResponse> {
	
	

	/** 
	* 请求入参
	 */
	private String updateRequest;

	public void setUpdateRequest(String updateRequest) {
		this.updateRequest = updateRequest;
	}

	public void setUpdateRequest(OapiUpdateBlackboardVo updateRequest) {
		this.updateRequest = new JSONWriter(false,false,true).write(updateRequest);
	}

	public String getUpdateRequest() {
		return this.updateRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.blackboard.update";
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
		txtParams.put("update_request", this.updateRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiBlackboardUpdateResponse> getResponseClass() {
		return OapiBlackboardUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiUpdateBlackboardVo extends TaobaoObject {
		private static final long serialVersionUID = 4559133593681163531L;
		/**
		 * 公告作者
		 */
		@ApiField("author")
		private String author;
		/**
		 * 公告id
		 */
		@ApiField("blackboard_id")
		private String blackboardId;
		/**
		 * 公告分类id，可以通过https:oapi.dingtalk.comblackboardcategoryget获取有效值
		 */
		@ApiField("category_id")
		private String categoryId;
		/**
		 * 公告内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 封面图,需要使用mediaId,可以通过https:oapi.dingtalk.commediaupload上传图片获取mediaId
		 */
		@ApiField("coverpic_mediaid")
		private String coverpicMediaid;
		/**
		 * 是否发送应用内钉提醒
		 */
		@ApiField("ding")
		private Boolean ding;
		/**
		 * 修改后是否再次通知接收人
		 */
		@ApiField("notify")
		private Boolean notify;
		/**
		 * 操作人userId(必须是公告管理员)
		 */
		@ApiField("operation_userid")
		private String operationUserid;
		/**
		 * 公告标题
		 */
		@ApiField("title")
		private String title;
	
		public String getAuthor() {
			return this.author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getBlackboardId() {
			return this.blackboardId;
		}
		public void setBlackboardId(String blackboardId) {
			this.blackboardId = blackboardId;
		}
		public String getCategoryId() {
			return this.categoryId;
		}
		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getCoverpicMediaid() {
			return this.coverpicMediaid;
		}
		public void setCoverpicMediaid(String coverpicMediaid) {
			this.coverpicMediaid = coverpicMediaid;
		}
		public Boolean getDing() {
			return this.ding;
		}
		public void setDing(Boolean ding) {
			this.ding = ding;
		}
		public Boolean getNotify() {
			return this.notify;
		}
		public void setNotify(Boolean notify) {
			this.notify = notify;
		}
		public String getOperationUserid() {
			return this.operationUserid;
		}
		public void setOperationUserid(String operationUserid) {
			this.operationUserid = operationUserid;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	

}