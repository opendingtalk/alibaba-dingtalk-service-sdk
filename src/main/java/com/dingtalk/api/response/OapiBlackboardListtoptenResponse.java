package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.listtopten response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiBlackboardListtoptenResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5125786339269599845L;

	/** 
	 * result
	 */
	@ApiListField("blackboard_list")
	@ApiField("oapi_blackboard_vo")
	private List<OapiBlackboardVo> blackboardList;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setBlackboardList(List<OapiBlackboardVo> blackboardList) {
		this.blackboardList = blackboardList;
	}
	public List<OapiBlackboardVo> getBlackboardList( ) {
		return this.blackboardList;
	}

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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiBlackboardVo extends TaobaoObject {
		private static final long serialVersionUID = 5492254428279796328L;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 跳转URL
		 */
		@ApiField("url")
		private String url;
	
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	


}
