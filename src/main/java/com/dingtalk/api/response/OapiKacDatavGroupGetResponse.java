package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.group.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavGroupGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4752779391724756476L;

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
	 * 返回结果对象
	 */
	@ApiField("result")
	private GroupStatisticalSummaryResponse result;


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

	public void setResult(GroupStatisticalSummaryResponse result) {
		this.result = result;
	}
	public GroupStatisticalSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupStatisticalSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 4398748127393813836L;
		/**
		 * 部门群数量
		 */
		@ApiField("dept_group_cnt")
		private Long deptGroupCnt;
		/**
		 * 内部群数量
		 */
		@ApiField("inner_group_cnt")
		private Long innerGroupCnt;
	
		public Long getDeptGroupCnt() {
			return this.deptGroupCnt;
		}
		public void setDeptGroupCnt(Long deptGroupCnt) {
			this.deptGroupCnt = deptGroupCnt;
		}
		public Long getInnerGroupCnt() {
			return this.innerGroupCnt;
		}
		public void setInnerGroupCnt(Long innerGroupCnt) {
			this.innerGroupCnt = innerGroupCnt;
		}
	}
	


}
