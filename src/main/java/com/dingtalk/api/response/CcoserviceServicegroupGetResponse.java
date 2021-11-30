package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.ccoservice.servicegroup.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CcoserviceServicegroupGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6475814853984941141L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private ServiceConversationModel result;


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

	public void setResult(ServiceConversationModel result) {
		this.result = result;
	}
	public ServiceConversationModel getResult( ) {
		return this.result;
	}

	
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ServiceConversationModel extends TaobaoObject {
		private static final long serialVersionUID = 8336427678931487643L;
		/**
		 * conversationType
		 */
		@ApiField("conversation_type")
		private Long conversationType;
		/**
		 * ownerDingtalkId
		 */
		@ApiField("owner_dingtalk_id")
		private String ownerDingtalkId;
		/**
		 * ownerName
		 */
		@ApiField("owner_name")
		private String ownerName;
		/**
		 * ownerNick
		 */
		@ApiField("owner_nick")
		private String ownerNick;
		/**
		 * ownerUserid
		 */
		@ApiField("owner_userid")
		private String ownerUserid;
		/**
		 * title
		 */
		@ApiField("title")
		private String title;
		/**
		 * type
		 */
		@ApiField("type")
		private Long type;
	
		public Long getConversationType() {
			return this.conversationType;
		}
		public void setConversationType(Long conversationType) {
			this.conversationType = conversationType;
		}
		public String getOwnerDingtalkId() {
			return this.ownerDingtalkId;
		}
		public void setOwnerDingtalkId(String ownerDingtalkId) {
			this.ownerDingtalkId = ownerDingtalkId;
		}
		public String getOwnerName() {
			return this.ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public String getOwnerNick() {
			return this.ownerNick;
		}
		public void setOwnerNick(String ownerNick) {
			this.ownerNick = ownerNick;
		}
		public String getOwnerUserid() {
			return this.ownerUserid;
		}
		public void setOwnerUserid(String ownerUserid) {
			this.ownerUserid = ownerUserid;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	


}
