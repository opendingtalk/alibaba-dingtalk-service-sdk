package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiV2UserCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.11.25
 */
public class OapiV2UserCreateRequest extends BaseTaobaoRequest<OapiV2UserCreateResponse> {
	
	

	/** 
	* 所属部门id列表
	 */
	private String deptIdList;

	/** 
	* 员工在对应的部门中的排序。
	 */
	private String deptOrderList;

	/** 
	* 部门内任职
	 */
	private String deptPositionList;

	/** 
	* 员工在对应的部门中的职位。
	 */
	private String deptTitleList;

	/** 
	* 员工邮箱，长度最大50个字符。企业内必须唯一，不可重复。
	 */
	private String email;

	/** 
	* 是否专属帐号（true时，不能指定loginEmail或mobile）
	 */
	private Boolean exclusiveAccount;

	/** 
	* 专属帐号类型：sso： 企业自建专属帐号；dingtalk：钉钉自建专属帐号。
	 */
	private String exclusiveAccountType;

	/** 
	* 专属帐号手机号
	 */
	private String exclusiveMobile;

	/** 
	* 专属帐号手机号验证状态
	 */
	private String exclusiveMobileVerifyStatus;

	/** 
	* 扩展属性，长度最大2000个字符。可以设置多种属性（手机上最多显示10个扩展属性，具体显示哪些属性，请到OA管理后台->设置->通讯录信息设置和OA管理后台->设置->手机端显示信息设置）。 该字段的值支持链接类型填写，同时链接支持变量通配符自动替换，目前支持通配符有：userid，corpid。示例： [工位地址](http:www.dingtalk.com?userid=#userid#&corpid=#corpid#)
	 */
	private String extension;

	/** 
	* 是否号码隐藏。隐藏手机号后，手机号在个人资料页隐藏，但仍可对其发DING、发起钉钉免费商务电话。
	 */
	private Boolean hideMobile;

	/** 
	* 入职时间，Unix时间戳，单位ms。
	 */
	private Long hiredDate;

	/** 
	* 钉钉专属帐号初始密码
	 */
	private String initPassword;

	/** 
	* 员工工号，长度最大50个字符。
	 */
	private String jobNumber;

	/** 
	* 登录邮箱
	 */
	private String loginEmail;

	/** 
	* 钉钉专属帐号登录名
	 */
	private String loginId;

	/** 
	* 直属主管
	 */
	private String managerUserid;

	/** 
	* 手机号码，企业内必须唯一，不可重复。如果是国际号码，请使用+xx-xxxxxx的格式
	 */
	private String mobile;

	/** 
	* 员工名称，长度最大80个字符。
	 */
	private String name;

	/** 
	* 员工的企业邮箱，长度最大100个字符。员工的企业邮箱已开通，才能增加此字段。
	 */
	private String orgEmail;

	/** 
	* 企业邮箱类型（profession：标准版，base：基础版）
	 */
	private String orgEmailType;

	/** 
	* 需要添加的专属帐号所属corpid
	 */
	private String outerExclusiveCorpid;

	/** 
	* 需要添加的专属帐号所属userid
	 */
	private String outerExclusiveUserid;

	/** 
	* 备注，长度最大2000个字符。
	 */
	private String remark;

	/** 
	* 是否高管模式。开启后，手机号码对所有员工隐藏。普通员工无法对其发DING、发起钉钉免费商务电话。高管之间不受影响。
	 */
	private Boolean seniorMode;

	/** 
	* 分机号，长度最大50个字符。企业内必须唯一，不可重复
	 */
	private String telephone;

	/** 
	* 职位，长度最大200个字符。
	 */
	private String title;

	/** 
	* 员工id，长度最大64个字符。员工在当前企业内的唯一标识。
	 */
	private String userid;

	/** 
	* 办公地点，长度最大100个字符。
	 */
	private String workPlace;

	public void setDeptIdList(String deptIdList) {
		this.deptIdList = deptIdList;
	}

	public String getDeptIdList() {
		return this.deptIdList;
	}

