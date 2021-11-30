package com.taobao.api.internal.report;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * SDK反馈回传响应封装。
 * 
 * @author changchun
 */
public class TopSdkFeedbackUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5321836199587199672L;

	/**
	 * 控制回传间隔，单位（毫秒）
	 */
	@ApiField("upload_interval")
	private long uploadInterval;

	public long getUploadInterval() {
		return uploadInterval;
	}

	public void setUploadInterval(long uploadInterval) {
		this.uploadInterval = uploadInterval;
	}

}
