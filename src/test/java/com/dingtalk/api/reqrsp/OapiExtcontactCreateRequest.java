package com.dingtalk.api.reqrsp;

import java.util.List;

import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;

/**
 * TOP DingTalk-API: dingtalk.oapi.extcontact.create request
 *
 * @author top auto create
 * @since 1.0, 2018.05.04
 */
public class OapiExtcontactCreateRequest extends BaseTaobaoRequest<OapiExtcontactCreateResponse> {



    /**
     * ?????????????????????
     */
    private String contact;

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setContact(OpenExtContact contact) {
        this.contact = new JSONWriter(false,false,true).write(contact);
    }

    public String getContact() {
        return this.contact;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.extcontact.create";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("contact", this.contact);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiExtcontactCreateResponse> getResponseClass() {
        return OapiExtcontactCreateResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    /**
     * ?????????????????????
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class OpenExtContact extends TaobaoObject {
        private static final long serialVersionUID = 8714724865935778369L;
        /**
         * ??????
         */
        @ApiField("address")
        private String address;
        /**
         * ?????????
         */
        @ApiField("company_name")
        private String companyName;
        /**
         * ?????????userId
         */
        @ApiField("follower_user_id")
        private String followerUserId;
        /**
         * ????????????
         */
        @ApiListField("label_ids")
        @ApiField("number")
        private List<Long> labelIds;
        /**
         * ?????????
         */
        @ApiField("mobile")
        private String mobile;
        /**
         * ??????
         */
        @ApiField("name")
        private String name;
        /**
         * ??????
         */
        @ApiField("remark")
        private String remark;
        /**
         * ??????????????????ID
         */
        @ApiListField("share_dept_ids")
        @ApiField("number")
        private List<Long> shareDeptIds;
        /**
         * ??????????????????userId??????
         */
        @ApiListField("share_user_ids")
        @ApiField("string")
        private List<String> shareUserIds;
        /**
         * ??????????????????
         */
        @ApiField("state_code")
        private String stateCode;
        /**
         * ??????
         */
        @ApiField("title")
        private String title;

        public String getAddress() {
            return this.address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getCompanyName() {
            return this.companyName;
        }
        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }
        public String getFollowerUserId() {
            return this.followerUserId;
        }
        public void setFollowerUserId(String followerUserId) {
            this.followerUserId = followerUserId;
        }
        public List<Long> getLabelIds() {
            return this.labelIds;
        }
        public void setLabelIds(List<Long> labelIds) {
            this.labelIds = labelIds;
        }
        public String getMobile() {
            return this.mobile;
        }
        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getRemark() {
            return this.remark;
        }
        public void setRemark(String remark) {
            this.remark = remark;
        }
        public List<Long> getShareDeptIds() {
            return this.shareDeptIds;
        }
        public void setShareDeptIds(List<Long> shareDeptIds) {
            this.shareDeptIds = shareDeptIds;
        }
        public List<String> getShareUserIds() {
            return this.shareUserIds;
        }
        public void setShareUserIds(List<String> shareUserIds) {
            this.shareUserIds = shareUserIds;
        }
        public String getStateCode() {
            return this.stateCode;
        }
        public void setStateCode(String stateCode) {
            this.stateCode = stateCode;
        }
        public String getTitle() {
            return this.title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
    }


}
