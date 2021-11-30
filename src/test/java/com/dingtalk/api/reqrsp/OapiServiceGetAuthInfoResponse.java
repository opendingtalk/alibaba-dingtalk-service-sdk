package com.dingtalk.api.reqrsp;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_auth_info response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServiceGetAuthInfoResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4268862237771566193L;

    /**
     * auth_corp_info
     */
    @ApiField("auth_corp_info")
    private AuthCorpInfo authCorpInfo;

    /**
     * auth_info
     */
    @ApiField("auth_info")
    private AuthInfo authInfo;

    /**
     * auth_user_info
     */
    @ApiField("auth_user_info")
    private AuthUserInfo authUserInfo;

    /**
     * channel_auth_info
     */
    @ApiField("channel_auth_info")
    private ChannelAuthInfo channelAuthInfo;

    /**
     * errcode
     */
    @ApiField("errcode")
    private Long errcode;

    /**
     * errmsg
     */
    @ApiField("errmsg")
    private String errmsg;


    public void setAuthCorpInfo(AuthCorpInfo authCorpInfo) {
        this.authCorpInfo = authCorpInfo;
    }
    public AuthCorpInfo getAuthCorpInfo( ) {
        return this.authCorpInfo;
    }

    public void setAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }
    public AuthInfo getAuthInfo( ) {
        return this.authInfo;
    }

    public void setAuthUserInfo(AuthUserInfo authUserInfo) {
        this.authUserInfo = authUserInfo;
    }
    public AuthUserInfo getAuthUserInfo( ) {
        return this.authUserInfo;
    }

    public void setChannelAuthInfo(ChannelAuthInfo channelAuthInfo) {
        this.channelAuthInfo = channelAuthInfo;
    }
    public ChannelAuthInfo getChannelAuthInfo( ) {
        return this.channelAuthInfo;
    }

    public void setErrcode(Long errcode) {
        this.errcode = errcode;
    }
    public Long getErrcode( ) {
        return this.errcode;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
    public String getErrmsg( ) {
        return this.errmsg;
    }

    public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }

    /**
     * agent
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class Agent extends TaobaoObject {
        private static final long serialVersionUID = 4653881778333126178L;
        /**
         * admin_list
         */
        @ApiListField("admin_list")
        @ApiField("string")
        private List<String> adminList;
        /**
         * agent_name
         */
        @ApiField("agent_name")
        private String agentName;
        /**
         * agentid
         */
        @ApiField("agentid")
        private Long agentid;
        /**
         * appid
         */
        @ApiField("appid")
        private Long appid;
        /**
         * logo_url
         */
        @ApiField("logo_url")
        private String logoUrl;

        public List<String> getAdminList() {
            return this.adminList;
        }
        public void setAdminList(List<String> adminList) {
            this.adminList = adminList;
        }
        public String getAgentName() {
            return this.agentName;
        }
        public void setAgentName(String agentName) {
            this.agentName = agentName;
        }
        public Long getAgentid() {
            return this.agentid;
        }
        public void setAgentid(Long agentid) {
            this.agentid = agentid;
        }
        public Long getAppid() {
            return this.appid;
        }
        public void setAppid(Long appid) {
            this.appid = appid;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }
        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }
    }

    /**
     * auth_info
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class AuthInfo extends TaobaoObject {
        private static final long serialVersionUID = 3314573481638722292L;
        /**
         * agent
         */
        @ApiListField("agent")
        @ApiField("agent")
        private List<Agent> agent;

        public List<Agent> getAgent() {
            return this.agent;
        }
        public void setAgent(List<Agent> agent) {
            this.agent = agent;
        }
    }

    /**
     * auth_user_info
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class AuthUserInfo extends TaobaoObject {
        private static final long serialVersionUID = 5791811359912468522L;
        /**
         * userId
         */
        @ApiField("userId")
        private String userId;

        public String getUserId() {
            return this.userId;
        }
        public void setUserId(String userId) {
            this.userId = userId;
        }
    }

    /**
     * auth_corp_info
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class AuthCorpInfo extends TaobaoObject {
        private static final long serialVersionUID = 8335795972598625712L;
        /**
         * auth_channel
         */
        @ApiField("auth_channel")
        private String authChannel;
        /**
         * auth_channel_type
         */
        @ApiField("auth_channel_type")
        private String authChannelType;
        /**
         * auth_level
         */
        @ApiField("auth_level")
        private Long authLevel;
        /**
         * corp_name
         */
        @ApiField("corp_name")
        private String corpName;
        /**
         * corpid
         */
        @ApiField("corpid")
        private String corpid;
        /**
         * industry
         */
        @ApiField("industry")
        private String industry;
        /**
         * invite_code
         */
        @ApiField("invite_code")
        private String inviteCode;
        /**
         * invite_url
         */
        @ApiField("invite_url")
        private String inviteUrl;
        /**
         * is_authenticated
         */
        @ApiField("is_authenticated")
        private Boolean isAuthenticated;
        /**
         * license_code
         */
        @ApiField("license_code")
        private String licenseCode;

        public String getAuthChannel() {
            return this.authChannel;
        }
        public void setAuthChannel(String authChannel) {
            this.authChannel = authChannel;
        }
        public String getAuthChannelType() {
            return this.authChannelType;
        }
        public void setAuthChannelType(String authChannelType) {
            this.authChannelType = authChannelType;
        }
        public Long getAuthLevel() {
            return this.authLevel;
        }
        public void setAuthLevel(Long authLevel) {
            this.authLevel = authLevel;
        }
        public String getCorpName() {
            return this.corpName;
        }
        public void setCorpName(String corpName) {
            this.corpName = corpName;
        }
        public String getCorpid() {
            return this.corpid;
        }
        public void setCorpid(String corpid) {
            this.corpid = corpid;
        }
        public String getIndustry() {
            return this.industry;
        }
        public void setIndustry(String industry) {
            this.industry = industry;
        }
        public String getInviteCode() {
            return this.inviteCode;
        }
        public void setInviteCode(String inviteCode) {
            this.inviteCode = inviteCode;
        }
        public String getInviteUrl() {
            return this.inviteUrl;
        }
        public void setInviteUrl(String inviteUrl) {
            this.inviteUrl = inviteUrl;
        }
        public Boolean getIsAuthenticated() {
            return this.isAuthenticated;
        }
        public void setIsAuthenticated(Boolean isAuthenticated) {
            this.isAuthenticated = isAuthenticated;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }
        public void setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
        }
    }

    /**
     * channelAgent
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class Channelagent extends TaobaoObject {
        private static final long serialVersionUID = 8573656837788598439L;
        /**
         * agent_name
         */
        @ApiField("agent_name")
        private String agentName;
        /**
         * agentid
         */
        @ApiField("agentid")
        private Long agentid;
        /**
         * appid
         */
        @ApiField("appid")
        private Long appid;
        /**
         * logo_url
         */
        @ApiField("logo_url")
        private String logoUrl;

        public String getAgentName() {
            return this.agentName;
        }
        public void setAgentName(String agentName) {
            this.agentName = agentName;
        }
        public Long getAgentid() {
            return this.agentid;
        }
        public void setAgentid(Long agentid) {
            this.agentid = agentid;
        }
        public Long getAppid() {
            return this.appid;
        }
        public void setAppid(Long appid) {
            this.appid = appid;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }
        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }
    }

    /**
     * channel_auth_info
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class ChannelAuthInfo extends TaobaoObject {
        private static final long serialVersionUID = 1422562156781263441L;
        /**
         * channelAgent
         */
        @ApiListField("channelAgent")
        @ApiField("channelagent")
        private List<Channelagent> channelAgent;

        public List<Channelagent> getChannelAgent() {
            return this.channelAgent;
        }
        public void setChannelAgent(List<Channelagent> channelAgent) {
            this.channelAgent = channelAgent;
        }
    }



}