	public void setDeptOrderList(String deptOrderList) {
		this.deptOrderList = deptOrderList;
	}

	public void setDeptOrderList(List<DeptOrder> deptOrderList) {
		this.deptOrderList = new JSONWriter(false,false,true).write(deptOrderList);
	}

	public String getDeptOrderList() {
		return this.deptOrderList;
	}

	public void setDeptPositionList(String deptPositionList) {
		this.deptPositionList = deptPositionList;
	}

	public void setDeptPositionList(List<DeptPosition> deptPositionList) {
		this.deptPositionList = new JSONWriter(false,false,true).write(deptPositionList);
	}

	public String getDeptPositionList() {
		return this.deptPositionList;
	}

	public void setDeptTitleList(String deptTitleList) {
		this.deptTitleList = deptTitleList;
	}

	public void setDeptTitleList(List<DeptTitle> deptTitleList) {
		this.deptTitleList = new JSONWriter(false,false,true).write(deptTitleList);
	}

	public String getDeptTitleList() {
		return this.deptTitleList;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setExclusiveAccount(Boolean exclusiveAccount) {
		this.exclusiveAccount = exclusiveAccount;
	}

	public Boolean getExclusiveAccount() {
		return this.exclusiveAccount;
	}

	public void setExclusiveAccountType(String exclusiveAccountType) {
		this.exclusiveAccountType = exclusiveAccountType;
	}

	public String getExclusiveAccountType() {
		return this.exclusiveAccountType;
	}

	public void setExclusiveMobile(String exclusiveMobile) {
		this.exclusiveMobile = exclusiveMobile;
	}

	public String getExclusiveMobile() {
		return this.exclusiveMobile;
	}

	public void setExclusiveMobileVerifyStatus(String exclusiveMobileVerifyStatus) {
		this.exclusiveMobileVerifyStatus = exclusiveMobileVerifyStatus;
	}

	public String getExclusiveMobileVerifyStatus() {
		return this.exclusiveMobileVerifyStatus;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void setExtensionString(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setHideMobile(Boolean hideMobile) {
		this.hideMobile = hideMobile;
	}

	public Boolean getHideMobile() {
		return this.hideMobile;
	}

	public void setHiredDate(Long hiredDate) {
		this.hiredDate = hiredDate;
	}

	public Long getHiredDate() {
		return this.hiredDate;
	}

	public void setInitPassword(String initPassword) {
		this.initPassword = initPassword;
	}

	public String getInitPassword() {
		return this.initPassword;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getJobNumber() {
		return this.jobNumber;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getLoginEmail() {
		return this.loginEmail;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setManagerUserid(String managerUserid) {
		this.managerUserid = managerUserid;
	}

	public String getManagerUserid() {
		return this.managerUserid;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	public String getOrgEmail() {
		return this.orgEmail;
	}

	public void setOrgEmailType(String orgEmailType) {
		this.orgEmailType = orgEmailType;
	}

	public String getOrgEmailType() {
		return this.orgEmailType;
	}

	public void setOuterExclusiveCorpid(String outerExclusiveCorpid) {
		this.outerExclusiveCorpid = outerExclusiveCorpid;
	}

	public String getOuterExclusiveCorpid() {
		return this.outerExclusiveCorpid;
	}

	public void setOuterExclusiveUserid(String outerExclusiveUserid) {
		this.outerExclusiveUserid = outerExclusiveUserid;
	}

	public String getOuterExclusiveUserid() {
		return this.outerExclusiveUserid;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setSeniorMode(Boolean seniorMode) {
		this.seniorMode = seniorMode;
	}

	public Boolean getSeniorMode() {
		return this.seniorMode;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getWorkPlace() {
		return this.workPlace;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.v2.user.create";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dept_id_list", this.deptIdList);
		txtParams.put("dept_order_list", this.deptOrderList);
		txtParams.put("dept_position_list", this.deptPositionList);
		txtParams.put("dept_title_list", this.deptTitleList);
		txtParams.put("email", this.email);
		txtParams.put("exclusive_account", this.exclusiveAccount);
		txtParams.put("exclusive_account_type", this.exclusiveAccountType);
		txtParams.put("exclusive_mobile", this.exclusiveMobile);
		txtParams.put("exclusive_mobile_verify_status", this.exclusiveMobileVerifyStatus);
		txtParams.put("extension", this.extension);
		txtParams.put("hide_mobile", this.hideMobile);
		txtParams.put("hired_date", this.hiredDate);
		txtParams.put("init_password", this.initPassword);
		txtParams.put("job_number", this.jobNumber);
		txtParams.put("login_email", this.loginEmail);
		txtParams.put("login_id", this.loginId);
		txtParams.put("manager_userid", this.managerUserid);
		txtParams.put("mobile", this.mobile);
		txtParams.put("name", this.name);
		txtParams.put("org_email", this.orgEmail);
		txtParams.put("org_email_type", this.orgEmailType);
		txtParams.put("outer_exclusive_corpid", this.outerExclusiveCorpid);
		txtParams.put("outer_exclusive_userid", this.outerExclusiveUserid);
		txtParams.put("remark", this.remark);
		txtParams.put("senior_mode", this.seniorMode);
		txtParams.put("telephone", this.telephone);
		txtParams.put("title", this.title);
		txtParams.put("userid", this.userid);
		txtParams.put("work_place", this.workPlace);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiV2UserCreateResponse> getResponseClass() {
		return OapiV2UserCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(deptIdList, 100, "deptIdList");
		RequestCheckUtils.checkObjectMaxListSize(deptOrderList, 100, "deptOrderList");
		RequestCheckUtils.checkObjectMaxListSize(deptPositionList, 999, "deptPositionList");
		RequestCheckUtils.checkObjectMaxListSize(deptTitleList, 100, "deptTitleList");
		RequestCheckUtils.checkMaxLength(email, 50, "email");
		RequestCheckUtils.checkMinValue(hiredDate, 1L, "hiredDate");
		RequestCheckUtils.checkMaxLength(jobNumber, 50, "jobNumber");
		RequestCheckUtils.checkMaxLength(loginEmail, 64, "loginEmail");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 80, "name");
		RequestCheckUtils.checkMaxLength(orgEmail, 100, "orgEmail");
		RequestCheckUtils.checkMaxLength(remark, 2000, "remark");
		RequestCheckUtils.checkMaxLength(telephone, 50, "telephone");
		RequestCheckUtils.checkMaxLength(title, 200, "title");
		RequestCheckUtils.checkMaxLength(userid, 64, "userid");
		RequestCheckUtils.checkMaxLength(workPlace, 100, "workPlace");
	}
	
	/**
	 * 员工在对应的部门中的排序。
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptOrder extends TaobaoObject {
		private static final long serialVersionUID = 2475818568547145829L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 员工在部门中的排序。
		 */
		@ApiField("order")
		private Long order;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public Long getOrder() {
			return this.order;
		}
		public void setOrder(Long order) {
			this.order = order;
		}
	}
	
	/**
	 * 员工在对应的部门中的职位。
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptTitle extends TaobaoObject {
		private static final long serialVersionUID = 2859377137262848258L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 员工在部门中的职位。
		 */
		@ApiField("title")
		private String title;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 部门内任职
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptPosition extends TaobaoObject {
		private static final long serialVersionUID = 2358222113249428617L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 是否是主任职
		 */
		@ApiField("is_main")
		private Boolean isMain;
		/**
		 * 部门内职位
		 */
		@ApiField("title")
		private String title;
		/**
		 * 部门内办公地
		 */
		@ApiField("work_place")
		private String workPlace;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public Boolean getIsMain() {
			return this.isMain;
		}
		public void setIsMain(Boolean isMain) {
			this.isMain = isMain;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getWorkPlace() {
			return this.workPlace;
		}
		public void setWorkPlace(String workPlace) {
			this.workPlace = workPlace;
		}
	}
	

}