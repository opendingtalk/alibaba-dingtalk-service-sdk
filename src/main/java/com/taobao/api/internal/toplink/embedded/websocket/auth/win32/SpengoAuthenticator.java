package com.taobao.api.internal.toplink.embedded.websocket.auth.win32;
///*
// * The MIT License
// *
// * Copyright (c) 2011 Takahiro Hashimoto
// *
// * Permission is hereby granted, free of charge, to any person obtaining a copy
// * of this software and associated documentation files (the "Software"), to deal
// * in the Software without restriction, including without limitation the rights
// * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// * copies of the Software, and to permit persons to whom the Software is
// * furnished to do so, subject to the following conditions:
// *
// * The above copyright notice and this permission notice shall be included in
// * all copies or substantial portions of the Software.
// *
// * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// * THE SOFTWARE.
// */
//package jp.a840.websocket.auth.win32;
//
//import com.sun.jna.NativeLong;
//import com.sun.jna.platform.win32.*;
//import com.sun.jna.platform.win32.Sspi.CredHandle;
//import com.sun.jna.platform.win32.Sspi.CtxtHandle;
//import com.sun.jna.platform.win32.Sspi.SecBufferDesc;
//import com.sun.jna.platform.win32.Sspi.TimeStamp;
//import com.sun.jna.ptr.IntByReference;
//import com.sun.jna.ptr.NativeLongByReference;
//import jp.a840.websocket.exception.WebSocketException;
//import static jp.a840.websocket.exception.ErrorCode.*;
//import jp.a840.websocket.auth.AbstractAuthenticator;
//import jp.a840.websocket.auth.AuthScheme;
//import jp.a840.websocket.auth.Challenge;
//import util.Base64;
//
//import java.util.List;
//
///**
// * Proxy authenticator for SPENGO authentication mechanism
// *
// * @author Takahiro Hashimoto
// * @see <a href="http://tools.ietf.org/html/rfc4559">RFC4559</a>
// */
//public class SpengoAuthenticator extends AbstractAuthenticator {
//
//    private CredHandle hCred = null;
//    private CtxtHandle hCtx = null;
//    private int negotiateCount = 0;
//    private static Mechanism defaultMechanism = Mechanism.Negotiate;
//    private final Mechanism mechanism;
//
//    public static void setDefaultMechanism(Mechanism mechanism){
//        defaultMechanism = mechanism;
//    }
//
//    public SpengoAuthenticator(){
//        super();
//        this.mechanism = defaultMechanism;
//    }
//
//    public SpengoAuthenticator(Mechanism mechanism){
//        super();
//        this.mechanism = mechanism;
//    }
//
//    @Override
//    public String getCredentials(List<Challenge> challengeList) throws WebSocketException {
//        for (Challenge challenge : challengeList) {
//            if (AuthScheme.Negotiate.equals(challenge.getScheme())) {
//                return getCredentials(challenge);
//            }
//        }
//        return null;
//    }
//
//    /**
//     * Gets the credentials.
//     *
//     * @param challenge the challenge
//     * @return the credentials
//     * @throws WebSocketException the web socket exception
//     */
//    public String getCredentials(Challenge challenge) throws WebSocketException {
//        int tmpNegotiateCount = this.negotiateCount;
//        String username = this.credentials.getUsername();
//        try {
//            String token = challenge.getParam();
//            SecBufferDesc pInputServerToken = null; // first server response have not a token
//            if (token == null) {
//                this.hCred = new CredHandle();
//                this.hCtx = new CtxtHandle();
//
//                TimeStamp timeStamp = new TimeStamp();
//                int ret;
//
//                ret = Secur32.INSTANCE.AcquireCredentialsHandle(
//                        null,
//                        this.mechanism.name(),
//                        Sspi.SECPKG_CRED_OUTBOUND,
//                        null,
//                        null,
//                        null,
//                        null,
//                        this.hCred,
//                        timeStamp);
//                if (ret != W32Errors.SEC_E_OK) {
//                    throw new WebSocketException(E3850, String.valueOf(ret));
//                }
//                pInputServerToken = null;
//            } else {
//                // create token buffer (server parameter decode from base64.)
//                pInputServerToken = new SecBufferDesc(Sspi.SECBUFFER_TOKEN, Base64.decode(token));
//            }
//
//            IntByReference pfClientContextAttr = new IntByReference();
//            SecBufferDesc pOutputClientToken = new SecBufferDesc(Sspi.SECBUFFER_TOKEN, Sspi.MAX_TOKEN_SIZE);
//
//            int ret = Secur32.INSTANCE.InitializeSecurityContext(
//
//                    this.hCred,
//                    this.hCtx.isNull() ? null : this.hCtx,
//                    username,
//                    Sspi.ISC_REQ_CONNECTION,
//                    0,
//                    Sspi.SECURITY_NATIVE_DREP,
//                    pInputServerToken,
//                    0,
//                    this.hCtx,
//                    pOutputClientToken,
//                    pfClientContextAttr,
//                    null
//            );
//            switch (ret) {
//                case W32Errors.SEC_E_OK:
//                    // finalize in done() method
//                    break;
//                case W32Errors.SEC_I_CONTINUE_NEEDED:
//                    this.negotiateCount++;
//                    break;
//                default:
//                    throw new WebSocketException(E3851, String.valueOf(ret));
//            }
//
//            return AuthScheme.Negotiate.name() + " " + Base64.encodeToString(pOutputClientToken.getBytes(), false);
//        } finally {
//            if (tmpNegotiateCount == this.negotiateCount) {
//                this.negotiateCount = -1;
//            }
//        }
//    }
//
//    @Override
//    public void done() {
//        if (this.hCred != null) Secur32.INSTANCE.FreeCredentialsHandle(this.hCred);
//        if (this.hCtx != null) Secur32.INSTANCE.DeleteSecurityContext(this.hCtx);
//        super.done();
//    }
//
//    @Override
//    public boolean isNeedAuthenticate() {
//        return this.negotiateCount > -1;
//    }
//}
