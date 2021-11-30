package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.seller.orgdetail.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRetailSellerOrgdetailQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1533926892148751531L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 组织列表
	 */
	@ApiListField("result")
	@ApiField("org_dto")
	private List<OrgDto> result;

	/** 
	 * 调用结果
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

	public void setResult(List<OrgDto> result) {
		this.result = result;
	}
	public List<OrgDto> getResult( ) {
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
	 * 卖家绑定的员工list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ShopEmpDto extends TaobaoObject {
		private static final long serialVersionUID = 1166532759912474567L;
		/**
		 * 主子账号
		 */
		@ApiField("emp_type")
		private String empType;
		/**
		 * 员工姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 卖家ID
		 */
		@ApiField("outer_id")
		private String outerId;
		/**
		 * 卖家子账号ID
		 */
		@ApiField("outer_sub_id")
		private String outerSubId;
		/**
		 * 绑定淘宝账号nick
		 */
		@ApiField("seller_nick")
		private String sellerNick;
		/**
		 * staffId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getEmpType() {
			return this.empType;
		}
		public void setEmpType(String empType) {
			this.empType = empType;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOuterId() {
			return this.outerId;
		}
		public void setOuterId(String outerId) {
			this.outerId = outerId;
		}
		public String getOuterSubId() {
			return this.outerSubId;
		}
		public void setOuterSubId(String outerSubId) {
			this.outerSubId = outerSubId;
		}
		public String getSellerNick() {
			return this.sellerNick;
		}
		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 组织绑定卖家List
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SellerDto extends TaobaoObject {
		private static final long serialVersionUID = 8597595862949173658L;
		/**
		 * 卖家ID
		 */
		@ApiField("seller_id")
		private Long sellerId;
		/**
		 * 卖家昵称
		 */
		@ApiField("seller_nick")
		private String sellerNick;
		/**
		 * 卖家绑定的员工list
		 */
		@ApiListField("shop_emp_list")
		@ApiField("shop_emp_dto")
		private List<ShopEmpDto> shopEmpList;
		/**
		 * 天猫店 淘宝店
		 */
		@ApiField("type")
		private String type;
		/**
		 * staffId
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getSellerId() {
			return this.sellerId;
		}
		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}
		public String getSellerNick() {
			return this.sellerNick;
		}
		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}
		public List<ShopEmpDto> getShopEmpList() {
			return this.shopEmpList;
		}
		public void setShopEmpList(List<ShopEmpDto> shopEmpList) {
			this.shopEmpList = shopEmpList;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 组织列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgDto extends TaobaoObject {
		private static final long serialVersionUID = 8385651462757338721L;
		/**
		 * 组织绑定卖家List
		 */
		@ApiListField("bind_sellers")
		@ApiField("seller_dto")
		private List<SellerDto> bindSellers;
		/**
		 * corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 组织创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 组织名
		 */
		@ApiField("org_name")
		private String orgName;
	
		public List<SellerDto> getBindSellers() {
			return this.bindSellers;
		}
		public void setBindSellers(List<SellerDto> bindSellers) {
			this.bindSellers = bindSellers;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
	}
	


}
