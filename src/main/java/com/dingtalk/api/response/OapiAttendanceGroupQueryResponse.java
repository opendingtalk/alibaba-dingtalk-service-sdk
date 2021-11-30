package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7644759689318253275L;

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
	 * demo
	 */
	@ApiField("result")
	private TopSimpleGroupVO result;

	/** 
	 * 成功标记
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

	public void setResult(TopSimpleGroupVO result) {
		this.result = result;
	}
	public TopSimpleGroupVO getResult( ) {
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
	 * 每天的班次设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopCycleScheduleItemVO extends TaobaoObject {
		private static final long serialVersionUID = 5438221297986519376L;
		/**
		 * 班次id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 班次名称
		 */
		@ApiField("class_name")
		private String className;
		/**
		 * 是否有效
		 */
		@ApiField("is_valid")
		private String isValid;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getClassName() {
			return this.className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public String getIsValid() {
			return this.isValid;
		}
		public void setIsValid(String isValid) {
			this.isValid = isValid;
		}
	}
	
	/**
	 * 排班周期设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopCycleScheduleVO extends TaobaoObject {
		private static final long serialVersionUID = 2855694739146744776L;
		/**
		 * 排班周期名称
		 */
		@ApiField("cycle_name")
		private String cycleName;
		/**
		 * 是否删除
		 */
		@ApiField("is_deleted")
		private String isDeleted;
		/**
		 * 是否有效
		 */
		@ApiField("is_valid")
		private String isValid;
		/**
		 * 每天的班次设置
		 */
		@ApiListField("item_list")
		@ApiField("top_cycle_schedule_item_v_o")
		private List<TopCycleScheduleItemVO> itemList;
	
		public String getCycleName() {
			return this.cycleName;
		}
		public void setCycleName(String cycleName) {
			this.cycleName = cycleName;
		}
		public String getIsDeleted() {
			return this.isDeleted;
		}
		public void setIsDeleted(String isDeleted) {
			this.isDeleted = isDeleted;
		}
		public String getIsValid() {
			return this.isValid;
		}
		public void setIsValid(String isValid) {
			this.isValid = isValid;
		}
		public List<TopCycleScheduleItemVO> getItemList() {
			return this.itemList;
		}
		public void setItemList(List<TopCycleScheduleItemVO> itemList) {
			this.itemList = itemList;
		}
	}
	
	/**
	 * demo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopSimpleGroupVO extends TaobaoObject {
		private static final long serialVersionUID = 7734548658422576696L;
		/**
		 * 考勤地址
		 */
		@ApiListField("address_list")
		@ApiField("string")
		private List<String> addressList;
		/**
		 * 排班周期设置
		 */
		@ApiListField("cycle_schedules")
		@ApiField("top_cycle_schedule_v_o")
		private List<TopCycleScheduleVO> cycleSchedules;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 考勤组管理员
		 */
		@ApiField("manager_list")
		private String managerList;
		/**
		 * 人员人数
		 */
		@ApiField("member_count")
		private Long memberCount;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 考勤组主负责人 id
		 */
		@ApiField("owner_user_id")
		private String ownerUserId;
		/**
		 * 考勤组关联的班次列表
		 */
		@ApiListField("shift_ids")
		@ApiField("number")
		private List<Long> shiftIds;
		/**
		 * 固定值，轮班制
		 */
		@ApiField("type")
		private String type;
		/**
		 * 跳转链接
		 */
		@ApiField("url")
		private String url;
		/**
		 * wifi名称
		 */
		@ApiListField("wifis")
		@ApiField("string")
		private List<String> wifis;
		/**
		 * 工作日
		 */
		@ApiListField("work_day_list")
		@ApiField("number")
		private List<Long> workDayList;
	
		public List<String> getAddressList() {
			return this.addressList;
		}
		public void setAddressList(List<String> addressList) {
			this.addressList = addressList;
		}
		public List<TopCycleScheduleVO> getCycleSchedules() {
			return this.cycleSchedules;
		}
		public void setCycleSchedules(List<TopCycleScheduleVO> cycleSchedules) {
			this.cycleSchedules = cycleSchedules;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getManagerList() {
			return this.managerList;
		}
		public void setManagerList(String managerList) {
			this.managerList = managerList;
		}
		public Long getMemberCount() {
			return this.memberCount;
		}
		public void setMemberCount(Long memberCount) {
			this.memberCount = memberCount;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOwnerUserId() {
			return this.ownerUserId;
		}
		public void setOwnerUserId(String ownerUserId) {
			this.ownerUserId = ownerUserId;
		}
		public List<Long> getShiftIds() {
			return this.shiftIds;
		}
		public void setShiftIds(List<Long> shiftIds) {
			this.shiftIds = shiftIds;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public List<String> getWifis() {
			return this.wifis;
		}
		public void setWifis(List<String> wifis) {
			this.wifis = wifis;
		}
		public List<Long> getWorkDayList() {
			return this.workDayList;
		}
		public void setWorkDayList(List<Long> workDayList) {
			this.workDayList = workDayList;
		}
	}
	


}
