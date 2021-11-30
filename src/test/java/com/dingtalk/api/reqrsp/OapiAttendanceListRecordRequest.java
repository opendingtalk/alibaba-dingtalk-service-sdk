package com.dingtalk.api.reqrsp;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.listRecord request
 *
 * @author top auto create
 * @since 1.0, 2018.05.11
 */
public class OapiAttendanceListRecordRequest extends BaseTaobaoRequest<OapiAttendanceListRecordResponse> {



    /**
     * ??????????????????????????????????????????????????????????????????????????????????????????7???
     */
    private String checkDateFrom;

    /**
     * ??????????????????????????????????????????????????????????????????????????????????????????7???
     */
    private String checkDateTo;

    /**
     * ??????????????????id???????????????????????????50???
     */
    private List<String> userIds;

    public void setCheckDateFrom(String checkDateFrom) {
        this.checkDateFrom = checkDateFrom;
    }

    public String getCheckDateFrom() {
        return this.checkDateFrom;
    }

    public void setCheckDateTo(String checkDateTo) {
        this.checkDateTo = checkDateTo;
    }

    public String getCheckDateTo() {
        return this.checkDateTo;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public List<String> getUserIds() {
        return this.userIds;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.attendance.listRecord";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("checkDateFrom", this.checkDateFrom);
        txtParams.put("checkDateTo", this.checkDateTo);
        txtParams.put("userIds", TaobaoUtils.objectToJson(this.userIds));
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiAttendanceListRecordResponse> getResponseClass() {
        return OapiAttendanceListRecordResponse.class;
    }

    public void check() throws ApiRuleException {
    }


}
