package com.taobao.api.internal.toplink.embedded.websocket.exception;

/**
 * The Class ErrorCode.
 *
 * @author Takahiro Hashimoto
 */
public enum ErrorCode {
    E3007("Not supported protocol. %s"),
    E3008("Not supported protocol. %s"),
    E3009("URI syntax error"),
    E3010("WebSocket is not connected"),
    E3020("Connection closed."),
    E3021("I/O error."),
    E3030("Couldn't add buffer to upstream queue"),
    E3031("Couldn't add buffer to upstream queue"),
    E3032("URI syntax error"),
    E3039("Already connected"),
    E3040("Can't transit state to CONNECTED. current state=%s"),
    E3041("Already connected"),
    E3042("Connection Timeout"),
    E3043("Unknown error"),
    E3044("Unknown error"),
    E3100("I/O error"),
    E3101("Invalid server response.(HTTP version) %s"),
    E3102("Invalid server response.(Status Code) %s"),
    E3200("Need proxy authenticate. Proxy Authenticate fail."),
    E3201("Need proxy authenticate. But not set a Authenticator"),
    E3202("Have not support proxy authenticate schemes."),
    E3500("Upgrade response header does not match websocket. Upgrade: %s"),
    E3501("Connection response header does not match Upgrade. Connection: %s"),
    E3502("Sec-WebSocket-Origin response header does not match request Origin header. Origin: %s Sec-WebSocket-Origin: %s"),
    E3503("Sec-WebSocket-Location response header does not match request URL. request uri: %s Sec-WebSocket-Location: %s"),
    E3550("Unknown error"),
    E3600("Upgrade response header does not match websocket. Upgrade: %s"),
    E3601("Connection response header does not match Upgrade. Connection: %s"),
    E3602("Sec-WebSocket-Accept response header is not found"),
    E3810("SSL handshake no such algorithm error"),
    E3811("SSL handshake keystore error"),
    E3812("SSL handshake key management error"),
    E3815("SSL handshake ssl error"),
    E3816("SSL handshake I/O error"),
    E3817("SSL handshake ssl error in wrap()"),
    E3818("SSL handshake ssl error in unwrap()"),
    E3820("Couldn't SSL unwrap, because caught buffer underflow from SSLEngine."),
    E3821("Couldn't resolve SSL buffer underflow"),
    E3830("Unsupported qop option 'auth-int'."),
    E3831("Unsupported qop option. qop:%s"),
    E3850("Failed AcquireCredentialsHandle ret(%s)"),
    E3851("Failed InitializeSecurityContext ret(%s)"),
    ;
    private String message;
    private ErrorCode(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
