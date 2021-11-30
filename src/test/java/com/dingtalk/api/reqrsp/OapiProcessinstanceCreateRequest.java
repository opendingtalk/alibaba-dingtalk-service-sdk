package com.dingtalk.api.reqrsp;

import java.util.List;

import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.create request
 *
 * @author top auto create
 * @since 1.0, 2018.05.04
 */
public class OapiProcessinstanceCreateRequest extends BaseTaobaoRequest<OapiProcessinstanceCreateResponse> {



    /**
     * ���������������������
     */
    private Long agentId;

    /**
     * ���������userid������
     */
    private String approvers;

    /**
     * ���������userid������
     */
    private String ccList;

    /**
     * ������������,���������START,FINISH,START_FINISH���
     */
    private String ccPosition;

    /**
     * ������������������������
     */
    private Long deptId;

    /**
     * ���������������������
     */
    private String formComponentValues;

    /**
     * ������������������������userid
     */
    private String originatorUserId;

    /**
     * ���������������������
     */
    private String processCode;

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Long getAgentId() {
        return this.agentId;
    }

    public void setApprovers(String approvers) {
        this.approvers = approvers;
    }

    public String getApprovers() {
        return this.approvers;
    }

    public void setCcList(String ccList) {
        this.ccList = ccList;
    }

    public String getCcList() {
        return this.ccList;
    }

    public void setCcPosition(String ccPosition) {
        this.ccPosition = ccPosition;
    }

    public String getCcPosition() {
        return this.ccPosition;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public void setFormComponentValues(String formComponentValues) {
        this.formComponentValues = formComponentValues;
    }

    public void setFormComponentValues(List<FormComponentValueVo> formComponentValues) {
        this.formComponentValues = new JSONWriter(false,false,true).write(formComponentValues);
    }

    public String getFormComponentValues() {
        return this.formComponentValues;
    }

    public void setOriginatorUserId(String originatorUserId) {
        this.originatorUserId = originatorUserId;
    }

    public String getOriginatorUserId() {
        return this.originatorUserId;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getProcessCode() {
        return this.processCode;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.processinstance.create";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("agent_id", this.agentId);
        txtParams.put("approvers", this.approvers);
        txtParams.put("cc_list", this.ccList);
        txtParams.put("cc_position", this.ccPosition);
        txtParams.put("dept_id", this.deptId);
        txtParams.put("form_component_values", this.formComponentValues);
        txtParams.put("originator_user_id", this.originatorUserId);
        txtParams.put("process_code", this.processCode);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiProcessinstanceCreateResponse> getResponseClass() {
        return OapiProcessinstanceCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(approvers, "approvers");
        RequestCheckUtils.checkMaxListSize(approvers, 20, "approvers");
        RequestCheckUtils.checkMaxListSize(ccList, 20, "ccList");
        RequestCheckUtils.checkNotEmpty(deptId, "deptId");
        RequestCheckUtils.checkObjectMaxListSize(formComponentValues, 20, "formComponentValues");
        RequestCheckUtils.checkNotEmpty(originatorUserId, "originatorUserId");
        RequestCheckUtils.checkNotEmpty(processCode, "processCode");
    }

    /**
     * ���������������������
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class FormComponentValueVo extends TaobaoObject {
        private static final long serialVersionUID = 1442778988881375214L;
        /**
         * ���������
         */
        @ApiField("ext_value")
        private String extValue;
        /**
         * ������������������������
         */
        @ApiField("name")
        private String name;
        /**
         * ���������������������
         */
        @ApiField("value")
        private String value;

        public String getExtValue() {
            return this.extValue;
        }
        public void setExtValue(String extValue) {
            this.extValue = extValue;
        }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getValue() {
            return this.value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }


}