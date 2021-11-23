package com.taobao.api.internal.toplink.remoting;

// just for recording processor mapping info
public class ServiceBean {
	private String interfaceName;
	private Object target;

	public String getInterfaceName() {
		return this.interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public Object getTarget() {
		return this.target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
}
