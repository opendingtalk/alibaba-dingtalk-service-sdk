package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.printdetail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdevicePrintdetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7163784215766343972L;

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
	 * 打印详情列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PrintDetailVO extends TaobaoObject {
		private static final long serialVersionUID = 2879243297966662137L;
		/**
		 * 部门扩展信息
		 */
		@ApiField("dept_ext_info")
		private String deptExtInfo;
		/**
		 * 部门全称
		 */
		@ApiField("dept_full_name")
		private String deptFullName;
		/**
		 * 一级部门名
		 */
		@ApiField("dept_level1_name")
		private String deptLevel1Name;
		/**
		 * 二级部门名
		 */
		@ApiField("dept_level2_name")
		private String deptLevel2Name;
		/**
		 * 三级部门名
		 */
		@ApiField("dept_level3_name")
		private String deptLevel3Name;
		/**
		 * 打印来源编号，0-5： 0-其他  1-pc驱动  2-二维码   3-审批   4-钉盘  5-IM
		 */
		@ApiField("origin")
		private String origin;
		/**
		 * 彩色或黑白打印类型.0黑白，1彩色
		 */
		@ApiField("page_color_type")
		private Long pageColorType;
		/**
		 * 单双面类型，0是单面，1是双面
		 */
		@ApiField("page_double_type")
		private Long pageDoubleType;
		/**
		 * 纸张大小类型 A3
		 */
		@ApiField("page_size_type")
		private String pageSizeType;
		/**
		 * 打印总页数
		 */
		@ApiField("pages")
		private Long pages;
		/**
		 * 打印时间戳，单位是毫秒
		 */
		@ApiField("print_date")
		private Date printDate;
		/**
		 * 打印机名称
		 */
		@ApiField("printer_nick")
		private String printerNick;
		/**
		 * 用户名
		 */
		@ApiField("user_name")
		private String userName;
	
		public String getDeptExtInfo() {
			return this.deptExtInfo;
		}
		public void setDeptExtInfo(String deptExtInfo) {
			this.deptExtInfo = deptExtInfo;
		}
		public String getDeptFullName() {
			return this.deptFullName;
		}
		public void setDeptFullName(String deptFullName) {
			this.deptFullName = deptFullName;
		}
		public String getDeptLevel1Name() {
			return this.deptLevel1Name;
		}
		public void setDeptLevel1Name(String deptLevel1Name) {
			this.deptLevel1Name = deptLevel1Name;
		}
		public String getDeptLevel2Name() {
			return this.deptLevel2Name;
		}
		public void setDeptLevel2Name(String deptLevel2Name) {
			this.deptLevel2Name = deptLevel2Name;
		}
		public String getDeptLevel3Name() {
			return this.deptLevel3Name;
		}
		public void setDeptLevel3Name(String deptLevel3Name) {
			this.deptLevel3Name = deptLevel3Name;
		}
		public String getOrigin() {
			return this.origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public Long getPageColorType() {
			return this.pageColorType;
		}
		public void setPageColorType(Long pageColorType) {
			this.pageColorType = pageColorType;
		}
		public Long getPageDoubleType() {
			return this.pageDoubleType;
		}
		public void setPageDoubleType(Long pageDoubleType) {
			this.pageDoubleType = pageDoubleType;
		}
		public String getPageSizeType() {
			return this.pageSizeType;
		}
		public void setPageSizeType(String pageSizeType) {
			this.pageSizeType = pageSizeType;
		}
		public Long getPages() {
			return this.pages;
		}
		public void setPages(Long pages) {
			this.pages = pages;
		}
		public Date getPrintDate() {
			return this.printDate;
		}
		public void setPrintDate(Date printDate) {
			this.printDate = printDate;
		}
		public String getPrinterNick() {
			return this.printerNick;
		}
		public void setPrinterNick(String printerNick) {
			this.printerNick = printerNick;
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
		private static final long serialVersionUID = 2825639668563537663L;
		/**
		 * 是否有更多记录
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 打印详情列表
		 */
		@ApiListField("list")
		@ApiField("print_detail_v_o")
		private List<PrintDetailVO> list;
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
		public List<PrintDetailVO> getList() {
			return this.list;
		}
		public void setList(List<PrintDetailVO> list) {
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
