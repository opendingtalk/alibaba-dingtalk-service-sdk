package com.dingtalk.api;

import com.dingtalk.api.reqrsp.*;
import com.taobao.api.ApiException;
import com.taobao.api.FileItem;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultDingTalkClientTest {

	@Test
	public void test_OapiAttendanceVacationTypeCreate() throws ApiException {
		DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/attendance/vacation/type/create");
		client.setUseJsonString(true);
		OapiAttendanceVacationTypeCreateRequest request = new OapiAttendanceVacationTypeCreateRequest();
		request.setBizType("lieu_leave");
		request.setExtras("{\"validity_type\":\"absolute_time\",\"validity_value\":\"12-31\"}");
		request.setHoursInPerDay(800L);
		request.setNaturalDayLeave(false);
		request.setLeaveViewUnit("day");
		request.setLeaveName("测试假1144433");
		request.setOpUserid("001");
		OapiAttendanceVacationTypeCreateResponse response = client.execute(request, "8511d7c466b53ee5bcb6677fa79fefb2");
		System.out.println("body:" + response.getBody());
	}

	@Test
	public void testAddmember() throws ApiException {
		String staffId = "04124918291037917436";
		String groupId = "cidwYqE5pjnFhY4dzWZPKINQQ==";
		String accessToken = "d30ca3bc46c0397fb6d2dcb60e454f4c";
		CcoserviceServicegroupAddmemberRequest request = new CcoserviceServicegroupAddmemberRequest();
		request.setUserid(staffId);
		request.setOpenGroupId(groupId);

//		LoggerUtil.warn(log, "addMemberToGroup�������,request={}, accessToken={}", JSON.toJSONString(request), accessToken);

		DingTalkClient client = new DefaultDingTalkClient("https://eco.taobao.com/router/rest");

		try {

			CcoserviceServicegroupAddmemberResponse response = client.execute(request, accessToken);
			System.out.println(response.getBody());
//			LoggerUtil.warn(log, "��Ⱥ����˽�� staffId={} groupId={} response={} accessToken={}", staffId, groupId, JSON.toJSONString(response),
//					accessToken);

			if (response.isSuccess() && response.getResult() != null) {

//				return response.getResult().getDingtalkId();

			} else {

				throw new RuntimeException("����Ⱥ������쳣");
			}

		} catch (Throwable e) {

//			LoggerUtil.error(log, e, "���ö�����Ⱥ�������Ա�쳣");

			throw new RuntimeException("����Ⱥ������쳣");

		}
	}

	@Test
	public void getTokenDirectly() throws ApiException {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
		OapiGettokenRequest request = new OapiGettokenRequest();
		request.setCorpid("dingc95d22c053c528ae");
		request.setCorpsecret("y2bvq4CbSV0TupI0bTg-Y3BSzyl3fhyJOLaUAkbIgj34L1lcrspjKL9A8FdLgNs4");

		OapiGettokenResponse response = client.execute(request, null);
		System.out.println(response.getBody());
	}

	@Test
    public void  test() throws UnsupportedEncodingException {
		String str = "name%2C%09%09%09%09%09+++status";
		String deStr = URLDecoder.decode(str, "UTF-8");
		System.out.println(deStr);
	    String fields = deStr.replaceAll("[\\t\\s\\n ]+", "");
	    System.out.println(fields);
//	    return fields.split(",");
    }

	@Test
	public void testGetAccesskey() throws ApiException {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/service/get_corp_token");
		OapiServiceGetCorpTokenRequest req = new OapiServiceGetCorpTokenRequest();
		req.setAuthCorpid("dingc365fcabbf733c3535c2f4657eb6378f");
		OapiServiceGetCorpTokenResponse response = client.execute(req,"suitezmpdnvsw4syq53g6");
		System.out.println(response.getBody());
	}

	@Test
	public void testPreTest1() throws Exception {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/xiaoxuan/pre/test1");
		OapiXiaoxuanPreTest1Request req = new OapiXiaoxuanPreTest1Request();
		req.setNormalData("1");
		req.setSystemData("2");
		OapiXiaoxuanPreTest1Response rsp = client.execute(req, "eb07281d4d0d33f1b9b068d637604168");
		System.out.println(rsp.isSuccess());
		System.out.println(rsp.getBody());
	}

	@Test
	public void testChatGet() throws Exception {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/get");
		OapiChatGetRequest req = new OapiChatGetRequest();
		req.setChatid("chat7ffb1d147ad59b2b23cf004aa3925639");
		req.setHttpMethod("GET");
		OapiChatGetResponse rsp = client.execute(req, "37da60ea7abf365ab50463a8f76cd897");
		System.out.println(rsp.isSuccess());
		System.out.println(rsp.getBody());
	}

	@Test
	public void testChatCreate() throws Exception {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/create");
		OapiChatCreateRequest req = new OapiChatCreateRequest();
		req.setName("Ⱥ����");
		req.setOwner("manager3861");
		List<String> userIds = new ArrayList<String>();
		userIds.add("manager3861");
		req.setUseridlist(userIds);
		OapiChatCreateResponse rsp = client.execute(req, "37da60ea7abf365ab50463a8f76cd897");
		System.out.println(rsp.isSuccess());
		System.out.println(rsp.getBody());
	}

	@Test
	public void testOapiImpaasConversationSendGroupMessageRequest() throws Exception {
		OapiImpaasConversationSendGroupMessageRequest request = new OapiImpaasConversationSendGroupMessageRequest();

		request.setChatId("145015360");
		request.setMsgType(1L);
		request.setContent("{\"senderId\":\"74463051793922674\",\"msgType\":\"coupon\",\"msgContent\":{\"attachmentList\":[{\"extension\":{\"bizId\":\"43298323014382\",\"from\":\"��Ⱥ\",\"title\":\"����app����ȯ\",\"desc\":\"��200��100\"}}]},\"chatId\":\"145015360\"}");

		DingTalkClient client = new DefaultDingTalkClient("https://11.162.254.154/topapi/impaas/conversation/sendGroupMessage");
		OapiImpaasConversationSendGroupMessageResponse response = client.execute(request, "787fee0bed1e37a8aba5854666029f8d");
		System.out.println(response.getBody());
	}

	@Test
	public void testBpms() throws Exception {
		DingTalkClient client = new DefaultDingTalkClient("https://eco.taobao.com/router/rest");
		SmartworkBpmsProcessinstanceGetRequest req = new SmartworkBpmsProcessinstanceGetRequest();
		req.setProcessInstanceId("f9385c49-aa95-4338-a3da-d50b0581e07d");
		req.putOtherTextParam("dd_l", "en_US");
		SmartworkBpmsProcessinstanceGetResponse rsp = client.execute(req, "c9bc01f606ed394997c9714b96cf0611");
		System.out.println(rsp.isSuccess());
		System.out.println(rsp.getBody());
	}

	@Test
	public void testDingTalkClient() throws Exception {
		DingTalkClient client = new DefaultDingTalkClient("https://11.162.254.154/router/rest");
		OapiXiaoxuanTestRequest request = new OapiXiaoxuanTestRequest();
		request.setNormalData("123");
		request.setSystemData("456");
		OapiXiaoxuanTestResponse resp = client.execute(request,"bf80cac4e8ad34a3afe7408c5f96be96");
		System.out.println(resp.getBody());
		System.out.println(resp.isSuccess());
		System.out.println(resp.getErrorCode());
		System.out.println(resp.getMsg());
		System.out.println(resp.getSubCode());
		System.out.println(resp.getSubMsg());
	}

	@Test
	public void testOapiServiceGetAuthInfoRequest() throws Exception {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/service/get_auth_info");
		OapiServiceGetAuthInfoRequest req1 = new OapiServiceGetAuthInfoRequest();
		req1.setAuthCorpid("dingc365fcabbf733c3535c2f4657eb6378f");
		OapiServiceGetAuthInfoResponse response = client.execute(req1,"suitezmpdnvsw4syq53g6","QhQQgAbHTmQ7wXhpfH4EF2aefd_ONzg_GhE7eBrV6PkuGbtBX501RU5dAaK8LFSZ","testSuiteTicket");
		System.out.println(response.getBody());
	}

	@Test
	public void testDingtalkOapi() throws Exception {
		DingTalkClient client = new DefaultDingTalkClient("https://11.162.254.154/topapi/xiaoxuan/test");
		OapiXiaoxuanTestRequest request = new OapiXiaoxuanTestRequest();
		request.setNormalData("123");
		request.setSystemData("456");
		OapiXiaoxuanTestResponse response = client.execute(request, "bc360da820933389bc2670dc2458faf5");
		System.out.println("success:" + response.isSuccess());
		System.out.println("errcode:" + response.getErrcode());
		System.out.println("errmsg:" + response.getErrmsg());
		System.out.println("response body:" + response.getBody());
		System.out.println("structure result:" + response.getResult());
		System.out.println("requestId:" + response.getRequestId());
	}

	@Test
	public void testDingtalkOapiPre() throws Exception {
		DingTalkClient client = new DefaultDingTalkClient("https://pre-oapi.dingtalk.com/topapi/xiaoxuan/test");
		OapiXiaoxuanTestRequest request = new OapiXiaoxuanTestRequest();
		request.setNormalData("123");
		request.setSystemData("456");
		OapiXiaoxuanTestResponse response = client.execute(request, "8511d7c466b53ee5bcb6677fa79fefb2");
		System.out.println("success:" + response.isSuccess());
		System.out.println("errcode:" + response.getErrcode());
		System.out.println("errmsg:" + response.getErrmsg());
		System.out.println("response body:" + response.getBody());
		System.out.println("structure result:" + response.getResult());
		System.out.println("requestId:" + response.getRequestId());
	}

	@Test
	public void testDingtalkOapiDepts() throws Exception {
		String token = getToken();

		departmentListParentDepts(token, "manager3861");
	}

	@Test
	public void testMediaUpload() throws Exception {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/media/upload");
		OapiMediaUploadRequest request = new OapiMediaUploadRequest();
		request.setMedia(new FileItem("/Users/xiaoxuan.lp/works/tools/image003.jpg"));
		request.setType("image");

		OapiMediaUploadResponse response = client.execute(request, "8511d7c466b53ee5bcb6677fa79fefb2");
		System.out.println(response.getBody());
	}

	@Test
    public void extContactCreate() throws ApiException{
        DingTalkClient client = new DefaultDingTalkClient("https://pre-oapi.dingtalk.com/topapi/extcontact/create");
        OapiExtcontactCreateRequest request = new OapiExtcontactCreateRequest();

        OapiExtcontactCreateRequest.OpenExtContact openExtContact = new OapiExtcontactCreateRequest.OpenExtContact();
        openExtContact.setTitle("Title");
        openExtContact.setLabelIds(Arrays.asList(304413077L, 304413084L));
        openExtContact.setShareDeptIds(Arrays.asList(64849382L, 59170032L));
        openExtContact.setAddress("��ַ");
        openExtContact.setRemark("��ע");
        openExtContact.setFollowerUserId("manager3861");
        openExtContact.setName("����");
        openExtContact.setStateCode("86");
        openExtContact.setCompanyName("��ҵ����");
        openExtContact.setShareUserIds(Arrays.asList("manager3861","042340888792"));
        openExtContact.setMobile("13567666099");

        request.setContact(openExtContact);

        OapiExtcontactCreateResponse response = client.execute(request, "8f0cda95885530ea9dad058d788de336");
        System.out.println(response.getBody());
    }

    @Test
    public void textProcessInstanceCreate() throws Exception {
        DefaultDingTalkClient client = new DefaultDingTalkClient("https://pre-oapi.dingtalk.com/topapi/processinstance/create");
        OapiProcessinstanceCreateRequest request = new OapiProcessinstanceCreateRequest();
        //        request.setAgentId(1L);
        request.setProcessCode("PROC-BY6LI83V-4R8T1CHNUX58O0Z6C55M3-DTQJJGEJ-1");
        List<OapiProcessinstanceCreateRequest.FormComponentValueVo> formComponentValues = new ArrayList<OapiProcessinstanceCreateRequest.FormComponentValueVo>();
        OapiProcessinstanceCreateRequest.FormComponentValueVo vo = new OapiProcessinstanceCreateRequest.FormComponentValueVo();
        vo.setName("��ҵ����");
        vo.setValue("test");
        vo.setExtValue("test");
        formComponentValues.add(vo);
        request.setFormComponentValues(formComponentValues);
        request.setApprovers("");
        request.setOriginatorUserId("1226682231742708");
        request.setDeptId(0L);
        OapiProcessinstanceCreateResponse response = client.execute(request,"ddc66aecc3f538d1be2db66ab99ea94f");
        System.out.println(response.getBody());
    }

//	@Test
//	public void testOapiMediaDownloadFile() throws Exception {
//		DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/media/downloadFile");
//		client.setNeedEnableParser(false);
//		client.setNeedEnableByteStream(true);
//		OapiMediaDownloadFileRequest request = new OapiMediaDownloadFileRequest();
//		request.setHttpMethod("GET");
//		request.setMediaId("@lADPBY0V40JJnzDNAczNA4Y");
//
//		OapiMediaDownloadFileResponse response = client.execute(request, "f0e5456465ae318199f4aacd53044114");
//		System.out.println(response.getBody());
//	}

	@Test
	public void testAttendanceListRecord() throws ApiException {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/attendance/listRecord");
		OapiAttendanceListRecordRequest request = new OapiAttendanceListRecordRequest();
		request.setCheckDateFrom("2018-05-15 00:00:00");
		request.setCheckDateTo("2018-05-16 00:00:00");
		request.setUserIds(Arrays.asList("f-163","1753211656723709492","011144314219964997","14434819071683996144","036833371636604376","0514071236208949794","0512414419-1001332687"
				,"0553451720621177521","04464544572418","hj-15941","070744482220881940","42","01096862264836","0546681317782971","085051124038826997","045223241924281948","085264435720111361","q-791","HN-13920","HN-13022","HN-9999","011404471621089624","HN-10509","hj-11103","hn-315","q-664","hj-8652","052419421127569448","LJ1609008","LJ1609153","LJ1702079","LJ1609216","LJ1703096","LJ1611159","LJ1612064","LJ1702081","LJ1604001","LJ1702093","HJ-30266","HJ-19744","LJ-00834","LJ-00833","LJ-00832","HJ-17133","085932316324116989","01112709194321","DT00008861","DT00012562","DT00011010","HJ-20401"));
		OapiAttendanceListRecordResponse response = client.execute(request,"55454de5389732f49c04d414682e0730");
		System.out.println(response.getBody());
	}

	private static String getToken() throws ApiException {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken?dd_l=en_US");
		OapiGettokenRequest request = new OapiGettokenRequest();
		request.setCorpid("dingc95d22c053c528ae");
		request.setCorpsecret("y2bvq4CbSV0TupI0bTg-Y3BSzyl3fhyJOLaUAkbIgj34L1lcrspjKL9A8FdLgNs4");

		OapiGettokenResponse response = client.execute(request, null);
		System.out.println(response.getBody());
		return response.getAccessToken();
	}

	private static void departmentListParentDepts(String token, String userId) throws ApiException {
		DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/department/list_parent_depts");
		OapiDepartmentListParentDeptsRequest request = new OapiDepartmentListParentDeptsRequest();
		request.setUserId(userId);

		OapiDepartmentListParentDeptsResponse response = client.execute(request, token);
		System.out.println(response.getBody());
	}
}
