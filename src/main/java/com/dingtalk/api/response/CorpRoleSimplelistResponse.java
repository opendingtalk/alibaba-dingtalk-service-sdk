package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.role.simplelist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpRoleSimplelistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8358787762147241155L;

	/** 
	 * result
	 */
	@ApiField("result")
	private PageVo result;


	public void setResult(PageVo result) {
		this.result = result;
	}
	public PageVo getResult( ) {
		return this.result;
	}

	
	
	/**
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpSimpleList extends TaobaoObject {
		private static final long serialVersionUID = 6358679613414125668L;
		/**
		 * userId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageVo extends TaobaoObject {
		private static final long serialVersionUID = 7528923825116881494L;
		/**
		 * hasMore
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("emp_simple_list")
		private List<EmpSimpleList> list;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<EmpSimpleList> getList() {
			return this.list;
		}
		public void setList(List<EmpSimpleList> list) {
			this.list = list;
		}
	}
	


}
