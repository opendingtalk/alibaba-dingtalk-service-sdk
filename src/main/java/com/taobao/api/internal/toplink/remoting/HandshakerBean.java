package com.taobao.api.internal.toplink.remoting;

import java.util.List;
import java.util.Map.Entry;

public interface HandshakerBean {
	public void onHandshake(List<Entry<String, String>> headers, ChannelContextBean context) throws Exception;
}