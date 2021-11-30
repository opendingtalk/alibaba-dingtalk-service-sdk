package com.taobao.api.reqrsp;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 获取TOP网关出口IP响应封装。
 * 
 * @author fengsheng
 * @since Aug 30, 2016
 */
public class TopIpoutGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1366405513439143952L;

	@ApiField("string")
	@ApiListField("ip_list")
	private List<String> ipList;

	public List<String> getIpList() {
		return this.ipList;
	}

	public void setIpList(List<String> ipList) {
		this.ipList = ipList;
	}

}
