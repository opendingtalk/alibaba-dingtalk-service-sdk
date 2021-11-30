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
import com.dingtalk.api.response.OapiBlackboardCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.06.16
 */
public class OapiBlackboardCreateRequest extends BaseTaobaoRequest<OapiBlackboardCreateResponse> {
	
	

	/** 
	* 请求入参
	 */
	private String createRequest;

	public void setCreateRequest(String createRequest) {
		this.createRequest = createRequest;
	}

	public void setCreateRequest(OapiCreateBlackboardVo createRequest) {
		this.createRequest = new JSONWriter(false,false,true).write(createRequest);
	}

	public String getCreateRequest() {
		return this.createRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.blackboard.create";
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
		txtParams.put("create_request", this.createRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiBlackboardCreateResponse> getResponseClass() {
		return OapiBlackboardCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BlackboardReceiverOpenVo extends TaobaoObject {
		private static final long serialVersionUID = 5811244555425348933L;
		/**
		 * 接收部门id列表
		 */
		@ApiListField("deptid_list")
		@ApiField("number")
		private List<Long> deptidList;
		/**
		 * 接收人userId列表
		 */
		@ApiListField("userid_list")
		@ApiField("string")
		private List<String> useridList;
	
		public List<Long> getDeptidList() {
			return this.deptidList;
		}
		public void setDeptidList(List<Long> deptidList) {
			this.deptidList = deptidList;
		}
		public List<String> getUseridList() {
			return this.useridList;
		}
		public void setUseridList(List<String> useridList) {
			this.useridList = useridList;
		}
	}
	
	/**
	 * 请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiCreateBlackboardVo extends TaobaoObject {
		private static final long serialVersionUID = 3722578818229665196L;
		/**
		 * 公告作者
		 */
		@ApiField("author")
		private String author;
		/**
		 * 入参
		 */
		@ApiField("blackboard_receiver")
		private BlackboardReceiverOpenVo blackboardReceiver;
		/**
		 * 公告分类id，可以通过公告开放接口：（获取企业公告未删除分类列表）获取有效值
		 */
		@ApiField("category_id")
		private String categoryId;
		/**
		 * 公告内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 封面图,需要使用mediaId,可以通过钉钉开放接口：https:ding-doc.dingtalk.comdoc#serverapi2bcmg0i 上传图片获取mediaId
		 */
		@ApiField("coverpic_mediaid")
		private String coverpicMediaid;
		/**
		 * 是否发送应用内钉提醒
		 */
		@ApiField("ding")
		private Boolean ding;
		/**
		 * 操作人的userId(必须是公告管理员)
		 */
		@ApiField("operation_userid")
		private String operationUserid;
		/**
		 * 保密等级，仅支持以下值(0:普通公告，20：保密公告)
		 */
		@ApiField("private_level")
		private Long privateLevel;
		/**
		 * 公告是否置顶
		 */
		@ApiField("push_top")
		private Boolean pushTop;
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
		public BlackboardReceiverOpenVo getBlackboardReceiver() {
			return this.blackboardReceiver;
		}
		public void setBlackboardReceiver(BlackboardReceiverOpenVo blackboardReceiver) {
			this.blackboardReceiver = blackboardReceiver;
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
		public String getOperationUserid() {
			return this.operationUserid;
		}
		public void setOperationUserid(String operationUserid) {
			this.operationUserid = operationUserid;
		}
		public Long getPrivateLevel() {
			return this.privateLevel;
		}
		public void setPrivateLevel(Long privateLevel) {
			this.privateLevel = privateLevel;
		}
		public Boolean getPushTop() {
			return this.pushTop;
		}
		public void setPushTop(Boolean pushTop) {
			this.pushTop = pushTop;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	

}