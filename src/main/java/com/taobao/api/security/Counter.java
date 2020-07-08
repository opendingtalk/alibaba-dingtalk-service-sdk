package com.taobao.api.security;

import java.util.concurrent.atomic.AtomicLong;

public class Counter {
    private AtomicLong encryptPhoneNum = new AtomicLong(0);
    private AtomicLong encryptNickNum = new AtomicLong(0);
    private AtomicLong encryptReceiverNameNum = new AtomicLong(0);
    private AtomicLong encryptSimpleNum = new AtomicLong(0);
    private AtomicLong encryptSearchNum = new AtomicLong(0);

    private AtomicLong decryptPhoneNum = new AtomicLong(0);
    private AtomicLong decryptNickNum = new AtomicLong(0);
    private AtomicLong decryptReceiverNameNum = new AtomicLong(0);
    private AtomicLong decryptSimpleNum = new AtomicLong(0);
    private AtomicLong decryptSearchNum = new AtomicLong(0);

    private AtomicLong searchPhoneNum = new AtomicLong(0);
    private AtomicLong searchNickNum = new AtomicLong(0);
    private AtomicLong searchReceiverNameNum = new AtomicLong(0);
    private AtomicLong searchSimpleNum = new AtomicLong(0);
    private AtomicLong searchSearchNum = new AtomicLong(0);

    public AtomicLong getEncryptPhoneNum() {
        return encryptPhoneNum;
    }

    public AtomicLong getEncryptNickNum() {
        return encryptNickNum;
    }

    public AtomicLong getEncryptReceiverNameNum() {
        return encryptReceiverNameNum;
    }

    public AtomicLong getDecryptPhoneNum() {
        return decryptPhoneNum;
    }

    public AtomicLong getDecryptNickNum() {
        return decryptNickNum;
    }

    public AtomicLong getDecryptReceiverNameNum() {
        return decryptReceiverNameNum;
    }

    public AtomicLong getSearchPhoneNum() {
        return searchPhoneNum;
    }

    public AtomicLong getSearchNickNum() {
        return searchNickNum;
    }

    public AtomicLong getSearchReceiverNameNum() {
        return searchReceiverNameNum;
    }

    public AtomicLong getEncryptSimpleNum() {
        return encryptSimpleNum;
    }

    public AtomicLong getEncryptSearchNum() {
        return encryptSearchNum;
    }

    public AtomicLong getDecryptSimpleNum() {
        return decryptSimpleNum;
    }

    public AtomicLong getDecryptSearchNum() {
        return decryptSearchNum;
    }

    public AtomicLong getSearchSimpleNum() {
        return searchSimpleNum;
    }

    public AtomicLong getSearchSearchNum() {
        return searchSearchNum;
    }

    public void reset() {
        encryptPhoneNum.getAndSet(0);
        encryptNickNum.getAndSet(0);
        encryptReceiverNameNum.getAndSet(0);
        encryptSimpleNum.getAndSet(0);
        encryptSearchNum.getAndSet(0);

        decryptPhoneNum.getAndSet(0);
        decryptNickNum.getAndSet(0);
        decryptReceiverNameNum.getAndSet(0);
        decryptSimpleNum.getAndSet(0);
        decryptSearchNum.getAndSet(0);

        searchPhoneNum.getAndSet(0);
        searchNickNum.getAndSet(0);
        searchReceiverNameNum.getAndSet(0);
        searchSimpleNum.getAndSet(0);
        searchSearchNum.getAndSet(0);
    }
}