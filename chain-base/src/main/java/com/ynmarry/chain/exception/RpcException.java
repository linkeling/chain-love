/* Copyright (c) 2018, yiboshi.com All Rights Reserved. */
package com.ynmarry.chain.exception;

/**
 * RPC级异常
 */
@SuppressWarnings("unused")
public class RpcException extends RuntimeException {
    static final long serialVersionUID = 1L;

    public RpcException() {
        super();
    }

    public RpcException(String message) {
        super(message);
    }

    public RpcException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcException(Throwable cause) {
        super(cause);
    }
}