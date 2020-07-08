package com.taobao.api.security;

/**
 * 
 * @author changchun
 * @since 2016年3月4日 下午4:48:31
 */
public class SecretData {

    private String originalValue;// 明文、h_mac数据
    private String originalBase64Value;// 原始base64加密之后的密文数据
    private Long secretVersion;// 秘钥版本
    private boolean search;

    public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }

    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    public String getOriginalBase64Value() {
        return originalBase64Value;
    }

    public void setOriginalBase64Value(String originalBase64Value) {
        this.originalBase64Value = originalBase64Value;
    }

    public Long getSecretVersion() {
        return secretVersion;
    }

    public void setSecretVersion(Long secretVersion) {
        this.secretVersion = secretVersion;
    }

}