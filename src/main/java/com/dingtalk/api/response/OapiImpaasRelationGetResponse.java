package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.relation.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasRelationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5785175532614371337L;

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
	@ApiListField("result")
	@ApiField("relation_model")
	private List<RelationModel> result;

	/** 
	 * success
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

	public void setResult(List<RelationModel> result) {
		this.result = result;
	}
	public List<RelationModel> getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RelationModel extends TaobaoObject {
		private static final long serialVersionUID = 8445848376827856114L;
		/**
		 * beginTime
		 */
		@ApiField("begin_time")
		private Long beginTime;
		/**
		 * dstImOpenid
		 */
		@ApiField("dst_im_openid")
		private String dstImOpenid;
		/**
		 * endTime
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * srcImOpenid
		 */
		@ApiField("src_im_openid")
		private String srcImOpenid;
	
		public Long getBeginTime() {
			return this.beginTime;
		}
		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}
		public String getDstImOpenid() {
			return this.dstImOpenid;
		}
		public void setDstImOpenid(String dstImOpenid) {
			this.dstImOpenid = dstImOpenid;
		}
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public String getSrcImOpenid() {
			return this.srcImOpenid;
		}
		public void setSrcImOpenid(String srcImOpenid) {
			this.srcImOpenid = srcImOpenid;
		}
	}
	


}
