package com.taobao.api.reqrsp;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

public class PrimitiveListResponse extends TaobaoResponse {

	private static final long serialVersionUID = -933150863231747674L;

	@ApiListField("name_list")
	@ApiField("string")
	private List<String> names;

	@ApiListField("value_list")
	@ApiField("string")
	private List<String> values;

	public List<String> getNames() {
		return this.names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<String> getValues() {
		return this.values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

}
