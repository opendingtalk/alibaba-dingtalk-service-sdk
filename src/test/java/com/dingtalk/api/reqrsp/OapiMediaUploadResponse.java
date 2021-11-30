package com.dingtalk.api.reqrsp;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP DingTalk-API: dingtalk.oapi.media.upload response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMediaUploadResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6195382659669153932L;

    /**
     * ???????????????????????????
     */
    @ApiField("created_at")
    private Long createdAt;

    /**
     * ?????????
     */
    @ApiField("errcode")
    private Long errcode;

    /**
     * ????????????
     */
    @ApiField("errmsg")
    private String errmsg;

    /**
     * ??????????????????????????????????????????
     */
    @ApiField("media_id")
    private String mediaId;

    /**
     * ???????????????????????????????????????image???????????????voice??????????????????(file)
     */
    @ApiField("type")
    private String type;


    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
    public Long getCreatedAt( ) {
        return this.createdAt;
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

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
    public String getMediaId( ) {
        return this.mediaId;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType( ) {
        return this.type;
    }

    public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }



}
