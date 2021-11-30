package com.taobao.api.parser;

import com.taobao.api.Constants;
import junit.framework.Assert;

import org.junit.Test;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoParser;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.parser.xml.ObjectXmlParser;
import com.taobao.api.reqrsp.PrimitiveListResponse;
import com.taobao.api.reqrsp.UserGetResponse;

public class ObjectParserTest {

	@Test
	public void parserXmlResponse() throws ApiException {
		String xml = "<user_get_response><user><user_id>2348845</user_id><nick>fengsheng</nick></user></user_get_response>";
		TaobaoParser<UserGetResponse> parser = new ObjectXmlParser<UserGetResponse>(UserGetResponse.class);
		UserGetResponse rsp = parser.parse(xml, Constants.RESPONSE_TYPE_QIMEN);
		System.out.println(rsp.getUser().getUserId());
	}

	@Test
	public void parserJsonResponse() throws ApiException {
		String json = "{\"user_get_response\":{\"user\":{\"nick\":\"helloworld\",\"type\":\"C\",\"user_id\":381950}}}";
		TaobaoParser<UserGetResponse> parser = new ObjectJsonParser<UserGetResponse>(UserGetResponse.class);
		UserGetResponse rsp = parser.parse(json, Constants.RESPONSE_TYPE_TOP);
		System.out.println(rsp.getUser().getUserId());
	}

	@Test
	public void parserPrimitiveArray() throws ApiException {
		ObjectXmlParser<PrimitiveListResponse> parser = new ObjectXmlParser<PrimitiveListResponse>(PrimitiveListResponse.class);
		PrimitiveListResponse rsp = parser.parse("<xxx_response><name_list><string>dt</string><string>thedate</string></name_list><value_list><string>20160513</string><string></string></value_list></xxx_response>", Constants.RESPONSE_TYPE_QIMEN);
		Assert.assertEquals(2, rsp.getNames().size());
		Assert.assertEquals(2, rsp.getValues().size());
	}

}
