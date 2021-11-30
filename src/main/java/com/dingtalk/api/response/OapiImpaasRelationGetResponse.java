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

	private static final long serialVersionUID = 5196224892482853994L;

	/** 
	 * 错误码  -1 系统异常 40035 参数错误
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 关系查询出参
	 */
	@ApiListField("result")
	@ApiField("relation_model")
	private List<RelationModel> result;

	/** 
	 * 接口是否调用成功
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
	 * 关系查询出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RelationModel extends TaobaoObject {
		private static final long serialVersionUID = 5136338179639948936L;
		/**
		 * 关系有效的开始时间（毫秒）
		 */
		@ApiField("begin_time")
		private Long beginTime;
		/**
		 * 接受者的im的唯一id
		 */
		@ApiField("dst_im_openid")
		private String dstImOpenid;
		/**
		 * 关系有效的结束时间（毫秒）
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 发送者的im的唯一id
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
