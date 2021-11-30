package com.dingtalk.api.reqrsp;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.create request
 *
 * @author top auto create
 * @since 1.0, 2018.05.03
 */
public class OapiChatCreateRequest extends BaseTaobaoRequest<OapiChatCreateResponse> {



    /**
     * ????????????2???????????????0????????????
     */
    private Long conversationTag;

    /**
     * ???????????????????????????
     */
    private List<String> extidlist;

    /**
     * ?????????
     */
    private String name;

    /**
     * ?????????userId
     */
    private String owner;

    /**
     * ???????????????emp??????????????????ext??????????????????
     */
    private String ownerType;

    /**
     * ??????????????????100?????????????????????????????????1????????????????????????0???????????????
     */
    private Long showHistoryType;

    /**
     * ?????????userId??????
     */
    private List<String> useridlist;

    public void setConversationTag(Long conversationTag) {
        this.conversationTag = conversationTag;
    }

    public Long getConversationTag() {
        return this.conversationTag;
    }

    public void setExtidlist(List<String> extidlist) {
        this.extidlist = extidlist;
    }

    public List<String> getExtidlist() {
        return this.extidlist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getOwnerType() {
        return this.ownerType;
    }

    public void setShowHistoryType(Long showHistoryType) {
        this.showHistoryType = showHistoryType;
    }

    public Long getShowHistoryType() {
        return this.showHistoryType;
    }

    public void setUseridlist(List<String> useridlist) {
        this.useridlist = useridlist;
    }

    public List<String> getUseridlist() {
        return this.useridlist;
    }

    public String getApiMethodName() {
        return "dingtalk.oapi.chat.create";
    }

    public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
    }

    public String getTopHttpMethod() {
        return null;
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("conversationTag", this.conversationTag);
        txtParams.put("extidlist", TaobaoUtils.objectToJson(this.extidlist));
        txtParams.put("name", this.name);
        txtParams.put("owner", this.owner);
        txtParams.put("ownerType", this.ownerType);
        txtParams.put("showHistoryType", this.showHistoryType);
        txtParams.put("useridlist", TaobaoUtils.objectToJson(this.useridlist));
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OapiChatCreateResponse> getResponseClass() {
        return OapiChatCreateResponse.class;
    }

    public void check() throws ApiRuleException {
    }


}
