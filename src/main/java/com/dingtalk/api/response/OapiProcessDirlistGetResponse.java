package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.dirlist.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessDirlistGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5589912472551876554L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 分组信息列表
	 */
	@ApiListField("result")
	@ApiField("result")
	private List<Result> result;

	/** 
	 * 系统状态
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

	public void setResult(List<Result> result) {
		this.result = result;
	}
	public List<Result> getResult( ) {
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
	 * 分组信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3674711247377348325L;
		/**
		 * 分组id
		 */
		@ApiField("dir_id")
		private String dirId;
		/**
		 * 分组名称
		 */
		@ApiField("dir_name")
		private String dirName;
	
		public String getDirId() {
			return this.dirId;
		}
		public void setDirId(String dirId) {
			this.dirId = dirId;
		}
		public String getDirName() {
			return this.dirName;
		}
		public void setDirName(String dirName) {
			this.dirName = dirName;
		}
	}
	


}
