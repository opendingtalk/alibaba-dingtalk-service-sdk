package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.listids response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2DepartmentListidsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3225579127434328762L;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 对返回码的文本描述内容
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 子部门ID列表数据
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
