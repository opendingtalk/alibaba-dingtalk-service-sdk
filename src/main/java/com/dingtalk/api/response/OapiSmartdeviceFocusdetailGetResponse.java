package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.focusdetail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceFocusdetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1648658429138477995L;

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
	 * 页数据结果
	 */
	@ApiField("result")
	private PageVO result;

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

	public void setResult(PageVO result) {
		this.result = result;
	}
	public PageVO getResult( ) {
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
	 * 投屏数据列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FocusDetailVO extends TaobaoObject {
		private static final long serialVersionUID = 6137431835188266394L;
		/**
		 * 投屏时间，单位毫秒
		 */
		@ApiField("create_date")
		private Date createDate;
		/**
		 * 部门全称
		 */
		@ApiField("dept_full_name")
		private String deptFullName;
		/**
		 * 投屏设备呢称
		 */
		@ApiField("nick_name")
		private String nickName;
		/**
		 * 会议室
		 */
		@ApiField("room")
		private String room;
		/**
		 * 用户名
		 */
		@ApiField("user_name")
		private String userName;
	
		public Date getCreateDate() {
			return this.createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		public String getDeptFullName() {
			return this.deptFullName;
		}
		public void setDeptFullName(String deptFullName) {
			this.deptFullName = deptFullName;
		}
		public String getNickName() {
			return this.nickName;
		}
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
		public String getRoom() {
			return this.room;
		}
		public void setRoom(String room) {
			this.room = room;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
	}
	
	/**
	 * 页数据结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageVO extends TaobaoObject {
		private static final long serialVersionUID = 3632897669914176881L;
		/**
		 * 是否有更多记录
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 投屏数据列表
		 */
		@ApiListField("list")
		@ApiField("focus_detail_v_o")
		private List<FocusDetailVO> list;
		/**
		 * 下一个游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * 下一游标
		 */
		@ApiField("next_cursor_string")
		private String nextCursorString;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<FocusDetailVO> getList() {
			return this.list;
		}
		public void setList(List<FocusDetailVO> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public String getNextCursorString() {
			return this.nextCursorString;
		}
		public void setNextCursorString(String nextCursorString) {
			this.nextCursorString = nextCursorString;
		}
	}
	


}
