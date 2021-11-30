package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.circle.tag.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkspaceCircleTagCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5847919938811371827L;

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
	 * 返回结果数据
	 */
	@ApiField("result")
	private FvPostTagOpenDto result;

	/** 
	 * 请求是否成功
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

	public void setResult(FvPostTagOpenDto result) {
		this.result = result;
	}
	public FvPostTagOpenDto getResult( ) {
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
	 * 返回结果数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FvPostTagOpenDto extends TaobaoObject {
		private static final long serialVersionUID = 1711576276848972176L;
		/**
		 * 话题名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 话题Id
		 */
		@ApiField("tag_id")
		private Long tagId;
		/**
		 * 话题类型
		 */
		@ApiField("tag_type")
		private Long tagType;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getTagId() {
			return this.tagId;
		}
		public void setTagId(Long tagId) {
			this.tagId = tagId;
		}
		public Long getTagType() {
			return this.tagType;
		}
		public void setTagType(Long tagType) {
			this.tagType = tagType;
		}
	}
	


}
