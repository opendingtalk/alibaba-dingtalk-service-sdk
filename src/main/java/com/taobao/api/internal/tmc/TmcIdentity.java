package com.taobao.api.internal.tmc;

import java.util.Map;

import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.endpoint.Identity;

/**
 * 消息服务-连接身份标识
 */
class TmcIdentity implements Identity {

	private String appKey;
	private String groupName;
	private String minorGroup;
	private String filterExp;

	public TmcIdentity(String appKey, String groupName,String minorGroup,String filterExp) {
		this.appKey = appKey;
		this.groupName = groupName;
		this.minorGroup = minorGroup;
		this.filterExp = filterExp;
	}

	public Identity parse(Object data) throws LinkException {
		return null;
	}

	@SuppressWarnings("unchecked")
	public void render(Object to) {
		((Map<String, String>) to).put("app_key", this.appKey);
		((Map<String, String>) to).put("group_name", this.groupName);
		((Map<String, String>) to).put("minor_group", this.minorGroup);
		((Map<String, String>) to).put("filter_exp", this.filterExp);
	}

	@Override
	public String toString() {
		return this.appKey + "~" + this.groupName + "~" + this.minorGroup+"~"+ filterExp;
	}

	@Override
	public int hashCode() {
		return (this.appKey + this.groupName).hashCode();
	}

	public boolean equals(Identity id) {
		return id.getClass().equals(TmcIdentity.class) &&
				this.appKey.equals(((TmcIdentity) id).appKey) &&
				this.groupName.equals(((TmcIdentity) id).groupName);
	}
}
