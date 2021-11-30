package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.atmachine.get_by_userid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceAtmachineGetByUseridResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6157892736978163837L;

	/** 
	 * 服务调用结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务调用结果码描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 查询智能考勤机列表结果模型
	 */
	@ApiField("result")
	private MachineInfoResultVo result;


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

	public void setResult(MachineInfoResultVo result) {
		this.result = result;
	}
	public MachineInfoResultVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 考勤机列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MachineVo extends TaobaoObject {
		private static final long serialVersionUID = 8687283469231581565L;
		/**
		 * 考勤机名称
		 */
		@ApiField("device_name")
		private String deviceName;
		/**
		 * 考勤机唯一id，字符串类型
		 */
		@ApiField("deviceid")
		private String deviceid;
		/**
		 * 考勤机唯一id，Long类型
		 */
		@ApiField("devid")
		private Long devid;
		/**
		 * 考勤机类型名称
		 */
		@ApiField("product_name")
		private String productName;
	
		public String getDeviceName() {
			return this.deviceName;
		}
		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}
		public String getDeviceid() {
			return this.deviceid;
		}
		public void setDeviceid(String deviceid) {
			this.deviceid = deviceid;
		}
		public Long getDevid() {
			return this.devid;
		}
		public void setDevid(Long devid) {
			this.devid = devid;
		}
		public String getProductName() {
			return this.productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
	}
	
	/**
	 * 查询智能考勤机列表结果模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MachineInfoResultVo extends TaobaoObject {
		private static final long serialVersionUID = 5822675435126614258L;
		/**
		 * 分页查询中，后页是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 考勤机列表
		 */
		@ApiListField("machine_list")
		@ApiField("machine_vo")
		private List<MachineVo> machineList;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<MachineVo> getMachineList() {
			return this.machineList;
		}
		public void setMachineList(List<MachineVo> machineList) {
			this.machineList = machineList;
		}
	}
	


}
