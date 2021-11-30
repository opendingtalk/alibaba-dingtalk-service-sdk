package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hire.job.queryjobids response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiHireJobQueryjobidsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1448392368455891233L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 职位标识列表
	 */
	@ApiListField("job_ids")
	@ApiField("string")
	private List<String> jobIds;

	/** 
	 * 是否成功
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

	public void setJobIds(List<String> jobIds) {
		this.jobIds = jobIds;
	}
	public List<String> getJobIds( ) {
		return this.jobIds;
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
	


}
