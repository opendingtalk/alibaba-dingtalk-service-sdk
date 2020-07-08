package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.list_ids response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDepartmentListIdsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8834125198597376981L;

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

	/** 
	 * sub_dept_id_list
	 */
	@ApiListField("sub_dept_id_list")
	@ApiField("number")
	private List<Long> subDeptIdList;


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

	public void setSubDeptIdList(List<Long> subDeptIdList) {
		this.subDeptIdList = subDeptIdList;
	}
	public List<Long> getSubDeptIdList( ) {
		return this.subDeptIdList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
