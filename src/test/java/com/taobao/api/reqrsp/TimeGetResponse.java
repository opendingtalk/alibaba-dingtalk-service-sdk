package com.taobao.api.reqrsp;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.time.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TimeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5321836199587199672L;

	/** 
	 * 淘宝系统当前时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time")
	private Date time;

	public void setTime(Date time) {
		this.time = time;
	}
	public Date getTime( ) {
		return this.time;
	}
	


}
