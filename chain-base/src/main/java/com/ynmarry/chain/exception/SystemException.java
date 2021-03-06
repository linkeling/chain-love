/* Copyright (c) 2018, yiboshi.com All Rights Reserved. */
package com.ynmarry.chain.exception;
/**
 * 系统级异常
 */
@SuppressWarnings("unused")
public class SystemException extends RuntimeException {
    static final long serialVersionUID = 1L;

    public SystemException() {
        super();
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }
}